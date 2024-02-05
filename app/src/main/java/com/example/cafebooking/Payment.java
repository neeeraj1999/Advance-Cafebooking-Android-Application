package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Payment extends AppCompatActivity {

    Button btnPay;
    TextView tvPayment;

    DecimalFormat f = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btnPay = findViewById(R.id.btnPay);
        tvPayment = findViewById(R.id.tvPayment);

        double totalPrice = getIntent().getDoubleExtra("bill", 0);
        double Price = totalPrice - (totalPrice* 0.1);

        String paymentDetails = "Your total bill after 10% discount is " + f.format(Price);
        tvPayment.setText(paymentDetails);


        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://p-y.tm/Jv-43cO"));
                startActivity(intent);
            }
        });
    }
}
