package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzebm extends com.google.android.gms.ads.internal.client.zzbg {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzebg f13502s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzebn f13503t;

    public zzebm(zzebn zzebnVar, zzebg zzebgVar) {
        this.f13502s = zzebgVar;
        this.f13503t = zzebnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: A */
    public final void mo2818A(int i2) {
        long j2 = this.f13503t.f13504a;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdFailedToLoad";
        zzebfVar.f13492d = Integer.valueOf(i2);
        this.f13502s.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: a */
    public final void mo2819a() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: b */
    public final void mo2820b() {
        long j2 = this.f13503t.f13504a;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdLoaded";
        this.f13502s.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: c */
    public final void mo2821c() {
        long j2 = this.f13503t.f13504a;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdOpened";
        this.f13502s.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: d0 */
    public final void mo2822d0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        long j2 = this.f13503t.f13504a;
        int i2 = zzeVar.f3106s;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdFailedToLoad";
        zzebfVar.f13492d = Integer.valueOf(i2);
        this.f13502s.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        long j2 = this.f13503t.f13504a;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdClosed";
        this.f13502s.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        long j2 = this.f13503t.f13504a;
        zzebf zzebfVar = new zzebf("interstitial");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdClicked";
        this.f13502s.f13495a.mo5118m(zzebfVar.m6143a());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
    }
}
