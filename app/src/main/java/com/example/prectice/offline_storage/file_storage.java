package com.example.prectice.offline_storage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityFileStorageBinding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class file_storage extends AppCompatActivity {
    private ActivityFileStorageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        binding=ActivityFileStorageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSave.setOnClickListener(view -> {

            String data=binding.edtName.getText().toString();
            FileOutputStream fs= null;

            try {
                fs = openFileOutput("data.txt",MODE_PRIVATE);
                fs.write(data.getBytes());
                fs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Toast.makeText(file_storage.this, "data write", Toast.LENGTH_SHORT).show();

        });

        binding.btnFind.setOnClickListener(view -> {

        });


    }
}