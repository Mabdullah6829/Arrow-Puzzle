package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyp {

    /* JADX INFO: renamed from: a */
    public final Executor f11785a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f11786b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f11787c = true;

    public zzcyp(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfoz zzfozVar) {
        this.f11785a = executor;
        this.f11786b = scheduledExecutorService;
    }
}
