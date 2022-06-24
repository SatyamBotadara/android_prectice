package com.example.prectice.fragment_using_navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.prectice.R;


public class second_fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button b1=view.findViewById(R.id.btn_second_first);
        Button b2=view.findViewById(R.id.btn_second_third);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc=Navigation.findNavController(view);
                nc.popBackStack();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc=Navigation.findNavController(view);
                nc.navigate(R.id.third_fragment);
            }
        });
    }
}