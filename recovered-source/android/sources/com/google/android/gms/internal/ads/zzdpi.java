package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12530a;

    /* JADX INFO: renamed from: b */
    public final zzini f12531b;

    /* JADX INFO: renamed from: c */
    public final zzini f12532c;

    /* JADX INFO: renamed from: d */
    public final zzini f12533d;

    public zzdpi(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4) {
        this.f12530a = zzimyVar;
        this.f12531b = zzimyVar2;
        this.f12532c = zzimyVar3;
        this.f12533d = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbeu zzbeuVar = (zzbeu) this.f12530a.zzb();
        Executor executor = (Executor) this.f12531b.zzb();
        Context context = (Context) this.f12532c.zzb();
        return new zzcux(executor, new zzcuj(context, zzbeuVar), (Clock) this.f12533d.zzb());
    }
}
