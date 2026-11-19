package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6259r extends AbstractC6261s {

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f24251d;

    /* JADX INFO: renamed from: e */
    public final long f24252e;

    /* JADX INFO: renamed from: f */
    public long f24253f;

    /* JADX INFO: renamed from: g */
    public long f24254g;

    /* JADX INFO: renamed from: h */
    public final long f24255h;

    /* JADX INFO: renamed from: i */
    public int f24256i;

    /* JADX INFO: renamed from: j */
    public int f24257j;

    /* JADX INFO: renamed from: k */
    public int f24258k = Integer.MAX_VALUE;

    public C6259r(ByteBuffer byteBuffer, boolean z) {
        this.f24251d = byteBuffer;
        long jM11853j = AbstractC6223d1.f24164c.m11853j(byteBuffer, AbstractC6223d1.f24168g);
        this.f24252e = jM11853j;
        this.f24253f = ((long) byteBuffer.limit()) + jM11853j;
        long jPosition = jM11853j + ((long) byteBuffer.position());
        this.f24254g = jPosition;
        this.f24255h = jPosition;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: A */
    public final int mo11902A() {
        return m11959G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: B */
    public final long mo11903B() {
        return m11960H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: C */
    public final boolean mo11904C(int i2) throws InvalidProtocolBufferException {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                m11963K(8);
                return true;
            }
            if (i3 == 2) {
                m11963K(m11959G());
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
            m11963K(4);
            return true;
        }
        if (((int) (this.f24253f - this.f24254g)) >= 10) {
            while (i4 < 10) {
                long j2 = this.f24254g;
                this.f24254g = j2 + 1;
                if (AbstractC6223d1.f24164c.mo11836e(j2) < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.m11741e();
        }
        while (i4 < 10) {
            long j3 = this.f24254g;
            if (j3 == this.f24253f) {
                throw InvalidProtocolBufferException.m11744h();
            }
            this.f24254g = j3 + 1;
            if (AbstractC6223d1.f24164c.mo11836e(j3) < 0) {
                i4++;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final int m11957E() throws InvalidProtocolBufferException {
        long j2 = this.f24254g;
        if (this.f24253f - j2 < 4) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24254g = 4 + j2;
        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
        return ((abstractC6220c1.mo11836e(j2 + 3) & 255) << 24) | (abstractC6220c1.mo11836e(j2) & 255) | ((abstractC6220c1.mo11836e(1 + j2) & 255) << 8) | ((abstractC6220c1.mo11836e(2 + j2) & 255) << 16);
    }

    /* JADX INFO: renamed from: F */
    public final long m11958F() throws InvalidProtocolBufferException {
        long j2 = this.f24254g;
        if (this.f24253f - j2 < 8) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24254g = 8 + j2;
        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
        return ((((long) abstractC6220c1.mo11836e(j2 + 7)) & 255) << 56) | (((long) abstractC6220c1.mo11836e(j2)) & 255) | ((((long) abstractC6220c1.mo11836e(1 + j2)) & 255) << 8) | ((((long) abstractC6220c1.mo11836e(2 + j2)) & 255) << 16) | ((((long) abstractC6220c1.mo11836e(3 + j2)) & 255) << 24) | ((((long) abstractC6220c1.mo11836e(4 + j2)) & 255) << 32) | ((((long) abstractC6220c1.mo11836e(5 + j2)) & 255) << 40) | ((((long) abstractC6220c1.mo11836e(6 + j2)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.mo11836e(r8) < 0) goto L34;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m11959G() {
        /*
            r12 = this;
            long r0 = r12.f24254g
            long r2 = r12.f24253f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.c1 r4 = com.google.protobuf.AbstractC6223d1.f24164c
            byte r5 = r4.mo11836e(r0)
            if (r5 < 0) goto L18
            r12.f24254g = r2
            return r5
        L18:
            long r6 = r12.f24253f
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.mo11836e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.mo11836e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.mo11836e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.mo11836e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.mo11836e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.mo11836e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.mo11836e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.mo11836e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.mo11836e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.m11961I()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f24254g = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6259r.m11959G():int");
    }

    /* JADX INFO: renamed from: H */
    public final long m11960H() {
        long j2;
        long j3;
        long j4;
        int i2;
        long j5 = this.f24254g;
        if (this.f24253f != j5) {
            long j6 = 1 + j5;
            AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
            byte bMo11836e = abstractC6220c1.mo11836e(j5);
            if (bMo11836e >= 0) {
                this.f24254g = j6;
                return bMo11836e;
            }
            if (this.f24253f - j6 >= 9) {
                long j7 = 2 + j5;
                int iMo11836e = (abstractC6220c1.mo11836e(j6) << 7) ^ bMo11836e;
                if (iMo11836e >= 0) {
                    long j8 = 3 + j5;
                    int iMo11836e2 = iMo11836e ^ (abstractC6220c1.mo11836e(j7) << 14);
                    if (iMo11836e2 < 0) {
                        j7 = j5 + 4;
                        int iMo11836e3 = iMo11836e2 ^ (abstractC6220c1.mo11836e(j8) << 21);
                        if (iMo11836e3 < 0) {
                            i2 = (-2080896) ^ iMo11836e3;
                        } else {
                            j8 = 5 + j5;
                            long jMo11836e = ((long) iMo11836e3) ^ (((long) abstractC6220c1.mo11836e(j7)) << 28);
                            if (jMo11836e >= 0) {
                                j4 = 266354560;
                            } else {
                                long j9 = 6 + j5;
                                long jMo11836e2 = jMo11836e ^ (((long) abstractC6220c1.mo11836e(j8)) << 35);
                                if (jMo11836e2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j8 = 7 + j5;
                                    jMo11836e = jMo11836e2 ^ (((long) abstractC6220c1.mo11836e(j9)) << 42);
                                    if (jMo11836e >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j5;
                                        jMo11836e2 = jMo11836e ^ (((long) abstractC6220c1.mo11836e(j8)) << 49);
                                        if (jMo11836e2 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = j5 + 9;
                                            long jMo11836e3 = (jMo11836e2 ^ (((long) abstractC6220c1.mo11836e(j9)) << 56)) ^ 71499008037633920L;
                                            if (jMo11836e3 < 0) {
                                                long j11 = j5 + 10;
                                                if (abstractC6220c1.mo11836e(j10) >= 0) {
                                                    j7 = j11;
                                                    j2 = jMo11836e3;
                                                }
                                            } else {
                                                j2 = jMo11836e3;
                                                j7 = j10;
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ jMo11836e2;
                                j7 = j9;
                            }
                            j2 = j4 ^ jMo11836e;
                        }
                        this.f24254g = j7;
                        return j2;
                    }
                    j2 = iMo11836e2 ^ 16256;
                    j7 = j8;
                    this.f24254g = j7;
                    return j2;
                }
                i2 = iMo11836e ^ (-128);
                j2 = i2;
                this.f24254g = j7;
                return j2;
            }
        }
        return m11961I();
    }

    /* JADX INFO: renamed from: I */
    public final long m11961I() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            long j3 = this.f24254g;
            if (j3 == this.f24253f) {
                throw InvalidProtocolBufferException.m11744h();
            }
            this.f24254g = 1 + j3;
            byte bMo11836e = AbstractC6223d1.f24164c.mo11836e(j3);
            j2 |= ((long) (bMo11836e & 127)) << i2;
            if ((bMo11836e & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
    }

    /* JADX INFO: renamed from: J */
    public final void m11962J() {
        long j2 = this.f24253f + ((long) this.f24256i);
        this.f24253f = j2;
        int i2 = (int) (j2 - this.f24255h);
        int i3 = this.f24258k;
        if (i2 <= i3) {
            this.f24256i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f24256i = i4;
        this.f24253f = j2 - ((long) i4);
    }

    /* JADX INFO: renamed from: K */
    public final void m11963K(int i2) throws InvalidProtocolBufferException {
        if (i2 >= 0) {
            long j2 = this.f24253f;
            long j3 = this.f24254g;
            if (i2 <= ((int) (j2 - j3))) {
                this.f24254g = j3 + ((long) i2);
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
        if (this.f24257j != i2) {
            throw InvalidProtocolBufferException.m11737a();
        }
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: d */
    public final int mo11913d() {
        return (int) (this.f24254g - this.f24255h);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: e */
    public final boolean mo11914e() {
        return this.f24254g == this.f24253f;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: h */
    public final void mo11915h(int i2) {
        this.f24258k = i2;
        m11962J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: i */
    public final int mo11916i(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int iMo11913d = mo11913d() + i2;
        int i3 = this.f24258k;
        if (iMo11913d > i3) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24258k = iMo11913d;
        m11962J();
        return i3;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: j */
    public final boolean mo11917j() {
        return m11960H() != 0;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: k */
    public final C6248m mo11918k() throws InvalidProtocolBufferException {
        int iM11959G = m11959G();
        if (iM11959G > 0) {
            long j2 = this.f24253f;
            long j3 = this.f24254g;
            if (iM11959G <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iM11959G];
                long j4 = iM11959G;
                AbstractC6223d1.f24164c.mo11834c(j3, bArr, 0L, j4);
                this.f24254g += j4;
                C6248m c6248m = AbstractC6251n.f24219t;
                return new C6248m(bArr);
            }
        }
        if (iM11959G == 0) {
            return AbstractC6251n.f24219t;
        }
        if (iM11959G < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: l */
    public final double mo11919l() {
        return Double.longBitsToDouble(m11958F());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: m */
    public final int mo11920m() {
        return m11959G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: n */
    public final int mo11921n() {
        return m11957E();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: o */
    public final long mo11922o() {
        return m11958F();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: p */
    public final float mo11923p() {
        return Float.intBitsToFloat(m11957E());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: q */
    public final int mo11924q() {
        return m11959G();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: r */
    public final long mo11925r() {
        return m11960H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: t */
    public final int mo11926t() {
        return m11957E();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: u */
    public final long mo11927u() {
        return m11958F();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: v */
    public final int mo11928v() {
        return AbstractC6261s.m11964b(m11959G());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: w */
    public final long mo11929w() {
        return AbstractC6261s.m11965c(m11960H());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: x */
    public final String mo11930x() throws InvalidProtocolBufferException {
        int iM11959G = m11959G();
        if (iM11959G > 0) {
            long j2 = this.f24253f;
            long j3 = this.f24254g;
            if (iM11959G <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iM11959G];
                long j4 = iM11959G;
                AbstractC6223d1.f24164c.mo11834c(j3, bArr, 0L, j4);
                String str = new String(bArr, AbstractC6213a0.f24134a);
                this.f24254g += j4;
                return str;
            }
        }
        if (iM11959G == 0) {
            return "";
        }
        if (iM11959G < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: y */
    public final String mo11931y() throws InvalidProtocolBufferException {
        int iM11959G = m11959G();
        if (iM11959G > 0) {
            long j2 = this.f24253f;
            long j3 = this.f24254g;
            if (iM11959G <= ((int) (j2 - j3))) {
                String strM11883b = AbstractC6232g1.m11883b(this.f24251d, (int) (j3 - this.f24252e), iM11959G);
                this.f24254g += (long) iM11959G;
                return strM11883b;
            }
        }
        if (iM11959G == 0) {
            return "";
        }
        if (iM11959G <= 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: z */
    public final int mo11932z() throws InvalidProtocolBufferException {
        if (mo11914e()) {
            this.f24257j = 0;
            return 0;
        }
        int iM11959G = m11959G();
        this.f24257j = iM11959G;
        if ((iM11959G >>> 3) != 0) {
            return iM11959G;
        }
        throw InvalidProtocolBufferException.m11738b();
    }
}
