package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbr extends zzhbs {

    /* JADX INFO: renamed from: w */
    public final Callable f18501w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzhbt f18502x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhbr(zzhbt zzhbtVar, Callable callable, Executor executor) {
        super(zzhbtVar, executor);
        this.f18502x = zzhbtVar;
        this.f18501w = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: a */
    public final Object mo7354a() {
        return this.f18501w.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    /* JADX INFO: renamed from: c */
    public final String mo7355c() {
        return this.f18501w.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    /* JADX INFO: renamed from: h */
    public final void mo7356h(Object obj) {
        this.f18502x.m7320c(obj);
    }
}
