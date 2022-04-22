package com.example.prectice.switch_toggle;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivitySwitchToggleBinding;

public class switch_toggle extends AppCompatActivity {

    private ActivitySwitchToggleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySwitchToggleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.getRoot().setBackgroundColor(Color.rgb(55,252,23));
        binding.checkbox.setOnCheckedChangeListener((compoundButton, b) -> {
                if(b)
                {
                    binding.getRoot().setBackgroundColor(Color.rgb(255,252,231));
                }
                else
                {
                    binding.getRoot().setBackgroundColor(Color.rgb(55,252,23));
                }
        });

        binding.toggleButton.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
            {
                binding.toggelImv.setVisibility(View.GONE);
            }
            else
            {
                binding.toggelImv.setVisibility(View.VISIBLE);
            }
        });

        binding.switch1.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                binding.getRoot().setBackgroundResource(R.drawable.ic_launcher_background);
            }
            else
            {

            }
        });



    }

}