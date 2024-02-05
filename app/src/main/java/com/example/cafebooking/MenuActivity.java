package com.example.cafebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    ListView lvMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lvMenu = findViewById(R.id.lvMenu);

       final String[] mFood = {"Tea", "Coffee","Maggie","Cappuccino","Pizza","Cold Drinks","Pasta","Lasagna","Cheese Toast","Burger"};
       final String[] mFoodPrice = {"20", "40","35","80","100","20","50","60","60","60"};


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mFood);
        lvMenu.setAdapter(arrayAdapter);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }

                if(position == 1)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 2)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 3)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 4)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 5)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 6)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 7)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 8)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }
                if(position == 9)
                {
                    String price = mFoodPrice[position];
                    String orderName = mFood[position];
                    Intent intent = new Intent(MenuActivity.this, orderDetailActivity.class);
                    intent.putExtra("Price", price);
                    intent.putExtra("OrderName", orderName);
                    startActivity(intent);
                }

            }
        });



    }
}
