package com.lalith.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    CardView b,i,e;
    Toolbar toolbar;
    NavigationView nav;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b = findViewById(R.id.beginner);
        i = findViewById(R.id.intermediate);
        e = findViewById(R.id.expert);
        drawerLayout = findViewById(R.id.drawablelayout);
        toolbar = findViewById(R.id.toolbar);
        nav = findViewById(R.id.nav);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        nav.setNavigationItemSelectedListener(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),beginner.class);
                startActivity(intent);
                finish();
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),intermediate.class);
                startActivity(intent);
                finish();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),expert.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.profile:
                Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.privacy:{
                Intent intent = new Intent(getApplicationContext(),privacy.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.About:
            {
                Intent intent = new Intent(getApplicationContext(),about.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.logout:
            {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                finish();
                break;
            }
        }
        return false;
    }
}
