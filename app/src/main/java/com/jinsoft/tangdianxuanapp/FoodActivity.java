package com.jinsoft.tangdianxuanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FoodActivity extends AppCompatActivity {

    private TextView tvTitle, tvDescription, tvPrice;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        tvDescription = (TextView) findViewById(R.id.foodViewDescription);
        tvTitle = (TextView) findViewById(R.id.foodViewTitle);
        tvPrice = (TextView) findViewById(R.id.foodViewPrice);
        img = (ImageView) findViewById(R.id.foodViewImage);

        Intent intent = getIntent();

        String description = intent.getExtras().getString("Description");
        int price = intent.getExtras().getInt("Price");
        String title = intent.getExtras().getString("Title");
        int thumbnail = intent.getExtras().getInt("Thumbnail");


        tvDescription.setText(description);
        tvTitle.setText(title);
        tvPrice.setText(String.valueOf(price));
        img.setImageResource(thumbnail);

    }
}
