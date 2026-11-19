package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsn implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f16425a;

    /* JADX INFO: renamed from: b */
    public final zzini f16426b;

    /* JADX INFO: renamed from: c */
    public final zzini f16427c;

    /* JADX INFO: renamed from: d */
    public final zzini f16428d;

    /* JADX INFO: renamed from: e */
    public final zzini f16429e;

    /* JADX INFO: renamed from: f */
    public final zzini f16430f;

    public zzfsn(zzcnz zzcnzVar, zzimy zzimyVar, zzini zziniVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4) {
        this.f16425a = zzcnzVar;
        this.f16426b = zzimyVar;
        this.f16427c = zziniVar;
        this.f16428d = zzimyVar2;
        this.f16429e = zzimyVar3;
        this.f16430f = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f16425a.m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfsm(contextM5709a, zzhcpVar, (zzhcq) this.f16426b.zzb(), (com.google.android.gms.ads.internal.util.client.zzu) this.f16427c.zzb(), (zzfse) this.f16428d.zzb(), (zzfqt) this.f16429e.zzb(), (zzcnn) this.f16430f.zzb());
    }
}
