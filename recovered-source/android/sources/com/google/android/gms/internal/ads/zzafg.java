package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafg implements zzahd {

    /* JADX INFO: renamed from: a */
    public final zzafj f5175a;

    /* JADX INFO: renamed from: b */
    public final long f5176b;

    /* JADX INFO: renamed from: c */
    public final long f5177c;

    /* JADX INFO: renamed from: d */
    public final long f5178d;

    /* JADX INFO: renamed from: e */
    public final long f5179e;

    /* JADX INFO: renamed from: f */
    public final long f5180f;

    public zzafg(zzafj zzafjVar, long j2, long j3, long j4, long j5, long j6) {
        this.f5175a = zzafjVar;
        this.f5176b = j2;
        this.f5177c = j3;
        this.f5178d = j4;
        this.f5179e = j5;
        this.f5180f = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzahe zzaheVar = new zzahe(j2, zzafi.m4066a(this.f5175a.mo4065e(j2), 0L, this.f5177c, this.f5178d, this.f5179e, this.f5180f));
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5176b;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
