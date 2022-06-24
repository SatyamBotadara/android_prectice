package com.example.prectice.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.prectice.R;

import java.util.Calendar;

public class dobpicker extends AppCompatActivity {

    Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobpicker);

        Button b=findViewById(R.id.btndobpicker);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                DatePickerDialog dd=new DatePickerDialog(dobpicker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {
                            String dob="Date Of Birth : "+dayOfMonth+"-"+(month+1)+"-"+year;
                            TextView tv=findViewById(R.id.tvdob);
                            tv.setText(dob);
                    }
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH));

                dd.getDatePicker().setMaxDate(System.currentTimeMillis());
                dd.show();
            }
        });


    }
}