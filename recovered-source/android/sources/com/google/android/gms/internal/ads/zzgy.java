package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgy {

    /* JADX INFO: renamed from: a */
    public final byte[] f18347a;

    /* JADX INFO: renamed from: b */
    public final int f18348b;

    /* JADX INFO: renamed from: c */
    public final int f18349c;

    /* JADX INFO: renamed from: d */
    public int f18350d;

    /* JADX INFO: renamed from: e */
    public int f18351e = 0;

    public zzgy(byte[] bArr, int i2, int i3) {
        this.f18347a = bArr;
        this.f18349c = i2;
        this.f18350d = i2;
        this.f18348b = i3;
        m7260i();
    }

    /* JADX INFO: renamed from: a */
    public final void m7252a() {
        int i2 = this.f18351e + 1;
        this.f18351e = i2;
        if (i2 == 8) {
            this.f18351e = 0;
            int i3 = this.f18350d;
            this.f18350d = i3 + (true == m7259h(i3 + 1) ? 2 : 1);
        }
        m7260i();
    }

    /* JADX INFO: renamed from: b */
    public final void m7253b(int i2) {
        int i3 = this.f18350d;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f18350d = i5;
        int i6 = (i2 - (i4 * 8)) + this.f18351e;
        this.f18351e = i6;
        if (i6 > 7) {
            this.f18350d = i5 + 1;
            this.f18351e = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f18350d) {
                m7260i();
                return;
            } else if (m7259h(i3)) {
                this.f18350d++;
                i3 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7254c(int i2) {
        int i3;
        int i4 = this.f18350d;
        int i5 = i2 / 8;
        int i6 = i4 + i5;
        int i7 = (this.f18351e + i2) - (i5 * 8);
        if (i7 > 7) {
            i6++;
            i7 -= 8;
        }
        while (true) {
            i4++;
            i3 = this.f18348b;
            if (i4 > i6 || i6 > i3) {
                break;
            }
            if (m7259h(i4)) {
                i6++;
                i4 += 2;
            }
        }
        if (i6 >= i3) {
            return i6 == i3 && i7 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7255d() {
        int i2 = this.f18347a[this.f18350d] & (128 >> this.f18351e);
        m7252a();
        return i2 != 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m7256e(int i2) {
        int i3;
        byte[] bArr;
        this.f18351e += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f18351e;
            int i5 = 2;
            bArr = this.f18347a;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.f18351e = i6;
            int i7 = this.f18350d;
            i4 |= (bArr[i7] & 255) << i6;
            if (true != m7259h(i7 + 1)) {
                i5 = 1;
            }
            this.f18350d = i7 + i5;
        }
        int i8 = this.f18350d;
        int i9 = i4 | ((bArr[i8] & 255) >> (8 - i3));
        int i10 = 32 - i2;
        if (i3 == 8) {
            this.f18351e = 0;
            this.f18350d = i8 + (true != m7259h(i8 + 1) ? 1 : 2);
        }
        int i11 = ((-1) >>> i10) & i9;
        m7260i();
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public final int m7257f() {
        int iM7258g = m7258g();
        int i2 = iM7258g % 2;
        return ((iM7258g + 1) / 2) * (i2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: g */
    public final int m7258g() {
        int i2 = 0;
        while (!m7255d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? m7256e(i2) : 0);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7259h(int i2) {
        int i3 = i2 - 2;
        if (this.f18349c > i3 || i2 >= this.f18348b) {
            return false;
        }
        byte[] bArr = this.f18347a;
        return bArr[i2] == 3 && bArr[i3] == 0 && bArr[i2 + (-1)] == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m7260i() {
        int i2;
        int i3 = this.f18350d;
        boolean z = false;
        if (i3 >= 0 && (i3 < (i2 = this.f18348b) || (i3 == i2 && this.f18351e == 0))) {
            z = true;
        }
        zzgtr.m7133f(z);
    }
}
