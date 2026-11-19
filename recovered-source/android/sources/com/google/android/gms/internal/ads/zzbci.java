package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbci {

    /* JADX INFO: renamed from: e */
    public static final String[] f7603e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a */
    public long f7604a;

    /* JADX INFO: renamed from: b */
    public long f7605b;

    /* JADX INFO: renamed from: c */
    public long f7606c;

    /* JADX INFO: renamed from: d */
    public boolean f7607d;

    /* JADX INFO: renamed from: a */
    public static zzbci m4749a(Context context, Executor executor) {
        String[] strArr = f7603e;
        zzbci zzbciVar = new zzbci();
        zzbciVar.f7604a = 0L;
        zzbciVar.f7605b = 0L;
        zzbciVar.f7606c = -1L;
        zzbciVar.f7607d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzbch(zzbciVar));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return zzbciVar;
    }
}
