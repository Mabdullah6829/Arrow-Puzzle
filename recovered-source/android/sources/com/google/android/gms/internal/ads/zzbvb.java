package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvb implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f9431a;

    public zzbvb(ListenableFuture listenableFuture) {
        this.f9431a = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) {
        return zzhcf.m7374h(this.f9431a, new zzbva(this, obj), zzcfy.f9953h);
    }
}
