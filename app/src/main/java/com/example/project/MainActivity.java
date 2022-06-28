package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button btncalculator,btnlifecycle,btnthreading,btnthreadlifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalculator=findViewById(R.id.btncalculator);
        btnlifecycle=findViewById(R.id.btnlifecycle);
        btnthreading=findViewById(R.id.btnthreading);
        btnthreadlifecycle=findViewById(R.id.btnthreadlifecycle);

        btncalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                startActivity(intent);
            }
        });
        btnlifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityLifeCycle.class);
                startActivity(intent);
            }
        });
        btnthreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MultiThreading.class);
                startActivity(i);
            }
        });
        btnthreadlifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ThreadLifeCycle.class);
                startActivity(i);
            }
        });
    }
}