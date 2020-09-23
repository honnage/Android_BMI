package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
        Uri map = Uri.parse("geo:0,0?q="+"ร้านอาหารเพื่อสุขภาพ");
        Intent i = new Intent(Intent.ACTION_VIEW,map);
        startActivity(i);
        if(i.resolveActivity(getPackageManager()) != null )
            startActivity(i);
        else
            Log.d("ImpliotImtents","cannit handle this intent.");
    }
}