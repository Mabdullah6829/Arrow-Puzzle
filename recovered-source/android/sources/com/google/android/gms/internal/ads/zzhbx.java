package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public class zzhbx extends zzhcg {
    /* JADX INFO: renamed from: q */
    public static zzhbx m7360q(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhbx ? (zzhbx) listenableFuture : new zzhby(listenableFuture);
    }
}
