package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdh extends zzbdm {

    /* JADX INFO: renamed from: h */
    public static volatile Long f7644h;

    /* JADX INFO: renamed from: i */
    public static final Object f7645i = new Object();

    public zzbdh(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", zzaxtVar, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        if (f7644h == null) {
            synchronized (f7645i) {
                try {
                    if (f7644h == null) {
                        f7644h = (Long) this.f7658e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            long jLongValue = f7644h.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4570G(jLongValue);
        }
    }
}
