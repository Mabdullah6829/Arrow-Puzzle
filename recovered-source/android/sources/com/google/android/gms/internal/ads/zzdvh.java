package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f13084a;

    /* JADX INFO: renamed from: b */
    public final zzini f13085b;

    /* JADX INFO: renamed from: c */
    public final zzini f13086c;

    /* JADX INFO: renamed from: d */
    public final zzcop f13087d;

    /* JADX INFO: renamed from: e */
    public final zzini f13088e;

    /* JADX INFO: renamed from: f */
    public final zzini f13089f;

    /* JADX INFO: renamed from: g */
    public final zzini f13090g;

    /* JADX INFO: renamed from: h */
    public final zzini f13091h;

    /* JADX INFO: renamed from: i */
    public final zzini f13092i;

    public zzdvh(zzcnz zzcnzVar, zzimy zzimyVar, zzimy zzimyVar2, zzcop zzcopVar, zzcqn zzcqnVar, zzimy zzimyVar3, zzimy zzimyVar4, zzimy zzimyVar5, zzimy zzimyVar6, zzimy zzimyVar7) {
        this.f13084a = zzcnzVar;
        this.f13085b = zzimyVar;
        this.f13086c = zzimyVar2;
        this.f13087d = zzcopVar;
        this.f13088e = zzimyVar3;
        this.f13089f = zzimyVar4;
        this.f13090g = zzimyVar5;
        this.f13091h = zzimyVar6;
        this.f13092i = zzimyVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f13084a.m5709a();
        Executor executor = (Executor) this.f13085b.zzb();
        zzbaw zzbawVar = (zzbaw) this.f13086c.zzb();
        VersionInfoParcel versionInfoParcelM5711a = this.f13087d.m5711a();
        com.google.android.gms.ads.internal.zza zzaVarM5796a = zzcqn.m5796a();
        new zzclr();
        return new zzdvd(contextM5709a, executor, zzbawVar, versionInfoParcelM5711a, zzaVarM5796a, (zzeko) this.f13088e.zzb(), (zzfsm) this.f13089f.zzb(), (zzdzt) this.f13090g.zzb(), (zzekz) this.f13091h.zzb(), (zzflk) this.f13092i.zzb());
    }
}
