package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdqt f12778a;

    /* JADX INFO: renamed from: b */
    public final zzdpa f12779b;

    /* JADX INFO: renamed from: c */
    public final zzini f12780c;

    public zzdsc(zzdqt zzdqtVar, zzdpa zzdpaVar, zzimy zzimyVar) {
        this.f12778a = zzdqtVar;
        this.f12779b = zzdpaVar;
        this.f12780c = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdqb zzdqbVarM6020a = this.f12778a.m6020a();
        zzdqf zzdqfVar = (zzdqf) this.f12779b.f12521a.zzb();
        zzinh.m8554a(zzdqfVar);
        Executor executor = (Executor) this.f12780c.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzdsb(zzdqbVarM6020a, zzdqfVar, executor, zzhcpVar);
    }
}
