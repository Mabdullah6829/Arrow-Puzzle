package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdol implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdoi f12439a;

    public zzdol(zzdoi zzdoiVar) {
        this.f12439a = zzdoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdql zzdqlVar = this.f12439a.f12438a.f12434a;
        zzinh.m8554a(zzdqlVar);
        Set setSingleton = zzdqlVar.f12657d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
