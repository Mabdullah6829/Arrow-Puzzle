package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdg extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final zzbcg f7642h;

    /* JADX INFO: renamed from: i */
    public final long f7643i;

    public zzbdg(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, zzbcg zzbcgVar) {
        super(zzbbzVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxtVar, i2, 53);
        this.f7642h = zzbcgVar;
        if (zzbcgVar != null) {
            if (zzbcgVar.f7593D <= -2) {
                WeakReference weakReference = zzbcgVar.f7601z;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    zzbcgVar.f7593D = -3L;
                }
            }
            this.f7643i = zzbcgVar.f7593D;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        if (this.f7642h != null) {
            long jLongValue = ((Long) this.f7658e.invoke(null, Long.valueOf(this.f7643i))).longValue();
            zzaxt zzaxtVar = this.f7657d;
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4599V(jLongValue);
        }
    }
}
