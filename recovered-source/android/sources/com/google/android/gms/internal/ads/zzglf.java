package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17713a;

    /* JADX INFO: renamed from: b */
    public final zzini f17714b;

    /* JADX INFO: renamed from: c */
    public final zzini f17715c;

    public zzglf(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar) {
        this.f17713a = zzinaVar;
        this.f17714b = zzimyVar;
        this.f17715c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f17713a.zzb();
        return new zzglk(context, context.getSharedPreferences("pcvmspf2", 0), zzimy.m8548b(this.f17714b), (zzgqo) this.f17715c.zzb());
    }
}
