package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1631a;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmq;
import com.google.android.gms.internal.ads.zzekz;

/* JADX INFO: loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: a */
    public final zzbic.zzq mo3239a(Context context, TelephonyManager telephonyManager) {
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        if (zzs.m3204c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzbic.zzq.ENUM_TRUE : zzbic.zzq.ENUM_FALSE;
        }
        return zzbic.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: b */
    public final void mo3240b(Context context) {
        AbstractC1631a.m2585C();
        NotificationChannel notificationChannelM2589c = AbstractC1631a.m2589c(((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8131H9)).intValue());
        notificationChannelM2589c.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM2589c);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: c */
    public final boolean mo3241c(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    /* JADX INFO: renamed from: d */
    public final Intent mo3242d(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzt
    /* JADX INFO: renamed from: i */
    public final zzclm mo3238i(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        return new zzcmq((zzclx) zzclbVar, zzbhwVar, z, zzekzVar);
    }
}
