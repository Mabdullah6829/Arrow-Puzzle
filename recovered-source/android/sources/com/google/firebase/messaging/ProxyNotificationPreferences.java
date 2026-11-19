package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ExecutorC1058a;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @WorkerThread
    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    @WorkerThread
    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }

    @WorkerThread
    public static void setProxyNotificationsInitialized(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }

    @WorkerThread
    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z) {
        if (Build.VERSION.SDK_INT < 29 || isProxyNotificationRetentionSet(getPreference(context), z)) {
            return;
        }
        gmsRpc.setRetainProxiedNotifications(z).addOnSuccessListener(new ExecutorC1058a(2), new OnSuccessListener() { // from class: com.google.firebase.messaging.n
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ProxyNotificationPreferences.setProxyRetentionPreferences(context, z);
            }
        });
    }

    @WorkerThread
    public static void setProxyRetentionPreferences(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }
}
