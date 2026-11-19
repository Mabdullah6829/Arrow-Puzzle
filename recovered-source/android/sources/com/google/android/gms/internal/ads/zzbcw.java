package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcw extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final zzbbr f7626h;

    public zzbcw(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, zzbbr zzbbrVar) {
        super(zzbbzVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzaxtVar, i2, 94);
        this.f7626h = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        Method method = this.f7658e;
        zzbbr zzbbrVar = this.f7626h;
        List list = zzbbrVar.f7529a;
        zzbbrVar.f7529a = Collections.EMPTY_LIST;
        int iIntValue = ((Integer) method.invoke(null, list)).intValue();
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            int iM4532a = zzayh.m4532a(iIntValue);
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4628x0(iM4532a);
        }
    }
}
