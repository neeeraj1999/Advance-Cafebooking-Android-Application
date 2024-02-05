package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    TextView tvOrderDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        tvOrderDetails = findViewById(R.id.tvOrderDetails);

        String date = getIntent().getExtras().getString("date");
        String time = getIntent().getExtras().getString("time");
        int TableNumber = getIntent().getIntExtra("TableNumber",0);

        tvOrderDetails.setText("Your Table Number : " + TableNumber + "\n" +
                               "Date : " + date + "\n" +
                               "Time : " + time);
    }
}
