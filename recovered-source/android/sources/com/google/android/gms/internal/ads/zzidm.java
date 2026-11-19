package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzidm extends zzidp {

    /* JADX INFO: renamed from: d */
    public final byte[] f19721d;

    /* JADX INFO: renamed from: e */
    public int f19722e;

    /* JADX INFO: renamed from: f */
    public int f19723f;

    /* JADX INFO: renamed from: g */
    public int f19724g;

    /* JADX INFO: renamed from: h */
    public final int f19725h;

    /* JADX INFO: renamed from: i */
    public int f19726i;

    /* JADX INFO: renamed from: j */
    public int f19727j = Integer.MAX_VALUE;

    public /* synthetic */ zzidm(byte[] bArr, int i2, int i3) {
        this.f19721d = bArr;
        this.f19722e = i3 + i2;
        this.f19724g = i2;
        this.f19725h = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: A */
    public final long mo8153A() {
        return m8156D();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: B */
    public final int mo8154B() {
        return zzidp.m8200h(mo8159G());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: C */
    public final long mo8155C() {
        return zzidp.m8201i(m8162J());
    }

    /* JADX INFO: renamed from: D */
    public final long m8156D() throws zzifh {
        int i2 = this.f19724g;
        if (this.f19722e - i2 < 8) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19724g = i2 + 8;
        byte[] bArr = this.f19721d;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: E */
    public final void m8157E(int i2) throws zzifh {
        if (i2 >= 0) {
            int i3 = this.f19722e;
            int i4 = this.f19724g;
            if (i2 <= i3 - i4) {
                this.f19724g = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: F */
    public final void m8158F() {
        int i2 = this.f19722e + this.f19723f;
        this.f19722e = i2;
        int i3 = i2 - this.f19725h;
        int i4 = this.f19727j;
        if (i3 <= i4) {
            this.f19723f = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f19723f = i5;
        this.f19722e = i2 - i5;
    }

    /* JADX INFO: renamed from: G */
    public abstract int mo8159G();

    /* JADX INFO: renamed from: H */
    public abstract int mo8160H();

    /* JADX INFO: renamed from: I */
    public final int m8161I() {
        int i2;
        int i3 = this.f19724g;
        int i4 = this.f19722e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f19721d;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f19724g = i5;
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
                this.f19724g = i6;
                return i2;
            }
        }
        return (int) m8163K();
    }

    /* JADX INFO: renamed from: J */
    public final long m8162J() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f19724g;
        int i3 = this.f19722e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f19721d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f19724g = i4;
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
                this.f19724g = i5;
                return j2;
            }
        }
        return m8163K();
    }

    /* JADX INFO: renamed from: K */
    public final long m8163K() throws zzifh {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.f19724g;
            if (i3 == this.f19722e) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f19724g = i3 + 1;
            byte b = this.f19721d[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: L */
    public final int m8164L() throws zzifh {
        int i2 = this.f19724g;
        if (this.f19722e - i2 < 4) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19724g = i2 + 4;
        byte[] bArr = this.f19721d;
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: a */
    public final int mo8165a(int i2) throws zzifh {
        if (i2 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = (this.f19724g - this.f19725h) + i2;
        if (i3 < 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.f19727j;
        if (i3 > i4) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19727j = i3;
        m8158F();
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: b */
    public final void mo8166b(int i2) {
        this.f19727j = i2;
        m8158F();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: c */
    public final boolean mo8167c() {
        return this.f19724g == this.f19722e;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: d */
    public final int mo8168d() {
        return this.f19724g - this.f19725h;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: j */
    public final int mo8169j() throws zzifh {
        if (mo8167c()) {
            this.f19726i = 0;
            return 0;
        }
        int iMo8159G = mo8159G();
        this.f19726i = iMo8159G;
        if ((iMo8159G >>> 3) != 0) {
            return iMo8159G;
        }
        throw new zzifh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: k */
    public final void mo8170k(int i2) throws zzifh {
        if (this.f19726i != i2) {
            throw new zzifh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: l */
    public final boolean mo8171l(int i2) throws zzifh {
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                m8157E(8);
                return true;
            }
            if (i3 == 2) {
                m8157E(mo8159G());
                return true;
            }
            if (i3 == 3) {
                m8202g();
                mo8170k(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                if (this.f19737b == 0) {
                    mo8170k(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw new zzifg();
            }
            m8157E(4);
            return true;
        }
        int i5 = this.f19722e - this.f19724g;
        byte[] bArr = this.f19721d;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f19724g;
                this.f19724g = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw new zzifh("CodedInputStream encountered a malformed varint.");
        }
        while (i4 < 10) {
            int i7 = this.f19724g;
            if (i7 == this.f19722e) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f19724g = i7 + 1;
            if (bArr[i7] < 0) {
                i4++;
            }
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: m */
    public final double mo8172m() {
        return Double.longBitsToDouble(m8156D());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: n */
    public final float mo8173n() {
        return Float.intBitsToFloat(m8164L());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: o */
    public final long mo8174o() {
        return m8162J();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: p */
    public final long mo8175p() {
        return m8162J();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: q */
    public final int mo8176q() {
        return mo8160H();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: r */
    public final long mo8177r() {
        return m8156D();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: s */
    public final int mo8178s() {
        return m8164L();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: t */
    public final boolean mo8179t() {
        return m8162J() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: u */
    public final String mo8180u() throws zzifh {
        int iMo8159G = mo8159G();
        if (iMo8159G > 0) {
            int i2 = this.f19722e;
            int i3 = this.f19724g;
            if (iMo8159G <= i2 - i3) {
                String str = new String(this.f19721d, i3, iMo8159G, StandardCharsets.UTF_8);
                this.f19724g += iMo8159G;
                return str;
            }
        }
        if (iMo8159G == 0) {
            return "";
        }
        if (iMo8159G < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: v */
    public final String mo8181v() throws zzifh {
        int iMo8159G = mo8159G();
        if (iMo8159G > 0) {
            int i2 = this.f19722e;
            int i3 = this.f19724g;
            if (iMo8159G <= i2 - i3) {
                String strM8489d = zzihp.m8489d(this.f19721d, i3, iMo8159G);
                this.f19724g += iMo8159G;
                return strM8489d;
            }
        }
        if (iMo8159G == 0) {
            return "";
        }
        if (iMo8159G <= 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: w */
    public final zzidl mo8182w() throws zzifh {
        int iMo8159G = mo8159G();
        byte[] bArr = this.f19721d;
        if (iMo8159G > 0) {
            int i2 = this.f19722e;
            int i3 = this.f19724g;
            if (iMo8159G <= i2 - i3) {
                zzidl zzidlVarM8150z = zzidl.m8150z(bArr, i3, iMo8159G);
                this.f19724g += iMo8159G;
                return zzidlVarM8150z;
            }
        }
        if (iMo8159G == 0) {
            return zzidl.f19719t;
        }
        if (iMo8159G > 0) {
            int i4 = this.f19722e;
            int i5 = this.f19724g;
            if (iMo8159G <= i4 - i5) {
                int i6 = iMo8159G + i5;
                this.f19724g = i6;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
                zzidl zzidlVar = zzidl.f19719t;
                return bArrCopyOfRange.length == 0 ? zzidl.f19719t : new zzidj(bArrCopyOfRange);
            }
        }
        if (iMo8159G <= 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: x */
    public final int mo8183x() {
        return mo8159G();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: y */
    public final int mo8184y() {
        return mo8160H();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: z */
    public final int mo8185z() {
        return m8164L();
    }
}
