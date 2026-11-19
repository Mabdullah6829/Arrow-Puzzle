package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtl implements zzcgf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbua f9352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqg f9353b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbub f9354c;

    public zzbtl(zzbub zzbubVar, zzbua zzbuaVar, zzfqg zzfqgVar) {
        this.f9352a = zzbuaVar;
        this.f9353b = zzfqgVar;
        this.f9354c = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        zzfqt zzfqtVar;
        com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbub zzbubVar = this.f9354c;
        synchronized (zzbubVar.f9382a) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbubVar.f9390i = 1;
                com.google.android.gms.ads.internal.util.zze.m3150k("Failed loading new engine. Marking new engine destroyable.");
                this.f9352a.m5139f();
                if (((Boolean) zzbkq.f9010d.m5057c()).booleanValue() && (zzfqtVar = zzbubVar.f9386e) != null) {
                    zzfqg zzfqgVar = this.f9353b;
                    zzfqgVar.mo6565g("Failed loading new engine");
                    zzfqgVar.mo6563L(false);
                    zzfqtVar.m6588b(zzfqgVar.mo6564e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (failure): Lock released");
    }
}
