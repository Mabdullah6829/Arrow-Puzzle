package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaab {

    /* JADX INFO: renamed from: a */
    public static final zzaad f21854a;

    static {
        zzaad zzaadVar;
        try {
            zzaadVar = zzaak.f21861a;
        } catch (NoClassDefFoundError unused) {
            zzaadVar = null;
        }
        if (zzaadVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 3; i2++) {
                String str = zzaad.f21855a[i2];
                try {
                    zzaadVar = (zzaad) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        f21854a = zzaadVar;
    }
}
