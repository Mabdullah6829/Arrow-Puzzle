package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzfo extends zzdp {

    /* JADX INFO: renamed from: s */
    public final OnPaidEventListener f3188s;

    public zzfo(OnPaidEventListener onPaidEventListener) {
        this.f3188s = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    /* JADX INFO: renamed from: b */
    public final boolean mo2912b() {
        return this.f3188s == null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    /* JADX INFO: renamed from: g3 */
    public final void mo2913g3(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.f3188s;
        if (onPaidEventListener != null) {
            int i2 = zztVar.f3266t;
            onPaidEventListener.m2758a();
        }
    }
}
