package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name;
    Button sq,vs;
    String nam;
    //priyaaaatttt


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        sq= findViewById(R.id.sq);
        vs= findViewById(R.id.vs);

        nam = name.getText().toString();

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,StartActivity.class);

                startActivity(intent);


            }

        });

        vs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,ScoreActivity.class);

                startActivity(intent);

            }
        });


    }}









