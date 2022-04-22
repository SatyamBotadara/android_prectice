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
import com.example.prectice.databinding.FragmentThisThirdBinding;


public class fragment_this_third extends Fragment {

    private FragmentThisThirdBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentThisThirdBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.thirdToGoa.setOnClickListener(view1 -> {
            FragmentManager fm=getParentFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();

            ft.replace(R.id.fragment_fcv,new goa_fragment());
            fm.popBackStack();
            ft.commit();
        });
    }
}