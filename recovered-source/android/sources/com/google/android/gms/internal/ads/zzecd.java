package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzecd implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzece f13538s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbsd f13539t;

    public /* synthetic */ zzecd(zzece zzeceVar, zzbsd zzbsdVar) {
        this.f13538s = zzeceVar;
        this.f13539t = zzbsdVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        try {
            this.f13539t.mo2942i3(this.f13538s.m6151b());
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
