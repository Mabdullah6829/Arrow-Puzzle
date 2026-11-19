package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhc {

    /* JADX INFO: renamed from: a */
    public final byte[] f18509a;

    /* JADX INFO: renamed from: b */
    public final int f18510b;

    /* JADX INFO: renamed from: c */
    public int f18511c;

    /* JADX INFO: renamed from: d */
    public int f18512d;

    public zzhc(byte[] bArr) {
        this.f18509a = bArr;
        this.f18510b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7362a() {
        int i2 = (this.f18509a[this.f18511c] & 255) >> this.f18512d;
        m7364c(1);
        return 1 == (i2 & 1);
    }

    /* JADX INFO: renamed from: b */
    public final int m7363b(int i2) {
        int i3 = this.f18511c;
        int i4 = i3 + 1;
        int iMin = Math.min(i2, 8 - this.f18512d);
        byte[] bArr = this.f18509a;
        int i5 = ((bArr[i3] & 255) >> this.f18512d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (bArr[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        m7364c(i2);
        return i6;
    }

    /* JADX INFO: renamed from: c */
    public final void m7364c(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.f18511c + i4;
        this.f18511c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f18512d;
        this.f18512d = i6;
        if (i6 > 7) {
            i5++;
            this.f18511c = i5;
            i6 -= 8;
            this.f18512d = i6;
        }
        boolean z = false;
        if (i5 >= 0 && (i5 < (i3 = this.f18510b) || (i5 == i3 && i6 == 0))) {
            z = true;
        }
        zzgtr.m7133f(z);
    }
}
