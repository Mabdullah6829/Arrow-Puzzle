package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17619a;

    /* JADX INFO: renamed from: b */
    public final zzini f17620b;

    /* JADX INFO: renamed from: c */
    public final zzini f17621c;

    /* JADX INFO: renamed from: d */
    public final zzina f17622d;

    /* JADX INFO: renamed from: e */
    public final zzini f17623e;

    public zzgjo(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar, zzina zzinaVar2) {
        this.f17619a = zzinaVar;
        this.f17620b = zzimyVar;
        this.f17621c = zzimyVar2;
        this.f17622d = zzinaVar2;
        this.f17623e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgjn((zzaxt) this.f17619a.f20011a, (zzgie) this.f17620b.zzb(), (DisplayMetrics) this.f17621c.zzb(), (View) this.f17622d.f20011a, (zzgqo) this.f17623e.zzb());
    }
}
