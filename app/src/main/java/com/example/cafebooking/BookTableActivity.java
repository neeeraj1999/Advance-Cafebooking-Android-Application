package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookTableActivity extends AppCompatActivity {

    Button btnTable1, btnTable2, btnTable3, btnTable4,
            btnTable5, btnTable6, btnTable7, btnTable8,
            btnTable9, btnTable10, btnTable11, btnTable12,
            btnTable13, btnTable14, btnTable15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_table);
        btnTable1 = findViewById(R.id.btnTable1);
        btnTable2 = findViewById(R.id.btnTable2);
        btnTable3 = findViewById(R.id.btnTable3);
        btnTable4 = findViewById(R.id.btnTable4);
        btnTable5 = findViewById(R.id.btnTable5);
        btnTable6 = findViewById(R.id.btnTable6);
        btnTable7 = findViewById(R.id.btnTable7);
        btnTable8 = findViewById(R.id.btnTable8);
        btnTable9 = findViewById(R.id.btnTable9);
        btnTable10 = findViewById(R.id.btnTable10);
        btnTable11 = findViewById(R.id.btnTable11);
        btnTable12 = findViewById(R.id.btnTable12);
        btnTable13 = findViewById(R.id.btnTable13);
        btnTable14 = findViewById(R.id.btnTable14);
        btnTable15 = findViewById(R.id.btnTable15);

        btnTable1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 1);
                startActivity(intent);
            }
        });

        btnTable2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 2);
                startActivity(intent);
            }
        });

        btnTable3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 3);
                startActivity(intent);
            }
        });

        btnTable4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 4);
                startActivity(intent);
            }
        });

        btnTable5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 5);
                startActivity(intent);
            }
        });

        btnTable6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 6);
                startActivity(intent);
            }
        });

        btnTable7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 7);
                startActivity(intent);
            }
        });

        btnTable8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 8);
                startActivity(intent);
            }
        });

        btnTable9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 9);
                startActivity(intent);
            }
        });

        btnTable10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 10);
                startActivity(intent);
            }
        });

        btnTable11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 11);
                startActivity(intent);
            }
        });

        btnTable12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 12);
                startActivity(intent);
            }
        });

        btnTable13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 13);
                startActivity(intent);
            }
        });

        btnTable14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 14);
                startActivity(intent);
            }
        });

        btnTable15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookTableActivity.this, ConfirmTable.class);
                intent.putExtra("tableNumber", 15);
                startActivity(intent);
            }
        });

    }
}
