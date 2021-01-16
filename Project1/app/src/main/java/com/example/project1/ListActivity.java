package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listVw;
    String[] FashionW={"BIBA", "Levis", "ZARA","RayBan","Pantalooms","Life Style","Shoppers Stop","Mebaz","Neerus","W","Soch","FabIndia","Globaldesi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listVw = findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, FashionW);
        listVw.setAdapter(adapter);

        listVw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemposition=position;
                String itemname= (String)listVw.getItemAtPosition(itemposition);
                Toast.makeText(ListActivity.this, "Positon: "+itemposition+", Name: "+itemname+"", Toast.LENGTH_SHORT).show();

            }
        });
    }
}