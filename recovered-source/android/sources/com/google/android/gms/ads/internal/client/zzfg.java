package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class zzfg implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfh f3183s;

    public zzfg(zzfh zzfhVar) {
        this.f3183s = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.f3183s.f3184s;
        if (zzbhVar != null) {
            try {
                zzbhVar.mo2818A(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
