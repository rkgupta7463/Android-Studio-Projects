package com.example.autocom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocom = findViewById(R.id.autoCom);

        ArrayList<String> arrlan = new ArrayList<>();

        arrlan.add("Python");
        arrlan.add("Java");
        arrlan.add("Ruby");
        arrlan.add("R");
        arrlan.add("C");
        arrlan.add("C++");
        arrlan.add("C#");
        arrlan.add("JavaScript");
        arrlan.add("PHP");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,arrlan);
        autocom.setAdapter(adapter);
        autocom.setThreshold(1);
    }
}