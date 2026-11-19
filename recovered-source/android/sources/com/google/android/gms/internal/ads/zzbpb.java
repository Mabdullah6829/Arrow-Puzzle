package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpb implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzclb f9205a;

    public zzbpb(zzclb zzclbVar) {
        this.f9205a = zzclbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3316a(Object obj) {
        String str = (String) obj;
        zzclb zzclbVar = this.f9205a;
        new com.google.android.gms.ads.internal.util.zzbt(zzclbVar.getContext(), zzclbVar.mo5472h().f3396s, str, zzclbVar.mo5565B() != null ? zzclbVar.mo5565B().f15963x0 : null).mo3108b();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DefaultGmsgHandlers.attributionReportingManager", th);
    }
}
