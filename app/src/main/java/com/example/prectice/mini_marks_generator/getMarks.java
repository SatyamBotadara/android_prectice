package com.example.prectice.mini_marks_generator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.prectice.databinding.ActivityGetMarksBinding;

import java.util.ArrayList;

public class getMarks extends AppCompatActivity {

    private ActivityGetMarksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityGetMarksBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.getMarksSubmit.setOnClickListener(view -> {

            String name=binding.getMarksName.getText().toString();
            Integer id=Integer.parseInt(binding.getMarksId.getText().toString());



            ArrayList<Integer> marks=new ArrayList<>();

            marks.add(Integer.parseInt(binding.getMarksPhysics.getText().toString()));
            marks.add(Integer.parseInt(binding.getMarksChemsitry.getText().toString()));
            marks.add(Integer.parseInt(binding.getMarksComputer.getText().toString()));
            marks.add(Integer.parseInt(binding.getMarksEnglish.getText().toString()));


            Student s=new Student(name,id,marks);

            Intent i=new Intent(getMarks.this,display_marks.class);
            i.putExtra("data",s);
            startActivity(i);

        });
    }
}