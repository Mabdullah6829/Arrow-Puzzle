package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zznn implements zzmd {

    /* JADX INFO: renamed from: s */
    public boolean f20510s;

    /* JADX INFO: renamed from: t */
    public long f20511t;

    /* JADX INFO: renamed from: u */
    public long f20512u;

    /* JADX INFO: renamed from: v */
    public zzav f20513v;

    /* JADX INFO: renamed from: a */
    public final void m8800a(long j2) {
        this.f20511t = j2;
        if (this.f20510s) {
            this.f20512u = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: c */
    public final long mo8618c() {
        long j2 = this.f20511t;
        if (!this.f20510s) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20512u;
        zzav zzavVar = this.f20513v;
        return (zzavVar.f6970a == 1.0f ? zzfm.m6519u(jElapsedRealtime) : jElapsedRealtime * ((long) zzavVar.f6972c)) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: i */
    public final void mo8619i(zzav zzavVar) {
        if (this.f20510s) {
            m8800a(mo8618c());
        }
        this.f20513v = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        return this.f20513v;
    }
}
