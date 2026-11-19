package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcs {

    /* JADX INFO: renamed from: b */
    public static zzgcs f16989b;

    /* JADX INFO: renamed from: a */
    public final zzgct f16990a;

    public zzgcs(Context context) {
        if (zzgct.f16991c == null) {
            zzgct.f16991c = new zzgct(context);
        }
        this.f16990a = zzgct.f16991c;
    }

    /* JADX INFO: renamed from: a */
    public static final zzgcs m6881a(Context context) {
        zzgcs zzgcsVar;
        synchronized (zzgcs.class) {
            try {
                if (f16989b == null) {
                    f16989b = new zzgcs(context);
                }
                zzgcsVar = f16989b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcsVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m6882b(boolean z) {
        synchronized (zzgcs.class) {
            try {
                zzgct zzgctVar = this.f16990a;
                zzgctVar.m6883a("paidv2_publisher_option", Boolean.valueOf(z));
                if (!z) {
                    zzgctVar.m6884b("paidv2_creation_time");
                    zzgctVar.m6884b("paidv2_id");
                    zzgctVar.m6884b("vendor_scoped_gpid_v2_id");
                    zzgctVar.m6884b("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
