package com.example.prectice.alertdialog;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prectice.R;

@RequiresApi(api = Build.VERSION_CODES.N)
public class datepickerforMovieTicket extends AppCompatActivity {

    Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepickerfor_movie_ticket);
        Button b=findViewById(R.id.datepickerformovie);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog d=new DatePickerDialog(datepickerforMovieTicket.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {
                        String s="your movie ticket is booked for "+dayOfMonth+"-"+(month+1)+"-"+year;
                        TextView tv=findViewById(R.id.tvdatepickerformovieticket);
                        tv.setText(s);
                    }
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH));

               d.getDatePicker().setMinDate(System.currentTimeMillis());
               d.show();

            }
        });
    }
}