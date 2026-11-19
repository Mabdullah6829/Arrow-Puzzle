package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbke {

    /* JADX INFO: renamed from: a */
    public MotionEvent f8967a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b */
    public MotionEvent f8968b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f8969c;

    public zzbke(ScheduledExecutorService scheduledExecutorService) {
        this.f8969c = scheduledExecutorService;
    }
}
