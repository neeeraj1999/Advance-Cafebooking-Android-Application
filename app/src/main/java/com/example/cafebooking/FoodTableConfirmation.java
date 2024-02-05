package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.text.DecimalFormat;

public class FoodTableConfirmation extends AppCompatActivity {

    ImageView ivImage1;
    TextView tvOrderInfo, tvDetails;
    Button btnMap2, btnGetDetails, btnPay;
    EditText etQuantity;
    DecimalFormat f = new DecimalFormat("0.00");
    Firebase dFirebase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_table_confirmation);

        Firebase.setAndroidContext(this);
        dFirebase = new Firebase("https://cafebooking-46d00.firebaseio.com/");

        ivImage1 = findViewById(R.id.ivImage1);
        tvOrderInfo = findViewById(R.id.tvOrderInfo);
        tvDetails = findViewById(R.id.tvDetails);
        btnGetDetails = findViewById(R.id.btnGetDetails);
        etQuantity = findViewById(R.id.etQuantity);
        btnMap2 = findViewById(R.id.btnMap2);
        btnPay = findViewById(R.id.btnPay);


        final String date = getIntent().getStringExtra("date");
        final String time = getIntent().getStringExtra("time");
        final int tableNumber = getIntent().getIntExtra("tableNumber", 0);
        final String foodPrice = getIntent().getStringExtra("foodPrice");
        final String foodName = getIntent().getStringExtra("foodName");
        final int Image = getIntent().getIntExtra("image",0);
        final String mail = getIntent().getStringExtra("eMail");
        final String Quantity = etQuantity.getText().toString();




        ivImage1.setImageResource(Image);
        tvOrderInfo.setText("You selected : " + foodName);

        btnGetDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
               String Quantity = etQuantity.getText().toString();

                if(Quantity.isEmpty())
                {
                    Toast.makeText(FoodTableConfirmation.this, "Please enter the Quantity", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    double totalPrice = (Double.parseDouble(foodPrice) +
                            Double.parseDouble(foodPrice)*0.055 +
                            Double.parseDouble(foodPrice)*0.055) * Integer.parseInt(Quantity);

                    String Details = "You selected : " + foodName + "\n" +
                                             "Price        : " + foodPrice + "\n"+
                                             "Quantity : " + Quantity + "\n" +
                                             "Total Price(including 11% gst)  : " + f.format(totalPrice) + "\n" +
                                             "Date         :" + date + "\n" +
                                             "Time         :" + time + "\n" +
                                             "Table Number :" + tableNumber ;

                            tvDetails.setText(Details);

                    Firebase aFirebase = dFirebase.child("Orders");

                    Firebase firebase = aFirebase.child("Deepak");

                    Firebase firebaseFoodName = firebase.child("food Name");
                    firebaseFoodName.setValue(foodName);

                    Firebase firebaseFoodPrice = firebase.child("food price");
                    firebaseFoodPrice.setValue(foodPrice);

                    Firebase firebaseQuantity = firebase.child("Quantity");
                    firebaseQuantity.setValue(Quantity);

                    Firebase firebaseTotal = firebase.child("Total price");
                    firebaseTotal.setValue(f.format(totalPrice));

                    Firebase firebaseDate = firebase.child("Date");
                    firebaseDate.setValue(date);

                    Firebase firebaseTime = firebase.child("Time");
                    firebaseTime.setValue(time);

                    Firebase firebaseTable = firebase.child("Table Number");
                    firebaseTable.setValue(tableNumber);


                }
            }
        });


        btnMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String address = "AISSMS, COE, PUNE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + address));
                startActivity(intent);
            }
        });


        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Quantity = etQuantity.getText().toString();

                final double totalPrice = (Double.parseDouble(foodPrice) +
                        Double.parseDouble(foodPrice)*0.055 +
                        Double.parseDouble(foodPrice)*0.055) * Double.parseDouble(Quantity);

                Intent intent = new Intent(FoodTableConfirmation.this, Payment.class);
               intent.putExtra("bill", totalPrice );
                startActivity(intent);

            }
        });






    }
}
