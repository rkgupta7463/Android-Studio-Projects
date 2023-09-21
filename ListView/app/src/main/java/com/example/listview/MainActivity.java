package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tex1;
    Spinner spinner;
    ListView list;
    Button button;
    ArrayList<String> arraName = new ArrayList<>();
    ArrayList<String> arrid = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        tex1 = findViewById(R.id.text);
        button = findViewById(R.id.btn);

        arraName.add("Rishu kumar gupta");
        arraName.add("Rahul gupta");
        arraName.add("Shubham gupta");
        arraName.add("Bittu gupta");
        arraName.add("Roshan gupta");
        arraName.add("Rajat gupta");
        arraName.add("Pradeep sharma");
        arraName.add("Pravesh kumar");
        arraName.add("Rajnish sharma");
        arraName.add("Rhaul kumar");
        arraName.add("Prakash kumar");
        arraName.add("Setting");
        arraName.add("Update");
        arraName.add("Logout");
        arraName.add("Edit");
        arraName.add("Sign in");
        arraName.add("Navbar");
        arraName.add("ListView");

        ArrayAdapter<String> adapter= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arraName);
//        list.setAdapter(adapter);

        arrid.add("Select........");
        arrid.add("Votar Id");
        arrid.add("Adhar card");
        arrid.add("XII marksheet");
        arrid.add("X marksheet");
        arrid.add("Pan card");

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrid);
        spinner.setAdapter(adapter1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex1.setText("Hello ");
            }
        });

    }
}