package com.example.prectice.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prectice.R;
import com.example.prectice.databinding.FragmentSecondBinding;


public class secondFragment extends Fragment {

    private FragmentSecondBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.secondToThird.setOnClickListener(view1 -> {
            FragmentManager fm=getParentFragmentManager();
            FragmentTransaction ft= fm.beginTransaction();

            ft.replace(R.id.fcv,new ThirdFragment());
            ft.addToBackStack("hello");
            ft.commit();

        });

        binding.secondToFirst.setOnClickListener(view1 -> {
            FragmentManager fm=getParentFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fcv,new phela_fragment());
            fm.popBackStack();
            ft.commit();
        });


    }
}