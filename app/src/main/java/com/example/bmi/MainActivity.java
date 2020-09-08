package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void WhatBMI(View v){
        Intent i = new Intent(this,WhatBMI.class);
        startActivity(i);
    }

    public void CheckBMI (View v){
        Intent i = new Intent(this,CheckBMI.class);
        startActivity(i);
    }

    public void FoodForHealth (View v){
        Intent i = new Intent(this,FoodForHealth.class);
        startActivity(i);
    }
}