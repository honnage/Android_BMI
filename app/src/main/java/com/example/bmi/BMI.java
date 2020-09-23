package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    String msgW;
    String msgH;
    String BMI;
    String Lavel1 = "Weight less than standard";
    String Lavel2 = "Normal weight";
    String Lavel3 = "Obesity Level 1";
    String Lavel4 = "Obesity Level 2";
    String Lavel5 = "Obesity Level 3";

    TextView TvMsgWeightShow;
    TextView TvMsgHeightShow;
    TextView TvBMI;
    TextView TvLavelBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        TvMsgWeightShow = findViewById(R.id.idEtWeightShow);
        TvMsgHeightShow = findViewById(R.id.idEtHeightShow);
        TvBMI = findViewById(R.id.idBMI);
        TvLavelBMI = findViewById(R.id.idStrLavelBMI);

        Intent i = getIntent();
        msgW = i.getStringExtra("MSG_W");
        msgH = i.getStringExtra("MSG_H");
        TvMsgWeightShow.setText(msgW);
        TvMsgHeightShow.setText(msgH);

        double ValueW = Double.parseDouble(msgW);
        double ValueH = Double.parseDouble(msgH);
        double setW = ValueW;
        double setH = ValueH;
        double ValueDown = ( setH / 100 );
        double DownPow = ValueDown * ValueDown;
        double ValueBMI = ValueW / DownPow;

        String strBMI = Double.toString(ValueBMI);
        TvBMI.setText(strBMI);

        if(ValueBMI < 18.5){
            TvLavelBMI.setText(Lavel1);
            TvLavelBMI.setTextColor(Color.rgb(0,153,153)); //สีฟ้า

        }else if(ValueBMI >= 18.5 && ValueBMI < 23){
            TvLavelBMI.setText(Lavel2);
            TvLavelBMI.setTextColor(Color.rgb(0,204,0)); //สีเขียว

        }else if(ValueBMI >= 23 && ValueBMI < 25){
            TvLavelBMI.setText(Lavel3);
            TvLavelBMI.setTextColor(Color.rgb(247,206,0)); //สีเหลือง

        }else if(ValueBMI >= 25 && ValueBMI < 30) {
            TvLavelBMI.setText(Lavel4);
            TvLavelBMI.setTextColor(Color.rgb(255,128,0)); //สีส้ม

        }else{
            TvLavelBMI.setText(Lavel5);
            TvLavelBMI.setTextColor(Color.rgb(200,0,0)); //สีแดดง

        }






    }
}