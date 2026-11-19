package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15501a;

    /* JADX INFO: renamed from: b */
    public final zzini f15502b;

    /* JADX INFO: renamed from: c */
    public final zzini f15503c;

    /* JADX INFO: renamed from: d */
    public final zzelz f15504d;

    /* JADX INFO: renamed from: e */
    public final zzdcq f15505e;

    /* JADX INFO: renamed from: f */
    public final zzini f15506f;

    public zzfdo(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzelz zzelzVar, zzdcq zzdcqVar, zzini zziniVar4) {
        this.f15501a = zziniVar;
        this.f15502b = zziniVar2;
        this.f15503c = zziniVar3;
        this.f15504d = zzelzVar;
        this.f15505e = zzdcqVar;
        this.f15506f = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzj zzjVarZzb = ((zzcnt) this.f15501a).zzb();
        Context contextM5709a = ((zzcnz) this.f15502b).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfdm(zzjVarZzb, contextM5709a, zzhcpVar, (ScheduledExecutorService) this.f15503c.zzb(), new zzely(((zzcnz) this.f15504d.f14188a).m5709a()), this.f15505e.m5898a(), ((zzcop) this.f15506f).m5711a());
    }
}
