package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcut implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f11517a;

    /* JADX INFO: renamed from: b */
    public final zzini f11518b;

    public zzcut(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f11517a = zzimyVar;
        this.f11518b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzcun zzcunVar = (zzcun) this.f11517a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        Set setSingleton = ((JSONObject) this.f11518b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdky(zzcunVar, zzhcpVar));
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
