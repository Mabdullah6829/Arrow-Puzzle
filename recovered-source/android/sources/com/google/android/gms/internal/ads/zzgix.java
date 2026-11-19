package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgix extends zzgji {

    /* JADX INFO: renamed from: f */
    public static volatile Long f17564f;

    /* JADX INFO: renamed from: g */
    public static final Object f17565g = new Object();

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        if (f17564f == null) {
            synchronized (f17565g) {
                try {
                    if (f17564f == null) {
                        Long l2 = (Long) method.invoke("", null);
                        if (l2 == null) {
                            throw null;
                        }
                        f17564f = l2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (zzaxtVar) {
            try {
                if (f17564f != null) {
                    long jLongValue = f17564f.longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4596T0(jLongValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
