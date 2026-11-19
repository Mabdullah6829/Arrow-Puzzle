package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
final class zzfc {

    /* JADX INFO: renamed from: a */
    public final int f15375a;

    /* JADX INFO: renamed from: b */
    public int f15376b;

    /* JADX INFO: renamed from: c */
    public boolean f15377c;

    /* JADX INFO: renamed from: d */
    public long f15378d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfd f15379e;

    public zzfc(zzfd zzfdVar, int i2) {
        this.f15379e = zzfdVar;
        this.f15375a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6421a() {
        zzfd zzfdVar = this.f15379e;
        zzbb zzbbVar = zzfdVar.f15443a;
        zzea zzeaVar = zzfdVar.f15447e;
        int iZzi = ((zzlj) zzbbVar).zzi();
        zzlj zzljVar = (zzlj) zzfdVar.f15443a;
        if (!zzljVar.zzk() || zzljVar.zzh() == 1 || zzljVar.zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.f15377c) {
                zzeaVar.mo6115E(4);
            }
            this.f15377c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f15377c;
        int i2 = this.f15375a;
        if (z && this.f15376b == iZzi) {
            if (jElapsedRealtime - this.f15378d >= i2) {
                zzfdVar.f15445c.mo6409e(new zzfe(4, i2));
            }
        } else {
            this.f15377c = true;
            this.f15378d = jElapsedRealtime;
            this.f15376b = iZzi;
            zzeaVar.mo6115E(4);
            zzeaVar.mo6120e(4, i2);
        }
    }
}
