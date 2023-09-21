package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());

                View view1  = getLayoutInflater().inflate(R.layout.custom_t,(ViewGroup) findViewById(R.id.viewContainer));

                toast.setView(view1);

                TextView textms = view1.findViewById(R.id.textsms);

                textms.setText("Message sent Successfully");

                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();
            }
        });

    }
}