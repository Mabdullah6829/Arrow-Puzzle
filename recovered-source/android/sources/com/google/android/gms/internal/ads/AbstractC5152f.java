package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.DefaultClock;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5152f {
    /* JADX INFO: renamed from: a */
    public static int m3769a(int i2, int i3, int i4) {
        return zzidu.m8280b(i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m3770b(int i2, int i3, int i4, int i5) {
        return ((i2 + i3) - i4) + i5;
    }

    /* JADX INFO: renamed from: c */
    public static int m3771c(int i2, int i3, int i4, int i5, int i6) {
        return Math.max(((i2 * i3) / i4) + i5, i6);
    }

    /* JADX INFO: renamed from: d */
    public static void m3772d(int i2, int i3, String str, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        zzeh.m6211c(str2, sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m3773e(int i2, HashMap map, String str, int i3, String str2) {
        map.put(str, Integer.valueOf(i2));
        map.put(str2, Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: f */
    public static void m3774f(DefaultClock defaultClock, zzdzo zzdzoVar, String str) {
        defaultClock.getClass();
        zzdzoVar.m6104c(System.currentTimeMillis(), str);
    }

    /* JADX INFO: renamed from: g */
    public static void m3775g(String str, String str2, String str3) {
        zzeh.m6211c(str3, str2.concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: h */
    public static void m3776h(StringBuilder sb, String str, int i2, String str2) {
        sb.append(str);
        sb.append(i2);
        zzeh.m6211c(str2, sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static int m3777i(int i2, int i3, int i4, int i5) {
        return zzidu.m8280b(i2) + i3 + i4 + i5;
    }
}
