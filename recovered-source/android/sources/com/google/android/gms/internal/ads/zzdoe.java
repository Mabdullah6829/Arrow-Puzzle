package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoe implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzind f12429a;

    /* JADX INFO: renamed from: b */
    public final zzind f12430b;

    /* JADX INFO: renamed from: c */
    public final zzind f12431c;

    /* JADX INFO: renamed from: d */
    public final zzini f12432d;

    /* JADX INFO: renamed from: e */
    public final zzdoi f12433e;

    public zzdoe(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzini zziniVar, zzdoi zzdoiVar) {
        this.f12429a = zzindVar;
        this.f12430b = zzindVar2;
        this.f12431c = zzindVar3;
        this.f12432d = zziniVar;
        this.f12433e = zzdoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Map mapZzb = this.f12429a.zzb();
        Map mapZzb2 = this.f12430b.zzb();
        Map mapZzb3 = this.f12431c.zzb();
        zzdql zzdqlVar = this.f12433e.f12438a.f12434a;
        zzinh.m8554a(zzdqlVar);
        return new zzdod(mapZzb, mapZzb2, mapZzb3, this.f12432d, zzdqlVar);
    }
}
