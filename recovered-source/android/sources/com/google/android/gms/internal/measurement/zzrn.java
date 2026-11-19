package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrn {

    /* JADX INFO: renamed from: a */
    public static final Object f22822a = new Object();

    /* JADX INFO: renamed from: b */
    public static Thread f22823b;

    /* JADX INFO: renamed from: c */
    public static volatile Handler f22824c;

    /* JADX INFO: renamed from: a */
    public static boolean m10625a(Thread thread) {
        if (f22823b == null) {
            f22823b = Looper.getMainLooper().getThread();
        }
        return thread == f22823b;
    }

    /* JADX INFO: renamed from: b */
    public static Handler m10626b() {
        if (f22824c == null) {
            synchronized (f22822a) {
                try {
                    if (f22824c == null) {
                        f22824c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22824c;
    }
}
