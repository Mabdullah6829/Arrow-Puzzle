package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfuc implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zze f16538s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzful f16539t;

    public zzfuc(zzful zzfulVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.f16538s = zzeVar;
        Objects.requireNonNull(zzfulVar);
        this.f16539t = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zze zzeVar = this.f16538s;
        zzful zzfulVar = this.f16539t;
        com.google.android.gms.ads.internal.client.zzce zzceVar = zzfulVar.f16563i;
        if (zzceVar != null) {
            try {
                zzceVar.mo2884Y1(zzfulVar.f16566l, zzeVar);
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to call onAdFailedToPreload");
            }
        }
    }
}
