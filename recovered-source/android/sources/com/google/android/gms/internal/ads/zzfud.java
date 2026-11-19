package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfud implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzful f16540s;

    public zzfud(zzful zzfulVar) {
        this.f16540s = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.f16540s;
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfulVar.f16562h;
        if (zzcbVar != null) {
            try {
                zzcbVar.mo2883z0((com.google.android.gms.ads.internal.client.zzfp) zzfulVar.f16559e.get());
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = zzfulVar.f16563i;
        if (zzceVar != null) {
            try {
                zzceVar.mo2886j0(zzfulVar.f16566l);
            } catch (RemoteException unused2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to call onAdsExhausted");
            }
        }
    }
}
