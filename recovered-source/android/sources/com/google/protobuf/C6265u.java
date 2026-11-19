package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6265u extends AbstractC6269w {

    /* JADX INFO: renamed from: f */
    public final byte[] f24266f;

    /* JADX INFO: renamed from: g */
    public final int f24267g;

    /* JADX INFO: renamed from: h */
    public int f24268h;

    public C6265u(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i4 = i2 + i3;
        if ((i2 | i3 | (bArr.length - i4)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        this.f24266f = bArr;
        this.f24268h = i2;
        this.f24267g = i4;
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: H */
    public final void mo11996H(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f24266f;
            int i2 = this.f24268h;
            this.f24268h = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: I */
    public final void mo11997I(int i2, boolean z) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 0);
        mo11996H(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: J */
    public final void mo11998J(int i2, byte[] bArr) throws CodedOutputStream$OutOfSpaceException {
        mo12013Y(i2);
        m12017c0(bArr, 0, i2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: K */
    public final void mo11999K(int i2, AbstractC6251n abstractC6251n) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 2);
        mo12000L(abstractC6251n);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: L */
    public final void mo12000L(AbstractC6251n abstractC6251n) throws CodedOutputStream$OutOfSpaceException {
        mo12013Y(abstractC6251n.size());
        abstractC6251n.mo11730z(this);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: M */
    public final void mo12001M(int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 5);
        mo12002N(i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: N */
    public final void mo12002N(int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f24266f;
            int i3 = this.f24268h;
            int i4 = i3 + 1;
            this.f24268h = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i3 + 2;
            this.f24268h = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i3 + 3;
            this.f24268h = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f24268h = i3 + 4;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: O */
    public final void mo12003O(int i2, long j2) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 1);
        mo12004P(j2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: P */
    public final void mo12004P(long j2) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f24266f;
            int i2 = this.f24268h;
            int i3 = i2 + 1;
            this.f24268h = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i2 + 2;
            this.f24268h = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i2 + 3;
            this.f24268h = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i2 + 4;
            this.f24268h = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i2 + 5;
            this.f24268h = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i2 + 6;
            this.f24268h = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i2 + 7;
            this.f24268h = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f24268h = i2 + 8;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Q */
    public final void mo12005Q(int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 0);
        mo12006R(i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: R */
    public final void mo12006R(int i2) throws CodedOutputStream$OutOfSpaceException {
        if (i2 >= 0) {
            mo12013Y(i2);
        } else {
            mo12015a0(i2);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: S */
    public final void mo12007S(int i2, InterfaceC6262s0 interfaceC6262s0, InterfaceC6178I0 interfaceC6178I0) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 2);
        mo12013Y(((AbstractC6218c) interfaceC6262s0).getSerializedSize(interfaceC6178I0));
        interfaceC6178I0.mo11731a(interfaceC6262s0, this.f24291c);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: T */
    public final void mo12008T(InterfaceC6262s0 interfaceC6262s0) throws CodedOutputStream$OutOfSpaceException {
        mo12013Y(interfaceC6262s0.getSerializedSize());
        interfaceC6262s0.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: U */
    public final void mo12009U(int i2, String str) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 2);
        mo12010V(str);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: V */
    public final void mo12010V(String str) throws CodedOutputStream$OutOfSpaceException {
        int i2 = this.f24268h;
        try {
            int iM12070E = AbstractC6269w.m12070E(str.length() * 3);
            int iM12070E2 = AbstractC6269w.m12070E(str.length());
            byte[] bArr = this.f24266f;
            if (iM12070E2 != iM12070E) {
                mo12013Y(AbstractC6232g1.m11884c(str));
                this.f24268h = AbstractC6232g1.f24178a.mo11802q(str, bArr, this.f24268h, m12016b0());
                return;
            }
            int i3 = i2 + iM12070E2;
            this.f24268h = i3;
            int iMo11802q = AbstractC6232g1.f24178a.mo11802q(str, bArr, i3, m12016b0());
            this.f24268h = i2;
            mo12013Y((iMo11802q - i2) - iM12070E2);
            this.f24268h = iMo11802q;
        } catch (C6229f1 e) {
            this.f24268h = i2;
            m12073G(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: W */
    public final void mo12011W(int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        mo12013Y((i2 << 3) | i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: X */
    public final void mo12012X(int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 0);
        mo12013Y(i3);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Y */
    public final void mo12013Y(int i2) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i3 = i2 & (-128);
            byte[] bArr = this.f24266f;
            if (i3 == 0) {
                int i4 = this.f24268h;
                this.f24268h = i4 + 1;
                bArr[i4] = (byte) i2;
                return;
            } else {
                try {
                    int i5 = this.f24268h;
                    this.f24268h = i5 + 1;
                    bArr[i5] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
        }
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: Z */
    public final void mo12014Z(int i2, long j2) throws CodedOutputStream$OutOfSpaceException {
        mo12011W(i2, 0);
        mo12015a0(j2);
    }

    @Override // com.google.protobuf.AbstractC6269w
    /* JADX INFO: renamed from: a0 */
    public final void mo12015a0(long j2) throws CodedOutputStream$OutOfSpaceException {
        boolean z = AbstractC6269w.f24290e;
        byte[] bArr = this.f24266f;
        if (z && m12016b0() >= 10) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f24268h;
                this.f24268h = i2 + 1;
                AbstractC6223d1.m11870k(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            int i3 = this.f24268h;
            this.f24268h = i3 + 1;
            AbstractC6223d1.m11870k(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                int i4 = this.f24268h;
                this.f24268h = i4 + 1;
                bArr[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), 1), e);
            }
        }
        int i5 = this.f24268h;
        this.f24268h = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m12016b0() {
        return this.f24267g - this.f24268h;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12017c0(byte[] bArr, int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i2, this.f24266f, this.f24268h, i3);
            this.f24268h += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24268h), Integer.valueOf(this.f24267g), Integer.valueOf(i3)), e);
        }
    }

    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: y */
    public final void mo11805y(byte[] bArr, int i2, int i3) throws CodedOutputStream$OutOfSpaceException {
        m12017c0(bArr, i2, i3);
    }
}
