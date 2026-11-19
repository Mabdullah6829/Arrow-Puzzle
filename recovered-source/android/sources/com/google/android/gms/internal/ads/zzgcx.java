package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcx {

    /* JADX INFO: renamed from: b */
    public static zzgcx f17004b;

    /* JADX INFO: renamed from: a */
    public final zzgct f17005a;

    public zzgcx(Context context) {
        if (zzgct.f16991c == null) {
            zzgct.f16991c = new zzgct(context);
        }
        this.f17005a = zzgct.f16991c;
        zzgcs.m6881a(context);
    }

    /* JADX INFO: renamed from: a */
    public static final zzgcx m6895a(Context context) {
        zzgcx zzgcxVar;
        synchronized (zzgcx.class) {
            try {
                if (f17004b == null) {
                    f17004b = new zzgcx(context);
                }
                zzgcxVar = f17004b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcxVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m6896b() {
        synchronized (zzgcx.class) {
            zzgct zzgctVar = this.f17005a;
            zzgctVar.m6884b("vendor_scoped_gpid_v2_id");
            zzgctVar.m6884b("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
