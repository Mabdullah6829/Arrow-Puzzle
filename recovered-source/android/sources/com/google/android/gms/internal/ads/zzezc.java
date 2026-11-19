package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15203a;

    /* JADX INFO: renamed from: b */
    public final zzini f15204b;

    /* JADX INFO: renamed from: c */
    public final zzini f15205c;

    public zzezc(zzfbh zzfbhVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15203a = zzfbhVar;
        this.f15204b = zzimyVar;
        this.f15205c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzfbh) this.f15203a).zzb();
        zzexg zzexgVar = (zzexg) this.f15204b.zzb();
        if (true == ((List) this.f15205c.zzb()).contains("29")) {
            objZzb = zzexgVar;
        }
        zzinh.m8554a(objZzb);
        return objZzb;
    }
}
