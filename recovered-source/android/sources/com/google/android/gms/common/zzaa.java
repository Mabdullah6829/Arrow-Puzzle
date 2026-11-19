package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzah;

/* JADX INFO: loaded from: classes.dex */
final class zzaa {

    /* JADX INFO: renamed from: a */
    public String f4667a = null;

    /* JADX INFO: renamed from: b */
    public long f4668b = -1;

    /* JADX INFO: renamed from: c */
    public zzah f4669c = zzah.m9098q();

    /* JADX INFO: renamed from: d */
    public zzah f4670d = zzah.m9098q();

    /* JADX INFO: renamed from: a */
    public final void m3666a() {
        if (this.f4667a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f4668b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f4669c.isEmpty() && this.f4670d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
