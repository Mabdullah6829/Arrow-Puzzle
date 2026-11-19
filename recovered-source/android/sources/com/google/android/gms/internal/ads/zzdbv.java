package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdbv {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f11972a;

    public zzdbv(zzfky zzfkyVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f11972a = atomicLong;
        atomicLong.set(zzfkyVar.f16005a.f15998a.f16057u.get());
    }

    /* JADX INFO: renamed from: a */
    public final void m5891a(long j2) {
        this.f11972a.set(j2);
    }
}
