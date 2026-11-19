package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfi {

    /* JADX INFO: renamed from: a */
    public long[] f15733a;

    /* JADX INFO: renamed from: b */
    public Object[] f15734b;

    /* JADX INFO: renamed from: c */
    public int f15735c;

    /* JADX INFO: renamed from: d */
    public int f15736d;

    public zzfi() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6455a(long j2, Object obj) {
        try {
            int i2 = this.f15736d;
            if (i2 > 0) {
                if (j2 <= this.f15733a[((this.f15735c + i2) - 1) % this.f15734b.length]) {
                    synchronized (this) {
                        this.f15735c = 0;
                        this.f15736d = 0;
                        Arrays.fill(this.f15734b, (Object) null);
                    }
                }
            }
            int length = this.f15734b.length;
            if (this.f15736d >= length) {
                int i3 = length + length;
                long[] jArr = new long[i3];
                Object[] objArr = new Object[i3];
                int i4 = this.f15735c;
                int i5 = length - i4;
                System.arraycopy(this.f15733a, i4, jArr, 0, i5);
                System.arraycopy(this.f15734b, this.f15735c, objArr, 0, i5);
                int i6 = this.f15735c;
                if (i6 > 0) {
                    System.arraycopy(this.f15733a, 0, jArr, i5, i6);
                    System.arraycopy(this.f15734b, 0, objArr, i5, this.f15735c);
                }
                this.f15733a = jArr;
                this.f15734b = objArr;
                this.f15735c = 0;
            }
            int i7 = this.f15735c;
            int i8 = this.f15736d;
            Object[] objArr2 = this.f15734b;
            int length2 = (i7 + i8) % objArr2.length;
            this.f15733a[length2] = j2;
            objArr2[length2] = obj;
            this.f15736d = i8 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m6456b() {
        return this.f15736d;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m6457c() {
        if (this.f15736d == 0) {
            return null;
        }
        return m6459e();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Object m6458d(long j2) {
        Object objM6459e;
        objM6459e = null;
        while (this.f15736d > 0 && j2 - this.f15733a[this.f15735c] >= 0) {
            objM6459e = m6459e();
        }
        return objM6459e;
    }

    /* JADX INFO: renamed from: e */
    public final Object m6459e() {
        zzgtr.m7133f(this.f15736d > 0);
        Object[] objArr = this.f15734b;
        int i2 = this.f15735c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f15735c = (i2 + 1) % objArr.length;
        this.f15736d--;
        return obj;
    }

    public zzfi(int i2) {
        this.f15733a = new long[10];
        this.f15734b = new Object[10];
    }
}
