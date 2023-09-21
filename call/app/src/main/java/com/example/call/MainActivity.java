package com.example.call;

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
        editText = (EditText) findViewById(R.id.edit);
    }
    public void call(View view){
        String number = editText.getText().toString();
        Intent dailp = new Intent(Intent.ACTION_DIAL);
        dailp.setData(Uri. parse ("tel:"+number));
        startActivity(dailp);
    }
}