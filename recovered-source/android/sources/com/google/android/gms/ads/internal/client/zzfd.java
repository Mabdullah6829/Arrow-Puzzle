package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class zzfd implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfe f3180s;

    public zzfd(zzfe zzfeVar) {
        this.f3180s = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.f3180s.f3181s.f3182s;
        if (zzbhVar != null) {
            try {
                zzbhVar.mo2818A(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
