package com.example.login_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextEmailAddress,editTextTextPassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email_id = editTextTextEmailAddress.getText().toString();
                String password = editTextTextPassword.getText().toString();
                if(email_id.equals("rishukumar0187@gmail.com") && (password.equals("12345678"))){
                    Toast.makeText(MainActivity.this,"Welcome to home page",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),NewActivity_1.class);
                startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email & password!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

//    public void log_in(View v) {
//        Toast.makeText(getApplicationContext(),
//                "You are successfully log in!", Toast.LENGTH_SHORT).show();
//    }
}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toast.makeText(getApplicationContext(), " onCreate invoked ", Toast.LENGTH_LONG).show();
//
//    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(), " onStart invoked ", Toast.LENGTH_LONG).show();
//
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        Toast.makeText(getApplicationContext(), " onResume invoked ", Toast.LENGTH_LONG).show();
//
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        Toast.makeText(getApplicationContext(), " onPause invoked ", Toast.LENGTH_LONG).show();
//
//    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(), " onStop invoked ", Toast.LENGTH_LONG).show();
//
//    }
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(), " onRestart invoked ", Toast.LENGTH_LONG).show();
//
//
//    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(), " onDestroy invoked ", Toast.LENGTH_LONG).show();
//
//    }
//}