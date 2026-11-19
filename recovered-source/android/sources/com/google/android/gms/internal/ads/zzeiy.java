package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiy {

    /* JADX INFO: renamed from: a */
    public final zzcbg f14002a;

    public zzeiy(zzcbg zzcbgVar) {
        this.f14002a = zzcbgVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6230a() {
        ListenableFuture listenableFutureM5304a = this.f14002a.m5304a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8062D8)).booleanValue()) {
            zzcgb.m5395b(listenableFutureM5304a, "persistFlags");
        } else {
            zzcgb.m5394a(listenableFutureM5304a, "persistFlags", zzcfy.f9953h);
        }
    }
}
