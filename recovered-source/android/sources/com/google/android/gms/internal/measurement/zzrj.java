package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;
import p001B.AbstractC0076b;

/* JADX INFO: loaded from: classes2.dex */
final class zzrj {

    /* JADX INFO: renamed from: a */
    public static final zzrl f22820a;

    static {
        zzrl zzrhVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzrl.class, zzrl.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzrhVar = (zzrl) it.next();
                AbstractC0076b.m139n(!it.hasNext(), "Expected at most one FlagsService");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                zzrhVar = new zzrh();
            }
            f22820a = zzrhVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
