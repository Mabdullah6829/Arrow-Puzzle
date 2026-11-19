package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpz implements zzfit {

    /* JADX INFO: renamed from: a */
    public final zzimy f11133a;

    public zzcpz(zzcpe zzcpeVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzina zzinaVarM8549a = zzina.m8549a(context);
        zzina zzinaVarM8549a2 = zzina.m8549a(zzrVar);
        zzina zzinaVarM8549a3 = zzina.m8549a(str);
        zzimy zzimyVar = zzcpeVar.f10800o;
        zzimy zzimyVarM8547a = zzimy.m8547a(new zzetl(zzimyVar));
        zzimy zzimyVarM8547a2 = zzimy.m8547a(new zzfjs(zzcpeVar.f10753L0));
        zzimy zzimyVar2 = zzcpeVar.f10778d;
        zzina zzinaVar = zzcpeVar.f10750K;
        int i2 = zzflh.f16061a;
        this.f11133a = zzimy.m8547a(new zzett(zzinaVarM8549a, zzinaVarM8549a2, zzinaVarM8549a3, zzimy.m8547a(new zzfir(zzimyVar2, zzimyVarM8547a, zzimyVarM8547a2, zzinaVarM8549a, zzinaVar)), zzimyVarM8547a, zzimyVarM8547a2, zzcpeVar.f10790j, zzcpeVar.f10752L, zzimyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final zzets zza() {
        return (zzets) this.f11133a.zzb();
    }
}
