package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhbz extends zzgwk implements Future {
    @Override // com.google.android.gms.internal.ads.zzgwk
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo6718b() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return mo7361g().cancel(z);
    }

    /* JADX INFO: renamed from: g */
    public abstract Future mo7361g();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo7361g().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo7361g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo7361g().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return mo7361g().get(j2, timeUnit);
    }
}
