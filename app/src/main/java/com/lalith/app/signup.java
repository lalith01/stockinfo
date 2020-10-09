package com.lalith.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    Button btn,btn1;
    EditText email,uname,pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        email = findViewById(R.id.email);
        uname = findViewById(R.id.uname);
        pswd = findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = email.getText().toString();
                String b = uname.getText().toString();
                String c = pswd.getText().toString();
                sqlite sqlite=new sqlite(signup.this);
                sqlite.insertData(a,b,c);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),login.class);
                        startActivity(intent);
                        finish();
                    }
                },1500);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),coverpage.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
