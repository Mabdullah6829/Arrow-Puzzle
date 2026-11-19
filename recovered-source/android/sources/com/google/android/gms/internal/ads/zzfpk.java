package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpk {

    /* JADX INFO: renamed from: d */
    public static final ListenableFuture f16241d = zzhcj.f18518t;

    /* JADX INFO: renamed from: a */
    public final zzhcp f16242a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f16243b;

    /* JADX INFO: renamed from: c */
    public final zzfpl f16244c;

    public zzfpk(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzfpl zzfplVar) {
        this.f16242a = zzhcpVar;
        this.f16243b = scheduledExecutorService;
        this.f16244c = zzfplVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfpj m6556a(ListenableFuture listenableFuture, Object obj) {
        return new zzfpj(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo6557b(Object obj);
}
