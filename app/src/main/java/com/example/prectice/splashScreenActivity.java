package com.example.prectice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.airbnb.lottie.animation.content.Content;
import com.example.prectice.databinding.ActivitySplashScreenBinding;

public class splashScreenActivity extends AppCompatActivity {
    ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i=new Intent(splashScreenActivity.this,MainActivity.class);
                startActivity(i);


                finish();
            }
        }).start();


    }
}


