package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqr {

    /* JADX INFO: renamed from: a */
    public final int f6671a;

    /* JADX INFO: renamed from: b */
    public boolean f6672b;

    /* JADX INFO: renamed from: c */
    public boolean f6673c;

    /* JADX INFO: renamed from: d */
    public byte[] f6674d;

    /* JADX INFO: renamed from: e */
    public int f6675e;

    public zzaqr(int i2) {
        this.f6671a = i2;
        byte[] bArr = new byte[131];
        this.f6674d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m4323a() {
        this.f6672b = false;
        this.f6673c = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4324b(int i2) {
        zzgtr.m7133f(!this.f6672b);
        boolean z = i2 == this.f6671a;
        this.f6672b = z;
        if (z) {
            this.f6675e = 3;
            this.f6673c = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4325c(byte[] bArr, int i2, int i3) {
        if (this.f6672b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f6674d;
            int length = bArr2.length;
            int i5 = this.f6675e + i4;
            if (length < i5) {
                this.f6674d = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f6674d, this.f6675e, i4);
            this.f6675e += i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4326d(int i2) {
        if (!this.f6672b) {
            return false;
        }
        this.f6675e -= i2;
        this.f6672b = false;
        this.f6673c = true;
        return true;
    }
}
