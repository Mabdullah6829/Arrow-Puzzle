package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdui implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzimx f12988a;

    /* JADX INFO: renamed from: b */
    public final zzdqt f12989b;

    public zzdui(zzimx zzimxVar, zzdqt zzdqtVar) {
        this.f12988a = zzimxVar;
        this.f12989b = zzdqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        View view;
        zzdpw zzdpwVar = (zzdpw) this.f12988a.zzb();
        zzdqb zzdqbVarM6020a = this.f12989b.m6020a();
        zzduh zzduhVar = new zzduh();
        synchronized (zzdqbVarM6020a) {
            view = zzdqbVarM6020a.f12624o;
        }
        zzduhVar.f12983s = view;
        zzduhVar.f12984t = zzdqbVarM6020a.m6012r();
        zzduhVar.f12985u = zzdpwVar;
        zzduhVar.f12986v = false;
        zzduhVar.f12987w = false;
        if (zzdqbVarM6020a.m6005h() != null) {
            zzdqbVarM6020a.m6005h().mo5594a0(zzduhVar);
        }
        return zzduhVar;
    }
}
