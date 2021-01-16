package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView signup;
    EditText mobile, password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup= findViewById(R.id.sgn_lnk);
        mobile= findViewById(R.id.mob_txt);
        password= findViewById(R.id.pass_txt);
        login= findViewById(R.id.lgn_btn);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup_intent= new Intent(MainActivity.this, signup.class);
                startActivity(signup_intent);
            }
        });
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String mobile_s= mobile.getText().toString();
        String password_s=password.getText().toString();
        if(!TextUtils.isEmpty(mobile_s)){
            if(!TextUtils.isEmpty(password_s)){

                validatedata(mobile_s,password_s);

            }else {
                Toast.makeText(MainActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                password.setError("Enter Valid Password");
            }

        }else {

            Toast.makeText(MainActivity.this, "Please enter mobile number", Toast.LENGTH_SHORT).show();
            mobile.setError("Enter Valid mobile number");
        }

    }
});


    }

    private void validatedata(String mobile_s, String password_s) {
        if(mobile_s.equals("9848690820")){
            if(password_s.equals("janu2525")){

                Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                Intent login_intent=new Intent(MainActivity.this, homeactivity.class );
                startActivity(login_intent);
            }else {
                Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(MainActivity.this, "Incorrect mobile number", Toast.LENGTH_SHORT).show();

        }
    }
}