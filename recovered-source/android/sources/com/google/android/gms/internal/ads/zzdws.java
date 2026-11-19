package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdws implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13220a;

    /* JADX INFO: renamed from: b */
    public final zzini f13221b;

    /* JADX INFO: renamed from: c */
    public final zzini f13222c;

    /* JADX INFO: renamed from: d */
    public final zzini f13223d;

    /* JADX INFO: renamed from: e */
    public final zzini f13224e;

    /* JADX INFO: renamed from: f */
    public final zzini f13225f;

    /* JADX INFO: renamed from: g */
    public final zzimz f13226g;

    /* JADX INFO: renamed from: h */
    public final zzini f13227h;

    /* JADX INFO: renamed from: i */
    public final zzini f13228i;

    /* JADX INFO: renamed from: j */
    public final zzini f13229j;

    /* JADX INFO: renamed from: k */
    public final zzini f13230k;

    public zzdws(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzimz zzimzVar, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10) {
        this.f13220a = zziniVar;
        this.f13221b = zziniVar2;
        this.f13222c = zziniVar3;
        this.f13223d = zziniVar4;
        this.f13224e = zziniVar5;
        this.f13225f = zziniVar6;
        this.f13226g = zzimzVar;
        this.f13227h = zziniVar7;
        this.f13228i = zziniVar8;
        this.f13229j = zziniVar9;
        this.f13230k = zziniVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        new zzclr();
        Context context = (Context) this.f13220a.zzb();
        zzbaw zzbawVar = (zzbaw) this.f13221b.zzb();
        zzbke zzbkeVar = (zzbke) this.f13222c.zzb();
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f13223d).m5711a();
        zzcqm zzcqmVar = ((zzcqn) this.f13224e).f11254a;
        return new zzdwq(context, zzbawVar, zzbkeVar, versionInfoParcelM5711a, zzcqn.m5796a(), (zzbhw) this.f13225f.zzb(), (zzdga) this.f13226g.zzb(), (zzekz) this.f13227h.zzb(), (zzflk) this.f13228i.zzb(), (zzdzt) this.f13229j.zzb(), (zzcna) this.f13230k.zzb());
    }
}
