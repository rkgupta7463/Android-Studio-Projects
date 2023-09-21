package com.example.better_charge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        textView = findViewById(R.id.textView);
        this.registerReceiver(this.broadcastReceiver, new
                IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            textView.setText("Battery Percentage: " + level);
            int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
            boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;
            if (isCharging) {
                Toast.makeText(getApplicationContext(), "Charger connected, Battery Charging..",
                        Toast.LENGTH_SHORT).show();
            }
            else if (status == BatteryManager.BATTERY_STATUS_DISCHARGING) {
                Toast.makeText(getApplicationContext(), "Charger disconnected",
                        Toast.LENGTH_SHORT).show();
            }
        }
    };
}
