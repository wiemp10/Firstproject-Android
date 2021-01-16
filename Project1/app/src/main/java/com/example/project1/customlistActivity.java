package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Object;

import android.os.Bundle;
import android.widget.ListView;

public class customlistActivity extends AppCompatActivity {

    ListView listVw;
    String[] FashionW={"BIBA", "Levis", "ZARA","RayBan","Pantalooms","Life Style","Shoppers Stop","Mebaz","Neerus","W","Soch","FabIndia","Globaldesi"};
    Integer[] logos= {R.drawable.biba,R.drawable.levi,R.drawable.zaras,R.drawable.rayb,R.drawable.pantaloon,R.drawable.lifes,R.drawable.shoppers,R.drawable.meba,R.drawable.neeru,R.drawable.wom,R.drawable.soch,R.drawable.fab,R.drawable.global};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);
        listVw = findViewById(R.id.listview);

        customadapter adapter=new customadapter(this, FashionW,logos );
        listVw.setAdapter(adapter);

    }
}