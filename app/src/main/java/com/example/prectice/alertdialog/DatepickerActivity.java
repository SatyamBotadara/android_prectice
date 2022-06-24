package com.example.prectice.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.prectice.R;

import java.util.Calendar;

public class DatepickerActivity extends AppCompatActivity {

    private Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        Button b=findViewById(R.id.btndatepiceker);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                new DatePickerDialog(DatepickerActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        int m=month+1;
                        b.setText(dayOfMonth+"-"+m+""+year);
                    }
                }, c.get(Calendar.YEAR),
                        c.get(Calendar.MONTH),
                        c.get(Calendar.DAY_OF_MONTH))
                        .show();



            }
        });

    }
}