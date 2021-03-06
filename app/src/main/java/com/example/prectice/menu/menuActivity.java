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
import android.widget.PopupMenu;
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

//        registerForContextMenu(binding.btncontextmenu);


        binding.popupmenu.setOnClickListener(view -> {
            PopupMenu popupMenu=new PopupMenu(menuActivity.this,view);

            popupMenu.getMenuInflater().inflate(R.menu.my_menu,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(menuItem -> {

                menuItem.getItemId();
                return false;
            });

            popupMenu.show();
        });

    }

    // context menu

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
//    {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        getMenuInflater().inflate(R.menu.my_menu,menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item)
//    {
//        return super.onContextItemSelected(item);
//    }

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