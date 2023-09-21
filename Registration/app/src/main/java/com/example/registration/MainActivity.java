package com.example.registration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password, repassword;
    Button signup, signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.repassword);
        signin = findViewById(R.id.btnsignin);
        signup = findViewById(R.id.btnsignup);
        DB = new DBHelper(this);

        //AlertBox
        Dialog alertDialog = new Dialog(MainActivity.this);
        alertDialog.setContentView(R.layout.alert_box);
        alertDialog.setCancelable(false);

        //signup btn works
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                if (user.equals(" ") || pass.equals(" ") || repass.equals(" ")) {
//                    Toast.makeText(MainActivity.this, "Please Enter all fields", Toast.LENGTH_SHORT).show();
                }//alertDialog.dismiss();
                else {
                    if (pass.equals(repass)) {
                        Boolean checkuser = DB.usercheck(user);
                        if (checkuser == false) {
                            Boolean insert = DB.insertData(user, pass);
                            if (insert == true) {
                                alertDialog.show();
//                                Toast.makeText(MainActivity.this, "Registred", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Homectivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "User already Exists Sign In", Toast.LENGTH_SHORT).show()
                            ;
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Password Not Match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}