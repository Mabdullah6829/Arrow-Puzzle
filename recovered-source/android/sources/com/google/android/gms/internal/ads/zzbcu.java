package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcu extends zzbdm {

    /* JADX INFO: renamed from: h */
    public static volatile Long f7624h;

    /* JADX INFO: renamed from: i */
    public static final Object f7625i = new Object();

    public zzbcu(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", zzaxtVar, i2, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        if (f7624h == null) {
            synchronized (f7625i) {
                try {
                    if (f7624h == null) {
                        f7624h = (Long) this.f7658e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            long jLongValue = f7624h.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4596T0(jLongValue);
        }
    }
}
