package com.example.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class MyService extends Service {
    private final IBinder iBind = new localBinder();
    private final Random mGenerator = new Random();

    public class localBinder extends Binder {
        MyService getService () {
            return MyService.this;
        }
    }

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return iBind;
    }

    public int genRandom () {
        return mGenerator.nextInt(1000);
    }
}
