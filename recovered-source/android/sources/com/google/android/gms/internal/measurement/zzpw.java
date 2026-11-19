package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import p011H.AbstractC0253Q;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzpw implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ListenableFuture f22750s;

    public /* synthetic */ zzpw(ListenableFuture listenableFuture) {
        this.f22750s = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        try {
            AbstractC0253Q.m379b(this.f22750s);
        } catch (ExecutionException e) {
            zzrn.m10626b().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    throw new RuntimeException(e.getCause());
                }
            });
        }
    }
}
