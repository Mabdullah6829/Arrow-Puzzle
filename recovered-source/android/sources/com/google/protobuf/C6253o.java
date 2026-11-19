package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6253o extends AbstractC6261s {

    /* JADX INFO: renamed from: d */
    public final byte[] f24224d;

    /* JADX INFO: renamed from: e */
    public int f24225e;

    /* JADX INFO: renamed from: f */
    public int f24226f;

    /* JADX INFO: renamed from: g */
    public int f24227g;

    /* JADX INFO: renamed from: h */
    public final int f24228h;

    /* JADX INFO: renamed from: i */
    public int f24229i;

    /* JADX INFO: renamed from: j */
    public int f24230j = Integer.MAX_VALUE;

    public C6253o(byte[] bArr, int i2, int i3, boolean z) {
        this.f24224d = bArr;
        this.f24225e = i3 + i2;
        this.f24227g = i2;
        this.f24228h = i2;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: A */
    public final int mo11902A() {
        return m11907G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: B */
    public final long mo11903B() {
        return m11908H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: C */
    public final boolean mo11904C(int i2) throws InvalidProtocolBufferException {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                m11911K(8);
                return true;
            }
            if (i3 == 2) {
                m11911K(m11907G());
                return true;
            }
            if (i3 == 3) {
                m11969D();
                mo11912a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            m11911K(4);
            return true;
        }
        int i5 = this.f24225e - this.f24227g;
        byte[] bArr = this.f24224d;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f24227g;
                this.f24227g = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.m11741e();
        }
        while (i4 < 10) {
            int i7 = this.f24227g;
            if (i7 == this.f24225e) {
                throw InvalidProtocolBufferException.m11744h();
            }
            this.f24227g = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final int m11905E() throws InvalidProtocolBufferException {
        int i2 = this.f24227g;
        if (this.f24225e - i2 < 4) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24227g = i2 + 4;
        byte[] bArr = this.f24224d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: F */
    public final long m11906F() throws InvalidProtocolBufferException {
        int i2 = this.f24227g;
        if (this.f24225e - i2 < 8) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24227g = i2 + 8;
        byte[] bArr = this.f24224d;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: G */
    public final int m11907G() {
        int i2;
        int i3 = this.f24227g;
        int i4 = this.f24225e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f24224d;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f24227g = i5;
                return b;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b2 = bArr[i10];
                            int i12 = (i11 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.f24227g = i6;
                return i2;
            }
        }
        return (int) m11909I();
    }

    /* JADX INFO: renamed from: H */
    public final long m11908H() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2 = this.f24227g;
        int i3 = this.f24225e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f24224d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f24227g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    j2 = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            j5 = (-2080896) ^ i10;
                        } else {
                            long j6 = i10;
                            i5 = i2 + 5;
                            long j7 = j6 ^ (((long) bArr[i9]) << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                i9 = i2 + 6;
                                long j8 = j7 ^ (((long) bArr[i5]) << 35);
                                if (j8 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j7 = j8 ^ (((long) bArr[i9]) << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i9 = i2 + 8;
                                        j8 = j7 ^ (((long) bArr[i5]) << 49);
                                        if (j8 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j9 = (j8 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i11;
                                                }
                                            }
                                            j2 = j9;
                                        }
                                    }
                                }
                                j5 = j3 ^ j8;
                            }
                            j2 = j4 ^ j7;
                        }
                        i5 = i9;
                        j2 = j5;
                    }
                }
                this.f24227g = i5;
                return j2;
            }
        }
        return m11909I();
    }

    /* JADX INFO: renamed from: I */
    public final long m11909I() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.f24227g;
            if (i3 == this.f24225e) {
                throw InvalidProtocolBufferException.m11744h();
            }
            this.f24227g = i3 + 1;
            byte b = this.f24224d[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
    }

    /* JADX INFO: renamed from: J */
    public final void m11910J() {
        int i2 = this.f24225e + this.f24226f;
        this.f24225e = i2;
        int i3 = i2 - this.f24228h;
        int i4 = this.f24230j;
        if (i3 <= i4) {
            this.f24226f = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f24226f = i5;
        this.f24225e = i2 - i5;
    }

    /* JADX INFO: renamed from: K */
    public final void m11911K(int i2) throws InvalidProtocolBufferException {
        if (i2 >= 0) {
            int i3 = this.f24225e;
            int i4 = this.f24227g;
            if (i2 <= i3 - i4) {
                this.f24227g = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw InvalidProtocolBufferException.m11744h();
        }
        throw InvalidProtocolBufferException.m11742f();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: a */
    public final void mo11912a(int i2) throws InvalidProtocolBufferException {
        if (this.f24229i != i2) {
            throw InvalidProtocolBufferException.m11737a();
        }
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: d */
    public final int mo11913d() {
        return this.f24227g - this.f24228h;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: e */
    public final boolean mo11914e() {
        return this.f24227g == this.f24225e;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: h */
    public final void mo11915h(int i2) {
        this.f24230j = i2;
        m11910J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: i */
    public final int mo11916i(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int iMo11913d = mo11913d() + i2;
        if (iMo11913d < 0) {
            throw InvalidProtocolBufferException.m11743g();
        }
        int i3 = this.f24230j;
        if (iMo11913d > i3) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24230j = iMo11913d;
        m11910J();
        return i3;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: j */
    public final boolean mo11917j() {
        return m11908H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: k */
    public final C6248m mo11918k() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM11907G = m11907G();
        byte[] bArr = this.f24224d;
        if (iM11907G > 0) {
            int i2 = this.f24225e;
            int i3 = this.f24227g;
            if (iM11907G <= i2 - i3) {
                C6248m c6248mM11896j = AbstractC6251n.m11896j(bArr, i3, iM11907G);
                this.f24227g += iM11907G;
                return c6248mM11896j;
            }
        }
        if (iM11907G == 0) {
            return AbstractC6251n.f24219t;
        }
        if (iM11907G > 0) {
            int i4 = this.f24225e;
            int i5 = this.f24227g;
            if (iM11907G <= i4 - i5) {
                int i6 = iM11907G + i5;
                this.f24227g = i6;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
            } else {
                if (iM11907G <= 0) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                if (iM11907G == 0) {
                    throw InvalidProtocolBufferException.m11742f();
                }
                bArrCopyOfRange = AbstractC6213a0.f24135b;
            }
        } else {
            if (iM11907G <= 0) {
                throw InvalidProtocolBufferException.m11744h();
            }
            if (iM11907G == 0) {
                throw InvalidProtocolBufferException.m11742f();
            }
            bArrCopyOfRange = AbstractC6213a0.f24135b;
        }
        C6248m c6248m = AbstractC6251n.f24219t;
        return new C6248m(bArrCopyOfRange);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: l */
    public final double mo11919l() {
        return Double.longBitsToDouble(m11906F());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: m */
    public final int mo11920m() {
        return m11907G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: n */
    public final int mo11921n() {
        return m11905E();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: o */
    public final long mo11922o() {
        return m11906F();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: p */
    public final float mo11923p() {
        return Float.intBitsToFloat(m11905E());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: q */
    public final int mo11924q() {
        return m11907G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: r */
    public final long mo11925r() {
        return m11908H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: t */
    public final int mo11926t() {
        return m11905E();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: u */
    public final long mo11927u() {
        return m11906F();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: v */
    public final int mo11928v() {
        return AbstractC6261s.m11964b(m11907G());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: w */
    public final long mo11929w() {
        return AbstractC6261s.m11965c(m11908H());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: x */
    public final String mo11930x() throws InvalidProtocolBufferException {
        int iM11907G = m11907G();
        if (iM11907G > 0) {
            int i2 = this.f24225e;
            int i3 = this.f24227g;
            if (iM11907G <= i2 - i3) {
                String str = new String(this.f24224d, i3, iM11907G, AbstractC6213a0.f24134a);
                this.f24227g += iM11907G;
                return str;
            }
        }
        if (iM11907G == 0) {
            return "";
        }
        if (iM11907G < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: y */
    public final String mo11931y() throws InvalidProtocolBufferException {
        int iM11907G = m11907G();
        if (iM11907G > 0) {
            int i2 = this.f24225e;
            int i3 = this.f24227g;
            if (iM11907G <= i2 - i3) {
                String strMo11800j = AbstractC6232g1.f24178a.mo11800j(this.f24224d, i3, iM11907G);
                this.f24227g += iM11907G;
                return strMo11800j;
            }
        }
        if (iM11907G == 0) {
            return "";
        }
        if (iM11907G <= 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: z */
    public final int mo11932z() throws InvalidProtocolBufferException {
        if (mo11914e()) {
            this.f24229i = 0;
            return 0;
        }
        int iM11907G = m11907G();
        this.f24229i = iM11907G;
        if ((iM11907G >>> 3) != 0) {
            return iM11907G;
        }
        throw InvalidProtocolBufferException.m11738b();
    }
}
