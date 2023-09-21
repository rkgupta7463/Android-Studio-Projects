package com.example.life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, " onCreate invoked ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), " onStart invoked ", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), " onResume invoked ", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), " onPause invoked ", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), " onStop invoked ", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), " onRestart invoked ", Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), " onDestroy invoked ", Toast.LENGTH_LONG).show();

    }
}