package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjm implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17612a;

    /* JADX INFO: renamed from: b */
    public final zzini f17613b;

    /* JADX INFO: renamed from: c */
    public final zzina f17614c;

    /* JADX INFO: renamed from: d */
    public final zzini f17615d;

    /* JADX INFO: renamed from: e */
    public final zzini f17616e;

    public zzgjm(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar, zzina zzinaVar2) {
        this.f17612a = zzinaVar;
        this.f17613b = zzimyVar;
        this.f17614c = zzinaVar2;
        this.f17615d = zzimyVar2;
        this.f17616e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgjl((zzaxt) this.f17612a.f20011a, (zzgie) this.f17613b.zzb(), (Map) this.f17614c.f20011a, (DisplayMetrics) this.f17615d.zzb(), (zzgqo) this.f17616e.zzb());
    }
}
