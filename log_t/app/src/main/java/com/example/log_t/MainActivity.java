package com.example.log_t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText1 , editText2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 =(EditText) findViewById(R.id.edit2);
        button = (Button) findViewById(R.id.button);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String user_id=editText1.getText().toString();
             String password = editText2.getText().toString();
             if (user_id.equals("rishukumar0187") && password.equals("1234")){
                 Intent iHome = new Intent(MainActivity.this, MainActivity2.class);
                 startActivity(iHome);
             }
             else{
                 Intent reload = new Intent(MainActivity.this , Reload.class);
                 startActivity(reload);
             }
         }
     });
    }
}