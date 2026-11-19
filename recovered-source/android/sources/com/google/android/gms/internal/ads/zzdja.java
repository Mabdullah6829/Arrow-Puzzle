package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdja implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdiz f12256a;

    /* JADX INFO: renamed from: b */
    public final zzinl f12257b;

    public zzdja(zzdiz zzdizVar, zzinl zzinlVar) {
        this.f12256a = zzdizVar;
        this.f12257b = zzinlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Set setZzb = this.f12257b.zzb();
        zzdiz zzdizVar = this.f12256a;
        if (zzdizVar.f12253p == null) {
            zzdizVar.f12253p = new zzddb(setZzb);
        }
        zzddb zzddbVar = zzdizVar.f12253p;
        zzinh.m8554a(zzddbVar);
        return zzddbVar;
    }
}
