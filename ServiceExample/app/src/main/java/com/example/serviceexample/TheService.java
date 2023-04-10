package com.example.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TheService extends Service {
    public static final String MY_TAG = "SRIRAM DEBUG:";
    final class TheThread implements Runnable {
        int ServiceID;
        TheThread(int ServiceID) {
            this.ServiceID = ServiceID;
        }

        @Override
        public void run() {
            synchronized (this) {
                try {
                    wait(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stopSelf(this.ServiceID);
            }
        }
    }

    @Override
    public void onCreate () {
        Log.i(MY_TAG,"onCreate Method");
        super.onCreate();
    }

    public int onStartCommand (Intent intent, int flags, int StartID) {
        Log.i(MY_TAG,"onStart Method");
        Toast.makeText(TheService.this, "Service is Started",Toast.LENGTH_SHORT).show();
        Thread thread = new Thread(new TheThread(StartID));
        thread.start();
        return (START_STICKY);
    }

    public void onDestroy () {
        Log.i(MY_TAG,"onDestroy Method");
        Toast.makeText(TheService.this, "Service is stopped",Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(MY_TAG,"onBind Method");
        return null;
    }
}

