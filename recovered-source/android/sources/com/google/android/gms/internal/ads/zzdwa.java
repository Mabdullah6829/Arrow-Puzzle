package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwa implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzerd f13145a;

    /* JADX INFO: renamed from: b */
    public final zzerd f13146b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f13147c;

    public zzdwa(zzerd zzerdVar, zzerd zzerdVar2, zzdcq zzdcqVar) {
        this.f13145a = zzerdVar;
        this.f13146b = zzerdVar2;
        this.f13147c = zzdcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* synthetic */ Object zzb() {
        int i2 = this.f13147c.m5898a().f16052p.f15997a;
        if (i2 != 0) {
            return i2 + (-1) != 0 ? this.f13146b.zzb() : this.f13145a.zzb();
        }
        throw null;
    }
}
