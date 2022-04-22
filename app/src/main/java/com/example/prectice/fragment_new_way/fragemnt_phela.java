package com.example.prectice.fragment_new_way;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prectice.R;
import com.example.prectice.databinding.FragmentFragemntPhelaBinding;


public class fragemnt_phela extends Fragment {
    FragmentFragemntPhelaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentFragemntPhelaBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnfirsttosecond.setOnClickListener(view1 -> {

            Navigation.findNavController(getView()).navigate(R.id.action_fragemnt_phela_to_fragment_dusra);

        });

    }
}