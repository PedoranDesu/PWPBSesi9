package com.pedoran.pwpbsesi9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pedoran.pwpbsesi9.Latihan1.ActivityLatihan1;
import com.pedoran.pwpbsesi9.Latihan2.ActivityLatihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLat1 = findViewById(R.id.btn_lat1);
        btnLat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, ActivityLatihan1.class);
                startActivity(pindah);
            }
        });

        Button btnLat2 = findViewById(R.id.btn_lat2);
        btnLat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, ActivityLatihan2.class);
                startActivity(pindah);
            }
        });
    }
}
