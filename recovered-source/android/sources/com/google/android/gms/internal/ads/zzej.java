package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej {

    /* JADX INFO: renamed from: a */
    public int f14004a;

    /* JADX INFO: renamed from: b */
    public int f14005b;

    /* JADX INFO: renamed from: c */
    public int f14006c;

    /* JADX INFO: renamed from: d */
    public long[] f14007d;

    /* JADX INFO: renamed from: e */
    public int f14008e;

    public zzej() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final long m6231a() {
        int i2 = this.f14006c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f14007d;
        int i3 = this.f14004a;
        long j2 = jArr[i3];
        this.f14004a = this.f14008e & (i3 + 1);
        this.f14006c = i2 - 1;
        return j2;
    }
}
