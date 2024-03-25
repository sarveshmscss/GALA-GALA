package com.example.makeeventseasy;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class eventslist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventslist);

        ImageView weddingImageView = findViewById(R.id.weddingImageView);
        TextView weddingTextView = findViewById(R.id.weddingTextView);
        LinearLayout weddingLayout = findViewById(R.id.weddingLayout);

        ImageView birthdayImageView = findViewById(R.id.birthdayImageView);
        TextView birthdayTextView = findViewById(R.id.birthdayTextView);
        LinearLayout birthdayLayout = findViewById(R.id.birthdayLayout);

        ImageView exhibitionImageView = findViewById(R.id.exhibitionImageView);
        TextView exhibitionTextView = findViewById(R.id.exhibitionTextView);
        LinearLayout exhibitionLayout = findViewById(R.id.exhibitionLayout);

        ImageView concertImageView = findViewById(R.id.concertImageView);
        TextView concertTextView = findViewById(R.id.concertTextView);
        LinearLayout concertLayout = findViewById(R.id.concertLayout);

        ImageView corporateImageView = findViewById(R.id.corporateImageView);
        TextView corporateTextView = findViewById(R.id.corporateTextView);
        LinearLayout corporateLayout = findViewById(R.id.corporateLayout);

        ImageView sportImageView = findViewById(R.id.sportImageView);
        TextView sportTextView = findViewById(R.id.sportTextView);
        LinearLayout sportLayout = findViewById(R.id.sportLayout);

        weddingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Wedding Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        birthdayLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Birthday Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        exhibitionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Exhibition Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        concertLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Concert Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        corporateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Corporate Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        sportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventslist.this, "Sport Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
