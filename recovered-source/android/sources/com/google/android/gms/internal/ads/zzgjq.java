package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17629a;

    /* JADX INFO: renamed from: b */
    public final zzini f17630b;

    /* JADX INFO: renamed from: c */
    public final zzini f17631c;

    /* JADX INFO: renamed from: d */
    public final zzina f17632d;

    public zzgjq(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2) {
        this.f17629a = zzinaVar;
        this.f17630b = zzimyVar;
        this.f17631c = zzimyVar2;
        this.f17632d = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgjp((Context) this.f17629a.f20011a, (zzgqo) this.f17630b.zzb(), (zzghl) this.f17631c.zzb(), (zzgdq) this.f17632d.f20011a);
    }
}
