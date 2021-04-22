package com.example.malusidevspace;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button next_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        next_screen = findViewById(R.id.splashnext);
//        next_screen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
//                //intent.putExtra("Something", "someelse");
//                startActivity(intent);
//            }
//        });

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, LauncherActivity.class);
            startActivity(intent);
            finish();

        },3500);

    }
}