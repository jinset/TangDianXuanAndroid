package com.jinsoft.tangdianxuanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
