package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeox implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14448a;

    /* JADX INFO: renamed from: b */
    public final zzini f14449b;

    /* JADX INFO: renamed from: c */
    public final zzini f14450c;

    /* JADX INFO: renamed from: d */
    public final zzini f14451d;

    /* JADX INFO: renamed from: e */
    public final zzini f14452e;

    /* JADX INFO: renamed from: f */
    public final zzini f14453f;

    public zzeox(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.f14448a = zziniVar;
        this.f14449b = zziniVar2;
        this.f14450c = zziniVar3;
        this.f14451d = zziniVar4;
        this.f14452e = zziniVar5;
        this.f14453f = zziniVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzeov zzb() {
        Context contextM5709a = ((zzcnz) this.f14448a).m5709a();
        zzfqq zzfqqVar = (zzfqq) this.f14449b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzeov(contextM5709a, zzfqqVar, zzhcpVar, (ScheduledExecutorService) this.f14450c.zzb(), (zzcyd) this.f14451d.zzb(), (zzepl) this.f14452e.zzb(), (zzfsi) this.f14453f.zzb());
    }
}
