package com.example.prectice.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.prectice.R;

public class alertdialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdialog);

        Button b=findViewById(R.id.btnalert);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(alertdialogActivity.this)
                        .setTitle("hello")
                        .setMessage("this is message")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(alertdialogActivity.this, "yes", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                                finish();
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(alertdialogActivity.this, "no", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();

                            }
                        })
                        .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(alertdialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        })
                        .show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("are you sure you want to exit")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        System.exit(0);
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}