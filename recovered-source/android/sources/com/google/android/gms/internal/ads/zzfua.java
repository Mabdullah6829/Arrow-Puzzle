package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfua implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx f16533s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzful f16534t;

    public zzfua(zzful zzfulVar, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.f16533s = zzdxVar;
        Objects.requireNonNull(zzfulVar);
        this.f16534t = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.f16533s;
        zzful zzfulVar = this.f16534t;
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfulVar.f16562h;
        if (zzcbVar != null) {
            try {
                zzcbVar.mo2882Z1((com.google.android.gms.ads.internal.client.zzfp) zzfulVar.f16559e.get());
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = zzfulVar.f16563i;
        if (zzceVar != null) {
            try {
                zzceVar.mo2885a4(zzfulVar.f16566l, zzdxVar);
            } catch (RemoteException unused2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to call onAdPreloaded");
            }
        }
    }
}
