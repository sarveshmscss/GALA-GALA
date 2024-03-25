package com.example.makeeventseasy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView titleTextView = findViewById(R.id.titleTextView);
        titleTextView.setText("GALA-GALA");

        ImageView eventListImageView = findViewById(R.id.eventListImageView);
        ImageView bookingsImageView = findViewById(R.id.bookingsImageView);
        ImageView extrasImageView = findViewById(R.id.extrasImageView);
        ImageView supportImageView = findViewById(R.id.supportImageView);

        eventListImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin.this, eventslist.class);
                startActivity(intent);
            }
        });

        bookingsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin.this, view_bookings.class);
                startActivity(intent);
            }
        });

        extrasImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin.this, extras.class);
                startActivity(intent);
            }
        });

        supportImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin.this, support.class);
                startActivity(intent);
            }
        });
    }
}
