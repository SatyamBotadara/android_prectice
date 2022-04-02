package com.example.prectice.view_data_binding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.prectice.databinding.ActivityViewBindingBinding;

public class view_binding extends AppCompatActivity {

    protected ActivityViewBindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityViewBindingBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

    }


}