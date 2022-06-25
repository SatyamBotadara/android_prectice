package com.example.prectice.menu;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityMenuBinding;

public class menuActivity extends AppCompatActivity {
    private Menu menu;
    private ActivityMenuBinding binding;
    private boolean menuBoolean=false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding=ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


    // option menu

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        getMenuInflater().inflate(R.menu.my_menu,menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item)
//    {
//
//        return super.onOptionsItemSelected(item);
//    }
//
//
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu)
//    {
//        // create the daynamic menu and change the items of menu
//
//        return super.onPrepareOptionsMenu(menu);
//    }


}