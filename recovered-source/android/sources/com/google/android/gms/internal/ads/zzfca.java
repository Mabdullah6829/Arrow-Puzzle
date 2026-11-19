package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfca implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15380a;

    /* JADX INFO: renamed from: b */
    public final zzini f15381b;

    /* JADX INFO: renamed from: c */
    public final zzini f15382c;

    /* JADX INFO: renamed from: d */
    public final zzini f15383d;

    /* JADX INFO: renamed from: e */
    public final zzdcq f15384e;

    /* JADX INFO: renamed from: f */
    public final zzini f15385f;

    /* JADX INFO: renamed from: g */
    public final zzini f15386g;

    /* JADX INFO: renamed from: h */
    public final zzini f15387h;

    public zzfca(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzdcq zzdcqVar, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f15380a = zziniVar;
        this.f15381b = zziniVar2;
        this.f15382c = zziniVar3;
        this.f15383d = zziniVar4;
        this.f15384e = zzdcqVar;
        this.f15385f = zziniVar5;
        this.f15386g = zziniVar6;
        this.f15387h = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfby(zzhcpVar, (ScheduledExecutorService) this.f15380a.zzb(), (String) this.f15381b.zzb(), (zzese) this.f15382c.zzb(), (Context) this.f15383d.zzb(), this.f15384e.m5898a(), (zzerz) this.f15385f.zzb(), (zzdxk) this.f15386g.zzb(), (zzecg) this.f15387h.zzb());
    }
}
