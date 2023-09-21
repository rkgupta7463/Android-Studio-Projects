package com.example.logm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.text);
    }
    public void btnclick(View view){
        String num=editText.getText().toString();
        Intent Dailcall = new Intent(Intent.ACTION_DIAL);
        Dailcall.setData(Uri.parse("tel:"+num));
        startActivity(Dailcall);
    }
}