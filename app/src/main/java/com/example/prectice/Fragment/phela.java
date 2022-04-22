package com.example.prectice.Fragment;

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
import com.example.prectice.databinding.FragmentPhela2Binding;


public class phela extends Fragment {

    private FragmentPhela2Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentPhela2Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnPhelaGoa.setOnClickListener(view1 -> {

            FragmentManager fm=getParentFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_fcv,new goa_fragment());
            ft.addToBackStack(null);
            ft.commit();
        });
    }
}