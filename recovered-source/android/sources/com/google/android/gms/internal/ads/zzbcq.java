package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcq extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final long f7618h;

    public zzbcq(zzbbz zzbbzVar, zzaxt zzaxtVar, long j2, int i2) {
        super(zzbbzVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxtVar, i2, 25);
        this.f7618h = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        long jLongValue = ((Long) this.f7658e.invoke(null, null)).longValue();
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4621q0(jLongValue);
            long j2 = this.f7618h;
            if (j2 != 0) {
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4592R0(jLongValue - j2);
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4598U0(j2);
            }
        }
    }
}
