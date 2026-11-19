package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends zzcr {

    /* JADX INFO: renamed from: s */
    public final FullScreenContentCallback f3100s;

    public zzbb(FullScreenContentCallback fullScreenContentCallback) {
        this.f3100s = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    /* JADX INFO: renamed from: a */
    public final void mo2813a() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    /* JADX INFO: renamed from: b */
    public final void mo2814b() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    /* JADX INFO: renamed from: d */
    public final void mo2815d() {
        FullScreenContentCallback fullScreenContentCallback = this.f3100s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.mo2734a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    /* JADX INFO: renamed from: z2 */
    public final void mo2816z2(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f3100s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.mo2735b(zzeVar.m2926w());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f3100s;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.mo2736c();
        }
    }
}
