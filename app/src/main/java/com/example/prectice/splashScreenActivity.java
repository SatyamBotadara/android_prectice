package com.example.prectice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.prectice.databinding.ActivityLoginBinding;
import com.example.prectice.databinding.ActivitySplashScreenBinding;
import com.example.prectice.login_registation_app.login_activity;

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
            public void run(){

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i=new Intent(splashScreenActivity.this,login_activity.class);
                startActivity(i);
                finish();
            }
        }).start();

    }
}