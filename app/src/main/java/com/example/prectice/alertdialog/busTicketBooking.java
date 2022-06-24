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

public class busTicketBooking extends AppCompatActivity {

    Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_ticket_booking);

        Button b=findViewById(R.id.btnbookingpicker);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                DatePickerDialog db=new DatePickerDialog(busTicketBooking.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {
                        String book="your booking is on : "+dayOfMonth+"-"+(month+1)+"-"+year;
                        TextView tv=findViewById(R.id.tvbookingpicker);
                        tv.setText(book);
                    }
                },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH));

                db.getDatePicker().setMinDate(System.currentTimeMillis());
                db.show();
            }
        });

    }
}