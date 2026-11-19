package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcv extends zzgcu {

    /* JADX INFO: renamed from: i */
    public static zzgcv f17002i;

    /* JADX INFO: renamed from: f */
    public static final zzgcv m6890f(Context context) {
        zzgcv zzgcvVar;
        synchronized (zzgcv.class) {
            try {
                if (f17002i == null) {
                    f17002i = new zzgcv(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                zzgcvVar = f17002i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcvVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m6891g() {
        synchronized (zzgcv.class) {
            m6887c(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6892h() {
        synchronized (zzgcv.class) {
            m6887c(true);
        }
    }
}
