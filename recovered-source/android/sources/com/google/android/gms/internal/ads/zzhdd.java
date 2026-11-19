package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzhdd extends zzhcm {

    /* JADX INFO: renamed from: u */
    public final Callable f18539u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzhde f18540v;

    public zzhdd(zzhde zzhdeVar, Callable callable) {
        this.f18540v = zzhdeVar;
        callable.getClass();
        this.f18539u = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: a */
    public final Object mo7354a() {
        return this.f18539u.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: c */
    public final String mo7355c() {
        return this.f18539u.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: d */
    public final boolean mo7357d() {
        return this.f18540v.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: e */
    public final void mo7358e(Object obj) {
        this.f18540v.m7320c(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: f */
    public final void mo7359f(Throwable th) {
        this.f18540v.m7321d(th);
    }
}
