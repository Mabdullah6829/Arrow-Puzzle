package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgb {
    /* JADX INFO: renamed from: a */
    public static void m5394a(ListenableFuture listenableFuture, String str, Executor executor) {
        listenableFuture.addListener(new zzhcd(listenableFuture, new zzcfz(str)), executor);
    }

    /* JADX INFO: renamed from: b */
    public static void m5395b(ListenableFuture listenableFuture, String str) {
        zzcga zzcgaVar = new zzcga(str);
        listenableFuture.addListener(new zzhcd(listenableFuture, zzcgaVar), zzcfy.f9953h);
    }
}
