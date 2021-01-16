package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeactivity extends AppCompatActivity {
    Button basicview_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        basicview_btn= findViewById(R.id.basic_btn);
        basicview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicview_intent= new Intent(homeactivity.this, basicviews.class);
                startActivity(basicview_intent);
            }
        });



    }

    public void implict(View view) {
        Intent implict_intent=new Intent(homeactivity.this, implictintent.class);
        startActivity(implict_intent);

    }

    public void listbtn(View view) {
        Intent List_intent=new Intent(homeactivity.this, ListActivity.class);
        startActivity(List_intent);
    }

    public void customlist(View view) {
        Intent cList_intent=new Intent(homeactivity.this, customlistActivity.class);
        startActivity(cList_intent);
    }

    public void gridbtn(View view) {
        Intent grid_intent=new Intent(homeactivity.this, gridActivity.class);
        startActivity(grid_intent);
    }

    public void notify(View view) {
        Intent notify_intent=new Intent(homeactivity.this, notificActivity.class);
        startActivity(notify_intent);
    }
}