package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2 , button3 , button4;
    TextView result;
    EditText editText, editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button)  findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        result = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editTextNumber);
        editText1 =(EditText) findViewById(R.id.editTextNumber1);

        getSupportActionBar().hide();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText.getText().toString());
                double num2 = Double.parseDouble(editText1.getText().toString());
                double sum = num1 + num2;
                result.setText(Double.toString(sum));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText.getText().toString());
                double num2 = Double.parseDouble(editText1.getText().toString());
                double sub = num1 - num2;
                result.setText(Double.toString(sub));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText.getText().toString());
                double num2 = Double.parseDouble(editText1.getText().toString());
                double max = num1 * num2;
                result.setText(Double.toString(max));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText.getText().toString());
                double num2 = Double.parseDouble(editText1.getText().toString());
                double div = num1 / num2;
                result.setText(Double.toString(div));
            }
        });
    }
}