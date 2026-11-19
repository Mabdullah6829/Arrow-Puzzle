package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzafv {

    /* JADX INFO: renamed from: a */
    public final zzafu f5220a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f5221b = new AtomicBoolean(false);

    public zzafv(zzafu zzafuVar) {
        this.f5220a = zzafuVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzaga m4092a(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.f5221b;
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    try {
                        constructorZza = this.f5220a.zza();
                    } catch (ClassNotFoundException unused) {
                        this.f5221b.set(true);
                        constructorZza = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorZza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzaga) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
