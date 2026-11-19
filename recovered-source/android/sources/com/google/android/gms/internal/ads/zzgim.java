package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgim implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17526a;

    /* JADX INFO: renamed from: b */
    public final zzini f17527b;

    /* JADX INFO: renamed from: c */
    public final zzina f17528c;

    /* JADX INFO: renamed from: d */
    public final zzina f17529d;

    /* JADX INFO: renamed from: e */
    public final zzini f17530e;

    public zzgim(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2, zzina zzinaVar3) {
        this.f17526a = zzinaVar;
        this.f17527b = zzimyVar;
        this.f17528c = zzinaVar2;
        this.f17529d = zzinaVar3;
        this.f17530e = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgil((zzaxt) this.f17526a.f20011a, (zzgie) this.f17527b.zzb(), (View) this.f17528c.f20011a, (Activity) this.f17529d.f20011a, (zzgqo) this.f17530e.zzb());
    }
}
