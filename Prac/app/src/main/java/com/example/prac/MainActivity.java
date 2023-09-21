package com.example.prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,res;
    Button sum,Mup,Sub1,Div1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = (Button) findViewById(R.id.sum);
        Sub1 = (Button) findViewById(R.id.sub);
        Mup = (Button) findViewById(R.id.mux);
        Div1 = (Button) findViewById(R.id.Div);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        res =(EditText) findViewById(R.id.res);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             double n1 = Double.parseDouble(e1.getText().toString());
             double n2 = Double.parseDouble(e2.getText().toString());
             double sum = n1 + n2;
             res.setText(Double.toString(sum));
            }
        });
        Sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(e1.getText().toString());
                double n2 = Double.parseDouble(e2.getText().toString());
                double Sub1 = n1 - n2;
                res.setText(Double.toString(Sub1));
            }
        });

        Mup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(e1.getText().toString());
                double n2 = Double.parseDouble(e2.getText().toString());
                double Mux = n1 * n2;
                res.setText(Double.toString(Mux));
            }
        });
        Div1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(e1.getText().toString());
                double n2 = Double.parseDouble(e2.getText().toString());
                double Div = n1 / n2;
                res.setText(Double.toString(Div));
            }
        });
    }
}