package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdf extends zzbdm {
    public zzbdf(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzaxtVar, i2, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            String str = (String) this.f7658e.invoke(null, null);
            zzbbu zzbbuVar = new zzbbu();
            HashMap mapM4675b = zzazo.m4675b(str);
            if (mapM4675b != null) {
                zzbbuVar.f7539a = (Long) mapM4675b.get(0);
                zzbbuVar.f7540b = (Long) mapM4675b.get(1);
            }
            long jLongValue = zzbbuVar.f7539a.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4595T(jLongValue);
            long jLongValue2 = zzbbuVar.f7540b.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4597U(jLongValue2);
        }
    }
}
