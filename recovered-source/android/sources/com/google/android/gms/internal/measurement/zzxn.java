package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzxn extends zzyq {

    /* JADX INFO: renamed from: d */
    public static final zzyf f23066d = new zzxl();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f23067c = new AtomicLong(-1);

    @Override // com.google.android.gms.internal.measurement.zzyq
    /* JADX INFO: renamed from: a */
    public final void mo10706a() {
        AtomicLong atomicLong = this.f23067c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
