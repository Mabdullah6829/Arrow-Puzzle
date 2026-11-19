package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.ads.zzdzo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements zzdls {

    /* JADX INFO: renamed from: s */
    public final zzdzo f3979s;

    /* JADX INFO: renamed from: t */
    public final zzq f3980t;

    /* JADX INFO: renamed from: u */
    public final String f3981u;

    public zzr(zzdzo zzdzoVar, zzq zzqVar, String str) {
        this.f3979s = zzdzoVar;
        this.f3980t = zzqVar;
        this.f3981u = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: a */
    public final void mo3343a(zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        zzq zzqVar = this.f3980t;
        String str = this.f3981u;
        zzdzo zzdzoVar = this.f3979s;
        String str2 = zzbcVar.f3906b;
        synchronized (zzqVar) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzqVar.f3974e.put(str, new zzo(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
            zzqVar.m3340b();
            zzqVar.m3341c(zzdzoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: y */
    public final void mo3344y(String str) {
    }
}
