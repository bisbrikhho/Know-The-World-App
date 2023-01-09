package com.example.knowtheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button weather,country,flights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        AnimationDrawable drawable = (AnimationDrawable) layout.getBackground();
        drawable.setEnterFadeDuration(2500);
        drawable.setExitFadeDuration(5000);
        drawable.start();

       weather = findViewById(R.id.wbtn);
       country = findViewById(R.id.cbtn);
       flights = findViewById(R.id.fbtn);

       weather.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, weather.class);
           }
       });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Countrys.class);

            }
        });

        flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, flights.class);

            }
        });

    }
}