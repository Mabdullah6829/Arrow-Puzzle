package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zztg implements zztk {

    /* JADX INFO: renamed from: c */
    public static final Object f21845c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile zzth f21846a;

    /* JADX INFO: renamed from: b */
    public volatile Object f21847b;

    @Override // com.google.android.gms.internal.consent_sdk.zztm
    public final Object zzb() {
        Object obj = this.f21847b;
        Object obj2 = f21845c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f21847b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f21846a.zzb();
                Object obj4 = this.f21847b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f21847b = objZzb;
                this.f21846a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
