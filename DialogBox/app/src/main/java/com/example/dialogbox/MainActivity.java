package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ArrayList<String> arrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =  findViewById(R.id.btndialog);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String name , pass;

                Dialog testDialog = new Dialog(MainActivity.this);
                testDialog.setContentView(R.layout.dialogbox);

                testDialog.dismiss();
                testDialog.show();
            }
        });
    }
}