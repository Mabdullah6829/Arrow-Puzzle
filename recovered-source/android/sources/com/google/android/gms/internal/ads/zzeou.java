package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeou implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfkn f14423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzeov f14424b;

    public zzeou(zzeov zzeovVar, zzfkn zzfknVar) {
        this.f14423a = zzfknVar;
        this.f14424b = zzeovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        zzeov zzeovVar = this.f14424b;
        zzepm zzepmVar = (zzepm) obj;
        synchronized (zzeovVar) {
            try {
                zzeovVar.f14434j.m6299b(zzepmVar, this.f14423a);
                zzfkn zzfknVarM6298a = zzeovVar.f14434j.m6298a();
                if (zzfknVarM6298a != null) {
                    zzeovVar.m6297a(zzfknVarM6298a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzeov zzeovVar = this.f14424b;
        synchronized (zzeovVar) {
            try {
                zzeow zzeowVar = zzeovVar.f14434j;
                zzfkn zzfknVar = this.f14423a;
                zzeowVar.m6300c(zzfknVar);
                zzfkn zzfknVarM6298a = zzeovVar.f14434j.m6298a();
                if (zzfknVar.f15959v0) {
                    while (zzfknVarM6298a != null) {
                        zzeovVar.m6297a(zzfknVarM6298a);
                        zzfknVarM6298a = zzeovVar.f14434j.m6298a();
                    }
                } else if (zzfknVarM6298a != null) {
                    zzeovVar.m6297a(zzfknVarM6298a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
