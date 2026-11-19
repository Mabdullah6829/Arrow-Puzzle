package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzyw implements zzabl {

    /* JADX INFO: renamed from: a */
    public long f21419a;

    /* JADX INFO: renamed from: b */
    public long f21420b;

    /* JADX INFO: renamed from: c */
    public zzabk f21421c;

    /* JADX INFO: renamed from: d */
    public zzyw f21422d;

    public zzyw(long j2) {
        zzgtr.m7133f(this.f21421c == null);
        this.f21419a = j2;
        this.f21420b = j2 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    /* JADX INFO: renamed from: a */
    public final zzabl mo3926a() {
        zzyw zzywVar = this.f21422d;
        if (zzywVar == null || zzywVar.f21421c == null) {
            return null;
        }
        return zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    /* JADX INFO: renamed from: d */
    public final zzabk mo3927d() {
        zzabk zzabkVar = this.f21421c;
        zzabkVar.getClass();
        return zzabkVar;
    }
}
