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
import com.example.prectice.databinding.FragmentGoaFragmentBinding;


public class goa_fragment extends Fragment {

    private FragmentGoaFragmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentGoaFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentManager fm=getParentFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();

        binding.goaToThird.setOnClickListener(view1 -> {
                ft.replace(R.id.fragment_fcv,new fragment_this_third());
                ft.addToBackStack(null);
                ft.commit();
        });

        binding.goaToPhela.setOnClickListener(view1 -> {

            ft.replace(R.id.fragment_fcv,new phela());
            fm.popBackStack();
            ft.commit();
        });

    }
}