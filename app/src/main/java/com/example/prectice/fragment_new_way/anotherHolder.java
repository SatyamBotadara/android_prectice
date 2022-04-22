package com.example.prectice.fragment_new_way;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityAnotherHolderBinding;

public class anotherHolder extends AppCompatActivity {
    ActivityAnotherHolderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding=ActivityAnotherHolderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}