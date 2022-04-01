package com.example.prectice.object_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prectice.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class pheli_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheli);

        Button b=findViewById(R.id.pheli_calculate);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // collect the data from the xml file

                    // student details

                    EditText edt1=findViewById(R.id.pheli_id_edt);
                    EditText edt2=findViewById(R.id.pheli_name_edt);

                    //subject details

                    EditText edt3=findViewById(R.id.pheli_physics_edt);
                    EditText edt4=findViewById(R.id.pheli_chemistry_edt);
                    EditText edt5=findViewById(R.id.pheli_maths_edt);
                    EditText edt6=findViewById(R.id.pheli_computer_edt);
                    EditText edt7=findViewById(R.id.pheli_english_edt);

                    // converat data

                    int id_studnet=Integer.parseInt(edt1.getText().toString());
                    String name=edt2.getText().toString();

                    // define array list
                    ArrayList<Integer> makrs_arr=new ArrayList<>();

                    makrs_arr.add(Integer.parseInt(edt3.getText().toString()));
                    makrs_arr.add(Integer.parseInt(edt4.getText().toString()));
                    makrs_arr.add(Integer.parseInt(edt5.getText().toString()));
                    makrs_arr.add(Integer.parseInt(edt6.getText().toString()));
                    makrs_arr.add(Integer.parseInt(edt7.getText().toString()));


                // create object of the data

                people p=new people(name,id_studnet,makrs_arr);

                // pass to the second activity

                Intent i=new Intent(pheli_activity.this,dusri_activity.class);
                i.putExtra("data",p);
                startActivity(i);

            }
        });

    }
}