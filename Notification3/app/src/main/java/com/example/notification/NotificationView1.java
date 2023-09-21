package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NotificationView1 extends AppCompatActivity {
            TextView textView;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_notification_view1);
                textView = findViewById(R.id.textView);
                //getting the notification message
                String message=getIntent().getStringExtra("message");
                textView.setText(message);
            }
        }
