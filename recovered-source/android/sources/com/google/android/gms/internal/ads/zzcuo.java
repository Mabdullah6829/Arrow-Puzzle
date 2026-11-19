package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11504a;

    /* JADX INFO: renamed from: b */
    public final zzini f11505b;

    /* JADX INFO: renamed from: c */
    public final zzini f11506c;

    /* JADX INFO: renamed from: d */
    public final zzini f11507d;

    /* JADX INFO: renamed from: e */
    public final zzini f11508e;

    public zzcuo(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzimy zzimyVar5) {
        this.f11504a = zzimyVar;
        this.f11505b = zzimyVar2;
        this.f11506c = zzimyVar3;
        this.f11507d = zzimyVar4;
        this.f11508e = zzimyVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcun((zzbuy) this.f11504a.zzb(), (zzcuj) this.f11505b.zzb(), (Executor) this.f11506c.zzb(), (zzcui) this.f11507d.zzb(), (Clock) this.f11508e.zzb());
    }
}
