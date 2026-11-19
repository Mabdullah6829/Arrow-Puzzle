package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad extends zzaa {
    public zzad() {
        this.f21569a = new Object[4];
        this.f21570b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m9093a(Object obj) {
        int i2;
        obj.getClass();
        int length = this.f21569a.length;
        int i3 = this.f21570b;
        int i4 = i3 + 1;
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= length) {
            i2 = length;
        } else {
            i2 = (length >> 1) + length + 1;
            if (i2 < i4) {
                int iHighestOneBit = Integer.highestOneBit(i3);
                i2 = iHighestOneBit + iHighestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
        }
        if (i2 > length || this.f21571c) {
            this.f21569a = Arrays.copyOf(this.f21569a, i2);
            this.f21571c = false;
        }
        Object[] objArr = this.f21569a;
        int i5 = this.f21570b;
        this.f21570b = i5 + 1;
        objArr[i5] = obj;
    }

    /* JADX INFO: renamed from: b */
    public final zzah m9094b() {
        this.f21571c = true;
        return zzah.m9100s(this.f21570b, this.f21569a);
    }
}
