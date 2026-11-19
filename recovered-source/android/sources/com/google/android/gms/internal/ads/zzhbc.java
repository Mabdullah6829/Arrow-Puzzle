package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbc extends zzhbe {
    @Override // com.google.android.gms.internal.ads.zzhbe
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo7342r(Object obj) {
        m7324l((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    /* JADX INFO: renamed from: s */
    public final Object mo7343s(Object obj, Object obj2) {
        zzhbn zzhbnVar = (zzhbn) obj;
        ListenableFuture listenableFutureMo3248b = zzhbnVar.mo3248b(obj2);
        if (listenableFutureMo3248b != null) {
            return listenableFutureMo3248b;
        }
        throw new NullPointerException(zzgui.m7149b("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbnVar));
    }
}
