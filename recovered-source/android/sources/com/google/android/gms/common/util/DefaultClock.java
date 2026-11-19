package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class DefaultClock implements Clock {

    /* JADX INFO: renamed from: a */
    public static final DefaultClock f4636a = new DefaultClock();

    private DefaultClock() {
    }

    @Override // com.google.android.gms.common.util.Clock
    /* JADX INFO: renamed from: a */
    public final long mo3639a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    /* JADX INFO: renamed from: b */
    public final long mo3640b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
