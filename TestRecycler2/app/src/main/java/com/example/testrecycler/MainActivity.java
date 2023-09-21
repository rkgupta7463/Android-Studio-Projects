package com.example.testrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<contactModule> arrcont = new ArrayList<>();
    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        FloatingActionButton addclick = findViewById(R.id.onclickplplus);

//        here changing the action bar
        getSupportActionBar().setTitle("Contact");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        addclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog addDialog = new Dialog(MainActivity.this);
                addDialog.setContentView(R.layout.addupdate);

                EditText editname = addDialog.findViewById(R.id.diloagname);
                EditText editnum = addDialog.findViewById(R.id.diloagnum);
                Button btnAction = addDialog.findViewById(R.id.btnadd);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="" , num="";
                        if (!editname.getText().toString().equals("") && !editnum.getText().toString().equals("")) {
                             name = editname.getText().toString();
                             num = editnum.getText().toString();


                            arrcont.add(new contactModule(R.drawable.img_2,name , num));
                            adapter.notifyItemInserted(arrcont.size()-1);

                            recyclerView.scrollToPosition(arrcont.size()-1);
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Contact is not valid",Toast.LENGTH_SHORT).show();
                        }
                        addDialog.dismiss();
                    }
                });
                addDialog.show();
            }
        });

        arrcont.add(new contactModule(R.drawable.img,"Rishu","7463906582"));
        arrcont.add(new contactModule(R.drawable.img_2,"Roshal","7463906589"));
        arrcont.add(new contactModule(R.drawable.img_2,"Vishal","7463906585"));
        arrcont.add(new contactModule(R.drawable.img_2,"Risikesh","7463906502"));
        arrcont.add(new contactModule(R.drawable.img_3,"Rahul","7463900582"));
        arrcont.add(new contactModule(R.drawable.img_4,"Amit","7463406582"));
        arrcont.add(new contactModule(R.drawable.img_5,"Roshan","7463906580"));
        arrcont.add(new contactModule(R.drawable.img_2,"Ronak","7463916582"));
        arrcont.add(new contactModule(R.drawable.img_5,"Rohit","7463906562"));
        arrcont.add(new contactModule(R.drawable.img_4,"Pravesh","7473906582"));
        arrcont.add(new contactModule(R.drawable.img_3,"Prince","7463906082"));

        adapter = new RecyclerAdapter(this, arrcont);
        recyclerView.setAdapter(adapter);
    }
}