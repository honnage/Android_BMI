package com.example.bmi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CheckBMI extends AppCompatActivity {
    EditText etMseWeight;
    EditText etMseHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_b_m_i);

        etMseWeight = findViewById(R.id.idEtWeightShow);
        etMseHeight = findViewById(R.id.idEtHeightShow);
    }

    public void goPageBMI(View v){
        Intent i = new Intent(this,BMI.class);
        String strW = etMseWeight.getText().toString();
        String strH = etMseHeight.getText().toString();
        i.putExtra("MSG_W",strW);
        i.putExtra("MSG_H",strH);

        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}