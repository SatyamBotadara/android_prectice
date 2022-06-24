package com.example.prectice.Fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityHolderBinding;

public class holderActivity extends AppCompatActivity {
    private ActivityHolderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding=ActivityHolderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.fcv,new fragment_first());
        ft.commit();

        binding.btnFrag.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String s=fm.findFragmentById(R.id.fcv).getClass().getSimpleName();
                Log.i("frag", s);

            }
        });

    }



}