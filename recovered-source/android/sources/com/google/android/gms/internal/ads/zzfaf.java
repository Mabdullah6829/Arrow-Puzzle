package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfaf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15264a;

    /* JADX INFO: renamed from: b */
    public final zzini f15265b;

    public zzfaf(zzcnz zzcnzVar, zzimy zzimyVar) {
        this.f15264a = zzcnzVar;
        this.f15265b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfad zzb() {
        return new zzfad(((zzcnz) this.f15264a).m5709a(), (Intent) this.f15265b.zzb());
    }
}
