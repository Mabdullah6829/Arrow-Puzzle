package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbic;

/* JADX INFO: loaded from: classes.dex */
public class zzz {
    /* JADX INFO: renamed from: a */
    public zzbic.zzq mo3239a(Context context, TelephonyManager telephonyManager) {
        return zzbic.zzq.ENUM_UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo3241c(Context context) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Intent mo3242d(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public void mo3243e(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    public int mo3244f(AudioManager audioManager) {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public int mo3245g(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    /* JADX INFO: renamed from: b */
    public void mo3240b(Context context) {
    }
}
