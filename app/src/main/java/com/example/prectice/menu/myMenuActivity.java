package com.example.prectice.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityMyMenuBinding;

public class myMenuActivity extends AppCompatActivity {
    private ActivityMyMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMyMenuBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.my_menu);
        return super.onCreateOptionsMenu(menu);
    }
}