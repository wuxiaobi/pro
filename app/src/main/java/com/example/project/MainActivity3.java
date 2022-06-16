package com.example.project;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG = "ss";

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(connecton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void bindServce(View view) {
        bindService(new Intent(this,MyService.class),connecton, Context.BIND_AUTO_CREATE);
    }

    public void unBindServce(View view) {
        unbindService(connecton);
    }
    private ServiceConnection connecton=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
        }
    };


    //启动服务
    public void startServce(View view) {
        startService(new Intent(this,MyService.class));
    }
    //停止服务
    public void stopServce(View view) {
        stopService(new Intent(this,MyService.class));
    }
}