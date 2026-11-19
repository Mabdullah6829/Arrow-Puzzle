package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabq {

    /* JADX INFO: renamed from: a */
    public static final String[] f21922a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b */
    public static final zzabu f21923b;

    static {
        zzabu zzabvVar;
        for (int i2 = 0; i2 < 2; i2++) {
            zzabvVar = null;
            try {
                zzabvVar = (zzabu) Class.forName(f21922a[i2]).asSubclass(zzabu.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzabvVar != null) {
                f21923b = zzabvVar;
            }
        }
        zzabvVar = new zzabv();
        f21923b = zzabvVar;
    }
}
