package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdk implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenableFuture f9770a;

    public zzcdk(zzcdp zzcdpVar, ListenableFuture listenableFuture) {
        this.f9770a = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        zzcdp.f9776l.remove(this.f9770a);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzcdp.f9776l.remove(this.f9770a);
    }
}
