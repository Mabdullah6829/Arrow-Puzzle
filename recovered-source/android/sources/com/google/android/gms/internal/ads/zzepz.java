package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepz implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14590a;

    /* JADX INFO: renamed from: b */
    public final zzini f14591b;

    /* JADX INFO: renamed from: c */
    public final zzina f14592c;

    public zzepz(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14590a = zziniVar;
        this.f14591b = zziniVar2;
        this.f14592c = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzepy((Context) this.f14590a.zzb(), (Executor) this.f14591b.zzb(), (zzdvz) this.f14592c.f20011a);
    }
}
