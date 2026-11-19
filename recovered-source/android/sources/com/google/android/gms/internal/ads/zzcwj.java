package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwj implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11627a;

    public zzcwj(zzcvz zzcvzVar, zzimy zzimyVar) {
        this.f11627a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Set setSingleton = Collections.singleton(new zzdky((zzcxp) this.f11627a.zzb(), zzcfy.f9953h));
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
