package com.example.prectice.fragment_slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import android.os.Bundle;
import android.widget.Toast;
import com.example.prectice.R;
import com.example.prectice.databinding.ActivityContainerBinding;

import java.util.ArrayList;

public class container_activity extends AppCompatActivity {
    private ArrayList<String> fragment_arr=new ArrayList<String>();
    private ActivityContainerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityContainerBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        fragment_arr.add("fragment_one");
        fragment_arr.add("fragment_two");
        fragment_arr.add("fragment_three");
        fragment_arr.add("fragment_four");


        binding.btnNext.setOnClickListener(view -> {
            String current_fragment= Navigation.findNavController(this,R.id.fragmentContainerView).getCurrentDestination().getLabel().toString();
            int  pos=fragment_arr.indexOf(current_fragment);
            if(pos<fragment_arr.size()-1)
            {
                Integer id=getResources().getIdentifier(fragment_arr.get(pos+1),"id",getPackageName());
                Navigation.findNavController(this,R.id.fragmentContainerView)
                        .navigate(id);
            }
            else if(pos==3)
            {
                Toast.makeText(container_activity.this,"this is last",Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnPrev.setOnClickListener(view -> {
            String current_fragment= Navigation.findNavController(this,R.id.fragmentContainerView).getCurrentDestination().getLabel().toString();
            int  pos=fragment_arr.indexOf(current_fragment);
            if(pos==0)
            {
                System.exit(1);
            }
            else
            {
                Integer id=getResources().getIdentifier(fragment_arr.get(pos-1),"id",getPackageName());
                Navigation.findNavController(this,R.id.fragmentContainerView)
                        .navigate(id);
            }

        });

    }
}