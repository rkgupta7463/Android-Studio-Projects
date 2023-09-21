package com.example.testphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editTextNumber);
    }
    public void click(View view){
        String num=editText.getText().toString();
        Intent iphone = new Intent(Intent.ACTION_DIAL);
        iphone.setData(Uri.parse("tel:"+num));
        startActivity(iphone);
    }
}