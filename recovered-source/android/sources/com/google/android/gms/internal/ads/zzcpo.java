package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpo implements zzfhd {

    /* JADX INFO: renamed from: a */
    public final Context f11011a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.client.zzr f11012b;

    /* JADX INFO: renamed from: c */
    public final String f11013c;

    /* JADX INFO: renamed from: d */
    public final zzcpe f11014d;

    /* JADX INFO: renamed from: e */
    public final zzimy f11015e;

    /* JADX INFO: renamed from: f */
    public final zzimy f11016f;

    public zzcpo(zzcpe zzcpeVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.f11014d = zzcpeVar;
        this.f11011a = context;
        this.f11012b = zzrVar;
        this.f11013c = str;
        zzina zzinaVarM8549a = zzina.m8549a(context);
        zzina zzinaVarM8549a2 = zzina.m8549a(zzrVar);
        zzimy zzimyVarM8547a = zzimy.m8547a(new zzetl(zzcpeVar.f10800o));
        this.f11015e = zzimyVarM8547a;
        zzimy zzimyVarM8547a2 = zzimy.m8547a(zzetp.f14852a);
        zzimy zzimyVarM8547a3 = zzimy.m8547a(zzdig.f12210a);
        zzimy zzimyVar = zzcpeVar.f10778d;
        zzina zzinaVar = zzcpeVar.f10750K;
        int i2 = zzflh.f16061a;
        this.f11016f = zzimy.m8547a(new zzfhb(zzimyVar, zzimyVarM8547a, zzimyVarM8547a2, zzimyVarM8547a3, zzinaVarM8549a, zzinaVarM8549a2, zzinaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfhd
    public final zzeso zza() {
        zzfha zzfhaVar = (zzfha) this.f11016f.zzb();
        zzetk zzetkVar = (zzetk) this.f11015e.zzb();
        zzcpe zzcpeVar = this.f11014d;
        zzimy zzimyVar = zzcpeVar.f10800o;
        VersionInfoParcel versionInfoParcel = zzcpeVar.f10774b.f10619a;
        zzinh.m8554a(versionInfoParcel);
        zzdzt zzdztVar = (zzdzt) zzimyVar.zzb();
        return new zzeso(this.f11011a, this.f11012b, this.f11013c, zzfhaVar, zzetkVar, versionInfoParcel, zzdztVar);
    }
}
