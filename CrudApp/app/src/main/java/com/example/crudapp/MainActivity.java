package com.example.crudapp;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name,contact,dob;
    Button insert,update,delete,view;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        dob=findViewById(R.id.dob);
        insert=findViewById(R.id.btninsert);
        update=findViewById(R.id.btnupdate);
        delete=findViewById(R.id.btndelete);
        view=findViewById(R.id.btnview);
        DB=new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTxt=name.getText().toString();
                String contactTxt=contact.getText().toString();
                String dobTxt=dob.getText().toString();
                Boolean checkinsertdata=DB.insertuserdata(nameTxt,contactTxt,dobTxt);
                if(checkinsertdata==true)
                    Toast.makeText(MainActivity.this,"new entry inserted",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"not inserted",Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTxt=name.getText().toString();
                String contactTxt=contact.getText().toString();
                String dobTxt=dob.getText().toString();
                Boolean checkupdatedata=DB.updateuserdata(nameTxt,contactTxt,dobTxt);
                if(checkupdatedata==true)
                    Toast.makeText(MainActivity.this,"entry updated",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"not updated",Toast.LENGTH_SHORT).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTxt=name.getText().toString();
                Boolean checkudeletedata=DB.deleteuserdata(nameTxt);
                if(checkudeletedata==true)
                    Toast.makeText(MainActivity.this,"entry deleted",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"not deleted",Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=DB.getData();
                if(res.getCount()==0){
                    Toast.makeText(MainActivity.this,"no data",Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Contact :"+res.getString(1)+"\n");
                    buffer.append("Dob :"+res.getString(2)+"\n\n");
                }
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("user entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}