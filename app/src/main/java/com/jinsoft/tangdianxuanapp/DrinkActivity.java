package com.jinsoft.tangdianxuanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DrinkActivity extends AppCompatActivity {


    List<Food> listDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        listDrink = new ArrayList<>();
        listDrink.add(new Food("Coca cola", 800, "Gaseosa", R.drawable.drinksimg1));
        listDrink.add(new Food("Es caliente y base de cafe", 1500, "Capuccino", R.drawable.drinksimg2));
        listDrink.add(new Food("ES CALIENTE", 800, "Cafe", R.drawable.drinksimg3));
        listDrink.add(new Food("tiene alcohol", 1500, "Coctel", R.drawable.drinksimg4));
        listDrink.add(new Food("Coca cola", 800, "Gaseosa", R.drawable.drinksimg1));
        listDrink.add(new Food("Es caliente y base de cafe", 1500, "Capuccino", R.drawable.drinksimg2));


        RecyclerView mRV = (RecyclerView) findViewById(R.id.recyclerViewId);

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, listDrink);
        mRV.setLayoutManager(new GridLayoutManager(this, 2));
        mRV.setAdapter(myAdapter);
        mRV.setHasFixedSize(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
