package com.example.klu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
ImageView imageView1,imageView2;
TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        imageView1=(ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        text1 = (TextView) findViewById(R.id.textView2);
        text2 = (TextView) findViewById(R.id.textView3);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klerp = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(klerp);
            }
        });
//
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kllms = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(kllms);
            }
        });
//        here animation for erp

        Animation Animation_first = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scalar_txt);
        text1.setAnimation(Animation_first);

//        here animation for lms
        Animation Animation_sceond = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scalar_txt);
        text2.setAnimation(Animation_sceond);

    }
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
//                Toast.makeText(MainActivity.this, "Welcome again!!", Toast.LENGTH_SHORT).show();
            }
        });
        exit.show();
    }
}