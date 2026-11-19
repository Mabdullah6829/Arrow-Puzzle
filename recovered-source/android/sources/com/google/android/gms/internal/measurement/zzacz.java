package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzacz extends zzada {

    /* JADX INFO: renamed from: c */
    public final byte[] f21998c;

    /* JADX INFO: renamed from: d */
    public final int f21999d;

    /* JADX INFO: renamed from: e */
    public int f22000e;

    /* JADX INFO: renamed from: f */
    public final OutputStream f22001f;

    public zzacz(OutputStream outputStream, int i2) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f22001f = outputStream;
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.f21998c = bArr;
        this.f21999d = bArr.length;
    }

    /* JADX INFO: renamed from: A */
    public final void m9503A(long j2) {
        boolean z = zzada.f22004b;
        byte[] bArr = this.f21998c;
        if (z) {
            while (true) {
                int i2 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    int i3 = this.f22000e;
                    this.f22000e = i3 + 1;
                    zzagg.m9708k(bArr, i3, (byte) i2);
                    return;
                } else {
                    int i4 = this.f22000e;
                    this.f22000e = i4 + 1;
                    zzagg.m9708k(bArr, i4, (byte) (i2 | 128));
                    j2 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i5 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    int i6 = this.f22000e;
                    this.f22000e = i6 + 1;
                    bArr[i6] = (byte) i5;
                    return;
                } else {
                    int i7 = this.f22000e;
                    this.f22000e = i7 + 1;
                    bArr[i7] = (byte) (i5 | 128);
                    j2 >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9504B(int i2) {
        int i3 = this.f22000e;
        byte[] bArr = this.f21998c;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.f22000e = i3 + 4;
    }

    /* JADX INFO: renamed from: C */
    public final void m9505C(long j2) {
        int i2 = this.f22000e;
        byte[] bArr = this.f21998c;
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >> 8);
        bArr[i2 + 2] = (byte) (j2 >> 16);
        bArr[i2 + 3] = (byte) (j2 >> 24);
        bArr[i2 + 4] = (byte) (j2 >> 32);
        bArr[i2 + 5] = (byte) (j2 >> 40);
        bArr[i2 + 6] = (byte) (j2 >> 48);
        bArr[i2 + 7] = (byte) (j2 >> 56);
        this.f22000e = i2 + 8;
    }

    /* JADX INFO: renamed from: D */
    public final void m9506D(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f22000e;
        int i5 = this.f21999d;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f21998c;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f22000e += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        this.f22000e = i5;
        m9508F();
        int i8 = i3 - i6;
        if (i8 > i5) {
            this.f22001f.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f22000e = i8;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9507E(int i2) {
        if (this.f21999d - this.f22000e < i2) {
            m9508F();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9508F() {
        this.f22001f.write(this.f21998c, 0, this.f22000e);
        this.f22000e = 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m9509G(int i2) {
        boolean z = zzada.f22004b;
        byte[] bArr = this.f21998c;
        if (z) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f22000e;
                this.f22000e = i3 + 1;
                zzagg.m9708k(bArr, i3, (byte) (i2 | 128));
                i2 >>>= 7;
            }
            int i4 = this.f22000e;
            this.f22000e = i4 + 1;
            zzagg.m9708k(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f22000e;
            this.f22000e = i5 + 1;
            bArr[i5] = (byte) (i2 | 128);
            i2 >>>= 7;
        }
        int i6 = this.f22000e;
        this.f22000e = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    /* JADX INFO: renamed from: a */
    public final void mo9371a(byte[] bArr, int i2, int i3) throws IOException {
        m9506D(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: e */
    public final void mo9481e(int i2, int i3) {
        mo9497u((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: f */
    public final void mo9482f(int i2, int i3) {
        m9507E(20);
        m9509G(i2 << 3);
        if (i3 >= 0) {
            m9509G(i3);
        } else {
            m9503A(i3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: g */
    public final void mo9483g(int i2, int i3) {
        m9507E(20);
        m9509G(i2 << 3);
        m9509G(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: h */
    public final void mo9484h(int i2, int i3) {
        m9507E(14);
        m9509G((i2 << 3) | 5);
        m9504B(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: i */
    public final void mo9485i(int i2, long j2) {
        m9507E(20);
        m9509G(i2 << 3);
        m9503A(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: j */
    public final void mo9486j(int i2, long j2) {
        m9507E(18);
        m9509G((i2 << 3) | 1);
        m9505C(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: k */
    public final void mo9487k(int i2, boolean z) {
        m9507E(11);
        m9509G(i2 << 3);
        int i3 = this.f22000e;
        this.f21998c[i3] = z ? (byte) 1 : (byte) 0;
        this.f22000e = i3 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: l */
    public final void mo9488l(int i2, String str) throws IOException {
        mo9497u((i2 << 3) | 2);
        mo9501y(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: m */
    public final void mo9489m(int i2, zzacr zzacrVar) {
        mo9497u((i2 << 3) | 2);
        mo9490n(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: n */
    public final void mo9490n(zzacr zzacrVar) {
        mo9497u(zzacrVar.mo9373b());
        zzacrVar.mo9376h(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: o */
    public final void mo9491o(int i2, byte[] bArr) throws IOException {
        mo9497u(i2);
        m9506D(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: p */
    public final void mo9492p(int i2, zzafc zzafcVar) {
        mo9497u(11);
        mo9483g(2, i2);
        mo9497u(26);
        mo9494r(zzafcVar);
        mo9497u(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: q */
    public final void mo9493q(int i2, zzacr zzacrVar) {
        mo9497u(11);
        mo9483g(2, i2);
        mo9489m(3, zzacrVar);
        mo9497u(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: r */
    public final void mo9494r(zzafc zzafcVar) {
        mo9497u(zzafcVar.mo9567f());
        zzafcVar.mo9349g(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: s */
    public final void mo9495s(byte b) {
        if (this.f22000e == this.f21999d) {
            m9508F();
        }
        int i2 = this.f22000e;
        this.f21998c[i2] = b;
        this.f22000e = i2 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: t */
    public final void mo9496t(int i2) {
        if (i2 >= 0) {
            mo9497u(i2);
        } else {
            mo9499w(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: u */
    public final void mo9497u(int i2) {
        m9507E(5);
        m9509G(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: v */
    public final void mo9498v(int i2) {
        m9507E(4);
        m9504B(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: w */
    public final void mo9499w(long j2) {
        m9507E(10);
        m9503A(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: x */
    public final void mo9500x(long j2) {
        m9507E(8);
        m9505C(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: y */
    public final void mo9501y(String str) throws IOException {
        int length = str.length() * 3;
        int iM9510b = zzada.m9510b(length);
        int i2 = iM9510b + length;
        int i3 = this.f21999d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iM9718c = zzagl.m9718c(str, bArr, 0, length);
            mo9497u(iM9718c);
            m9506D(bArr, 0, iM9718c);
            return;
        }
        if (i2 > i3 - this.f22000e) {
            m9508F();
        }
        int iM9510b2 = zzada.m9510b(str.length());
        int i4 = this.f22000e;
        byte[] bArr2 = this.f21998c;
        try {
            if (iM9510b2 == iM9510b) {
                int i5 = i4 + iM9510b2;
                this.f22000e = i5;
                int iM9718c2 = zzagl.m9718c(str, bArr2, i5, i3 - i5);
                this.f22000e = i4;
                m9509G((iM9718c2 - i4) - iM9510b2);
                this.f22000e = iM9718c2;
            } else {
                int iM9717b = zzagl.m9717b(str);
                m9509G(iM9717b);
                this.f22000e = zzagl.m9718c(str, bArr2, this.f22000e, iM9717b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: z */
    public final int mo9502z() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
