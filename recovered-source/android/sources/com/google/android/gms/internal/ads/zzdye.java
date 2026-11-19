package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdye implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdyx f13279a;

    public zzdye(zzdyx zzdyxVar) {
        this.f13279a = zzdyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzdyx zzdyxVar = this.f13279a;
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8460b6)).booleanValue() ? Collections.singleton(new zzdky(new zzdyw((zzbhw) zzdyxVar.f13301a.zzb(), zzdyxVar.f13302b.zzb()), zzhcpVar)) : Collections.EMPTY_SET;
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
