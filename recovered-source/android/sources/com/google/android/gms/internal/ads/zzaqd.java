package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqd {

    /* JADX INFO: renamed from: f */
    public static final byte[] f6528f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f6529a;

    /* JADX INFO: renamed from: b */
    public int f6530b;

    /* JADX INFO: renamed from: c */
    public int f6531c;

    /* JADX INFO: renamed from: d */
    public int f6532d;

    /* JADX INFO: renamed from: e */
    public byte[] f6533e;

    /* JADX INFO: renamed from: a */
    public final void m4311a(byte[] bArr, int i2, int i3) {
        if (this.f6529a) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f6533e;
            int length = bArr2.length;
            int i5 = this.f6531c + i4;
            if (length < i5) {
                this.f6533e = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f6533e, this.f6531c, i4);
            this.f6531c += i4;
        }
    }
}
