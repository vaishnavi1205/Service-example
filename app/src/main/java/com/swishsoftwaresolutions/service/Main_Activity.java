package com.swishsoftwaresolutions.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started_);
    }

    public void startService(View view){
        Intent intent = new Intent(Main_Activity.this,StartedService.class);
        startService(intent);
    }


    public void stopService(View view) {
        stopService(new Intent(Main_Activity.this,StartedService.class));
    }
}
