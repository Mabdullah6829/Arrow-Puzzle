package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzequ implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14671a;

    /* JADX INFO: renamed from: b */
    public final zzini f14672b;

    /* JADX INFO: renamed from: c */
    public final zzina f14673c;

    public zzequ(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14671a = zziniVar;
        this.f14672b = zziniVar2;
        this.f14673c = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzeqt((Context) this.f14671a.zzb(), (Executor) this.f14672b.zzb(), (zzdvz) this.f14673c.f20011a);
    }
}
