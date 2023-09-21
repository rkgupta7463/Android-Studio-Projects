package com.example.sqlitedetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name , email, phone;
    Button insert , delete, update,veiw;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.gmail);
        phone = findViewById(R.id.phone);
        insert = findViewById(R.id.btninsert);
        delete = findViewById(R.id.btbndtele);
        update = findViewById(R.id.btnupdate);
        veiw = findViewById(R.id.btnveiw);

        DB = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameText = name.getText().toString();
                String emailText = email.getText().toString();
                Integer phonenumber = Integer.parseInt(phone.getText().toString());

                Boolean checkinsertiondata = DB.insertquery(nameText,emailText,phonenumber);
            }
        });
    }
}