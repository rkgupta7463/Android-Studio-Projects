package com.example.recyclert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<contactModule> contarray = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contarray.add(new contactModule("Rishu","7463906582"));
        contarray.add(new contactModule("Rahul","7456829310"));
        contarray.add(new contactModule("Roshan","7458963120"));
        contarray.add(new contactModule("Shubham","6370460646"));
        contarray.add(new contactModule("Pradip","9117787518"));
        contarray.add(new contactModule("Akber","6241563744"));

        adapter = new RecyclerAdapter(this,contarray);
        recyclerView.setAdapter(adapter);
    }
}