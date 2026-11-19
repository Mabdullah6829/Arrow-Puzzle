package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzguk implements Serializable, zzguj {

    /* JADX INFO: renamed from: s */
    public final transient zzgup f18202s = new zzgup();

    /* JADX INFO: renamed from: t */
    public final zzguj f18203t;

    /* JADX INFO: renamed from: u */
    public volatile transient boolean f18204u;

    /* JADX INFO: renamed from: v */
    public transient Object f18205v;

    public zzguk(zzguj zzgujVar) {
        this.f18203t = zzgujVar;
    }

    public final String toString() {
        Object objM2450q;
        if (this.f18204u) {
            String strValueOf = String.valueOf(this.f18205v);
            objM2450q = AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objM2450q = this.f18203t;
        }
        String string = objM2450q.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza() {
        if (!this.f18204u) {
            synchronized (this.f18202s) {
                try {
                    if (!this.f18204u) {
                        Object objZza = this.f18203t.zza();
                        this.f18205v = objZza;
                        this.f18204u = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f18205v;
    }
}
