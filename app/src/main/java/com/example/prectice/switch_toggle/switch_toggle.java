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

        binding.getRoot().setBackgroundColor(Color.rgb(100,100,100));

        // swtich

        binding.swtichComponent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    binding.imageView.setVisibility(View.GONE);
                }
                else
                {
                    binding.imageView.setVisibility(View.VISIBLE);
                }

            }
        });

        //checkbox

        binding.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    binding.getRoot().setBackgroundColor(Color.rgb(200,10,200));
                }
                else
                {
                    binding.getRoot().setBackgroundColor(Color.rgb(100,100,100));
                }

            }
        });

        // toggle button

        binding.togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                      binding.getRoot().setBackgroundResource(R.drawable.index);
                }
                else
                {
                    binding.getRoot().setBackgroundColor(Color.rgb(100,100,100));
                }
            }
        });


    }

}