package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16468a;

    /* JADX INFO: renamed from: b */
    public final zzfto f16469b;

    /* JADX INFO: renamed from: c */
    public final zzcnz f16470c;

    /* JADX INFO: renamed from: d */
    public final zzini f16471d;

    /* JADX INFO: renamed from: e */
    public final zzini f16472e;

    /* JADX INFO: renamed from: f */
    public final zzcnt f16473f;

    public zzftd(zzimy zzimyVar, zzfto zzftoVar, zzcnz zzcnzVar, zzimy zzimyVar2, zzimy zzimyVar3, zzcnt zzcntVar) {
        this.f16468a = zzimyVar;
        this.f16469b = zzftoVar;
        this.f16470c = zzcnzVar;
        this.f16471d = zzimyVar2;
        this.f16472e = zzimyVar3;
        this.f16473f = zzcntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzftc((zzfum) this.f16468a.zzb(), this.f16469b.zzb(), this.f16470c.m5709a(), (Clock) this.f16471d.zzb(), (zzfsx) this.f16472e.zzb(), this.f16473f.zzb());
    }
}
