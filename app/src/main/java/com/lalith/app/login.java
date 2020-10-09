package com.lalith.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button btn,btn1;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        final String e = email.getText().toString();
        final String p = password.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),dashboard.class);
                    startActivity(intent);
                    finish();
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
