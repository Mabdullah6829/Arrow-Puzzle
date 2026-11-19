package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzei {

    /* JADX INFO: renamed from: a */
    public int f13939a;

    /* JADX INFO: renamed from: b */
    public long[] f13940b;

    public zzei() {
        this(32);
    }

    /* JADX INFO: renamed from: a */
    public final void m6219a() {
        int i2 = this.f13939a;
        long[] jArr = this.f13940b;
        if (i2 == jArr.length) {
            this.f13940b = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.f13940b;
        int i3 = this.f13939a;
        this.f13939a = i3 + 1;
        jArr2[i3] = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m6220b(long[] jArr) {
        int i2 = this.f13939a;
        int length = jArr.length;
        int i3 = i2 + length;
        long[] jArr2 = this.f13940b;
        int length2 = jArr2.length;
        if (i3 > length2) {
            this.f13940b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i3));
        }
        System.arraycopy(jArr, 0, this.f13940b, this.f13939a, length);
        this.f13939a = i3;
    }

    /* JADX INFO: renamed from: c */
    public final long m6221c(int i2) {
        if (i2 >= 0 && i2 < this.f13939a) {
            return this.f13940b[i2];
        }
        int i3 = this.f13939a;
        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 24 + String.valueOf(i3).length()), "Invalid index ", i2, ", size is ", i3));
    }

    public zzei(int i2) {
        this.f13940b = new long[i2];
    }
}
