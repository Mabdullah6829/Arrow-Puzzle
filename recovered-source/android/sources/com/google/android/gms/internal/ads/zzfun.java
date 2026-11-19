package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfun implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f16583a;

    /* JADX INFO: renamed from: b */
    public final zzcop f16584b;

    /* JADX INFO: renamed from: c */
    public final zzini f16585c;

    /* JADX INFO: renamed from: d */
    public final zzini f16586d;

    /* JADX INFO: renamed from: e */
    public final zzcrj f16587e;

    /* JADX INFO: renamed from: f */
    public final zzini f16588f;

    /* JADX INFO: renamed from: g */
    public final zzini f16589g;

    /* JADX INFO: renamed from: h */
    public final zzfto f16590h;

    public zzfun(zzcnz zzcnzVar, zzcop zzcopVar, zzimy zzimyVar, zzimy zzimyVar2, zzcrj zzcrjVar, zzimy zzimyVar3, zzimy zzimyVar4, zzfto zzftoVar) {
        this.f16583a = zzcnzVar;
        this.f16584b = zzcopVar;
        this.f16585c = zzimyVar;
        this.f16586d = zzimyVar2;
        this.f16587e = zzcrjVar;
        this.f16588f = zzimyVar3;
        this.f16589g = zzimyVar4;
        this.f16590h = zzftoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfum(this.f16583a.m5709a(), this.f16584b.m5711a(), (ScheduledExecutorService) this.f16585c.zzb(), (zzfow) this.f16586d.zzb(), zzfmc.m6524a(this.f16587e.f11311a.m5709a()), (Clock) this.f16588f.zzb(), (zzfsx) this.f16589g.zzb(), this.f16590h.zzb());
    }
}
