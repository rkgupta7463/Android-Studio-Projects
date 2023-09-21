package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private  static final String CHANNAL_ID= "AI APP";
    private  static final Integer NOTIFICATION_ID= 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button notifyBtn = findViewById(R.id.nbtn);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            NotificationChannel channel = new NotificationChannel("NOTIFICATION", "myNotification", NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager manager = getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }

        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here i am going to write the code of notifiation app
//                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"myNotification");
//                builder.setContentTitle("New Notification");
//                builder.setContentText("Hello , Get notification by this application");
//                builder.setSmallIcon(R.drawable.ic_baseline_notifications_24);
//                builder.setAutoCancel(true);
//                NotificationManagerCompat nm = NotificationManagerCompat.from(MainActivity.this);
//                nm.notify(12,builder.build());

                notificatclass notificatclass = new notificatclass(MainActivity.this);
                notificatclass.createnotification();

                Intent intent = new Intent(MainActivity.this, notificatclass.class);
                intent.putExtra("title","New Notification");
                intent.putExtra("text","Hello , Get notification by this application");
                intent.putExtra("Id",12);


                PendingIntent pendingIntent =  PendingIntent.getBroadcast(MainActivity.this, 0,intent,0);

                notificatclass.createalarm(new Date().getTime(),pendingIntent);
            }
        });
    }
}