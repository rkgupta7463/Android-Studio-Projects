package com.example.spinner_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] page1 = this.getResources().getStringArray(R.array.page);

       getSupportActionBar().hide();

        Spinner spinner1 =(Spinner) findViewById(R.id.spinner3);
        Button button = (Button) findViewById(R.id.btn);

        spinner1.setOnItemSelectedListener(this);

        ArrayAdapter pageH = new ArrayAdapter(this, android.R.layout.simple_spinner_item,page1);
        pageH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(pageH);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iHome = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(iHome);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}