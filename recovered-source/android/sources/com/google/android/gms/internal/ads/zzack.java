package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
final class zzack implements zzacl {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Executor f4913s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzdu f4914t;

    public zzack(ExecutorService executorService, zzdu zzduVar) {
        this.f4913s = executorService;
        this.f4914t = zzduVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4913s.execute(runnable);
    }
}
