package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlf {

    /* JADX INFO: renamed from: a */
    public static final Logger f18918a = Logger.getLogger(zzhlf.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f18919b = new AtomicBoolean(false);

    private zzhlf() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7505a() {
        return f18919b.get();
    }
}
