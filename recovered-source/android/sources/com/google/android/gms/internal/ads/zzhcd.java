package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcd implements Runnable {

    /* JADX INFO: renamed from: s */
    public final ListenableFuture f18514s;

    /* JADX INFO: renamed from: t */
    public final zzhcc f18515t;

    public zzhcd(ListenableFuture listenableFuture, zzhcc zzhccVar) {
        this.f18514s = listenableFuture;
        this.f18515t = zzhccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo7319a;
        ListenableFuture listenableFuture = this.f18514s;
        boolean z = listenableFuture instanceof zzhdh;
        zzhcc zzhccVar = this.f18515t;
        if (z && (thMo7319a = ((zzhdh) listenableFuture).mo7319a()) != null) {
            zzhccVar.mo3317b(thMo7319a);
            return;
        }
        try {
            zzhccVar.mo3316a(zzhcf.m7378l(listenableFuture));
        } catch (ExecutionException e) {
            zzhccVar.mo3317b(e.getCause());
        } catch (Throwable th) {
            zzhccVar.mo3317b(th);
        }
    }

    public final String toString() {
        zzgtn zzgtnVar = new zzgtn("zzhcd");
        zzgtm zzgtmVar = new zzgtm();
        zzgtnVar.f18179c.f18176b = zzgtmVar;
        zzgtnVar.f18179c = zzgtmVar;
        zzgtmVar.f18175a = this.f18515t;
        return zzgtnVar.toString();
    }
}
