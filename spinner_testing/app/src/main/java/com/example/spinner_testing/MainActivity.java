package com.example.spinner_testing;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to here start spinner for select attributes
        String[] S_name = this.getResources().getStringArray(R.array.State_name);

        Spinner spinner =(Spinner) findViewById(R.id.spinner);
        AutoCompleteTextView autocom = (AutoCompleteTextView) findViewById(R.id.autoCom);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter sname =new ArrayAdapter(this, android.R.layout.simple_spinner_item, S_name);
        sname.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(sname);

        autocom.setAdapter(sname);
        autocom.setThreshold(2);

        ActionBar actionBar = getSupportActionBar();

        // providing title for the ActionBar
        actionBar.setTitle("Home");
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}