package com.example.prectice.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivitySeekbarBinding;

public class seekbarActivity extends AppCompatActivity implements  SeekBar.OnSeekBarChangeListener {

    private ActivitySeekbarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySeekbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.seekbarBlue.setOnSeekBarChangeListener(this);
        binding.seekbarGreen.setOnSeekBarChangeListener(this);
        binding.seekbarRed.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int blue=binding.seekbarBlue.getProgress();
        int red=binding.seekbarRed.getProgress();
        int green=binding.seekbarGreen.getProgress();

        binding.imv.setBackgroundColor(Color.rgb(red,green,blue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}