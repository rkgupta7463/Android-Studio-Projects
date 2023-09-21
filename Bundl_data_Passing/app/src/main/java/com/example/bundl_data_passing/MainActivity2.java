package com.example.bundl_data_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView;

        textView = (TextView) findViewById(R.id.textView);

        Intent fromAct = getIntent();

        String title = fromAct.getStringExtra("Title");
        String studentn = fromAct.getStringExtra("Student");
        int roll_no =fromAct.getIntExtra("Roll No: ",0);

        textView.setText("Name: "+studentn+"Roll No: "+roll_no);
        getSupportActionBar().setTitle(title);
    }
}