package com.example.prectice.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prectice.R;

import java.util.ArrayList;

public class listviewActivity extends AppCompatActivity {

    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ListView lv=findViewById(R.id.listview);

        arrayList.add("c");
        arrayList.add("java");
        arrayList.add("c++");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(listviewActivity.this, ""+lv.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });

        ArrayAdapter arrayAdapter=new ArrayAdapter(listviewActivity.this, android.R.layout.simple_expandable_list_item_1,arrayList);

        lv.setAdapter(arrayAdapter);

    }
}