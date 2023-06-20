package com.example.animationdemotwo.activityanim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.animationdemotwo.R;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
    }
    public void openFirst(View view)
    {
        Intent intent = new Intent(MainActivityTwo.this, MainActivityOne.class);
        startActivity(intent);

    }
}