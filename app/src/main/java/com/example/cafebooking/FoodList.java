package com.example.cafebooking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodList extends AppCompatActivity {

    ListView lvFoodList;
    String[] mFood = {"Tea", "Coffee","Maggie","Cappuccino","Pizza","Cold Drinks","Pasta","Lasagna","Cheese Toast","Burger"};
    String[] mFoodPrice = {"20", "40","35","80","100","20","50","60","60","60"};
    int[] mImage = {(R.drawable.tea), (R.drawable.coffee),R.drawable.maggie,
                     R.drawable.cappucino, R.drawable.pizza, R.drawable.colddrinks,
                     R.drawable.pasta, R.drawable.lasagna, R.drawable.cheesetoast, R.drawable.burger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        final String date = getIntent().getStringExtra("date");
         final String time = getIntent().getStringExtra("time");
        final int tableNumber = getIntent().getIntExtra("tableNumber",0);


        lvFoodList = findViewById(R.id.lvFoodList);

        MyAdapter adapter = new MyAdapter(FoodList.this,mFood, mFoodPrice, mImage);
        lvFoodList.setAdapter(adapter);

        lvFoodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 1)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 2)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 3)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 4)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 5)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 6)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 7)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 8)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }
                if(position == 9)
                {
                    Intent intent = new Intent(FoodList.this, FoodTableConfirmation.class);
                    intent.putExtra("date", date);
                    intent.putExtra("time", time);
                    intent.putExtra("tableNumber", tableNumber);
                    intent.putExtra("image",(mImage[position]));
                    intent.putExtra("foodName", mFood[position]);
                    intent.putExtra("foodPrice", mFoodPrice[position]);
                    startActivity(intent);
                }


            }
        });

    }
    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rFood[];
        String rFoodPrice[];
       int rImage[];

         MyAdapter(@NonNull Context c,String foodName[], String foodPrice[],int image[]) {
            super(c, R.layout.imagelist, R.id.tvName,foodName);
            this.context = c;
            this.rFood = foodName;
            this.rFoodPrice = foodPrice;
            this.rImage = image;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View imagelist = layoutInflater.inflate(R.layout.imagelist, parent, false);

            ImageView images = imagelist.findViewById(R.id.ivFood);
            TextView name = imagelist.findViewById(R.id.tvName);
            TextView price = imagelist.findViewById(R.id.tvPrice);

           images.setImageResource(rImage[position]);
            name.setText(rFood[position]);
            price.setText(rFoodPrice[position]);



             return imagelist;
        }
    }
}
