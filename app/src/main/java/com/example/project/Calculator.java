package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

    EditText etfirstvalue,etsecondvalue;
    Button btnadd,btnsubs,btnmultiply,btndivide;
    double num1,num2;
    TextView tvresult;
    process p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etfirstvalue=findViewById(R.id.etfirstvalue);
        etsecondvalue=findViewById(R.id.etsecondvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubs=findViewById(R.id.btnsubs);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivision);
        tvresult=findViewById(R.id.tvresult);
        p = new process();

        Clicklistener();

    }



    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=p.add(num1,num2);
                tvresult.setText(String.valueOf(result));
            }
        });
        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=p.subs(num1,num2);
                tvresult.setText(String.valueOf(result));
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=p.multiply(num1,num2);
                tvresult.setText(String.valueOf(result));
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=p.divide(num1,num2);
                tvresult.setText(String.valueOf(result));
            }
        });
    }
}