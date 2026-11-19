package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import p001B.AbstractC0074D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxh {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0074D f23062a;

    static {
        AbstractC0074D zzxgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzxgVar = new zzxf();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzxgVar = new zzxg();
        }
        f23062a = zzxgVar;
    }
}
