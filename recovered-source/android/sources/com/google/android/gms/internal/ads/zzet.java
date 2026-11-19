package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzet {

    /* JADX INFO: renamed from: a */
    public byte[] f14823a;

    /* JADX INFO: renamed from: b */
    public int f14824b;

    /* JADX INFO: renamed from: c */
    public int f14825c;

    /* JADX INFO: renamed from: d */
    public int f14826d;

    public zzet(byte[] bArr, int i2) {
        this.f14823a = bArr;
        this.f14826d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6338a(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.f14887a;
        int i2 = zzeuVar.f14889c;
        this.f14823a = bArr;
        this.f14824b = 0;
        this.f14825c = 0;
        this.f14826d = i2;
        m6341d(zzeuVar.f14888b * 8);
    }

    /* JADX INFO: renamed from: b */
    public final int m6339b() {
        return ((this.f14826d - this.f14824b) * 8) - this.f14825c;
    }

    /* JADX INFO: renamed from: c */
    public final int m6340c() {
        zzgtr.m7133f(this.f14825c == 0);
        return this.f14824b;
    }

    /* JADX INFO: renamed from: d */
    public final void m6341d(int i2) {
        int i3 = i2 / 8;
        this.f14824b = i3;
        this.f14825c = i2 - (i3 * 8);
        m6350m();
    }

    /* JADX INFO: renamed from: e */
    public final void m6342e() {
        int i2 = this.f14825c + 1;
        this.f14825c = i2;
        if (i2 == 8) {
            this.f14825c = 0;
            this.f14824b++;
        }
        m6350m();
    }

    /* JADX INFO: renamed from: f */
    public final void m6343f(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f14824b + i3;
        this.f14824b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f14825c;
        this.f14825c = i5;
        if (i5 > 7) {
            this.f14824b = i4 + 1;
            this.f14825c = i5 - 8;
        }
        m6350m();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6344g() {
        int i2 = this.f14823a[this.f14824b] & (128 >> this.f14825c);
        m6342e();
        return i2 != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m6345h(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f14825c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f14825c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f14825c = i5;
            byte[] bArr = this.f14823a;
            int i6 = this.f14824b;
            this.f14824b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f14823a;
        int i7 = this.f14824b;
        int i8 = i4 | ((bArr2[i7] & 255) >> (8 - i3));
        int i9 = 32 - i2;
        if (i3 == 8) {
            this.f14825c = 0;
            this.f14824b = i7 + 1;
        }
        int i10 = ((-1) >>> i9) & i8;
        m6350m();
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public final long m6346i(int i2) {
        if (i2 <= 32) {
            int iM6345h = m6345h(i2);
            String str = zzfm.f16091a;
            return 4294967295L & ((long) iM6345h);
        }
        int iM6345h2 = m6345h(i2 - 32);
        int iM6345h3 = m6345h(32);
        String str2 = zzfm.f16091a;
        return (4294967295L & ((long) iM6345h3)) | ((((long) iM6345h2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: j */
    public final void m6347j(int i2, byte[] bArr) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.f14823a;
            int i5 = this.f14824b;
            int i6 = i5 + 1;
            this.f14824b = i6;
            byte b = bArr2[i5];
            int i7 = this.f14825c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.f14825c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f14823a;
            int i10 = this.f14824b;
            this.f14824b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.f14825c = i11;
        byte[] bArr4 = this.f14823a;
        int i12 = this.f14824b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.f14825c = 0;
            this.f14824b = i12 + 1;
        }
        m6350m();
    }

    /* JADX INFO: renamed from: k */
    public final void m6348k() {
        if (this.f14825c == 0) {
            return;
        }
        this.f14825c = 0;
        this.f14824b++;
        m6350m();
    }

    /* JADX INFO: renamed from: l */
    public final void m6349l(int i2) {
        zzgtr.m7133f(this.f14825c == 0);
        this.f14824b += i2;
        m6350m();
    }

    /* JADX INFO: renamed from: m */
    public final void m6350m() {
        int i2;
        int i3 = this.f14824b;
        boolean z = false;
        if (i3 >= 0 && (i3 < (i2 = this.f14826d) || (i3 == i2 && this.f14825c == 0))) {
            z = true;
        }
        zzgtr.m7133f(z);
    }

    public zzet() {
        this.f14823a = zzfm.f16092b;
    }
}
