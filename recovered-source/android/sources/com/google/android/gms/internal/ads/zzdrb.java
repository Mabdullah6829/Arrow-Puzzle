package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12709a;

    /* JADX INFO: renamed from: b */
    public final zzini f12710b;

    /* JADX INFO: renamed from: c */
    public final zzini f12711c;

    /* JADX INFO: renamed from: d */
    public final zzdqt f12712d;

    /* JADX INFO: renamed from: e */
    public final zzimz f12713e;

    /* JADX INFO: renamed from: f */
    public final zzimz f12714f;

    /* JADX INFO: renamed from: g */
    public final zzini f12715g;

    /* JADX INFO: renamed from: h */
    public final zzini f12716h;

    public zzdrb(zzcnt zzcntVar, zzdcq zzdcqVar, zzini zziniVar, zzdqt zzdqtVar, zzimz zzimzVar, zzimz zzimzVar2, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f12709a = zzcntVar;
        this.f12710b = zzdcqVar;
        this.f12711c = zziniVar;
        this.f12712d = zzdqtVar;
        this.f12713e = zzimzVar;
        this.f12714f = zzimzVar2;
        this.f12715g = zzimyVar;
        this.f12716h = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdra zzb() {
        com.google.android.gms.ads.internal.util.zzj zzjVarZzb = ((zzcnt) this.f12709a).zzb();
        zzflg zzflgVarM5898a = ((zzdcq) this.f12710b).m5898a();
        zzdqg zzdqgVar = (zzdqg) this.f12711c.zzb();
        zzdqb zzdqbVarM6020a = this.f12712d.m6020a();
        zzdro zzdroVar = (zzdro) this.f12713e.zzb();
        zzdrw zzdrwVar = (zzdrw) this.f12714f.zzb();
        Executor executor = (Executor) this.f12715g.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzdra(zzjVarZzb, zzflgVarM5898a, zzdqgVar, zzdqbVarM6020a, zzdroVar, zzdrwVar, executor, zzhcpVar, (zzdpy) this.f12716h.zzb());
    }
}
