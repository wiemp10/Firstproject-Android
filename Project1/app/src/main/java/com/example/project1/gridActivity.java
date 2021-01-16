package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;


public class gridActivity extends AppCompatActivity {
    GridView grdviw;
    String[] FashionW={"BIBA", "Levis", "ZARA","RayBan","Pantalooms","Life Style","Shoppers Stop","Mebaz","Neerus","W","Soch","FabIndia","Globaldesi"};
    Integer[] logos= {R.drawable.biba,R.drawable.levi,R.drawable.zaras,R.drawable.rayb,R.drawable.pantaloon,R.drawable.lifes,R.drawable.shoppers,R.drawable.meba,R.drawable.neeru,R.drawable.wom,R.drawable.soch,R.drawable.fab,R.drawable.global};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        grdviw=findViewById(R.id.gridvw);
        gridadapter adapter=new gridadapter(this, FashionW,logos);
        grdviw.setAdapter(adapter);

    }
}