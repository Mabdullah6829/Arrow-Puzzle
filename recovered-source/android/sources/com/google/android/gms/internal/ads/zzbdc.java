package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdc extends zzbdm {

    /* JADX INFO: renamed from: h */
    public List f7638h;

    /* JADX INFO: renamed from: i */
    public final Context f7639i;

    public zzbdc(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, Context context) {
        super(zzbbzVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzaxtVar, i2, 31);
        this.f7638h = null;
        this.f7639i = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4568E(-1L);
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4569F(-1L);
        Context context = this.f7639i;
        if (context == null) {
            context = this.f7654a.f7547a;
        }
        if (this.f7638h == null) {
            this.f7638h = (List) this.f7658e.invoke(null, context);
        }
        List list = this.f7638h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzaxtVar) {
            long jLongValue = ((Long) this.f7638h.get(0)).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4568E(jLongValue);
            long jLongValue2 = ((Long) this.f7638h.get(1)).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4569F(jLongValue2);
        }
    }
}
