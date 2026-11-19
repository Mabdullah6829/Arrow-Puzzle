package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6257q extends AbstractC6261s {

    /* JADX INFO: renamed from: d */
    public final InputStream f24243d;

    /* JADX INFO: renamed from: e */
    public final byte[] f24244e;

    /* JADX INFO: renamed from: f */
    public int f24245f;

    /* JADX INFO: renamed from: g */
    public int f24246g;

    /* JADX INFO: renamed from: h */
    public int f24247h;

    /* JADX INFO: renamed from: i */
    public int f24248i;

    /* JADX INFO: renamed from: j */
    public int f24249j;

    /* JADX INFO: renamed from: k */
    public int f24250k = Integer.MAX_VALUE;

    public C6257q(InputStream inputStream) {
        AbstractC6213a0.m11832a(inputStream, "input");
        this.f24243d = inputStream;
        this.f24244e = new byte[4096];
        this.f24245f = 0;
        this.f24247h = 0;
        this.f24249j = 0;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: A */
    public final int mo11902A() {
        return m11950J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: B */
    public final long mo11903B() {
        return m11951K();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: C */
    public final boolean mo11904C(int i2) throws InvalidProtocolBufferException {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                m11955O(8);
                return true;
            }
            if (i3 == 2) {
                m11955O(m11950J());
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
            m11955O(4);
            return true;
        }
        int i5 = this.f24245f - this.f24247h;
        byte[] bArr = this.f24244e;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f24247h;
                this.f24247h = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw InvalidProtocolBufferException.m11741e();
        }
        while (i4 < 10) {
            if (this.f24247h == this.f24245f) {
                m11954N(1);
            }
            int i7 = this.f24247h;
            this.f24247h = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final byte[] m11945E(int i2) throws IOException {
        byte[] bArrM11946F = m11946F(i2);
        if (bArrM11946F != null) {
            return bArrM11946F;
        }
        int i3 = this.f24247h;
        int i4 = this.f24245f;
        int length = i4 - i3;
        this.f24249j += i4;
        this.f24247h = 0;
        this.f24245f = 0;
        ArrayList arrayListM11947G = m11947G(i2 - length);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f24244e, i3, bArr, 0, length);
        int size = arrayListM11947G.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListM11947G.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m11946F(int i2) throws IOException {
        if (i2 == 0) {
            return AbstractC6213a0.f24135b;
        }
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int i3 = this.f24249j;
        int i4 = this.f24247h;
        int i5 = i3 + i4 + i2;
        if (i5 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.f24250k;
        if (i5 > i6) {
            m11955O((i6 - i3) - i4);
            throw InvalidProtocolBufferException.m11744h();
        }
        int i7 = this.f24245f - i4;
        int i8 = i2 - i7;
        InputStream inputStream = this.f24243d;
        if (i8 >= 4096) {
            try {
                if (i8 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f24088s = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f24244e, this.f24247h, bArr, 0, i7);
        this.f24249j += this.f24245f;
        this.f24247h = 0;
        this.f24245f = 0;
        while (i7 < i2) {
            try {
                int i9 = inputStream.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                this.f24249j += i9;
                i7 += i9;
            } catch (InvalidProtocolBufferException e2) {
                e2.f24088s = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m11947G(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.f24243d.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw InvalidProtocolBufferException.m11744h();
                }
                this.f24249j += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final int m11948H() throws InvalidProtocolBufferException {
        int i2 = this.f24247h;
        if (this.f24245f - i2 < 4) {
            m11954N(4);
            i2 = this.f24247h;
        }
        this.f24247h = i2 + 4;
        byte[] bArr = this.f24244e;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: I */
    public final long m11949I() throws InvalidProtocolBufferException {
        int i2 = this.f24247h;
        if (this.f24245f - i2 < 8) {
            m11954N(8);
            i2 = this.f24247h;
        }
        this.f24247h = i2 + 8;
        byte[] bArr = this.f24244e;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: J */
    public final int m11950J() {
        int i2;
        int i3 = this.f24247h;
        int i4 = this.f24245f;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f24244e;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f24247h = i5;
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
                this.f24247h = i6;
                return i2;
            }
        }
        return (int) m11952L();
    }

    /* JADX INFO: renamed from: K */
    public final long m11951K() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2 = this.f24247h;
        int i3 = this.f24245f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f24244e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f24247h = i4;
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
                this.f24247h = i5;
                return j2;
            }
        }
        return m11952L();
    }

    /* JADX INFO: renamed from: L */
    public final long m11952L() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f24247h == this.f24245f) {
                m11954N(1);
            }
            int i3 = this.f24247h;
            this.f24247h = i3 + 1;
            byte b = this.f24244e[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.m11741e();
    }

    /* JADX INFO: renamed from: M */
    public final void m11953M() {
        int i2 = this.f24245f + this.f24246g;
        this.f24245f = i2;
        int i3 = this.f24249j + i2;
        int i4 = this.f24250k;
        if (i3 <= i4) {
            this.f24246g = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f24246g = i5;
        this.f24245f = i2 - i5;
    }

    /* JADX INFO: renamed from: N */
    public final void m11954N(int i2) throws InvalidProtocolBufferException {
        if (m11956P(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f24249j) - this.f24247h) {
            throw InvalidProtocolBufferException.m11744h();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: O */
    public final void m11955O(int i2) throws InvalidProtocolBufferException {
        int i3 = this.f24245f;
        int i4 = this.f24247h;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.f24247h = i4 + i2;
            return;
        }
        InputStream inputStream = this.f24243d;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int i5 = this.f24249j;
        int i6 = i5 + i4;
        int i7 = i6 + i2;
        int i8 = this.f24250k;
        if (i7 > i8) {
            m11955O((i8 - i5) - i4);
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24249j = i6;
        int i9 = i3 - i4;
        this.f24245f = 0;
        this.f24247h = 0;
        while (i9 < i2) {
            long j2 = i2 - i9;
            try {
                try {
                    long jSkip = inputStream.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i9 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f24088s = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f24249j += i9;
                m11953M();
                throw th;
            }
        }
        this.f24249j += i9;
        m11953M();
        if (i9 >= i2) {
            return;
        }
        int i10 = this.f24245f;
        int i11 = i10 - this.f24247h;
        this.f24247h = i10;
        m11954N(1);
        while (true) {
            int i12 = i2 - i11;
            int i13 = this.f24245f;
            if (i12 <= i13) {
                this.f24247h = i12;
                return;
            } else {
                i11 += i13;
                this.f24247h = i13;
                m11954N(1);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m11956P(int i2) throws IOException {
        InputStream inputStream = this.f24243d;
        int i3 = this.f24247h;
        int i4 = i3 + i2;
        int i5 = this.f24245f;
        if (i4 <= i5) {
            throw new IllegalStateException(AbstractC0271e0.m397e(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i6 = this.f24249j;
        if (i2 <= (Integer.MAX_VALUE - i6) - i3 && i6 + i3 + i2 <= this.f24250k) {
            byte[] bArr = this.f24244e;
            if (i3 > 0) {
                if (i5 > i3) {
                    System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                }
                this.f24249j += i3;
                this.f24245f -= i3;
                this.f24247h = 0;
            }
            int i7 = this.f24245f;
            try {
                int i8 = inputStream.read(bArr, i7, Math.min(bArr.length - i7, (Integer.MAX_VALUE - this.f24249j) - i7));
                if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 > 0) {
                    this.f24245f += i8;
                    m11953M();
                    if (this.f24245f >= i2) {
                        return true;
                    }
                    return m11956P(i2);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f24088s = true;
                throw e;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: a */
    public final void mo11912a(int i2) throws InvalidProtocolBufferException {
        if (this.f24248i != i2) {
            throw InvalidProtocolBufferException.m11737a();
        }
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: d */
    public final int mo11913d() {
        return this.f24249j + this.f24247h;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: e */
    public final boolean mo11914e() {
        return this.f24247h == this.f24245f && !m11956P(1);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: h */
    public final void mo11915h(int i2) {
        this.f24250k = i2;
        m11953M();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: i */
    public final int mo11916i(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        int i3 = this.f24249j + this.f24247h + i2;
        int i4 = this.f24250k;
        if (i3 > i4) {
            throw InvalidProtocolBufferException.m11744h();
        }
        this.f24250k = i3;
        m11953M();
        return i4;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: j */
    public final boolean mo11917j() {
        return m11951K() != 0;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: k */
    public final C6248m mo11918k() throws IOException {
        int iM11950J = m11950J();
        int i2 = this.f24245f;
        int i3 = this.f24247h;
        int i4 = i2 - i3;
        byte[] bArr = this.f24244e;
        if (iM11950J <= i4 && iM11950J > 0) {
            C6248m c6248mM11896j = AbstractC6251n.m11896j(bArr, i3, iM11950J);
            this.f24247h += iM11950J;
            return c6248mM11896j;
        }
        if (iM11950J == 0) {
            return AbstractC6251n.f24219t;
        }
        if (iM11950J < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        byte[] bArrM11946F = m11946F(iM11950J);
        if (bArrM11946F != null) {
            return AbstractC6251n.m11896j(bArrM11946F, 0, bArrM11946F.length);
        }
        int i5 = this.f24247h;
        int i6 = this.f24245f;
        int length = i6 - i5;
        this.f24249j += i6;
        this.f24247h = 0;
        this.f24245f = 0;
        ArrayList arrayListM11947G = m11947G(iM11950J - length);
        byte[] bArr2 = new byte[iM11950J];
        System.arraycopy(bArr, i5, bArr2, 0, length);
        int size = arrayListM11947G.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayListM11947G.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C6248m c6248m = AbstractC6251n.f24219t;
        return new C6248m(bArr2);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: l */
    public final double mo11919l() {
        return Double.longBitsToDouble(m11949I());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: m */
    public final int mo11920m() {
        return m11950J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: n */
    public final int mo11921n() {
        return m11948H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: o */
    public final long mo11922o() {
        return m11949I();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: p */
    public final float mo11923p() {
        return Float.intBitsToFloat(m11948H());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: q */
    public final int mo11924q() {
        return m11950J();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: r */
    public final long mo11925r() {
        return m11951K();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: t */
    public final int mo11926t() {
        return m11948H();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: u */
    public final long mo11927u() {
        return m11949I();
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: v */
    public final int mo11928v() {
        return AbstractC6261s.m11964b(m11950J());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: w */
    public final long mo11929w() {
        return AbstractC6261s.m11965c(m11951K());
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: x */
    public final String mo11930x() throws InvalidProtocolBufferException {
        int iM11950J = m11950J();
        byte[] bArr = this.f24244e;
        if (iM11950J > 0) {
            int i2 = this.f24245f;
            int i3 = this.f24247h;
            if (iM11950J <= i2 - i3) {
                String str = new String(bArr, i3, iM11950J, AbstractC6213a0.f24134a);
                this.f24247h += iM11950J;
                return str;
            }
        }
        if (iM11950J == 0) {
            return "";
        }
        if (iM11950J < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        if (iM11950J > this.f24245f) {
            return new String(m11945E(iM11950J), AbstractC6213a0.f24134a);
        }
        m11954N(iM11950J);
        String str2 = new String(bArr, this.f24247h, iM11950J, AbstractC6213a0.f24134a);
        this.f24247h += iM11950J;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: y */
    public final String mo11931y() throws IOException {
        int iM11950J = m11950J();
        int i2 = this.f24247h;
        int i3 = this.f24245f;
        int i4 = i3 - i2;
        byte[] bArrM11945E = this.f24244e;
        if (iM11950J <= i4 && iM11950J > 0) {
            this.f24247h = i2 + iM11950J;
        } else {
            if (iM11950J == 0) {
                return "";
            }
            if (iM11950J < 0) {
                throw InvalidProtocolBufferException.m11742f();
            }
            i2 = 0;
            if (iM11950J <= i3) {
                m11954N(iM11950J);
                this.f24247h = iM11950J;
            } else {
                bArrM11945E = m11945E(iM11950J);
            }
        }
        return AbstractC6232g1.f24178a.mo11800j(bArrM11945E, i2, iM11950J);
    }

    @Override // com.google.protobuf.AbstractC6261s
    /* JADX INFO: renamed from: z */
    public final int mo11932z() throws InvalidProtocolBufferException {
        if (mo11914e()) {
            this.f24248i = 0;
            return 0;
        }
        int iM11950J = m11950J();
        this.f24248i = iM11950J;
        if ((iM11950J >>> 3) != 0) {
            return iM11950J;
        }
        throw InvalidProtocolBufferException.m11738b();
    }
}
