package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqb {

    /* JADX INFO: renamed from: e */
    public static final byte[] f6505e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f6506a;

    /* JADX INFO: renamed from: b */
    public int f6507b;

    /* JADX INFO: renamed from: c */
    public int f6508c;

    /* JADX INFO: renamed from: d */
    public byte[] f6509d;

    /* JADX INFO: renamed from: a */
    public final void m4310a(byte[] bArr, int i2, int i3) {
        if (this.f6506a) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f6509d;
            int length = bArr2.length;
            int i5 = this.f6507b + i4;
            if (length < i5) {
                this.f6509d = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f6509d, this.f6507b, i4);
            this.f6507b += i4;
        }
    }
}
