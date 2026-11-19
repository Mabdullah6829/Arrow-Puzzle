package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmf {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingDeque f16106a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b */
    public final Callable f16107b;

    /* JADX INFO: renamed from: c */
    public final zzhcp f16108c;

    public zzfmf(zzdvd zzdvdVar, zzhcp zzhcpVar) {
        this.f16107b = zzdvdVar;
        this.f16108c = zzhcpVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6530a(int i2) {
        LinkedBlockingDeque linkedBlockingDeque = this.f16106a;
        int size = i2 - linkedBlockingDeque.size();
        for (int i3 = 0; i3 < size; i3++) {
            linkedBlockingDeque.add(this.f16108c.submit(this.f16107b));
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized ListenableFuture m6531b() {
        m6530a(1);
        return (ListenableFuture) this.f16106a.poll();
    }
}
