package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtk implements zzcgh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbua f9349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqg f9350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbub f9351c;

    public zzbtk(zzbub zzbubVar, zzbua zzbuaVar, zzfqg zzfqgVar) {
        this.f9349a = zzbuaVar;
        this.f9350b = zzfqgVar;
        this.f9351c = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5135b(Object obj) {
        zzfqt zzfqtVar;
        com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbub zzbubVar = this.f9351c;
        synchronized (zzbubVar.f9382a) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (success): Lock acquired");
                zzbubVar.f9390i = 0;
                zzbua zzbuaVar = zzbubVar.f9389h;
                if (zzbuaVar != null && this.f9349a != zzbuaVar) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("New JS engine is loaded, marking previous one as destroyable.");
                    zzbubVar.f9389h.m5139f();
                }
                zzbubVar.f9389h = this.f9349a;
                if (((Boolean) zzbkq.f9010d.m5057c()).booleanValue() && (zzfqtVar = zzbubVar.f9386e) != null) {
                    zzfqg zzfqgVar = this.f9350b;
                    zzfqgVar.mo6563L(true);
                    zzfqtVar.m6588b(zzfqgVar.mo6564e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine (success): Lock released");
    }
}
