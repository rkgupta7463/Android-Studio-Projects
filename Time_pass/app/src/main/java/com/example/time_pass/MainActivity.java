package com.example.time_pass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
EditText edit1,edit2;
TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        edit1 = (EditText) findViewById(R.id.Name1);
        edit2 = (EditText) findViewById(R.id.Name2);
        text1 = (TextView) findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = edit1.getText().toString().trim();
                String lname = edit2.getText().toString().trim();
//                Double num1;
//                num1 = Double.parseDouble();
                text1.setText("Hello, "+fname+lname);
            }
        });
    }
}