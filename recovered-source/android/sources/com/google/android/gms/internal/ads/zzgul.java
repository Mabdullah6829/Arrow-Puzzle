package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzgul implements zzguj {

    /* JADX INFO: renamed from: s */
    public final zzgup f18206s = new zzgup();

    /* JADX INFO: renamed from: t */
    public volatile zzguj f18207t;

    /* JADX INFO: renamed from: u */
    public Object f18208u;

    public zzgul(zzguj zzgujVar) {
        this.f18207t = zzgujVar;
    }

    public final String toString() {
        Object objM2450q = this.f18207t;
        if (objM2450q == null) {
            String strValueOf = String.valueOf(this.f18208u);
            objM2450q = AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String string = objM2450q.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        if (this.f18207t != null) {
            synchronized (this.f18206s) {
                try {
                    if (this.f18207t != null) {
                        Object objZza = this.f18207t.zza();
                        this.f18208u = objZza;
                        this.f18207t = null;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f18208u;
    }
}
