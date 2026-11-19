package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17577a;

    /* JADX INFO: renamed from: b */
    public final zzini f17578b;

    /* JADX INFO: renamed from: c */
    public final zzini f17579c;

    /* JADX INFO: renamed from: d */
    public final zzini f17580d;

    public zzgjc(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2) {
        this.f17577a = zzinaVar;
        this.f17578b = zzimyVar;
        this.f17579c = zzinaVar2;
        this.f17580d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgjb((zzaxt) this.f17577a.f20011a, (zzgie) this.f17578b.zzb(), (Context) this.f17579c.zzb(), (zzgqo) this.f17580d.zzb());
    }
}
