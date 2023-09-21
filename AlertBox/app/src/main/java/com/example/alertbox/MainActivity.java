package com.example.alertbox;

import static android.content.DialogInterface.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textview);
        TextView text = findViewById(R.id.text);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                alertDialog.setTitle("Treams and Condition");
                alertDialog.setIcon(R.drawable.ic_baseline_info_24);
                alertDialog.setMessage("Have you read all T & C");


                alertDialog.setPositiveButton("Yes! I've Read",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(this, "Alerted by dialog buttom", Toast.LENGTH_SHORT).show();
                        Intent ihome = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(ihome);
                    }
                });

                alertDialog.setNegativeButton("No Agree",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Cannceled", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.show();
            }
        });
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);

        exit.setTitle("Exit the App");
        exit.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        exit.setMessage("Are You sure to exit?");

        exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
                Toast.makeText(MainActivity.this, "you exited", Toast.LENGTH_SHORT).show();
            }
        });
        exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Welcome again!!", Toast.LENGTH_SHORT).show();
            }
        });
        exit.show();
    }
}