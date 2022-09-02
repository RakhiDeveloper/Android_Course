package com.erinfa.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {
    View first_line,second_line,third_line,fourth_line,fifth_line,sixth_line;
    TextView appName,appName1,tag_line;
    Animation topAnimation, bottomAnimation, middleAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        first_line=findViewById(R.id.first_line);
        second_line=findViewById(R.id.second_line);
        third_line=findViewById(R.id.third_line);
        fourth_line=findViewById(R.id.fourth_line);
        fifth_line=findViewById(R.id.fifth_line);
        sixth_line=findViewById(R.id.sixth_line);
        appName=findViewById(R.id.appName);
        appName1=findViewById(R.id.appName1);
        tag_line=findViewById(R.id.tag_line);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation= AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        first_line.setAnimation(topAnimation);
        second_line.setAnimation(topAnimation);
        third_line.setAnimation(topAnimation);
        fourth_line.setAnimation(topAnimation);
        fifth_line.setAnimation(topAnimation);
        sixth_line.setAnimation(topAnimation);
        appName.setAnimation(middleAnimation);
        appName1.setAnimation(bottomAnimation);
        tag_line.setAnimation(middleAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);





    }
}