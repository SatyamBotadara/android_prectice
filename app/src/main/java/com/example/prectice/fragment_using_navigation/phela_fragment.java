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
import com.example.prectice.databinding.PhelaFragmentBinding;


public class phela_fragment extends Fragment
{
    private PhelaFragmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=PhelaFragmentBinding.inflate(getLayoutInflater());
        return inflater.inflate(R.layout.phela_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        Button b=view.findViewById(R.id.gotosecond);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController nc=Navigation.findNavController(view);
                nc.navigate(R.id.second_fragment);
            }
        });


    }
}