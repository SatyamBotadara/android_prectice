package com.example.prectice.mini_marks_generator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.prectice.databinding.ActivityDisplayMarksBinding;

public class display_marks extends AppCompatActivity {

    private ActivityDisplayMarksBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityDisplayMarksBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Intent i=getIntent();
        Student s=(Student)i.getSerializableExtra("data");
        binding.setObj(s);

    }
}