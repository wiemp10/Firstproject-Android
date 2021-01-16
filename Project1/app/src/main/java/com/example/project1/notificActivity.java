package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notificActivity extends AppCompatActivity {

    Button snotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notific);
        snotify=findViewById(R.id.smallnotif);
        snotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int notification_id=1;
                NotificationCompat.Builder builder= new NotificationCompat.Builder(notificActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher_round))
                        .setContentTitle("Travel Anywhere")
                        .setContentText("Travel Maldives just Rs53000 only Book now, Hurry up!")
                        .setAutoCancel(true)
                        .setDefaults(NotificationCompat.DEFAULT_ALL);

                NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

                    String channelid= "com.example.project1";
                    NotificationChannel channel= new NotificationChannel(channelid,"Project1", NotificationManager.IMPORTANCE_DEFAULT);

                    notificationManager.createNotificationChannel(channel);
                    builder.setChannelId(channelid);
                }
                notificationManager.notify(notification_id, builder.build());
            }
        });
    }
}