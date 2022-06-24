package com.example.prectice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.prectice.databinding.ActivityPracticeBinding;
import com.google.android.material.snackbar.Snackbar;

public class practice extends AppCompatActivity
{
    private ActivityPracticeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPracticeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}