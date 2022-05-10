package com.example.prectice.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityHolderBinding;

import java.util.ArrayList;

public class holder_activity extends AppCompatActivity {
    private ActivityHolderBinding binding;
    private ArrayList<String> fragments=new ArrayList<>();

    @Override
    protected void onResume() {
        super.onResume();

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.fcv,new phela_fragment());
        ft.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityHolderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // fragment manager
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        //array list
        fragments.add("phela_fragment");
        fragments.add("secondFragment");
        fragments.add("ThirdFragment");

        binding.btnNext.setOnClickListener(view -> {
            String current_name=fm.findFragmentById(R.id.fcv).getClass().getSimpleName();


        });

        binding.btnPrev.setOnClickListener(view -> {
            String name=fm.findFragmentById(R.id.fcv).getClass().getSimpleName();


        });


    }
    public void manageTransaction(FragmentManager fm,FragmentTransaction ft,String current_name){

    }


}