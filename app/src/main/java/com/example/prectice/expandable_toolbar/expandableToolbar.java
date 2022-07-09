package com.example.prectice.expandable_toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prectice.databinding.ActivityExpandableToolbarBinding;

public class expandableToolbar extends AppCompatActivity {

    private ActivityExpandableToolbarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityExpandableToolbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
    }
}