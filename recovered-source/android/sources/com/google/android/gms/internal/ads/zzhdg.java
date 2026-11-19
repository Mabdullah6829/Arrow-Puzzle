package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdg {
    /* JADX INFO: renamed from: a */
    public static Object m7390a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
