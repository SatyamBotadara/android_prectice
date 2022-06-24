package com.example.prectice.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prectice.R;
import com.example.prectice.databinding.FragmentFirstBinding;


public class fragment_first extends Fragment {

    private FragmentFirstBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        binding=FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}