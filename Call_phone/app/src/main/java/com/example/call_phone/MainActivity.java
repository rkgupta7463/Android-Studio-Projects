package com.example.call_phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button button;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState) ;
        setContentView(R.layout. activity_main );
        e1 = (EditText) findViewById(R.id.e1);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit1 = e1.getText().toString();
                Intent dialIntent = new Intent(Intent. ACTION_DIAL ) ;
                dialIntent.setData(Uri. parse ("tel:"+edit1)) ;
                startActivity(dialIntent) ;
            }
        });
    }
}

