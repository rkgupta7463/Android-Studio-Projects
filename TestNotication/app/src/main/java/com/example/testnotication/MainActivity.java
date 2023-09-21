package com.example.testnotication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNAL_ID = "SPA";
    private static final int NOTIFICATION_ID = 100;

    Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_baseline_notifications_24,null);
    BitmapDrawable btd = (BitmapDrawable) drawable;
    Bitmap lagerIcon = btd.getBitmap();
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn  = findViewById(R.id.btn);
        NotificationManager mn =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(lagerIcon)
                    .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                    .setContentText("New Message")
                    .setSubText("New Message from Services provider's App")
                    .setChannelId(CHANNAL_ID)
                    .build();

            mn.createNotificationChannel(new NotificationChannel(CHANNAL_ID, "NEW CHANNNAL", NotificationManager.IMPORTANCE_DEFAULT));
        }else{
            notification = new Notification.Builder(this)
                    .setLargeIcon(lagerIcon)
                    .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                    .setContentText("New Message")
                    .setSubText("New Message from Services provider's App")
                    .setChannelId(CHANNAL_ID)
                    .build();
        }
    mn.notify(NOTIFICATION_ID,notification);
    }
}