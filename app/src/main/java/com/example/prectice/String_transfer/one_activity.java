package com.example.prectice.String_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.prectice.R;

public class one_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Button b= findViewById(R.id.btn_send);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //name
                EditText edt=findViewById(R.id.edt_one);
                //address
                EditText edt1=findViewById(R.id.edt1_one);
                //collages
                EditText edt2=findViewById(R.id.edt2_one);
                //age
                EditText edt3=findViewById(R.id.edt3_one);

                String name,address,collage_name;
                Integer age;

                name=edt.getText().toString();
                address=edt1.getText().toString();
                collage_name=edt2.getText().toString();
                age=Integer.parseInt(edt3.getText().toString());


                Intent i=new Intent(one_activity.this,two_activity.class);
                i.putExtra("name",name);
                i.putExtra("address",address);
                i.putExtra("collage_name",collage_name);
                i.putExtra("age",age);
                startActivity(i);

            }
        });

    }
}