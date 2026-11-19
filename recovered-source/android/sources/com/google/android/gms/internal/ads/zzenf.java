package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14279a;

    /* JADX INFO: renamed from: b */
    public final zzina f14280b;

    /* JADX INFO: renamed from: c */
    public final zzini f14281c;

    public zzenf(zzina zzinaVar, zzini zziniVar, zzini zziniVar2) {
        this.f14279a = zziniVar;
        this.f14280b = zzinaVar;
        this.f14281c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzene((Context) this.f14279a.zzb(), (zzcwx) this.f14280b.f20011a, (Executor) this.f14281c.zzb());
    }
}
