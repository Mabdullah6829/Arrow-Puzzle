package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpr implements zzebd {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11030a;

    /* JADX INFO: renamed from: b */
    public final zzcpu f11031b;

    /* JADX INFO: renamed from: c */
    public Long f11032c;

    /* JADX INFO: renamed from: d */
    public String f11033d;

    public /* synthetic */ zzcpr(zzcpe zzcpeVar, zzcpu zzcpuVar) {
        this.f11030a = zzcpeVar;
        this.f11031b = zzcpuVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzebe m5762a() {
        zzinh.m8555b(Long.class, this.f11032c);
        zzinh.m8555b(String.class, this.f11033d);
        return new zzcps(this.f11030a, this.f11031b, this.f11032c, this.f11033d);
    }

    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ zzebd m5763b(String str) {
        str.getClass();
        this.f11033d = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ zzebd m5764c(long j2) {
        this.f11032c = Long.valueOf(j2);
        return this;
    }
}
