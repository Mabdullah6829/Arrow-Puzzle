package com.arrow.puzzle.escape.maze.free.game.personal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.arrow.puzzle.escape.maze.free.game.activity.SplashActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.google.gson.internal.bind.AbstractC6153b;
import java.util.Random;
import p061g.AsyncTaskC6345j;

/* JADX INFO: loaded from: classes.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX INFO: renamed from: c */
    public final void m2723c(String str, String str2, String str3) {
        Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
        intent.putExtra("notify", true);
        if (str3.isEmpty()) {
            intent.putExtra("intent", false);
        } else {
            intent.putExtra("intent", true);
        }
        intent.putExtra("type", str3);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(2)).play();
            } catch (Exception e) {
                e.printStackTrace();
            }
            NotificationChannel notificationChannelM11684c = AbstractC6153b.m11684c();
            notificationChannelM11684c.setDescription(str2);
            notificationChannelM11684c.enableLights(true);
            notificationChannelM11684c.setLightColor(-16776961);
            notificationChannelM11684c.enableLights(true);
            notificationManager.createNotificationChannel(notificationChannelM11684c);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "com.arrow.puzzle.escape.maze.free.game");
        builder.setAutoCancel(true).setDefaults(-1).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.ic_notification).setContentTitle(str).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setContentInfo("Info").setAutoCancel(true).setVibrate(new long[]{1000, 1000, 1000, 1000, 1000}).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(activity);
        notificationManager.notify(new Random().nextInt(), builder.build());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Gson gson = new Gson();
        Log.e("Notification Message", "Message received");
        Log.e("Notification Message", gson.toJson(remoteMessage));
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            String str = "";
            if (!remoteMessage.getData().isEmpty()) {
                String str2 = remoteMessage.getData().get("type");
                if (str2 != null) {
                    Log.e("Message type", str2);
                    str = str2;
                }
                m2723c(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody(), str);
                return;
            }
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();
            String str3 = remoteMessage.getData().get("img");
            if (str3 == null) {
                m2723c(title, body, "");
            } else {
                new AsyncTaskC6345j(this, title, body, str3).execute(new Void[0]);
            }
        }
    }
}
