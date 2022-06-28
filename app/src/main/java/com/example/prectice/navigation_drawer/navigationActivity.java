package com.example.prectice.navigation_drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityNavigationBinding;
import com.example.prectice.databinding.NavigationHeaderLayoutBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class navigationActivity extends AppCompatActivity
{

    private ActivityNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // coustome toolbar

        getSupportActionBar().hide();



        binding.cutomtool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawerLayout dl=findViewById(R.id.drawerlayout);
                dl.openDrawer(GravityCompat.START);

            }
        });

        binding.cutomtool.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                return false;
            }
        });


        // navigation item listener



        binding.navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {


                return false;
            }
        });


        //bottom navigation

//        binding.bottomnev.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                return false;
//            }
//        });
//
//        BottomNavigationView bnv=findViewById(R.id.bottomnev);
//        bnv.getMenu().findItem(R.id.item2).setChecked(true);

        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout dl=findViewById(R.id.drawerlayout);

        if(dl.isDrawerOpen(GravityCompat.START)){
            dl.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }

    }
}