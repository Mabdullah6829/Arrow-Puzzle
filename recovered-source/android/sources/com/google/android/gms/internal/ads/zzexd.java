package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzexd {

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f15078a;

    /* JADX INFO: renamed from: b */
    public final long f15079b;

    /* JADX INFO: renamed from: c */
    public final Clock f15080c;

    public zzexd(ListenableFuture listenableFuture, long j2, Clock clock) {
        this.f15078a = listenableFuture;
        this.f15080c = clock;
        this.f15079b = clock.mo3639a() + j2;
    }
}
