package com.example.prectice.object_passing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prectice.R;
import com.google.android.material.snackbar.Snackbar;

public class pheli_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheli);

        Button b=findViewById(R.id.btn_obj_send);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,city;

                EditText edt1=findViewById(R.id.objtrans1);
                EditText edt2=findViewById(R.id.objtrans2);

//                Toast.makeText(pheli_activity.this,"this is the toast",Toast.LENGTH_LONG).show();
//                Snackbar.make(view,"this is the snackbar",Snackbar.LENGTH_SHORT).show();

                name=edt1.getText().toString();
                city=edt2.getText().toString();
                if(name.isEmpty()){
                    edt1.setError("please enter the data");
                }
                if(city.isEmpty()){
                    edt2.setError("please enter the data");
                }

                people p=new people(name,city);


            }
        });

    }
}