package com.example.wi_fi_display;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Switch aswitch;
     TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aswitch = (Switch) findViewById(R.id.switch1);
//       textView1 = (TextView) findViewById(R.id.textView1);
       aswitch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (aswitch.isClickable()){
                   WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                   wifi.setWifiEnabled(true);
                   Toast.makeText(getApplicationContext(),"Wi Fi is No",Toast.LENGTH_SHORT).show();
               }
               else {
                   WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                   wifi.setWifiEnabled(false);
                   Toast.makeText(getApplicationContext(),"Wi Fi is off",Toast.LENGTH_SHORT).show();
               }
           }
       });
    }
}