package com.example.animationdemotwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Toasty extends AppCompatActivity {

    private static Object LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);
    }
    public void openToasty(View view)
    {
        //Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
        //Toasty.error(getApplicationContext(), "This is an error toast.", Toasty.LENGTH_SHORT, true).show();
        //Toasty.warning(getApplicationContext(), "Beware of the dog.", Toasty.LENGTH_SHORT, true).show();
       // Toasty.custom(getApplicationContext(), "I'm a custom Toast", R.drawable.battery_0, R.color.purple_200, 500, true,true).show();
    }



}