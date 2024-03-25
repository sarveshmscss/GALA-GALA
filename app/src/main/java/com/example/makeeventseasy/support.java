package com.example.makeeventseasy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class support extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        TextView welcomeMessage = findViewById(R.id.welcomeMessage);
        welcomeMessage.setText("Support");

        TextView emailTextView = findViewById(R.id.email);
        emailTextView.setText("Email: galagala@gmail.com");

        TextView phoneNumberTextView = findViewById(R.id.phoneNumber);
        phoneNumberTextView.setText("Phone: 7904677091");

        TextView question1TextView = findViewById(R.id.question1);
        question1TextView.setText("Q: What services do you offer?");

        TextView answer1TextView = findViewById(R.id.answer1);
        answer1TextView.setText("A: We offer event management and handling services.");


    }
}
