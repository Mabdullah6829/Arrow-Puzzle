package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzccw;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzfl implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzccw f3187s;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzccw zzccwVar = this.f3187s;
        if (zzccwVar != null) {
            try {
                zzccwVar.mo5339o(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }
}
