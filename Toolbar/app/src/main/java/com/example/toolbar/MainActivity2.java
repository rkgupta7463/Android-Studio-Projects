package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<String> name = new ArrayList<>();

//    String name[] ={"Home","Setting","Privacy","Feedback"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView1);
        ListView listView = findViewById(R.id.listView);


//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle("My ToolBar");
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }

        name.add("Home");
        name.add("Setting");
        name.add("Privacy");
        name.add("Feedback");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_main, R.id.textView1,name);
        listView.setAdapter(adapter);
    }
}