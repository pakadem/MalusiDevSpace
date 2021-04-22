package com.example.malusidevspace;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    private Button btn_home, btn_calculation, btn_about, btn_profile;
    private TextView visitors_name;
    String visitors_name_intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        visitors_name_intent = getIntent().getStringExtra("visitors_name");
        visitors_name = findViewById(R.id.text_welcome_visitor);
        visitors_name.setText("Dear " + visitors_name_intent + ", ");

        btn_home = findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent( MenuActivity.this, LauncherActivity.class);
                startActivity(intent);
            }
        });

        btn_calculation = findViewById(R.id.btn_calculation);
        btn_calculation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent( MenuActivity.this, CalculationActivity.class);
                startActivity(intent);
            }
        });

        btn_about = findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent( MenuActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent( MenuActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}