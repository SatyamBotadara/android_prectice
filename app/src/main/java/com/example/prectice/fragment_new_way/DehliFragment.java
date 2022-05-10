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
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.FragmentDehliBinding;


public class DehliFragment extends Fragment {
    private FragmentDehliBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentDehliBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnFirstSecond.setOnClickListener(view1 -> {


            NavController nv= Navigation.findNavController(getView());
            nv.navigate(R.id.action_dehliFragment_to_goaFragment);

        });

    }
}