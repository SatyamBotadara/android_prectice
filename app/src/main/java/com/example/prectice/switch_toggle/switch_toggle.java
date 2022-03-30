package com.example.prectice.switch_toggle;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.example.prectice.databinding.ActivitySwitchToggleBinding;

public class switch_toggle extends AppCompatActivity implements  CompoundButton.OnCheckedChangeListener{

    private ActivitySwitchToggleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySwitchToggleBinding.inflate(getLayoutInflater());
        binding.getRoot().setBackgroundColor(Color.rgb(93,94,23));

        binding.switch1.setOnCheckedChangeListener(this);

        binding.toggleButton.setOnCheckedChangeListener(this);

        binding.checkbox.setOnCheckedChangeListener(this);

        setContentView(binding.getRoot());
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            binding.getRoot().setBackgroundColor(Color.rgb(73,34,22));
        }
        else {
            binding.getRoot().setBackgroundColor(Color.rgb(93,94,23));
        }
    }
}