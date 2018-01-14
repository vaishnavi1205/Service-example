package com.swishsoftwaresolutions.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by DELL on 12/3/2017.
 */

public class StartedService extends Service {

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service created",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, final int startId) {
        int latestStartId = startId;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    stopSelfResult(startId);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        }).start();
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_LONG).show();
    }
}
