package com.google.android.gms.internal.ads;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
final class zzadc implements zzaeu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzvm f4955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzadg f4957c;

    public zzadc(zzadg zzadgVar, zzvm zzvmVar, int i2, long j2) {
        this.f4955a = zzvmVar;
        this.f4956b = i2;
        this.f4957c = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    /* JADX INFO: renamed from: e */
    public final void mo3972e(long j2) {
        this.f4957c.m3987L0(this.f4955a, this.f4956b, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        zzadg zzadgVar = this.f4957c;
        zzadgVar.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f4955a.mo8909A(this.f4956b);
        Trace.endSection();
        zzadgVar.m3984J0(0, 1);
    }
}
