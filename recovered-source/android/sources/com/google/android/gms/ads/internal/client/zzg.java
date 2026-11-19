package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzbg {

    /* JADX INFO: renamed from: s */
    public final AdListener f3201s;

    public zzg(AdListener adListener) {
        this.f3201s = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: A */
    public final void mo2818A(int i2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: a */
    public final void mo2819a() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: b */
    public final void mo2820b() {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2727e();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: c */
    public final void mo2821c() {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2728g();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: d0 */
    public final void mo2822d0(zze zzeVar) {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2726c(zzeVar.m2925H());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2725b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2730k();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.f3201s;
        if (adListener != null) {
            adListener.mo2739d();
        }
    }
}
