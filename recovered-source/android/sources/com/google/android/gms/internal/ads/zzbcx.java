package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcx extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final zzbbc f7627h;

    /* JADX INFO: renamed from: i */
    public final long f7628i;

    /* JADX INFO: renamed from: j */
    public final long f7629j;

    public zzbcx(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, zzbbc zzbbcVar, long j2, long j3) {
        super(zzbbzVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzaxtVar, i2, 11);
        this.f7627h = zzbbcVar;
        this.f7628i = j2;
        this.f7629j = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzbbc zzbbcVar = this.f7627h;
        if (zzbbcVar != null) {
            String str = (String) this.f7658e.invoke(null, zzbbcVar.f7508a, Long.valueOf(this.f7628i), Long.valueOf(this.f7629j));
            zzbba zzbbaVar = new zzbba();
            HashMap mapM4675b = zzazo.m4675b(str);
            if (mapM4675b != null) {
                zzbbaVar.f7504a = (Long) mapM4675b.get(0);
                zzbbaVar.f7505b = (Long) mapM4675b.get(1);
                zzbbaVar.f7506c = (Long) mapM4675b.get(2);
            }
            zzaxt zzaxtVar = this.f7657d;
            synchronized (zzaxtVar) {
                try {
                    long jLongValue = zzbbaVar.f7504a.longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4582M0(jLongValue);
                    if (zzbbaVar.f7505b.longValue() >= 0) {
                        long jLongValue2 = zzbbaVar.f7505b.longValue();
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4615k0(jLongValue2);
                    }
                    if (zzbbaVar.f7506c.longValue() >= 0) {
                        long jLongValue3 = zzbbaVar.f7506c.longValue();
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4616l0(jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
