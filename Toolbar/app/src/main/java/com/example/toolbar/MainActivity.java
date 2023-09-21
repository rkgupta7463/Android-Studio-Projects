package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        //this is for simple toolbar
//        setActionBar();

//        this is for appcampact wieght
//        step1:
        setSupportActionBar(toolbar);

//        step2:

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My ToolBar");
        }

        //toolbar.setTitle("My ToolBar");
        toolbar.setSubtitle("Sub title");

    }
    //        i am going to implements the code for menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId==R.id.opt_new){
            Toast.makeText(MainActivity.this, "Created new file",Toast.LENGTH_SHORT).show();
            Intent opt_new = new Intent(this,MainActivity2.class);
            startActivity(opt_new);
        }
        else if(itemId==R.id.opt_setting){
            Toast.makeText(MainActivity.this, "Setting is open",Toast.LENGTH_SHORT).show();
            Intent opt_setting = new Intent(this,MainActivity3.class);
            startActivity(opt_setting);
        }
        else if(itemId==R.id.opy_feedback){
            Toast.makeText(MainActivity.this, "Thanks for give feedback",Toast.LENGTH_SHORT).show();
            Intent feedback = new Intent(this,MainActivity4.class);
            startActivity(feedback);
        }
        else{
            super.onBackPressed();
            Toast.makeText(this,"You backed",Toast.LENGTH_SHORT).show();        }
        return super.onOptionsItemSelected(item);
    }
}