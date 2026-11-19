package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11394a;

    /* JADX INFO: renamed from: b */
    public final zzini f11395b;

    /* JADX INFO: renamed from: c */
    public final zzini f11396c;

    /* JADX INFO: renamed from: d */
    public final zzini f11397d;

    /* JADX INFO: renamed from: e */
    public final zzini f11398e;

    /* JADX INFO: renamed from: f */
    public final zzini f11399f;

    public zzctr(zzcnz zzcnzVar, zzcnt zzcntVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4) {
        this.f11394a = zzcnzVar;
        this.f11395b = zzcntVar;
        this.f11396c = zzimyVar;
        this.f11397d = zzimyVar2;
        this.f11398e = zzimyVar3;
        this.f11399f = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f11394a).m5709a();
        com.google.android.gms.ads.internal.util.zzj zzjVarZzb = ((zzcnt) this.f11395b).zzb();
        zzelw zzelwVar = (zzelw) this.f11396c.zzb();
        zzdwv zzdwvVar = (zzdwv) this.f11397d.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzctq(contextM5709a, zzjVarZzb, zzelwVar, zzdwvVar, zzhcpVar, (zzhcp) this.f11398e.zzb(), (ScheduledExecutorService) this.f11399f.zzb());
    }
}
