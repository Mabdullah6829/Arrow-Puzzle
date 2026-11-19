package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcqf implements zzfkh {

    /* JADX INFO: renamed from: a */
    public final zzimy f11148a;

    /* JADX INFO: renamed from: b */
    public final zzimy f11149b;

    public zzcqf(zzcpe zzcpeVar, Context context, String str) {
        zzina zzinaVarM8549a = zzina.m8549a(context);
        zzimy zzimyVar = zzcpeVar.f10753L0;
        zzfih zzfihVar = new zzfih(zzimyVar, zzcpeVar.f10755M0, zzinaVarM8549a);
        zzimy zzimyVarM8547a = zzimy.m8547a(new zzfjs(zzimyVar));
        zzimy zzimyVarM8547a2 = zzimy.m8547a(zzfld.f16012a);
        zzimy zzimyVar2 = zzcpeVar.f10778d;
        zzina zzinaVar = zzcpeVar.f10750K;
        int i2 = zzflh.f16061a;
        zzimy zzimyVarM8547a3 = zzimy.m8547a(new zzfkb(zzinaVarM8549a, zzimyVar2, zzinaVar, zzfihVar, zzimyVarM8547a, zzimyVarM8547a2));
        this.f11148a = zzimy.m8547a(new zzfkl(zzimyVarM8547a3, zzimyVarM8547a, zzimyVarM8547a2));
        this.f11149b = zzimy.m8547a(new zzfkf(zzina.m8550b(str), zzimyVarM8547a3, zzinaVarM8549a, zzimyVarM8547a, zzimyVarM8547a2, zzcpeVar.f10790j, zzcpeVar.f10752L, zzcpeVar.f10800o));
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final zzfkk zza() {
        return (zzfkk) this.f11148a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final zzfke zzb() {
        return (zzfke) this.f11149b.zzb();
    }
}
