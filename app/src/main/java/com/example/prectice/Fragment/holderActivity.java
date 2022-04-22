package com.example.prectice.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityHolder3Binding;


public class holderActivity extends AppCompatActivity {

    private ActivityHolder3Binding binding;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityHolder3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        ft.add(R.id.fragment_fcv,new phela());
        ft.commit();

        binding.fragmentNext.setOnClickListener(view -> {

            //fm.findFragmentById(R.id.fragment_fcv).getClass().getSimpleName()
            FragmentManager fm2=getSupportFragmentManager();
            FragmentTransaction ft2=fm2.beginTransaction();
            String current_name=fm2.findFragmentById(R.id.fragment_fcv).getClass().getSimpleName();

            if(current_name.equals("phela")){


                Log.i("fragment", current_name);
                ft2.replace(R.id.fragment_fcv,new goa_fragment());
                ft2.addToBackStack(null);
                fm2.beginTransaction().commit();
            }
            else if(current_name=="goa_fragment")
            {     ft.replace(R.id.fragment_fcv,new fragment_this_third());
                ft.addToBackStack(null);

            }



            ft.commit();
        });


        binding.fragmentPrev.setOnClickListener(view ->{

            String current_name=fm.findFragmentById(R.id.fragment_fcv).getClass().getSimpleName();

            if(current_name=="fragment_this_third"){
                ft.replace(R.id.fragment_fcv,new goa_fragment());
                fm.popBackStack();
                ft.commit();
            }
            else if(current_name=="goa_fragment"){
                ft.replace(R.id.fragment_fcv,new phela());
                fm.popBackStack();
                ft.commit();
            }

        });



    }
}