package com.example.makeeventseasy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class extras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);


        ImageView venueImageView = findViewById(R.id.venueImageView);
        ImageView cateringImageView = findViewById(R.id.cateringImageView);
        ImageView audioVisualImageView = findViewById(R.id.audioVisualImageView);
        ImageView transportImageView = findViewById(R.id.transportImageView);
        ImageView accommodationImageView = findViewById(R.id.accommodationImageView);
        ImageView giftsImageView = findViewById(R.id.giftsImageView);

        TextView venueTextView = findViewById(R.id.venueTextView);
        TextView cateringTextView = findViewById(R.id.cateringTextView);
        TextView audioVisualTextView = findViewById(R.id.audioVisualTextView);
        TextView transportTextView = findViewById(R.id.transportTextView);
        TextView accommodationTextView = findViewById(R.id.accommodationTextView);
        TextView giftsTextView = findViewById(R.id.giftsTextView);

        venueImageView.setImageResource(R.drawable.venue);
        cateringImageView.setImageResource(R.drawable.catering);
        audioVisualImageView.setImageResource(R.drawable.concert);
        transportImageView.setImageResource(R.drawable.transport);
        accommodationImageView.setImageResource(R.drawable.accomodation);
        giftsImageView.setImageResource(R.drawable.gift);


        venueTextView.setText("Venue Selection");
        cateringTextView.setText("Catering Services");
        audioVisualTextView.setText("Audio-Visual Services");
        transportTextView.setText("Transportation");
        accommodationTextView.setText("Accommodation");
        giftsTextView.setText("Gifts");
    }
}
