package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdb extends zzbdm {
    public zzbdb(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", zzaxtVar, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        try {
            int i2 = 1;
            if (true == ((Boolean) this.f7658e.invoke(null, this.f7654a.f7547a)).booleanValue()) {
                i2 = 2;
            }
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4626v0(i2);
        } catch (InvocationTargetException unused) {
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4626v0(3);
        }
    }
}
