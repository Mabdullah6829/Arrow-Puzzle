package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyg implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15150a;

    /* JADX INFO: renamed from: b */
    public final zzini f15151b;

    /* JADX INFO: renamed from: c */
    public final zzini f15152c;

    public zzeyg(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.f15150a = zziniVar;
        this.f15151b = zziniVar2;
        this.f15152c = zziniVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Object zzeuiVar = new zzeui(((zzcnz) ((zzeuk) this.f15150a).f14909a).m5709a());
        zzexg zzexgVar = (zzexg) this.f15151b.zzb();
        if (true == ((List) this.f15152c.zzb()).contains("2")) {
            zzeuiVar = zzexgVar;
        }
        zzinh.m8554a(zzeuiVar);
        return zzeuiVar;
    }
}
