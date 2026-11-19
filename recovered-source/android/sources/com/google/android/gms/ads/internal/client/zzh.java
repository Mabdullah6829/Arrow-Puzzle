package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.internal.ads.zzbss;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzbj {

    /* JADX INFO: renamed from: s */
    public final AdLoadCallback f3202s;

    /* JADX INFO: renamed from: t */
    public final zzbss f3203t;

    public zzh(AdLoadCallback adLoadCallback, zzbss zzbssVar) {
        this.f3202s = adLoadCallback;
        this.f3203t = zzbssVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    /* JADX INFO: renamed from: l0 */
    public final void mo2823l0(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f3202s;
        if (adLoadCallback != null) {
            adLoadCallback.mo2731a(zzeVar.m2925H());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        zzbss zzbssVar;
        AdLoadCallback adLoadCallback = this.f3202s;
        if (adLoadCallback == null || (zzbssVar = this.f3203t) == null) {
            return;
        }
        adLoadCallback.mo2732b(zzbssVar);
    }
}
