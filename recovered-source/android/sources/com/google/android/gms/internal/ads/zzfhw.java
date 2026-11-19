package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfhw implements zzgti {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfia f15728a;

    public zzfhw(zzfia zzfiaVar) {
        this.f15728a = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final Object apply(Object obj) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", (zzegz) obj);
        com.google.android.gms.ads.internal.util.zze.m3150k("Failed to get a cache key, reverting to legacy flow.");
        zzfia zzfiaVar = this.f15728a;
        zzflg zzflgVarZzb = zzfiaVar.f15738b.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVarZzb.f16040d;
        String str = zzflgVarZzb.f16043g;
        com.google.android.gms.ads.internal.client.zzx zzxVar = zzflgVarZzb.f16047k;
        zzfnc zzfncVar = ((zzfmw) zzfiaVar.f15737a).f16127b;
        zzfhy zzfhyVar = new zzfhy(null, new zzfng(zzmVar, str, new zzcbn(zzfncVar.f16147s).m5307a().f9726j, zzfncVar.f16153y, zzxVar));
        zzfiaVar.f15740d = zzfhyVar;
        return zzfhyVar;
    }
}
