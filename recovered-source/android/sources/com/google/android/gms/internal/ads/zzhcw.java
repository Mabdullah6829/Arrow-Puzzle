package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcw {
    /* JADX INFO: renamed from: a */
    public static Executor m7388a(final Executor executor, final zzhay zzhayVar) {
        executor.getClass();
        return executor == zzhbu.f18506s ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzhcs
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    zzhayVar.m7321d(e);
                }
            }
        };
    }
}
