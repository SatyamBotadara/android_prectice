package com.example.prectice.login_registation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.prectice.R;
import com.example.prectice.databinding.AcitivityLinearBinding;
import com.example.prectice.databinding.ActivityRegistrationBinding;

public class registration_activity extends AppCompatActivity {

    private ActivityRegistrationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding= ActivityRegistrationBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.RegisterToLogin.setOnClickListener(view -> {
            Intent i=new Intent(registration_activity.this,login_activity.class);
            startActivity(i);
        });

    }
}