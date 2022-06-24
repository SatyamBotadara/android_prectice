package com.example.prectice.fragment_using_navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityNavigationHolderBinding;

import java.util.ArrayList;

public class navigation_holder extends AppCompatActivity {
    private ActivityNavigationHolderBinding binding;
    private ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNavigationHolderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=new ArrayList<>();
        list.add("phela_fragment");
        list.add("second_fragment");
        list.add("third_fragment");

        Button b1=findViewById(R.id.next);
        Button b2=findViewById(R.id.prev);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String s= Navigation.findNavController(navigation_holder.this,R.id.nav_host_fragment).getCurrentDestination().getLabel().toString();
                Integer index=list.indexOf(s);

                if(index>=0&&index<list.size()-1)
                {

                String nextString=list.get(index+1);

                NavController nc= Navigation.findNavController(navigation_holder.this,R.id.nav_host_fragment);
                nc.navigate(getResources().getIdentifier(nextString,"id",getPackageName()));
                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String s=Navigation.findNavController(navigation_holder.this,R.id.nav_host_fragment).getCurrentDestination().getLabel().toString();
                Integer index=list.indexOf(s);

                if(index>0&&index<list.size())
                {
                    String nexts=list.get(index-1);
                    Navigation.findNavController(navigation_holder.this,R.id.nav_host_fragment).popBackStack();
                }

            }
        });


    }
}