package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Secondactivity extends AppCompatActivity {
    String items []= new String[]{"Android","Iphone","Windows","Blackberry","Linux"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        final ListView listView= (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp=items[position].toString();
                Intent intent1= new Intent(Secondactivity.this,thirdactivity.class);
                intent1.putExtra("Listviewclickvalue",temp);
                startActivity(intent1);
            }
        });

    }
}
