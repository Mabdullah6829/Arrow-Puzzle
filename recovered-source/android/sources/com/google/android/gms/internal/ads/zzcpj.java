package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpj implements zzffp {

    /* JADX INFO: renamed from: a */
    public final zzimy f10908a;

    public zzcpj(zzcpe zzcpeVar, Context context, String str) {
        zzina zzinaVarM8549a = zzina.m8549a(context);
        zzina zzinaVarM8549a2 = zzina.m8549a(str);
        zzimy zzimyVar = zzcpeVar.f10753L0;
        zzfig zzfigVar = new zzfig(zzimyVar, zzcpeVar.f10755M0, zzinaVarM8549a);
        zzimy zzimyVarM8547a = zzimy.m8547a(new zzfgn(zzimyVar));
        zzimy zzimyVar2 = zzcpeVar.f10778d;
        zzina zzinaVar = zzcpeVar.f10750K;
        int i2 = zzflh.f16061a;
        zzcop zzcopVar = zzcpeVar.f10790j;
        this.f10908a = zzimy.m8547a(new zzfgv(zzinaVar, zzinaVarM8549a, zzinaVarM8549a2, zzimy.m8547a(new zzfgp(zzinaVarM8549a, zzimyVar2, zzinaVar, zzfigVar, zzimyVarM8547a, zzcopVar)), zzimyVarM8547a, zzcopVar, zzcpeVar.f10800o));
    }

    @Override // com.google.android.gms.internal.ads.zzffp
    public final zzfgu zza() {
        return (zzfgu) this.f10908a.zzb();
    }
}
