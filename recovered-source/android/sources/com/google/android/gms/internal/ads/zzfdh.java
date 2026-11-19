package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdh implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15486a;

    /* JADX INFO: renamed from: b */
    public final Context f15487b;

    public zzfdh(Context context, zzhcp zzhcpVar) {
        this.f15486a = zzhcpVar;
        this.f15487b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15486a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean zIsActiveNetworkMetered;
                int i2;
                Context context = this.f15485a.f15487b;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
                int i3 = -1;
                if (com.google.android.gms.ads.internal.util.zzs.m3204c(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i2 = type;
                        i3 = iOrdinal;
                    } else {
                        i2 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                } else {
                    zIsActiveNetworkMetered = false;
                    i2 = -2;
                }
                return new zzfdf(networkOperator, i2, zztVar.f3706f.mo3245g(context), phoneType, zIsActiveNetworkMetered, i3);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 39;
    }
}
