package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetv {

    /* JADX INFO: renamed from: a */
    public final zzeuh f14875a;

    /* JADX INFO: renamed from: b */
    public final String f14876b;

    /* JADX INFO: renamed from: c */
    public zzdcs f14877c;

    public zzetv(zzeuh zzeuhVar, String str) {
        this.f14875a = zzeuhVar;
        this.f14876b = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6355a(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) {
        this.f14877c = null;
        zzeub zzeubVar = new zzeub(i2);
        zzetu zzetuVar = new zzetu(this);
        this.f14875a.m6398a(zzmVar, this.f14876b, zzeubVar, zzetuVar);
    }
}
