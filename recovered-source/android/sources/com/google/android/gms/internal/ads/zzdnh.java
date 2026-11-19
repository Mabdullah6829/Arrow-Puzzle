package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdml f12379a;

    /* JADX INFO: renamed from: b */
    public final zzini f12380b;

    public zzdnh(zzdml zzdmlVar, zzimy zzimyVar) {
        this.f12379a = zzdmlVar;
        this.f12380b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Executor executor = (Executor) this.f12380b.zzb();
        final zzclb zzclbVar = this.f12379a.f12349b;
        return new zzdky(new zzdhw() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzdhw
            /* JADX INFO: renamed from: u */
            public final /* synthetic */ void mo5857u() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O;
                zzclb zzclbVar2 = zzclbVar;
                if (zzclbVar2 == null || (zzmVarMo5585O = zzclbVar2.mo5585O()) == null) {
                    return;
                }
                zzmVarMo5585O.zzb();
            }
        }, executor);
    }
}
