package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzesn implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzeso f14801a;

    public zzesn(zzeso zzesoVar) {
        this.f14801a = zzesoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final void mo6334a(zzcya zzcyaVar) {
        zzdbv zzdbvVar;
        zzeso zzesoVar = this.f14801a;
        zzcvs zzcvsVar = (zzcvs) zzcyaVar;
        synchronized (zzesoVar) {
            try {
                zzcvs zzcvsVar2 = zzesoVar.f14802A;
                if (zzcvsVar2 != null) {
                    zzdbv zzdbvVar2 = zzcvsVar.f11768j;
                    if (zzdbvVar2 != null && (zzdbvVar = zzcvsVar2.f11768j) != null) {
                        zzdbvVar2.m5891a(zzdbvVar.f11972a.get());
                    }
                    zzddy zzddyVar = zzesoVar.f14802A.f11761c;
                    zzddyVar.getClass();
                    zzddyVar.m5923J0(new zzddw(null));
                }
                zzesoVar.f14802A = zzcvsVar;
                zzcvsVar.mo5855a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzeso zzesoVar = this.f14801a;
        synchronized (zzesoVar) {
            zzesoVar.f14802A = null;
        }
    }
}
