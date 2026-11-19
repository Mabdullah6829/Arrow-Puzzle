package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbct extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final zzbca f7623h;

    public zzbct(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, zzbca zzbcaVar) {
        super(zzbbzVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzaxtVar, i2, 85);
        this.f7623h = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        Method method = this.f7658e;
        zzbca zzbcaVar = this.f7623h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbcaVar.f7564c), Long.valueOf(zzbcaVar.f7565d), Long.valueOf(zzbcaVar.f7566e), Long.valueOf(zzbcaVar.f7567f));
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            long j2 = jArr[0];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4617m0(j2);
            long j3 = jArr[1];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4618n0(j3);
        }
    }
}
