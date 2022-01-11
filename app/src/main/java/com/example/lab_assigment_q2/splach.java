package com.example.lab_assigment_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class splach extends AppCompatActivity {

    private Button start;
    private ImageView man;
    private  Intent intent;
    private Animation top_animation,bottom_animation;
    private TextView bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        this.start=findViewById(R.id.start);
        this.man=findViewById(R.id.man);
        this.bmi=findViewById(R.id.BMI);
        this.top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        this.bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        top_animation.setDuration(2500);
        bottom_animation.setDuration(2500);
        this.bmi.setAnimation(top_animation);
        this.man.setAnimation(bottom_animation);
        this.start.setAnimation(bottom_animation);
        this.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(getBaseContext(),MainActivity.class));
            }
        });

    }
}