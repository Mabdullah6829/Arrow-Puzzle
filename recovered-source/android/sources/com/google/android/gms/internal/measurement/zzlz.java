package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.internal.C6462u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlz {
    /* JADX INFO: renamed from: a */
    public static final void m10473a(final Level level, Executor executor, final Exception exc, final String str, final Object... objArr) {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzly
            @Override // java.lang.Runnable
            public final void run() {
                zzxs zzxsVar = zzlx.f22641a;
                zzzf zzzfVar = zzxsVar.f23063a;
                Level level2 = level;
                boolean zMo9314b = zzzfVar.mo9314b(level2);
                zzaab.f21854a.mo9307c().mo9316a(zzzfVar.mo9308a(), level2, zMo9314b);
                ((zzxp) ((zzxp) (!zMo9314b ? zzxs.f23069b : new zzxq(zzxsVar, level2)).mo10720b(exc)).mo10721g()).mo10719a(str, objArr);
            }
        };
        int i2 = zzxa.f23060a;
        executor.execute(new zzwz(new C6462u(), zzvy.m10684a(), runnable));
    }
}
