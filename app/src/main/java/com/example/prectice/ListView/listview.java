package com.example.prectice.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityListview2Binding;
import com.example.prectice.databinding.ListviewUpdateLayoutBinding;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    ArrayList<product> list=new ArrayList<>();

    private ActivityListview2Binding binding;
    private ListviewUpdateLayoutBinding binding1;
    private Integer Total_price=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityListview2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        // listview data batava mate ek to adapter joye j class file no data show kri sake view ma
        // so we use adapeter for it
        // array adapter is simple adapter for creating list view
        // array adapter take list and display it to the view in activity

        ArrayAdapter<product> arrayAdapter=new ArrayAdapter(listview.this,android.R.layout.simple_list_item_1,list);
        binding.productlistview.setAdapter(arrayAdapter);


        binding.btnadditem.setOnClickListener(view -> {



            String productName=binding.edtproductName.getText().toString();
            Integer  productPrice=Integer.parseInt(binding.edtproductprice.getText().toString());

            binding.edtproductprice.setText("");
            binding.edtproductName.setText("");

            product p=new product(productName,productPrice);
            list.add(p);
            Total_price=sum(list);
            binding.setTotalprice(Total_price);

            arrayAdapter.notifyDataSetChanged();



        });

        binding.productlistview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int pos, long l) {


                product p=list.get(pos);

                PopupMenu popupMenu=new PopupMenu(listview.this,view);
                popupMenu.inflate(R.menu.listviewpopupmenu);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {



                        switch(menuItem.getItemId())
                        {
                            case R.id.listitemupdate:

                                binding1=ListviewUpdateLayoutBinding.inflate(getLayoutInflater());
                                binding1.listviewupdateproductname.setText(p.getName());
                                binding1.listviewupdateproductprice.setText(p.getPrice().toString());

                                new AlertDialog.Builder(listview.this)
                                        .setTitle("Update item")
                                        .setView(binding1.getRoot())
                                        .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                String name=binding1.listviewupdateproductname.getText().toString();
                                                Integer price =Integer.parseInt(binding1.listviewupdateproductprice.getText().toString());

                                                p.setName(name);
                                                p.setPrice(price);
                                                Total_price=sum(list);
                                                binding.setTotalprice(Total_price);
                                                arrayAdapter.notifyDataSetChanged();
                                                dialogInterface.dismiss();

                                            }
                                        })
                                        .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                                dialogInterface.dismiss();
                                            }
                                        })
                                        .show();
                                break;

                            case R.id.listitemdelete:
                                list.remove(pos);
                                Total_price=sum(list);
                                binding.setTotalprice(Total_price);
                                arrayAdapter.notifyDataSetChanged();
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();

                return false;
            }
        });


    }


    public Integer sum(ArrayList<product> list)
    {
        Integer sum=0;

        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i).getPrice();

        }

        return sum;
    }
}