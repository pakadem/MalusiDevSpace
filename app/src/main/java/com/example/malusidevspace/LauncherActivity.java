package com.example.malusidevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LauncherActivity extends AppCompatActivity {
    private EditText visitors_name;
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        visitors_name = findViewById(R.id.editTextenter_visitor_name);
        btn_next = findViewById(R.id.btn_next);

        String text_visitor_name = visitors_name.getText().toString();

        visitors_name.setText(text_visitor_name);

        btn_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String textmessage = visitors_name.getText().toString();

                Intent intent = new Intent( LauncherActivity.this, MenuActivity.class);
                intent.putExtra("visitors_name", textmessage);
                startActivity(intent);
            }
        });

    }
}