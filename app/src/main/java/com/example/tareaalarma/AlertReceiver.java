package com.example.tareaalarma;

import android.content.BroadcastReceiver;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification("Alarma", "La Alarma está trabajando");
        notificationHelper.getManager().notify(5, nb.build());
    }
}
