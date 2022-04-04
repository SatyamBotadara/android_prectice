package com.example.prectice.cordinator_layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prectice.databinding.ActivityCordinatorLayoutBinding;


public class cordinator_layout extends AppCompatActivity {
    private ActivityCordinatorLayoutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityCordinatorLayoutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


    }
}