package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private EditText edittext;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button2);
        button2=findViewById(R.id.button3);
        button3=findViewById(R.id.button4);
        button4=findViewById(R.id.button5);
        button5=findViewById(R.id.button6);
        edittext=findViewById(R.id.editTextPerson);
        textview=findViewById(R.id.textView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double dollar=n*0.013;
                textview.setText("The Corresponding Value of Rs in Dollar="+dollar);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double pound=n*2.205;
                textview.setText("The Corresponding Value of Kg in Pounds="+pound);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double cubic=n*61.0237;
                textview.setText("The Corresponding Value of Liter in CubicInch="+cubic);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double foot=n*3.28084;
                textview.setText("The Corresponding Value of Meter in Foot="+foot);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double miles=n*2.23694;
                textview.setText("The Corresponding Value of M/S in Miles/Hrs="+miles);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=(edittext.getText()).toString();
                double n=Double.parseDouble(str);
                double radian=n*0.0174533;
                textview.setText("The Corresponding Value of Degree in Radian="+radian);
            }
        });
    }
}