package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfde implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f15476a;

    /* JADX INFO: renamed from: b */
    public final zzini f15477b;

    /* JADX INFO: renamed from: c */
    public final zzini f15478c;

    public zzfde(zzcnz zzcnzVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15476a = zzcnzVar;
        this.f15477b = zzimyVar;
        this.f15478c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfdd zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfdd(zzhcpVar, this.f15476a.m5709a(), (zzeej) this.f15477b.zzb(), (String) this.f15478c.zzb());
    }
}
