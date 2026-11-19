package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdah f11595a;

    /* JADX INFO: renamed from: b */
    public final zzini f11596b;

    /* JADX INFO: renamed from: c */
    public final zzcwc f11597c;

    /* JADX INFO: renamed from: d */
    public final zzcwb f11598d;

    /* JADX INFO: renamed from: e */
    public final zzcwq f11599e;

    /* JADX INFO: renamed from: f */
    public final zzcwd f11600f;

    /* JADX INFO: renamed from: g */
    public final zzini f11601g;

    /* JADX INFO: renamed from: h */
    public final zzini f11602h;

    /* JADX INFO: renamed from: i */
    public final zzimx f11603i;

    /* JADX INFO: renamed from: j */
    public final zzini f11604j;

    public zzcvw(zzdah zzdahVar, zzimy zzimyVar, zzcwc zzcwcVar, zzcwb zzcwbVar, zzcwq zzcwqVar, zzcwd zzcwdVar, zzdoi zzdoiVar, zzimy zzimyVar2, zzimx zzimxVar, zzimy zzimyVar3) {
        this.f11595a = zzdahVar;
        this.f11596b = zzimyVar;
        this.f11597c = zzcwcVar;
        this.f11598d = zzcwbVar;
        this.f11599e = zzcwqVar;
        this.f11600f = zzcwdVar;
        this.f11601g = zzdoiVar;
        this.f11602h = zzimyVar2;
        this.f11603i = zzimxVar;
        this.f11604j = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzcvv zzb() {
        zzcxz zzcxzVarZzb = this.f11595a.zzb();
        Context context = (Context) this.f11596b.zzb();
        zzfko zzfkoVar = this.f11597c.f11617a.f11612c;
        zzinh.m8554a(zzfkoVar);
        View view = this.f11598d.f11616a.f11611b;
        zzinh.m8554a(view);
        zzclb zzclbVar = this.f11599e.f11635a.f11613d;
        zzcxy zzcxyVar = this.f11600f.f11618a.f11610a;
        zzdql zzdqlVar = ((zzdoi) this.f11601g).f12438a.f12434a;
        zzinh.m8554a(zzdqlVar);
        return new zzcvv(zzcxzVarZzb, context, zzfkoVar, view, zzclbVar, zzcxyVar, zzdqlVar, (zzdli) this.f11602h.zzb(), zzimy.m8548b(this.f11603i), (Executor) this.f11604j.zzb());
    }
}
