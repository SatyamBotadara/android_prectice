package com.example.prectice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        Thread t=new Thread(new splase());
        t.start();
    }


    class splase implements  Runnable{

        @Override
        public void run() {
            try
            {
                Thread.sleep(5000);
                Intent i=new Intent(splashScreenActivity.this,MainActivity.class);
                startActivity(i);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }


}


