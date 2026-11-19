package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbc {

    /* JADX INFO: renamed from: a */
    public NetworkCapabilities f7508a;

    /* JADX INFO: renamed from: a */
    public static zzbbc m4718a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        zzbbc zzbbcVar = new zzbbc();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzbbb(zzbbcVar));
                return zzbbcVar;
            } catch (RuntimeException unused) {
                synchronized (zzbbc.class) {
                    zzbbcVar.f7508a = null;
                }
            }
        }
        return zzbbcVar;
    }
}
