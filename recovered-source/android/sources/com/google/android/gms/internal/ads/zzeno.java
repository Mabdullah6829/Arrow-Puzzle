package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeno implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14307a;

    /* JADX INFO: renamed from: b */
    public final zzini f14308b;

    /* JADX INFO: renamed from: c */
    public final zzina f14309c;

    /* JADX INFO: renamed from: d */
    public final zzini f14310d;

    /* JADX INFO: renamed from: e */
    public final zzini f14311e;

    public zzeno(zzini zziniVar, zzini zziniVar2, zzina zzinaVar, zzini zziniVar3, zzini zziniVar4) {
        this.f14307a = zziniVar;
        this.f14308b = zziniVar2;
        this.f14309c = zzinaVar;
        this.f14310d = zziniVar3;
        this.f14311e = zziniVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzenn((Context) this.f14307a.zzb(), (Executor) this.f14308b.zzb(), (zzdno) this.f14309c.f20011a, (zzfkm) this.f14310d.zzb(), (zzdzt) this.f14311e.zzb());
    }
}
