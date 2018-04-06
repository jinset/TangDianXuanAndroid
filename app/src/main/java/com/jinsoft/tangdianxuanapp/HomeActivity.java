package com.jinsoft.tangdianxuanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goDrink(View view) {
        Intent intent = new Intent(HomeActivity.this, DrinkActivity.class);
        startActivity(intent);
    }

    public void goDish(View view) {
        Intent intent = new Intent(HomeActivity.this, DishActivity.class);
        startActivity(intent);
    }
}
