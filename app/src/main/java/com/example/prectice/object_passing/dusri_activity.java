package com.example.prectice.object_passing;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.prectice.R;

public class dusri_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dusri);

        Intent i=getIntent();
        people p=(people)i.getSerializableExtra("data");

        // get the view

        TextView tv_id,tv_name,tv_total,tv_avg,tv_percentage;

        tv_id=findViewById(R.id.dusri_id_tv);
        tv_name=findViewById(R.id.dursi_name_tv);
        tv_avg=findViewById(R.id.dusri_avg_tv);
        tv_total=findViewById(R.id.dusri_total_marks_tv);
        tv_percentage=findViewById(R.id.dusri_percentage_tv);

        //set the data

        tv_id.setText(String.valueOf(p.get_id()));
        tv_name.setText(p.get_name());
        tv_total.setText(String.valueOf(p.total_marks()));
        tv_avg.setText(String.valueOf(p.avg_marks()));
        tv_percentage.setText(String.valueOf(p.percentage())+"%");

    }
}