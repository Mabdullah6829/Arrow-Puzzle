package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzacs extends zzacv {

    /* JADX INFO: renamed from: d */
    public final byte[] f21974d;

    /* JADX INFO: renamed from: f */
    public int f21976f;

    /* JADX INFO: renamed from: h */
    public int f21978h;

    /* JADX INFO: renamed from: i */
    public int f21979i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f21975e = 0;

    /* JADX INFO: renamed from: g */
    public int f21977g = 0;

    public /* synthetic */ zzacs(byte[] bArr) {
        this.f21974d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: A */
    public final int mo9384A() {
        return mo9396M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: B */
    public final int mo9385B() {
        return mo9397N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: C */
    public final int mo9386C() {
        return m9393J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: D */
    public final long mo9387D() {
        return m9394K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: E */
    public final int mo9388E() {
        return zzacv.m9431j(mo9396M());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: F */
    public final long mo9389F() {
        return zzacv.m9432k(mo9391H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: G */
    public final int mo9390G() {
        return mo9397N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: H */
    public final long mo9391H() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f21977g;
        int i3 = this.f21975e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f21974d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f21977g = i4;
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
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j5 = (-2080896) ^ i10;
                            i5 = i9;
                            j2 = j5;
                        } else {
                            i7 = i2 + 5;
                            long j6 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i11 = i2 + 6;
                                long j7 = j6 ^ (((long) bArr[i7]) << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j6 = j7 ^ (((long) bArr[i11]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j7 = j6 ^ (((long) bArr[i7]) << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            j6 = j7 ^ (((long) bArr[i11]) << 56);
                                            if (j6 >= 0) {
                                                j3 = 71499008037633920L;
                                            } else {
                                                int i12 = i2 + 10;
                                                long j8 = j6 ^ (((long) bArr[i7]) << 63);
                                                if (j8 >= 0) {
                                                    j2 = j8 ^ (-9151873028817141888L);
                                                    i5 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j7 ^ j4;
                                i5 = i11;
                            }
                            j2 = j6 ^ j3;
                        }
                    }
                    i5 = i7;
                }
                this.f21977g = i5;
                return j2;
            }
        }
        return m9392I();
    }

    /* JADX INFO: renamed from: I */
    public final long m9392I() throws zzaeh {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.f21977g;
            if (i3 == this.f21975e) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f21977g = i3 + 1;
            byte b = this.f21974d[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: J */
    public final int m9393J() throws zzaeh {
        int i2 = this.f21977g;
        if (this.f21975e - i2 < 4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21977g = i2 + 4;
        byte[] bArr = this.f21974d;
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX INFO: renamed from: K */
    public final long m9394K() throws zzaeh {
        int i2 = this.f21977g;
        if (this.f21975e - i2 < 8) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21977g = i2 + 8;
        byte[] bArr = this.f21974d;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m9395L(int i2) throws zzaeh {
        if (i2 > 0) {
            int i3 = this.f21975e;
            int i4 = this.f21977g;
            if (i2 <= i3 - i4) {
                int i5 = i2 + i4;
                this.f21977g = i5;
                return Arrays.copyOfRange(this.f21974d, i4, i5);
            }
        }
        if (i2 > 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            return zzaed.f22038a;
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: M */
    public abstract int mo9396M();

    /* JADX INFO: renamed from: N */
    public abstract int mo9397N();

    /* JADX INFO: renamed from: O */
    public final int m9398O() {
        int i2;
        int i3 = this.f21977g;
        int i4 = this.f21975e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f21974d;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f21977g = i5;
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
                this.f21977g = i6;
                return i2;
            }
        }
        return (int) m9392I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: a */
    public final int mo9399a(int i2) {
        if (i2 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.f21977g;
        if (i3 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.f21979i;
        if (i3 > i4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21979i = i3;
        int i5 = this.f21975e + this.f21976f;
        this.f21975e = i5;
        if (i5 <= i3) {
            this.f21976f = 0;
            return i4;
        }
        int i6 = i5 - i3;
        this.f21976f = i6;
        this.f21975e = i5 - i6;
        return i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: b */
    public final void mo9400b(int i2) {
        this.f21979i = i2;
        int i3 = this.f21975e + this.f21976f;
        this.f21975e = i3;
        if (i3 <= i2) {
            this.f21976f = 0;
            return;
        }
        int i4 = i3 - i2;
        this.f21976f = i4;
        this.f21975e = i3 - i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: c */
    public final int mo9401c() {
        int i2 = this.f21979i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f21977g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: d */
    public final boolean mo9402d() {
        return this.f21977g == this.f21975e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: e */
    public final int mo9403e() {
        return this.f21977g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: f */
    public final int mo9404f(byte[] bArr, int i2, int i3) {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, this.f21975e - this.f21977g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f21974d, this.f21977g, bArr, i2, iMin);
        this.f21977g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: g */
    public final void mo9405g(int i2) throws zzaeh {
        if (i2 >= 0) {
            int i3 = this.f21975e;
            int i4 = this.f21977g;
            if (i2 <= i3 - i4) {
                this.f21977g = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: l */
    public final int mo9406l() throws zzaeh {
        if (mo9402d()) {
            this.f21978h = 0;
            return 0;
        }
        int iMo9396M = mo9396M();
        this.f21978h = iMo9396M;
        if ((iMo9396M >>> 3) != 0) {
            return iMo9396M;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: m */
    public final void mo9407m(int i2) throws zzaeh {
        if (this.f21978h != i2) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: n */
    public final boolean mo9408n(int i2) throws zzaeh {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                mo9405g(8);
                return true;
            }
            if (i3 == 2) {
                mo9405g(mo9396M());
                return true;
            }
            if (i3 == 3) {
                m9433i();
                mo9407m(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                if (this.f21989b == 0) {
                    mo9407m(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw new zzaeg();
            }
            mo9405g(4);
            return true;
        }
        int i5 = this.f21975e - this.f21977g;
        byte[] bArr = this.f21974d;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f21977g;
                this.f21977g = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
        }
        while (i4 < 10) {
            int i7 = this.f21977g;
            if (i7 == this.f21975e) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f21977g = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: o */
    public final double mo9409o() {
        return Double.longBitsToDouble(m9394K());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: p */
    public final float mo9410p() {
        return Float.intBitsToFloat(m9393J());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: q */
    public final long mo9411q() {
        return mo9391H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: r */
    public final long mo9412r() {
        return mo9391H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: s */
    public final int mo9413s() {
        return mo9397N();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: t */
    public final long mo9414t() {
        return m9394K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: u */
    public final int mo9415u() {
        return m9393J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: v */
    public final boolean mo9416v() {
        return mo9391H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: w */
    public final String mo9417w() throws zzaeh {
        int iMo9396M = mo9396M();
        if (iMo9396M > 0) {
            int i2 = this.f21975e;
            int i3 = this.f21977g;
            if (iMo9396M <= i2 - i3) {
                String str = new String(this.f21974d, i3, iMo9396M, StandardCharsets.UTF_8);
                this.f21977g += iMo9396M;
                return str;
            }
        }
        if (iMo9396M == 0) {
            return "";
        }
        if (iMo9396M < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: x */
    public final String mo9418x() throws zzaeh {
        int iMo9396M = mo9396M();
        if (iMo9396M > 0) {
            int i2 = this.f21975e;
            int i3 = this.f21977g;
            if (iMo9396M <= i2 - i3) {
                String strM9719d = zzagl.m9719d(this.f21974d, i3, iMo9396M);
                this.f21977g += iMo9396M;
                return strM9719d;
            }
        }
        if (iMo9396M == 0) {
            return "";
        }
        if (iMo9396M <= 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: y */
    public final zzacr mo9419y() throws zzaeh {
        int iMo9396M = mo9396M();
        if (iMo9396M > 0) {
            int i2 = this.f21975e;
            int i3 = this.f21977g;
            if (iMo9396M <= i2 - i3) {
                zzacr zzacrVarM9380n = zzacr.m9380n(this.f21974d, i3, iMo9396M);
                this.f21977g += iMo9396M;
                return zzacrVarM9380n;
            }
        }
        if (iMo9396M == 0) {
            return zzacr.f21972t;
        }
        byte[] bArrM9395L = m9395L(iMo9396M);
        zzacr zzacrVar = zzacr.f21972t;
        return bArrM9395L.length == 0 ? zzacr.f21972t : new zzacq(bArrM9395L);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: z */
    public final byte[] mo9420z() {
        return m9395L(mo9396M());
    }
}
