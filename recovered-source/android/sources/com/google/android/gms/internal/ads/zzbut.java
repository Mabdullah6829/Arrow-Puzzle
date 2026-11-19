package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbut implements zzbuf {

    /* JADX INFO: renamed from: a */
    public final zzbuh f9412a;

    /* JADX INFO: renamed from: b */
    public final zzbui f9413b;

    /* JADX INFO: renamed from: c */
    public final zzbub f9414c;

    /* JADX INFO: renamed from: d */
    public final String f9415d;

    public zzbut(zzbub zzbubVar, String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        this.f9414c = zzbubVar;
        this.f9415d = str;
        this.f9413b = zzbuiVar;
        this.f9412a = zzbuhVar;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m5149a(Object obj) {
        zzcgd zzcgdVar = new zzcgd();
        zzbtv zzbtvVarM5142b = this.f9414c.m5142b();
        com.google.android.gms.ads.internal.util.zze.m3150k("callJs > getEngine: Promise created");
        zzbtvVarM5142b.m5399a(new zzbuq(this, zzbtvVarM5142b, obj, zzcgdVar), new zzbur(zzbtvVarM5142b, this, zzcgdVar));
        return zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) {
        return m5149a(obj);
    }
}
