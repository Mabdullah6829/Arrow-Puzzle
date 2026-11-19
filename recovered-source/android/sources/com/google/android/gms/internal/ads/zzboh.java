package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C5137e;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzboh extends zzbno {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzboi f9193s;

    @Override // com.google.android.gms.internal.ads.zzbnp
    /* JADX INFO: renamed from: E3 */
    public final void mo5075E3(zzbnc zzbncVar) {
        zzbnd zzbndVar;
        zzboi zzboiVar = this.f9193s;
        C5137e c5137e = zzboiVar.f9194a;
        synchronized (zzboiVar) {
            zzbndVar = zzboiVar.f9196c;
            if (zzbndVar == null) {
                zzbndVar = new zzbnd(zzbncVar);
                zzboiVar.f9196c = zzbndVar;
            }
        }
        ((MediationNativeListener) c5137e.f2923u).mo3298p(zzbndVar);
    }
}
