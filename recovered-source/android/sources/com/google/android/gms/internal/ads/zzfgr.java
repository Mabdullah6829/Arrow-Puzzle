package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfgr implements zzetz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfgu f15638a;

    public zzfgr(zzfgu zzfguVar) {
        this.f15638a = zzfguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    /* JADX INFO: renamed from: a */
    public final void mo6334a(zzcya zzcyaVar) {
        zzcvm zzcvmVar = (zzcvm) zzcyaVar;
        zzfgu zzfguVar = this.f15638a;
        synchronized (zzfguVar) {
            try {
                zzcvm zzcvmVar2 = zzfguVar.f15643C;
                if (zzcvmVar2 != null) {
                    zzcvmVar2.m5844d();
                }
                zzfguVar.f15643C = zzcvmVar;
                zzclb zzclbVar = zzcvmVar.f11563l;
                if (zzclbVar != null) {
                    zzclbVar.mo5597d0(zzfguVar);
                }
                zzfguVar.f15649x.m6436a(new zzcvn(zzcvmVar, zzfguVar, zzfguVar.f15649x, zzfguVar.f15651z));
                zzcvmVar.mo5855a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfgu zzfguVar = this.f15638a;
        synchronized (zzfguVar) {
            zzfguVar.f15643C = null;
        }
    }
}
