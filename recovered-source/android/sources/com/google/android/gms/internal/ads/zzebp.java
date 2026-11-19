package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzebp extends zzccv {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzebr f13506s;

    public zzebp(zzebr zzebrVar) {
        this.f13506s = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: a */
    public final void mo5338a() {
        zzebr zzebrVar = this.f13506s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdLoaded";
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: o */
    public final void mo5339o(int i2) {
        zzebr zzebrVar = this.f13506s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdFailedToLoad";
        zzebfVar.f13492d = Integer.valueOf(i2);
        zzebgVar.m6145b(zzebfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: q */
    public final void mo5340q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzebr zzebrVar = this.f13506s;
        zzebg zzebgVar = zzebrVar.f13509b;
        long j2 = zzebrVar.f13508a;
        int i2 = zzeVar.f3106s;
        zzebf zzebfVar = new zzebf("rewarded");
        zzebfVar.f13489a = Long.valueOf(j2);
        zzebfVar.f13491c = "onRewardedAdFailedToLoad";
        zzebfVar.f13492d = Integer.valueOf(i2);
        zzebgVar.m6145b(zzebfVar);
    }
}
