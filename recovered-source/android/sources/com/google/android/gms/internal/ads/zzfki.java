package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfki implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfkk f15865a;

    public zzfki(zzfkk zzfkkVar) {
        this.f15865a = zzfkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final void mo6334a(zzcya zzcyaVar) {
        zzfkk zzfkkVar = this.f15865a;
        zzdvu zzdvuVar = (zzdvu) zzcyaVar;
        synchronized (zzfkkVar) {
            try {
                zzfkkVar.f15871v = zzdvuVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8763t4)).booleanValue()) {
                    zzdvuVar.f13135u.f16010a = zzfkkVar.f15870u;
                }
                zzfkkVar.f15871v.mo5855a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfkk zzfkkVar = this.f15865a;
        synchronized (zzfkkVar) {
            zzfkkVar.f15871v = null;
        }
    }
}
