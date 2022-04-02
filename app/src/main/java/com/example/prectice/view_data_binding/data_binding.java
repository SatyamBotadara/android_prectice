package com.example.prectice.view_data_binding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.prectice.databinding.ActivityDataBindingBinding;

public class data_binding extends AppCompatActivity {

    private ActivityDataBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityDataBindingBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnenter.setOnClickListener(view -> {
            Student s=new Student("satyam","botad");
            binding.setObj(s);
            binding.setHello(19);
        });

    }
}