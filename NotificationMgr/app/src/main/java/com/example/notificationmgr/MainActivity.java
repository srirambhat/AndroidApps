package com.example.notificationmgr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                        Notification notify = new Notification.Builder(MainActivity.this)
                                .setTicker("Ticker Title")
                                .setContentTitle("Content Title")
                                .setContentText("Sriram Title")
                                .setSmallIcon(R.mipmap.smasher1)
                                .addAction(R.mipmap.smasher2, "Action 1", pIntent)
                                .addAction(R.mipmap.smasher3, "Action 2", pIntent)
                                .setContentIntent(pIntent).getNotification();
                        notify.flags = Notification.FLAG_AUTO_CANCEL;
                        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        nm.notify(0,notify);

                    }
                }
        );
    }
}