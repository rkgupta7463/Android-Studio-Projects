package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My ToolBar");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}