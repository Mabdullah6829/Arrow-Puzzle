package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfls implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzflt f16075a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f16076b;

    public zzfls(zzflt zzfltVar, int i2) {
        this.f16076b = i2;
        this.f16075a = zzfltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        String str = (String) obj;
        zzflt zzfltVar = this.f16075a;
        zzfkn zzfknVar = zzfltVar.f16077a;
        if (!zzfknVar.f15933i0) {
            zzfltVar.f16079c.m6643b(str, zzfknVar.f15963x0, zzfltVar.f16081e, null);
            return;
        }
        zzfse zzfseVar = zzfltVar.f16080d;
        String str2 = zzfltVar.f16078b.f15973b;
        zzfseVar.getClass();
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        zzekq zzekqVar = new zzekq(System.currentTimeMillis(), str2, str, this.f16076b);
        zzeko zzekoVar = zzfseVar.f16390a;
        zzekoVar.getClass();
        zzekoVar.m6258c(new zzekl(zzekoVar, zzekqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("BufferingUrlPinger.attributionReportingManager", th);
    }
}
