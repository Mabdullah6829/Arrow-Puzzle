package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzetr implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzets f14853a;

    public zzetr(zzets zzetsVar) {
        this.f14853a = zzetsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6334a(zzcya zzcyaVar) {
        zzets zzetsVar = this.f14853a;
        zzdmh zzdmhVar = (zzdmh) zzcyaVar;
        synchronized (zzetsVar) {
            zzetsVar.f14855B = zzdmhVar;
            zzdmhVar.mo5855a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzets zzetsVar = this.f14853a;
        synchronized (zzetsVar) {
            zzetsVar.f14855B = null;
        }
    }
}
