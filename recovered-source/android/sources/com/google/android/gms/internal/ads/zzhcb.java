package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhcb extends zzhbz implements ListenableFuture {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        mo7365h().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Future mo7361g() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract ListenableFuture mo7365h();
}
