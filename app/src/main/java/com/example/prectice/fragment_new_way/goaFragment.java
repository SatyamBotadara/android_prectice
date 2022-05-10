package com.example.prectice.fragment_new_way;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prectice.databinding.FragmentGoaBinding;


public class goaFragment extends Fragment {

    private FragmentGoaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        binding=FragmentGoaBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnGoback.setOnClickListener(view1 -> {
            NavController nc= Navigation.findNavController(getView());
            nc.popBackStack();
        });
    }
}