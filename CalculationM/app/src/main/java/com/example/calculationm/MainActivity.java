package com.example.calculationm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
Button button;
EditText edit1 , edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        Button b1 = (Button) findViewById(R.id.btn1);
        Button b2 = (Button) findViewById(R.id.btn2);
        Button b3 = (Button) findViewById(R.id.btn3);
        Button b4 = (Button) findViewById(R.id.btn4);
        Button b5 = (Button) findViewById(R.id.btn5);
//        Button bar = (Button) findViewById(R.id.barabar);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1+num2;
                text.setText(Double.toString(res));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1-num2;
                text.setText(Double.toString(res));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1*num2;
                text.setText(Double.toString(res));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1/num2;
                text.setText(Double.toString(res));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1%num2;
                text.setText(Double.toString(res));
            }
        });
    }
}