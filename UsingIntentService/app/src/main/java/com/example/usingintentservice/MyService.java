package com.example.usingintentservice;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends IntentService {
    public static final String MY_TAG = "SRIRAM DEBUG:";

    public MyService() {
        super("my intent thread");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.i(MY_TAG,"onStart Method");
        Toast.makeText(MyService.this, "Service is Started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    /*
     *
     */
    public void onDestroy(){
        Log.i(MY_TAG,"onDestroy Method");
        Toast.makeText(MyService.this, "Service is stopped",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        synchronized (this) {
            try {
                wait(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
