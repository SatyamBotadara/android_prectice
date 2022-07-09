package com.example.prectice.dialog2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityDialogBinding;
import com.example.prectice.databinding.ActivityProductAddListViewBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class dialog extends AppCompatActivity {

    private ActivityDialogBinding binding;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        super.onCreate(savedInstanceState);
        binding=ActivityDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//       binding.progressdialog.setOnClickListener(view -> {
//            ProgressDialog pd=new ProgressDialog(dialog.this);
//            pd.setTitle("Downloading...");
//            pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//
//            new Thread(() -> {
//                for (int i=1;i<=100;i++)
//                {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if (i==100){
//                        pd.dismiss();
//                    }
//                    pd.setProgress(i);
//                }
//
//            }).start();
//
//
//            pd.show();
//       });
//
//
////      date picker
//
//        binding.datepicker.setOnClickListener(view -> {
//
//
//
//            new DatePickerDialog(dialog.this, (datePicker, i, i1, i2) -> Toast.makeText(dialog.this, i2+"-"+(i1+1)+"-"+i, Toast.LENGTH_SHORT).show(),c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
//
//        });
//
//        binding.timepicker.setOnClickListener(view -> {
//
//
//            new TimePickerDialog(dialog.this, (timePicker, i, i1) -> {
//                Toast.makeText(this, i+":"+i1, Toast.LENGTH_SHORT).show();
//
//            },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),false).show();
//        });
//
//
//        binding.fullscreendialog.setOnClickListener(view -> {
//
//            ActivityProductAddListViewBinding binding1=ActivityProductAddListViewBinding.inflate(getLayoutInflater());
//            Dialog d=new Dialog(dialog.this, android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen);
//            d.setContentView(binding1.getRoot());
//            d.setTitle("full screen");
//            d.show();
//
//            binding1.btnAddProduct.setOnClickListener(view1 -> {
//                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
//            });
//
//        });
//
//
//
//        binding.bottomappbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                return false;
//            }
//        });
//
//        binding.bottomappbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        binding.bottomsheetdialog.setOnClickListener(view -> {

            BottomSheet bottomSheet=new BottomSheet();
            bottomSheet.show(getSupportFragmentManager(),"hello");

        });


    }


}