package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejh {

    /* JADX INFO: renamed from: a */
    public final zzejd f14015a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f14016b;

    public zzejh(zzejd zzejdVar, zzhcp zzhcpVar) {
        this.f14015a = zzejdVar;
        this.f14016b = zzhcpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6232a(zzfos zzfosVar) {
        final zzejd zzejdVar = this.f14015a;
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzejg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzejdVar.getWritableDatabase();
            }
        };
        zzhcp zzhcpVar = this.f14016b;
        ListenableFuture listenableFutureSubmit = zzhcpVar.submit(callable);
        listenableFutureSubmit.addListener(new zzhcd(listenableFutureSubmit, new zzejf(this, zzfosVar)), zzhcpVar);
    }
}
