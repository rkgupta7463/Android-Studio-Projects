package com.example.display_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to my application", Toast.LENGTH_SHORT).show();
    }
    public void makeToast(View v){
        Toast.makeText(getApplicationContext(),"Alert by Toast methoc",Toast.LENGTH_SHORT).show();
    }
    public void Switch(View v){
        Toast.makeText(getApplicationContext(),"Switch on",Toast.LENGTH_SHORT).show();   
    }

}