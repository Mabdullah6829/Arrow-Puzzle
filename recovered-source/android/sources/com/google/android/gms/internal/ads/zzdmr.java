package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12354a;

    public zzdmr(zzimy zzimyVar) {
        this.f12354a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdky((zzdbs) this.f12354a.zzb(), zzcfy.f9953h));
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
