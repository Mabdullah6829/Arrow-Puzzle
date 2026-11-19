package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzxe extends zzwz {

    /* JADX INFO: renamed from: e */
    public static final Object f21262e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f21263c;

    /* JADX INFO: renamed from: d */
    public final Object f21264d;

    public zzxe(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.f21263c = obj;
        this.f21264d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: b */
    public final zzbe mo4736b(int i2, zzbe zzbeVar, long j2) {
        this.f21246b.mo4736b(i2, zzbeVar, j2);
        if (Objects.equals(zzbeVar.f7675a, this.f21263c)) {
            zzbeVar.f7675a = zzbe.f7673m;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: d */
    public final zzbd mo4738d(int i2, zzbd zzbdVar, boolean z) {
        this.f21246b.mo4738d(i2, zzbdVar, z);
        if (Objects.equals(zzbdVar.f7633b, this.f21264d) && z) {
            zzbdVar.f7633b = f21262e;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: e */
    public final int mo4739e(Object obj) {
        Object obj2;
        if (f21262e.equals(obj) && (obj2 = this.f21264d) != null) {
            obj = obj2;
        }
        return this.f21246b.mo4739e(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: f */
    public final Object mo4740f(int i2) {
        Object objMo4740f = this.f21246b.mo4740f(i2);
        return Objects.equals(objMo4740f, this.f21264d) ? f21262e : objMo4740f;
    }
}
