package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzhdc extends zzhcm {

    /* JADX INFO: renamed from: u */
    public final zzhbm f18537u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzhde f18538v;

    public zzhdc(zzhde zzhdeVar, zzhbm zzhbmVar) {
        this.f18538v = zzhdeVar;
        this.f18537u = zzhbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: a */
    public final Object mo7354a() {
        zzhbm zzhbmVar = this.f18537u;
        ListenableFuture listenableFutureZza = zzhbmVar.zza();
        if (listenableFutureZza != null) {
            return listenableFutureZza;
        }
        throw new NullPointerException(zzgui.m7149b("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: c */
    public final String mo7355c() {
        return this.f18537u.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: d */
    public final boolean mo7357d() {
        return this.f18538v.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo7358e(Object obj) {
        this.f18538v.m7324l((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: f */
    public final void mo7359f(Throwable th) {
        this.f18538v.m7321d(th);
    }
}
