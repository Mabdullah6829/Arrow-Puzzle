package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6255p extends AbstractC6261s {

    /* JADX INFO: renamed from: d */
    public final Iterator f24231d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f24232e;

    /* JADX INFO: renamed from: f */
    public int f24233f;

    /* JADX INFO: renamed from: g */
    public int f24234g;

    /* JADX INFO: renamed from: i */
    public int f24236i;

    /* JADX INFO: renamed from: k */
    public long f24238k;

    /* JADX INFO: renamed from: l */
    public long f24239l;

    /* JADX INFO: renamed from: m */
    public long f24240m;

    /* JADX INFO: renamed from: h */
    public int f24235h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public int f24237j = 0;

    public C6255p(ArrayList arrayList, int i2) {
        this.f24233f = i2;
        this.f24231d = arrayList.iterator();
        if (i2 != 0) {
            m11944O();
            return;
        }
        this.f24232e = AbstractC6213a0.f24136c;
        this.f24238k = 0L;
        this.f24239l = 0L;
        this.f24240m = 0L;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: A */
    public final int mo11902A() {
        return m11939J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: B */
    public final long mo11903B() {
        return m11940K();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: C */
    public final boolean mo11904C(int i2) throws InvalidProtocolBufferException {
        int i3 = i2 & 7;
        if (i3 == 0) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (m11935F() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.m11741e();
        }
        if (i3 == 1) {
            m11943N(8);
            return true;
        }
        if (i3 == 2) {
            m11943N(m11939J());
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
        m11943N(4);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final long m11934E() {
        return this.f24240m - this.f24238k;
    }

    /* JADX INFO: renamed from: F */
    public final byte m11935F() throws InvalidProtocolBufferException {
        if (m11934E() == 0) {
            if (!this.f24231d.hasNext()) {
                throw InvalidProtocolBufferException.m11744h();
            }
            m11944O();
        }
        long j2 = this.f24238k;
        this.f24238k = 1 + j2;
        return AbstractC6223d1.f24164c.mo11836e(j2);
    }

    /* JADX INFO: renamed from: G */
    public final void m11936G(int i2, byte[] bArr) throws InvalidProtocolBufferException {
        if (i2 < 0 || i2 > m11942M()) {
            if (i2 > 0) {
                throw InvalidProtocolBufferException.m11744h();
            }
            if (i2 != 0) {
                throw InvalidProtocolBufferException.m11742f();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (m11934E() == 0) {
                if (!this.f24231d.hasNext()) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                m11944O();
            }
            int iMin = Math.min(i3, (int) m11934E());
            long j2 = iMin;
            AbstractC6223d1.f24164c.mo11834c(this.f24238k, bArr, i2 - i3, j2);
            i3 -= iMin;
            this.f24238k += j2;
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m11937H() {
        if (m11934E() < 4) {
            return (m11935F() & 255) | ((m11935F() & 255) << 8) | ((m11935F() & 255) << 16) | ((m11935F() & 255) << 24);
        }
        long j2 = this.f24238k;
        this.f24238k = 4 + j2;
        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
        return ((abstractC6220c1.mo11836e(j2 + 3) & 255) << 24) | (abstractC6220c1.mo11836e(j2) & 255) | ((abstractC6220c1.mo11836e(1 + j2) & 255) << 8) | ((abstractC6220c1.mo11836e(2 + j2) & 255) << 16);
    }

    /* JADX INFO: renamed from: I */
    public final long m11938I() {
        if (m11934E() < 8) {
            return (((long) m11935F()) & 255) | ((((long) m11935F()) & 255) << 8) | ((((long) m11935F()) & 255) << 16) | ((((long) m11935F()) & 255) << 24) | ((((long) m11935F()) & 255) << 32) | ((((long) m11935F()) & 255) << 40) | ((((long) m11935F()) & 255) << 48) | ((((long) m11935F()) & 255) << 56);
        }
        long j2 = this.f24238k;
        this.f24238k = 8 + j2;
        AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
        return (((long) abstractC6220c1.mo11836e(j2)) & 255) | ((((long) abstractC6220c1.mo11836e(j2 + 1)) & 255) << 8) | ((((long) abstractC6220c1.mo11836e(j2 + 2)) & 255) << 16) | ((((long) abstractC6220c1.mo11836e(3 + j2)) & 255) << 24) | ((((long) abstractC6220c1.mo11836e(4 + j2)) & 255) << 32) | ((((long) abstractC6220c1.mo11836e(5 + j2)) & 255) << 40) | ((((long) abstractC6220c1.mo11836e(6 + j2)) & 255) << 48) | ((((long) abstractC6220c1.mo11836e(j2 + 7)) & 255) << 56);
    }

    /* JADX INFO: renamed from: J */
    public final int m11939J() {
        int i2;
        long j2 = this.f24238k;
        if (this.f24240m != j2) {
            long j3 = j2 + 1;
            AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
            byte bMo11836e = abstractC6220c1.mo11836e(j2);
            if (bMo11836e >= 0) {
                this.f24238k++;
                return bMo11836e;
            }
            if (this.f24240m - this.f24238k >= 10) {
                long j4 = 2 + j2;
                int iMo11836e = (abstractC6220c1.mo11836e(j3) << 7) ^ bMo11836e;
                if (iMo11836e < 0) {
                    i2 = iMo11836e ^ (-128);
                } else {
                    long j5 = 3 + j2;
                    int iMo11836e2 = (abstractC6220c1.mo11836e(j4) << 14) ^ iMo11836e;
                    if (iMo11836e2 >= 0) {
                        i2 = iMo11836e2 ^ 16256;
                    } else {
                        long j6 = 4 + j2;
                        int iMo11836e3 = iMo11836e2 ^ (abstractC6220c1.mo11836e(j5) << 21);
                        if (iMo11836e3 < 0) {
                            i2 = (-2080896) ^ iMo11836e3;
                        } else {
                            j5 = 5 + j2;
                            byte bMo11836e2 = abstractC6220c1.mo11836e(j6);
                            int i3 = (iMo11836e3 ^ (bMo11836e2 << 28)) ^ 266354560;
                            if (bMo11836e2 < 0) {
                                j6 = 6 + j2;
                                if (abstractC6220c1.mo11836e(j5) < 0) {
                                    j5 = 7 + j2;
                                    if (abstractC6220c1.mo11836e(j6) < 0) {
                                        j6 = 8 + j2;
                                        if (abstractC6220c1.mo11836e(j5) < 0) {
                                            j5 = 9 + j2;
                                            if (abstractC6220c1.mo11836e(j6) < 0) {
                                                long j7 = j2 + 10;
                                                if (abstractC6220c1.mo11836e(j5) >= 0) {
                                                    i2 = i3;
                                                    j4 = j7;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i3;
                            }
                            i2 = i3;
                        }
                        j4 = j6;
                    }
                    j4 = j5;
                }
                this.f24238k = j4;
                return i2;
            }
        }
        return (int) m11941L();
    }

    /* JADX INFO: renamed from: K */
    public final long m11940K() {
        long j2;
        long j3;
        long j4;
        long j5 = this.f24238k;
        if (this.f24240m != j5) {
            long j6 = j5 + 1;
            AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
            byte bMo11836e = abstractC6220c1.mo11836e(j5);
            if (bMo11836e >= 0) {
                this.f24238k++;
                return bMo11836e;
            }
            if (this.f24240m - this.f24238k >= 10) {
                long j7 = 2 + j5;
                int iMo11836e = (abstractC6220c1.mo11836e(j6) << 7) ^ bMo11836e;
                if (iMo11836e < 0) {
                    j2 = iMo11836e ^ (-128);
                } else {
                    long j8 = 3 + j5;
                    int iMo11836e2 = (abstractC6220c1.mo11836e(j7) << 14) ^ iMo11836e;
                    if (iMo11836e2 >= 0) {
                        j2 = iMo11836e2 ^ 16256;
                    } else {
                        long j9 = 4 + j5;
                        int iMo11836e3 = iMo11836e2 ^ (abstractC6220c1.mo11836e(j8) << 21);
                        if (iMo11836e3 < 0) {
                            j2 = (-2080896) ^ iMo11836e3;
                            j7 = j9;
                        } else {
                            long j10 = 5 + j5;
                            long jMo11836e = (((long) abstractC6220c1.mo11836e(j9)) << 28) ^ ((long) iMo11836e3);
                            if (jMo11836e >= 0) {
                                j4 = 266354560;
                            } else {
                                j8 = 6 + j5;
                                long jMo11836e2 = jMo11836e ^ (((long) abstractC6220c1.mo11836e(j10)) << 35);
                                if (jMo11836e2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j10 = 7 + j5;
                                    jMo11836e = jMo11836e2 ^ (((long) abstractC6220c1.mo11836e(j8)) << 42);
                                    if (jMo11836e >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j5;
                                        jMo11836e2 = jMo11836e ^ (((long) abstractC6220c1.mo11836e(j10)) << 49);
                                        if (jMo11836e2 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j10 = 9 + j5;
                                            long jMo11836e3 = (jMo11836e2 ^ (((long) abstractC6220c1.mo11836e(j8)) << 56)) ^ 71499008037633920L;
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
                            }
                            j2 = j4 ^ jMo11836e;
                            j7 = j10;
                        }
                    }
                    j7 = j8;
                }
                this.f24238k = j7;
                return j2;
            }
        }
        return m11941L();
    }

    /* JADX INFO: renamed from: L */
    public final long m11941L() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bM11935F = m11935F();
            j2 |= ((long) (bM11935F & 127)) << i2;
            if ((bM11935F & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
    }

    /* JADX INFO: renamed from: M */
    public final int m11942M() {
        return (int) ((((long) (this.f24233f - this.f24237j)) - this.f24238k) + this.f24239l);
    }

    /* JADX INFO: renamed from: N */
    public final void m11943N(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0 || i2 > (((long) (this.f24233f - this.f24237j)) - this.f24238k) + this.f24239l) {
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.m11744h();
            }
            throw InvalidProtocolBufferException.m11742f();
        }
        while (i2 > 0) {
            if (m11934E() == 0) {
                if (!this.f24231d.hasNext()) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                m11944O();
            }
            int iMin = Math.min(i2, (int) m11934E());
            i2 -= iMin;
            this.f24238k += (long) iMin;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m11944O() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f24231d.next();
        this.f24232e = byteBuffer;
        this.f24237j += (int) (this.f24238k - this.f24239l);
        long jPosition = byteBuffer.position();
        this.f24238k = jPosition;
        this.f24239l = jPosition;
        this.f24240m = this.f24232e.limit();
        long jM11853j = AbstractC6223d1.f24164c.m11853j(this.f24232e, AbstractC6223d1.f24168g);
        this.f24238k += jM11853j;
        this.f24239l += jM11853j;
        this.f24240m += jM11853j;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: a */
    public final void mo11912a(int i2) throws InvalidProtocolBufferException {
        if (this.f24236i != i2) {
            throw InvalidProtocolBufferException.m11737a();
        }
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: d */
    public final int mo11913d() {
        return (int) ((((long) this.f24237j) + this.f24238k) - this.f24239l);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: e */
    public final boolean mo11914e() {
        return (((long) this.f24237j) + this.f24238k) - this.f24239l == ((long) this.f24233f);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: h */
    public final void mo11915h(int i2) {
        this.f24235h = i2;
        int i3 = this.f24233f + this.f24234g;
        this.f24233f = i3;
        if (i3 <= i2) {
            this.f24234g = 0;
            return;
        }
        int i4 = i3 - i2;
        this.f24234g = i4;
        this.f24233f = i3 - i4;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: i */
    public final int mo11916i(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int iMo11913d = mo11913d() + i2;
        int i3 = this.f24235h;
        if (iMo11913d > i3) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24235h = iMo11913d;
        int i4 = this.f24233f + this.f24234g;
        this.f24233f = i4;
        if (i4 <= iMo11913d) {
            this.f24234g = 0;
            return i3;
        }
        int i5 = i4 - iMo11913d;
        this.f24234g = i5;
        this.f24233f = i4 - i5;
        return i3;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: j */
    public final boolean mo11917j() {
        return m11940K() != 0;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: k */
    public final C6248m mo11918k() throws InvalidProtocolBufferException {
        int iM11939J = m11939J();
        if (iM11939J > 0) {
            long j2 = iM11939J;
            long j3 = this.f24240m;
            long j4 = this.f24238k;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[iM11939J];
                AbstractC6223d1.f24164c.mo11834c(j4, bArr, 0L, j2);
                this.f24238k += j2;
                C6248m c6248m = AbstractC6251n.f24219t;
                return new C6248m(bArr);
            }
        }
        if (iM11939J > 0 && iM11939J <= m11942M()) {
            byte[] bArr2 = new byte[iM11939J];
            m11936G(iM11939J, bArr2);
            C6248m c6248m2 = AbstractC6251n.f24219t;
            return new C6248m(bArr2);
        }
        if (iM11939J == 0) {
            return AbstractC6251n.f24219t;
        }
        if (iM11939J < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: l */
    public final double mo11919l() {
        return Double.longBitsToDouble(m11938I());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: m */
    public final int mo11920m() {
        return m11939J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: n */
    public final int mo11921n() {
        return m11937H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: o */
    public final long mo11922o() {
        return m11938I();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: p */
    public final float mo11923p() {
        return Float.intBitsToFloat(m11937H());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: q */
    public final int mo11924q() {
        return m11939J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: r */
    public final long mo11925r() {
        return m11940K();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: t */
    public final int mo11926t() {
        return m11937H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: u */
    public final long mo11927u() {
        return m11938I();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: v */
    public final int mo11928v() {
        return AbstractC6261s.m11964b(m11939J());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: w */
    public final long mo11929w() {
        return AbstractC6261s.m11965c(m11940K());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: x */
    public final String mo11930x() throws InvalidProtocolBufferException {
        int iM11939J = m11939J();
        if (iM11939J > 0) {
            long j2 = iM11939J;
            long j3 = this.f24240m;
            long j4 = this.f24238k;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[iM11939J];
                AbstractC6223d1.f24164c.mo11834c(j4, bArr, 0L, j2);
                String str = new String(bArr, AbstractC6213a0.f24134a);
                this.f24238k += j2;
                return str;
            }
        }
        if (iM11939J > 0 && iM11939J <= m11942M()) {
            byte[] bArr2 = new byte[iM11939J];
            m11936G(iM11939J, bArr2);
            return new String(bArr2, AbstractC6213a0.f24134a);
        }
        if (iM11939J == 0) {
            return "";
        }
        if (iM11939J < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: y */
    public final String mo11931y() throws InvalidProtocolBufferException {
        int iM11939J = m11939J();
        if (iM11939J > 0) {
            long j2 = iM11939J;
            long j3 = this.f24240m;
            long j4 = this.f24238k;
            if (j2 <= j3 - j4) {
                String strM11883b = AbstractC6232g1.m11883b(this.f24232e, (int) (j4 - this.f24239l), iM11939J);
                this.f24238k += j2;
                return strM11883b;
            }
        }
        if (iM11939J >= 0 && iM11939J <= m11942M()) {
            byte[] bArr = new byte[iM11939J];
            m11936G(iM11939J, bArr);
            return AbstractC6232g1.f24178a.mo11800j(bArr, 0, iM11939J);
        }
        if (iM11939J == 0) {
            return "";
        }
        if (iM11939J <= 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        throw InvalidProtocolBufferException.m11744h();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: z */
    public final int mo11932z() throws InvalidProtocolBufferException {
        if (mo11914e()) {
            this.f24236i = 0;
            return 0;
        }
        int iM11939J = m11939J();
        this.f24236i = iM11939J;
        if ((iM11939J >>> 3) != 0) {
            return iM11939J;
        }
        throw InvalidProtocolBufferException.m11738b();
    }
}
