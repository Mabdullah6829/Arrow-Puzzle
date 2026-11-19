package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzyt extends zzyq {

    /* JADX INFO: renamed from: d */
    public static final zzyf f23109d = new zzyr();

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f23110e = new zzys();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f23111c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.zzyq
    /* JADX INFO: renamed from: a */
    public final void mo10706a() {
        this.f23111c.decrementAndGet();
    }
}
