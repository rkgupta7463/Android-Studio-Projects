package com.example.dis_toast_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeToast(View v){
        Toast.makeText(MainActivity.this,"Alert by Toast Function",Toast.LENGTH_SHORT).show();
    }
}