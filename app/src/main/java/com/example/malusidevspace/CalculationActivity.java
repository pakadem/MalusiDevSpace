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

public class CalculationActivity extends AppCompatActivity {
    private EditText enter_feed_kilos, enter_chicken_num;
    private TextView results;
    private Button btn_back, btn_calculate;
    //private String chicken_num, feed_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CalculationActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });


        btn_calculate = findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                enter_chicken_num = findViewById(R.id.editTextenter_chicken_num);
                double chicken_num = Double.parseDouble( enter_chicken_num.getText().toString() );
//                int chicken_num_int = 0;
//                if (!"".equals(chicken_num)){
//                    chicken_num_int = Integer.parseInt(chicken_num);
//                }

                enter_feed_kilos = findViewById(R.id.editTextenter_feed_kilos);
                double feed_num = Double.parseDouble( enter_feed_kilos.getText().toString() );
//                int feed_num_int = 0;
//                if (!"".equals(feed_num)){
//                    feed_num_int = Integer.parseInt(feed_num);
//                }

                results = findViewById(R.id.editTextenter_results);


                double formular = feed_num / chicken_num;

                if( formular >= (double)2.5){

                    results.setText("You have ENOUGH feed.  ");
                }else{

                    results.setText("You're LOW on feed.");
                }


            }
        });

    }
}