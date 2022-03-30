package com.example.prectice.String_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prectice.R;

public class two_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent i=getIntent();


        Integer age= i.getIntExtra("age",18);
        String address=i.getStringExtra("address");
        String name=i.getStringExtra("name");
        String collage_name=i.getStringExtra("collage_name");

          TextView tv1=  findViewById(R.id.tv1);
          TextView tv2=findViewById(R.id.tv2);
          TextView tv3=findViewById(R.id.tv3);
          TextView tv4=findViewById(R.id.tv4);

          tv1.setText("Name:"+name);
          tv2.setText("address:"+address);
          tv3.setText("collage name:"+collage_name);
          tv4.setText("age:"+age.toString());

    }
}