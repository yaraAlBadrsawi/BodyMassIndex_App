package com.example.lab_assigment_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText length;
    private EditText weight;
    private TextView result;
    private Button calc;
    private Button clear;
    private TextView value;
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imageView1=findViewById(R.id.imageView1);
        this.imageView2=findViewById(R.id.imageView2);
        this.imageView3=findViewById(R.id.imageView3);
        this.imageView4=findViewById(R.id.imageView4);
        this.imageView5=findViewById(R.id.imageView5);
        this.imageView6=findViewById(R.id.imageView6);
        this.length=findViewById(R.id.length);
        this.weight=findViewById(R.id.weight);
        this.result=findViewById(R.id.result);
        this.calc=findViewById(R.id.click);
        this.clear=findViewById(R.id.clear);
        this.value=findViewById(R.id.value);
        this.calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!length.getText().toString().isEmpty())&&(!weight.getText().toString().isEmpty())){
                    Double len =Double.parseDouble(length.getText().toString());
                    Double wig = Double.parseDouble(weight.getText().toString());
                    Double mass=wig/(len*len);

                   if(mass<18.5){
                       result.setText(R.string.underWeight);
                       value.setText("your body mass is :"+ mass);

                       value.setTextColor(getColor(R.color.yellow));
                        result.setTextColor(getColor(R.color.yellow));
                        imageView1.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView3.setVisibility(View.INVISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);


                   }
                   else if (mass>18.5&&mass<24.9){
                       result.setText(R.string.NormalWeight);
                       value.setText("your body mass is :"+ mass);
                       value.setTextColor(getColor(R.color.green));
                       result.setTextColor(getColor(R.color.green));
                       imageView1.setVisibility(View.INVISIBLE);
                       imageView2.setVisibility(View.VISIBLE);
                       imageView3.setVisibility(View.INVISIBLE);
                       imageView4.setVisibility(View.INVISIBLE);
                       imageView5.setVisibility(View.INVISIBLE);
                       imageView6.setVisibility(View.INVISIBLE);

                   }
                   else if (mass>25&&mass<29.9){
                       result.setText(R.string.overWeight);
                       result.setTextColor(getColor(R.color.blue));
                       value.setText("your body mass is :"+ mass);
                       value.setTextColor(getColor(R.color.blue));
                       imageView3.setVisibility(View.VISIBLE);
                       imageView2.setVisibility(View.INVISIBLE);
                       imageView4.setVisibility(View.INVISIBLE);
                       imageView1.setVisibility(View.INVISIBLE);
                       imageView5.setVisibility(View.INVISIBLE);
                       imageView6.setVisibility(View.INVISIBLE);

                   }
                   else if(mass>30&&mass<34.9){
                       result.setText(R.string.obeseType1);
                       result.setTextColor(getColor(R.color.orange1));
                       value.setText("your body mass is :"+ mass);
                       value.setTextColor(getColor(R.color.orange1));
                       imageView1.setVisibility(View.INVISIBLE);
                       imageView2.setVisibility(View.INVISIBLE);
                       imageView3.setVisibility(View.INVISIBLE);
                       imageView4.setVisibility(View.VISIBLE);
                       imageView5.setVisibility(View.INVISIBLE);
                       imageView6.setVisibility(View.INVISIBLE);
                   }else if(mass>35&&mass<39.9){
                       result.setText(R.string.obeseType2);
                       result.setTextColor(getColor(R.color.orange2));
                       value.setText("your body mass is :"+ mass);
                       value.setTextColor(getColor(R.color.orange2));
                       imageView1.setVisibility(View.INVISIBLE);
                       imageView2.setVisibility(View.INVISIBLE);
                       imageView3.setVisibility(View.INVISIBLE);
                       imageView4.setVisibility(View.INVISIBLE);
                       imageView5.setVisibility(View.VISIBLE);
                       imageView6.setVisibility(View.INVISIBLE);

                   }else {
                       result.setText(R.string.obeseType3);
                       value.setText("your body mass is :"+ mass);
                       value.setTextColor(getColor(R.color.red));
                       imageView6.setVisibility(View.VISIBLE);
                       result.setTextColor(getColor(R.color.red));
                       imageView1.setVisibility(View.INVISIBLE);
                       imageView2.setVisibility(View.INVISIBLE);
                       imageView3.setVisibility(View.INVISIBLE);
                       imageView4.setVisibility(View.INVISIBLE);
                       imageView5.setVisibility(View.INVISIBLE);
                   }
            }}
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                length.setText(null);
                weight.setText(null);
                result.setText(null);
                value.setText(null);
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
            }
        });

    }
}