package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.String.format;

public class orderDetailActivity extends AppCompatActivity {
     TextView tvOrderDetail;

     DecimalFormat f = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        tvOrderDetail = findViewById(R.id.tvOrderDetail);

        String price = getIntent().getExtras().getString("Price");
        String orderName = getIntent().getExtras().getString("OrderName");
        Double total = Double.parseDouble(price) +
                Double.parseDouble(price)*0.055 +
                Double.parseDouble(price)*0.055;



        String details = "You have selected: " + orderName + "\n" +
                         "Order Price      : " + price  + "\n" +
                         "SGST             : 5.5% " + "\n" +
                         "GGST             : 5.5% " + "\n" +
                         "Total Order Price: " + (f.format(total));
                         tvOrderDetail.setText(details);


    }
}
