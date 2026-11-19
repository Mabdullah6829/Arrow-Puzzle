package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzebq extends zzccr {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzebr f13507s;

    public zzebq(zzebr zzebrVar) {
        this.f13507s = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: a */
    public final void mo5332a() {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdOpened";
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: b */
    public final void mo5333b() {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdClosed";
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: b3 */
    public final void mo5334b3(zzccm zzccmVar) {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onUserEarnedReward";
        zzebfVar.f13493e = zzccmVar.mo5330a();
        zzebfVar.f13494f = Integer.valueOf(zzccmVar.mo5331b());
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: l */
    public final void mo5335l(int i2) {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdFailedToShow";
        zzebfVar.f13492d = Integer.valueOf(i2);
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: w3 */
    public final void mo5336w3(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        int i2 = zzeVar.f3106s;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdFailedToShow";
        zzebfVar.f13492d = Integer.valueOf(i2);
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdImpression";
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() {
        zzebr zzebrVar = this.f13507s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onAdClicked";
        zzebgVar.m6145b(zzebfVar);
    }
}
