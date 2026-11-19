package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzihf extends zzihd {
    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8443a(Object obj, int i2, long j2) {
        ((zzihe) obj).m8457d(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo8444b(int i2, int i3, Object obj) {
        ((zzihe) obj).m8457d((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8445c(Object obj, int i2, long j2) {
        ((zzihe) obj).m8457d((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8446d(Object obj, int i2, zzidl zzidlVar) {
        ((zzihe) obj).m8457d((i2 << 3) | 2, zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8447e(int i2, Object obj, Object obj2) {
        ((zzihe) obj).m8457d((i2 << 3) | 3, (zzihe) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzihe mo8448f() {
        return zzihe.m8454a();
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: g */
    public final zzihe mo8449g(Object obj) {
        zzihe zziheVar = (zzihe) obj;
        if (zziheVar.f19901e) {
            zziheVar.f19901e = false;
        }
        return zziheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ zzihe mo8450h(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.f19896f) {
            return zziheVar;
        }
        zzihe zziheVarM8454a = zzihe.m8454a();
        zziepVar.zzt = zziheVarM8454a;
        return zziheVarM8454a;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo8451i(Object obj, Object obj2) {
        ((zziep) obj).zzt = (zzihe) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    /* JADX INFO: renamed from: j */
    public final void mo8452j(Object obj) {
        zzihe zziheVar = ((zziep) obj).zzt;
        if (zziheVar.f19901e) {
            zziheVar.f19901e = false;
        }
    }
}
