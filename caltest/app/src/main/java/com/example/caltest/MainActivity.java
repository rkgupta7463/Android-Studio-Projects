package com.example.caltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edit1, edit2;
Button button1,button2, button3,button4;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        button1=(Button) findViewById(R.id.btn1);
        text = (TextView) findViewById(R.id.text);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1= Double.parseDouble(edit1.getText().toString());
                double num2 = Double.parseDouble(edit2.getText().toString());
                double res = num1+num2;
                text.setText(Double.toString(res));
            }
        });
    }
}