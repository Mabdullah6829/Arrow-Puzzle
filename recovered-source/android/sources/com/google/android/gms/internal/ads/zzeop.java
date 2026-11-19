package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeop implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14411a;

    /* JADX INFO: renamed from: b */
    public final zzina f14412b;

    /* JADX INFO: renamed from: c */
    public final zzini f14413c;

    public zzeop(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14411a = zziniVar;
        this.f14412b = zzinaVar;
        this.f14413c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzeoo((Context) this.f14411a.zzb(), (zzdok) this.f14412b.f20011a, (Executor) this.f14413c.zzb());
    }
}
