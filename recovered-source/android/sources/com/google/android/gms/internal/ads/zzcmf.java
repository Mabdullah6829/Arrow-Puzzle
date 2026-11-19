package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcmf implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcmh f10551s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f10552t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f10553u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f10554v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f10555w;

    public /* synthetic */ zzcmf(zzcmh zzcmhVar, int i2, int i3, boolean z, boolean z2) {
        this.f10551s = zzcmhVar;
        this.f10552t = i2;
        this.f10553u = i3;
        this.f10554v = z;
        this.f10555w = z2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i2;
        boolean z;
        boolean z2;
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        com.google.android.gms.ads.internal.client.zzed zzedVar2;
        com.google.android.gms.ads.internal.client.zzed zzedVar3;
        zzcmh zzcmhVar = this.f10551s;
        int i3 = this.f10552t;
        int i4 = this.f10553u;
        boolean z3 = this.f10554v;
        boolean z4 = this.f10555w;
        synchronized (zzcmhVar.f10565t) {
            try {
                boolean z5 = zzcmhVar.f10570y;
                if (z5 || i4 != 1) {
                    i2 = i4;
                    z = false;
                } else {
                    i4 = 1;
                    i2 = 1;
                    z = true;
                }
                boolean z6 = i3 != i4;
                if (z6 && i2 == 1) {
                    z2 = true;
                    i2 = 1;
                } else {
                    z2 = false;
                }
                boolean z7 = z6 && i2 == 2;
                boolean z8 = z6 && i2 == 3;
                zzcmhVar.f10570y = z5 || z;
                if (z) {
                    try {
                        com.google.android.gms.ads.internal.client.zzed zzedVar4 = zzcmhVar.f10569x;
                        if (zzedVar4 != null) {
                            zzedVar4.mo2934a();
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                    }
                }
                if (z2 && (zzedVar3 = zzcmhVar.f10569x) != null) {
                    zzedVar3.mo2935b();
                }
                if (z7 && (zzedVar2 = zzcmhVar.f10569x) != null) {
                    zzedVar2.mo2936c();
                }
                if (z8) {
                    com.google.android.gms.ads.internal.client.zzed zzedVar5 = zzcmhVar.f10569x;
                    if (zzedVar5 != null) {
                        zzedVar5.zzh();
                    }
                    zzcmhVar.f10564s.mo5469Y();
                }
                if (z3 != z4 && (zzedVar = zzcmhVar.f10569x) != null) {
                    zzedVar.mo2933J2(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
