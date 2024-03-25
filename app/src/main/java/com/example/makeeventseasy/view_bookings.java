package com.example.makeeventseasy;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class view_bookings extends AppCompatActivity {

    private DBHelper dbHelper;
    private ListView listViewBookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bookings);

        dbHelper = new DBHelper(this);
        listViewBookings = findViewById(R.id.listViewBookings);

        // Fetch and display bookings
        displayBookings();
    }

    private void displayBookings() {
        ArrayList<String> bookingsList = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] projection = {
                "event_name",
                "event_date",
                "event_location",
                "event_description"
        };

        Cursor cursor = db.query(
                "events",
                projection,
                null,
                null,
                null,
                null,
                null
        );

        if (cursor.moveToFirst()) {
            do {
                String eventName = cursor.getString(cursor.getColumnIndexOrThrow("event_name"));
                String eventDate = cursor.getString(cursor.getColumnIndexOrThrow("event_date"));
                String eventLocation = cursor.getString(cursor.getColumnIndexOrThrow("event_location"));
                String eventDescription = cursor.getString(cursor.getColumnIndexOrThrow("event_description"));

                String bookingDetails = "Event Name: " + eventName + "\n"
                        + "Event Date: " + eventDate + "\n"
                        + "Event Location: " + eventLocation + "\n"
                        + "Event Description: " + eventDescription + "\n\n";

                bookingsList.add(bookingDetails);
            } while (cursor.moveToNext());
        } else {
            Toast.makeText(this, "No bookings found", Toast.LENGTH_SHORT).show();
        }
        cursor.close();
        db.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bookingsList);
        listViewBookings.setAdapter(adapter);
    }
}
