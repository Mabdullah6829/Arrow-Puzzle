package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmd {
    /* JADX INFO: renamed from: a */
    public static void m6526a(int i2, Throwable th, String str) {
        String strM2447n = AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 20), "Ad failed to load : ", i2);
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2447n);
        com.google.android.gms.ads.internal.util.zze.m3151l(str, th);
        if (i2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e(str, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m6527b(Context context, boolean z) {
        if (z) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        String strM3034c = com.google.android.gms.ads.internal.util.client.zzf.m3034c(context);
        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strM3034c).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strM3034c, "\")) to get test ads on this device.");
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2450q);
    }
}
