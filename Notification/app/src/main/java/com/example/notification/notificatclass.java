package com.example.notification;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class notificatclass extends BroadcastReceiver{
    private  Context context;

    public  notificatclass(){}

    public notificatclass(Context context){
        this.context = context;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder nm;
        nm = new NotificationCompat.Builder(context, "MyNotification")
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setContentTitle(intent.getExtras().getString("title"))
                .setContentText(intent.getExtras().getString("text"))
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(PendingIntent.getActivity(context,0, new Intent(context,MainActivity.class),0));

        NotificationManagerCompat nmc = NotificationManagerCompat.from(context);
        nmc.notify(intent.getExtras().getInt("Id"),nm.build());
    }

    public void createnotification(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            String title = "New Notification";
            String text = "Hello , Get notification by this application";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("Mychannal",title,importance);
            channel.setDescription(text);

            NotificationManager n =(NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
            n.createNotificationChannel(channel);
        }
    }

    public void createalarm(long timeToshowNotification, PendingIntent pendingIntent){
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,timeToshowNotification,pendingIntent);
    }
    public void cancalNotifcation(int notificationID){
        NotificationManager n = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
        n.cancel(notificationID);
    }
}
