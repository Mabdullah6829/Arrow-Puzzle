package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f10638a;

    public zzcoh(zzimy zzimyVar) {
        this.f10638a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzecg zzecgVar = (zzecg) this.f10638a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8608k2)).booleanValue() ? Collections.singleton(new zzdky(zzecgVar, zzhcpVar)) : Collections.EMPTY_SET;
        zzinh.m8554a(setSingleton);
        return setSingleton;
    }
}
