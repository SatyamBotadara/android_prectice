package com.example.prectice.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityNotesTakingBinding;

import java.util.ArrayList;

public class NotesTaking extends AppCompatActivity {

    private ActivityNotesTakingBinding binding;
    private ArrayList<notes> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNotesTakingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayAdapter<notes> arrayAdapter=new ArrayAdapter(NotesTaking.this,R.layout.note_list_item,list);
        binding.noteslistview.setAdapter(arrayAdapter);

        binding.btnaddnotes.setOnClickListener(view -> {

            String title=binding.edtnotetitle.getText().toString();
            String desc=binding.edtnotedesc.getText().toString();

            notes n=new notes(title,desc);
            list.add(n);
            arrayAdapter.notifyDataSetChanged();
        });

//        SimpleAdapter adapter=new SimpleAdapter(NotesTaking.this,)




    }
}