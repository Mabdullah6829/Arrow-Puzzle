package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15321a;

    /* JADX INFO: renamed from: b */
    public final zzini f15322b;

    /* JADX INFO: renamed from: c */
    public final zzini f15323c;

    public zzfbh(zzcnz zzcnzVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15321a = zzimyVar;
        this.f15322b = zzimyVar2;
        this.f15323c = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfbf zzb() {
        return new zzfbf((ApplicationInfo) this.f15321a.zzb(), (PackageInfo) this.f15322b.zzb(), ((zzcnz) this.f15323c).m5709a());
    }
}
