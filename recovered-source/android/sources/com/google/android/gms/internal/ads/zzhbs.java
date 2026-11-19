package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbs extends zzhcm {

    /* JADX INFO: renamed from: u */
    public final Executor f18503u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzhbt f18504v;

    public zzhbs(zzhbt zzhbtVar, Executor executor) {
        this.f18504v = zzhbtVar;
        executor.getClass();
        this.f18503u = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: d */
    public final boolean mo7357d() {
        return this.f18504v.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: e */
    public final void mo7358e(Object obj) {
        this.f18504v.f18505H = null;
        mo7356h(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: f */
    public final void mo7359f(Throwable th) {
        zzhbt zzhbtVar = this.f18504v;
        zzhbtVar.f18505H = null;
        if (th instanceof ExecutionException) {
            zzhbtVar.m7321d(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhbtVar.cancel(false);
        } else {
            zzhbtVar.m7321d(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo7356h(Object obj);
}
