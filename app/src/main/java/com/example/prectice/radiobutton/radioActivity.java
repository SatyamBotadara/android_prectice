package com.example.prectice.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityRadioBinding;

public class radioActivity extends AppCompatActivity {

    private ActivityRadioBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityRadioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioJava:
                        Toast.makeText(radioActivity.this, "java", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioKotlin:
                        Toast.makeText(radioActivity.this, "kotlin", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiobuttonc:
                        Toast.makeText(radioActivity.this, "c", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioPaython:
                        Toast.makeText(radioActivity.this, "paython", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }
}