package com.example.prectice.navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityMynavigationDrawerBinding;

public class mynavigation_drawer extends AppCompatActivity {

    private ActivityMynavigationDrawerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMynavigationDrawerBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.drwableLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
//        binding.drwableLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        binding.toolbarLayout.toolbar.setNavigationOnClickListener(view -> {
            binding.drwableLayout.openDrawer(Gravity.LEFT);
        });


    }

}