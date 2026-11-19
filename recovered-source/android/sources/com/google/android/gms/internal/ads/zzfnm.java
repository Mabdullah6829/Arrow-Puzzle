package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfnm implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfnp f16165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfnr f16166b;

    public zzfnm(zzfnr zzfnrVar, zzfnp zzfnpVar) {
        this.f16165a = zzfnpVar;
        this.f16166b = zzfnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        zzfnr zzfnrVar = this.f16166b;
        synchronized (zzfnrVar) {
            try {
                zzfnrVar.f16173d = null;
                zzfnrVar.f16172c.addFirst(this.f16165a);
                if (zzfnrVar.f16174e == 1) {
                    zzfnrVar.m6545a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzfnr zzfnrVar = this.f16166b;
        synchronized (zzfnrVar) {
            zzfnrVar.f16173d = null;
        }
    }
}
