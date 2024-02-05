package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class ConfirmTable extends AppCompatActivity {

    TextView tvConfirm;
     Button btnConfirm, btnSelectFood;
     EditText etDate, etTime;
     private Firebase Ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_table);
        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://cafebooking-46d00.firebaseio.com/");

        tvConfirm = findViewById(R.id.tvConfirm);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnSelectFood = findViewById(R.id.btnSelectFood);

        etDate = findViewById(R.id.etDate);
        etTime = findViewById(R.id.etTime);

        int tableNumber = getIntent().getIntExtra("tableNumber", 0);
        tvConfirm.setText("Selected table Number : " + tableNumber);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final String date =etDate.getText().toString();
               final String time = etTime.getText().toString();
               final int tableNumber = getIntent().getIntExtra("tableNumber",0);


                if(date.isEmpty())
                {
                    etDate.setError("please enter date");
                }
                else if(time.isEmpty())
                {
                    etTime.setError("please enter arrival time");
                }
                else
                {
                    Intent intent = new Intent(ConfirmTable.this, Confirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("TableNumber",tableNumber);
                    startActivity(intent);

                }

            }
        });

        btnSelectFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String date =etDate.getText().toString();
                final String time = etTime.getText().toString();
                final int tableNumber = getIntent().getIntExtra("tableNumber",0);



                if(date.isEmpty())
                {
                    etDate.setError("please enter date");
                }
                else if(time.isEmpty())
                {
                    etTime.setError("please enter arrival time");
                }
                else {


                    Intent intent = new Intent(ConfirmTable.this, FoodList.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    startActivity(intent);
                }
            }
        });
    }
}
