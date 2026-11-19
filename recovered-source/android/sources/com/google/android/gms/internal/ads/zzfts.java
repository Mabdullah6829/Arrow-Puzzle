package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfts implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16513a;

    /* JADX INFO: renamed from: b */
    public final zzfto f16514b;

    /* JADX INFO: renamed from: c */
    public final zzcnz f16515c;

    /* JADX INFO: renamed from: d */
    public final zzini f16516d;

    public zzfts(zzimy zzimyVar, zzfto zzftoVar, zzcnz zzcnzVar, zzimy zzimyVar2) {
        this.f16513a = zzimyVar;
        this.f16514b = zzftoVar;
        this.f16515c = zzcnzVar;
        this.f16516d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzftr((zzfum) this.f16513a.zzb(), this.f16514b.zzb(), this.f16515c.m5709a(), (Clock) this.f16516d.zzb());
    }
}
