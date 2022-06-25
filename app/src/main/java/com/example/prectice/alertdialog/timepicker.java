package com.example.prectice.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.prectice.R;

import java.util.Calendar;

public class timepicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        Button b=findViewById(R.id.btntimepicker);

        Calendar c=Calendar.getInstance();

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                new TimePickerDialog(timepicker.this,R.style.timepickertheme, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1)
                    {
                        TextView tv=findViewById(R.id.tvtimepicker);
                        tv.setText("time : "+i+":"+i1);
                    }
                }, c.get(Calendar.HOUR), c.get(Calendar.MINUTE), true).show();


            }
        });

    }
}