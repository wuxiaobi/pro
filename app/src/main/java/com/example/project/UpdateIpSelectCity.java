package com.example.project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UpdateIpSelectCity extends BroadcastReceiver {
    private static final String TAG = UpdateIpSelectCity.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "UpdateIpSelectCity onReceive:广播接收者" );
    }
}
