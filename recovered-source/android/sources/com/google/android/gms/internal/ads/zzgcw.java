package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcw extends zzgcu {

    /* JADX INFO: renamed from: i */
    public static zzgcw f17003i;

    /* JADX INFO: renamed from: f */
    public static final zzgcw m6893f(Context context) {
        zzgcw zzgcwVar;
        synchronized (zzgcw.class) {
            try {
                if (f17003i == null) {
                    f17003i = new zzgcw(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                zzgcwVar = f17003i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcwVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m6894g() {
        synchronized (zzgcw.class) {
            try {
                zzgct zzgctVar = this.f17000f;
                if (zzgctVar.f16993b.contains(this.f16995a)) {
                    m6887c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
