package com.lalith.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coverpage extends AppCompatActivity {
    Button btn,btn1,button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverpage);
        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);

        // login
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coverpage.this,login.class);
                startActivity(intent);
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coverpage.this,signup.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
