package com.example.animationdemotwo.activityanim.btryanim;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.animationdemotwo.R;

public class BatteryAnimation extends AppCompatActivity {
    ImageView bat_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_animation);
        bat_img=(ImageView)findViewById(R.id.bat_img);
        bat_img.setBackgroundResource(R.drawable.battery_item);
        AnimationDrawable animationDrawable=(AnimationDrawable) bat_img.getBackground();
        animationDrawable.start();
    }
}