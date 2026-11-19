package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhce {

    /* JADX INFO: renamed from: a */
    public final boolean f18516a;

    /* JADX INFO: renamed from: b */
    public final zzgwt f18517b;

    public /* synthetic */ zzhce(zzgwt zzgwtVar, boolean z) {
        this.f18516a = z;
        this.f18517b = zzgwtVar;
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m7366a(Executor executor, Callable callable) {
        zzhbt zzhbtVar = new zzhbt(this.f18517b, this.f18516a, false);
        zzhbtVar.f18505H = new zzhbr(zzhbtVar, callable, executor);
        zzhbtVar.m7348u();
        return zzhbtVar;
    }
}
