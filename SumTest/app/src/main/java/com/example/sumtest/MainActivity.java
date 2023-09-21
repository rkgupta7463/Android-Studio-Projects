package com.example.sumtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edit1,edit2;
Button button;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 =(EditText) findViewById(R.id.editTextNumber);
        edit2 = (EditText) findViewById(R.id.Number2);
        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(edit1.getText().toString());
                Double num2 = Double.parseDouble(edit2.getText().toString());
                Double res = num1+num2;
                text.setText(Double.toString(res));
            }
        });
    }
}