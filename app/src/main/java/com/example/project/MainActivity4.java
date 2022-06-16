package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Java代码来注册接收者 动态接收者
        UpdateIpSelectCity updateIpSelectCity=new UpdateIpSelectCity();
        IntentFilter filter=new IntentFilter();
        filter.addAction(ActionUtils.ACTION_EQUES_UPDATE_IP);
        registerReceiver(updateIpSelectCity,filter);
    }
    //动态注册接收者
    public void sendAction1(View view) {
        Intent intent=new Intent();
        intent.setAction(ActionUtils.ACTION_EQUES_UPDATE_IP);
        sendBroadcast(intent);
    }
    //第二步：发送给接受者
    //静态广播接受则
    public void sendAction2(View view) {
        Intent intent=new Intent();
        intent.setAction(ActionUtils.ACTION_FLAG);
        sendBroadcast(intent);
    }
}