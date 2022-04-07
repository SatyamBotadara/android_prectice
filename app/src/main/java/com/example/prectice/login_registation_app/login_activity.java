package com.example.prectice.login_registation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityLoginBinding;

public class login_activity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.loginToSignup.setOnClickListener(view -> {
            Intent i=new Intent(login_activity.this,registration_activity.class);
            startActivity(i);
        });
    }
}