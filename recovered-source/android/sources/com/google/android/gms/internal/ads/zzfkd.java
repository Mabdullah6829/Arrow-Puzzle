package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkd implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfke f15846a;

    public zzfkd(zzfke zzfkeVar) {
        this.f15846a = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final void mo6334a(zzcya zzcyaVar) {
        zzfke zzfkeVar = this.f15846a;
        zzdvu zzdvuVar = (zzdvu) zzcyaVar;
        synchronized (zzfkeVar) {
            try {
                zzfkeVar.f15848B = zzdvuVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8763t4)).booleanValue()) {
                    zzdvuVar.f13135u.f16010a = zzfkeVar.f15853w;
                }
                zzfkeVar.f15848B.mo5855a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfke zzfkeVar = this.f15846a;
        synchronized (zzfkeVar) {
            zzfkeVar.f15848B = null;
        }
    }
}
