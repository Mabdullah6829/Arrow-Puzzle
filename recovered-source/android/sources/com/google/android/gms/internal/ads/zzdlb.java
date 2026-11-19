package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12299a;

    /* JADX INFO: renamed from: b */
    public final zzinl f12300b;

    /* JADX INFO: renamed from: c */
    public final zzcyr f12301c;

    public zzdlb(zzimy zzimyVar, zzinl zzinlVar, zzcyr zzcyrVar) {
        this.f12299a = zzimyVar;
        this.f12300b = zzinlVar;
        this.f12301c = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdla((Context) this.f12299a.zzb(), this.f12300b.zzb(), this.f12301c.m5872a());
    }
}
