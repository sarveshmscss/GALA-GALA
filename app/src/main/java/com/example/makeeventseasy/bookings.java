package com.example.makeeventseasy;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Calendar;

public class bookings extends AppCompatActivity {

    private DBHelper dbHelper;
    private Spinner eventTypeSpinner;
    private EditText eventNameEditText, eventLocationEditText, eventDescriptionEditText;
    private TextInputEditText eventDateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);

        dbHelper = new DBHelper(this);

        eventTypeSpinner = findViewById(R.id.eventTypeSpinner);
        eventNameEditText = findViewById(R.id.eventNameEditText);
        eventDateEditText = findViewById(R.id.eventDateEditText);
        eventLocationEditText = findViewById(R.id.eventLocationEditText);
        eventDescriptionEditText = findViewById(R.id.eventDescriptionEditText);
        Button submitButton = findViewById(R.id.submitButton);

        eventTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });

        submitButton.setOnClickListener(v -> {
            submitForm();
        });

        eventDateEditText.setOnClickListener(v -> {
            showDatePicker(v);
        });
    }

    private void submitForm() {
        String eventType = eventTypeSpinner.getSelectedItem().toString();
        String eventName = eventNameEditText.getText().toString().trim();
        String eventDate = eventDateEditText.getText().toString().trim();
        String eventLocation = eventLocationEditText.getText().toString().trim();
        String eventDescription = eventDescriptionEditText.getText().toString().trim();

        if (eventName.isEmpty() || eventDate.isEmpty() || eventLocation.isEmpty() || eventDescription.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        insertUserData(eventName, eventDate, eventLocation, eventDescription);
    }

    private void insertUserData(String eventName, String eventDate, String eventLocation, String eventDescription) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("event_name", eventName);
        values.put("event_date", eventDate);
        values.put("event_location", eventLocation);
        values.put("event_description", eventDescription);

        long newRowId = db.insert("events", null, values);

        if (newRowId != -1) {
            Toast.makeText(this, "Event booked successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed to book the event", Toast.LENGTH_SHORT).show();
        }

        db.close();
    }

    public void showDatePicker(View view) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(bookings.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                eventDateEditText.setText(selectedDate);
            }
        }, year, month, day);
        datePickerDialog.show();
    }
}
