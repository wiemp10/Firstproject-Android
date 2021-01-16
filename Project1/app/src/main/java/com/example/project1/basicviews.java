package com.example.project1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class basicviews extends AppCompatActivity {

   Button alertbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicviews);

alertbtn= findViewById(R.id.alert_btn);
    }

    public void shorttoast(View view) {
        Toast.makeText(this, "This is the short Toast", Toast.LENGTH_SHORT).show();
    }

    public void longtoast(View view) {
        Toast.makeText(this, "This is the Long Toast", Toast.LENGTH_LONG).show();
    }

    public void openalert(View view) {
        final AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Delete");
        builder.setMessage("Want to delete");
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertbtn.setVisibility(View.INVISIBLE);
            }
        });
        builder.create().show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
}