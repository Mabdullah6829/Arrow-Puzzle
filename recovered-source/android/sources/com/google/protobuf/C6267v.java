package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.protobuf.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6267v extends AbstractC6269w {

    /* JADX INFO: renamed from: f */
    public final byte[] f24270f;

    /* JADX INFO: renamed from: g */
    public final int f24271g;

    /* JADX INFO: renamed from: h */
    public int f24272h;

    /* JADX INFO: renamed from: i */
    public final OutputStream f24273i;

    public C6267v(OutputStream outputStream, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i2, 20);
        this.f24270f = new byte[iMax];
        this.f24271g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f24273i = outputStream;
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: H */
    public final void mo11996H(byte b) {
        if (this.f24272h == this.f24271g) {
            m12026g0();
        }
        int i2 = this.f24272h;
        this.f24272h = i2 + 1;
        this.f24270f[i2] = b;
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: I */
    public final void mo11997I(int i2, boolean z) {
        m12027h0(11);
        m12023d0(i2, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i3 = this.f24272h;
        this.f24272h = i3 + 1;
        this.f24270f[i3] = b;
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: J */
    public final void mo11998J(int i2, byte[] bArr) throws IOException {
        mo12013Y(i2);
        m12028i0(bArr, 0, i2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: K */
    public final void mo11999K(int i2, AbstractC6251n abstractC6251n) {
        mo12011W(i2, 2);
        mo12000L(abstractC6251n);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: L */
    public final void mo12000L(AbstractC6251n abstractC6251n) {
        mo12013Y(abstractC6251n.size());
        abstractC6251n.mo11730z(this);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: M */
    public final void mo12001M(int i2, int i3) {
        m12027h0(14);
        m12023d0(i2, 5);
        m12021b0(i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: N */
    public final void mo12002N(int i2) {
        m12027h0(4);
        m12021b0(i2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: O */
    public final void mo12003O(int i2, long j2) {
        m12027h0(18);
        m12023d0(i2, 1);
        m12022c0(j2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: P */
    public final void mo12004P(long j2) {
        m12027h0(8);
        m12022c0(j2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Q */
    public final void mo12005Q(int i2, int i3) {
        m12027h0(20);
        m12023d0(i2, 0);
        if (i3 >= 0) {
            m12024e0(i3);
        } else {
            m12025f0(i3);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: R */
    public final void mo12006R(int i2) {
        if (i2 >= 0) {
            mo12013Y(i2);
        } else {
            mo12015a0(i2);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: S */
    public final void mo12007S(int i2, InterfaceC6262s0 interfaceC6262s0, InterfaceC6178I0 interfaceC6178I0) {
        mo12011W(i2, 2);
        mo12013Y(((AbstractC6218c) interfaceC6262s0).getSerializedSize(interfaceC6178I0));
        interfaceC6178I0.mo11731a(interfaceC6262s0, this.f24291c);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: T */
    public final void mo12008T(InterfaceC6262s0 interfaceC6262s0) {
        mo12013Y(interfaceC6262s0.getSerializedSize());
        interfaceC6262s0.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: U */
    public final void mo12009U(int i2, String str) throws IOException {
        mo12011W(i2, 2);
        mo12010V(str);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: V */
    public final void mo12010V(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM12070E = AbstractC6269w.m12070E(length);
            int i2 = iM12070E + length;
            int i3 = this.f24271g;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iMo11802q = AbstractC6232g1.f24178a.mo11802q(str, bArr, 0, length);
                mo12013Y(iMo11802q);
                m12028i0(bArr, 0, iMo11802q);
                return;
            }
            if (i2 > i3 - this.f24272h) {
                m12026g0();
            }
            int iM12070E2 = AbstractC6269w.m12070E(str.length());
            int i4 = this.f24272h;
            byte[] bArr2 = this.f24270f;
            try {
                if (iM12070E2 == iM12070E) {
                    int i5 = i4 + iM12070E2;
                    this.f24272h = i5;
                    int iMo11802q2 = AbstractC6232g1.f24178a.mo11802q(str, bArr2, i5, i3 - i5);
                    this.f24272h = i4;
                    m12024e0((iMo11802q2 - i4) - iM12070E2);
                    this.f24272h = iMo11802q2;
                } else {
                    int iM11884c = AbstractC6232g1.m11884c(str);
                    m12024e0(iM11884c);
                    this.f24272h = AbstractC6232g1.f24178a.mo11802q(str, bArr2, this.f24272h, iM11884c);
                }
            } catch (C6229f1 e) {
                this.f24272h = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (C6229f1 e3) {
            m12073G(str, e3);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: W */
    public final void mo12011W(int i2, int i3) {
        mo12013Y((i2 << 3) | i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: X */
    public final void mo12012X(int i2, int i3) {
        m12027h0(20);
        m12023d0(i2, 0);
        m12024e0(i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Y */
    public final void mo12013Y(int i2) {
        m12027h0(5);
        m12024e0(i2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Z */
    public final void mo12014Z(int i2, long j2) {
        m12027h0(20);
        m12023d0(i2, 0);
        m12025f0(j2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: a0 */
    public final void mo12015a0(long j2) {
        m12027h0(10);
        m12025f0(j2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m12021b0(int i2) {
        int i3 = this.f24272h;
        int i4 = i3 + 1;
        this.f24272h = i4;
        byte[] bArr = this.f24270f;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f24272h = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f24272h = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f24272h = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12022c0(long j2) {
        int i2 = this.f24272h;
        int i3 = i2 + 1;
        this.f24272h = i3;
        byte[] bArr = this.f24270f;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f24272h = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f24272h = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f24272h = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f24272h = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i2 + 6;
        this.f24272h = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i2 + 7;
        this.f24272h = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f24272h = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m12023d0(int i2, int i3) {
        m12024e0((i2 << 3) | i3);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m12024e0(int i2) {
        boolean z = AbstractC6269w.f24290e;
        byte[] bArr = this.f24270f;
        if (z) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f24272h;
                this.f24272h = i3 + 1;
                AbstractC6223d1.m11870k(bArr, i3, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            int i4 = this.f24272h;
            this.f24272h = i4 + 1;
            AbstractC6223d1.m11870k(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f24272h;
            this.f24272h = i5 + 1;
            bArr[i5] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
        }
        int i6 = this.f24272h;
        this.f24272h = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12025f0(long j2) {
        boolean z = AbstractC6269w.f24290e;
        byte[] bArr = this.f24270f;
        if (z) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f24272h;
                this.f24272h = i2 + 1;
                AbstractC6223d1.m11870k(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            int i3 = this.f24272h;
            this.f24272h = i3 + 1;
            AbstractC6223d1.m11870k(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f24272h;
            this.f24272h = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        int i5 = this.f24272h;
        this.f24272h = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m12026g0() {
        this.f24273i.write(this.f24270f, 0, this.f24272h);
        this.f24272h = 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m12027h0(int i2) {
        if (this.f24271g - this.f24272h < i2) {
            m12026g0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m12028i0(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f24272h;
        int i5 = this.f24271g;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f24270f;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f24272h += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f24272h = i5;
        m12026g0();
        if (i8 > i5) {
            this.f24273i.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f24272h = i8;
        }
    }

    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: y */
    public final void mo11805y(byte[] bArr, int i2, int i3) throws IOException {
        m12028i0(bArr, i2, i3);
    }
}
