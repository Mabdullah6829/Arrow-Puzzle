package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14646a;

    /* JADX INFO: renamed from: b */
    public final zzini f14647b;

    /* JADX INFO: renamed from: c */
    public final zzdcq f14648c;

    /* JADX INFO: renamed from: d */
    public final zzini f14649d;

    /* JADX INFO: renamed from: e */
    public final zzina f14650e;

    /* JADX INFO: renamed from: f */
    public final zzini f14651f;

    /* JADX INFO: renamed from: g */
    public final zzini f14652g;

    /* JADX INFO: renamed from: h */
    public final zzini f14653h;

    /* JADX INFO: renamed from: i */
    public final zzini f14654i;

    public zzeqo(zzdcq zzdcqVar, zzina zzinaVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.f14646a = zziniVar;
        this.f14647b = zziniVar2;
        this.f14648c = zzdcqVar;
        this.f14649d = zziniVar3;
        this.f14650e = zzinaVar;
        this.f14651f = zziniVar4;
        this.f14652g = zziniVar5;
        this.f14653h = zziniVar6;
        this.f14654i = zziniVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzeqn((Context) this.f14646a.zzb(), ((zzcop) this.f14647b).m5711a(), this.f14648c.m5898a(), (Executor) this.f14649d.zzb(), (zzdvz) this.f14650e.f20011a, (zzdwq) this.f14651f.zzb(), new zzbqa(), (zzekz) this.f14652g.zzb(), (zzdzo) this.f14653h.zzb(), (zzdzt) this.f14654i.zzb());
    }
}
