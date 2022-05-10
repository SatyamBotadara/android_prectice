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
import com.example.prectice.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentThirdBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.thirdToSecond.setOnClickListener(view1 -> {
            FragmentManager fm=getParentFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fcv,new secondFragment());
            fm.popBackStack();

            ft.commit();
        });
    }
}