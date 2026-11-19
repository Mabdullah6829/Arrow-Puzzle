package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzido extends zzidp {

    /* JADX INFO: renamed from: d */
    public final InputStream f19728d;

    /* JADX INFO: renamed from: g */
    public int f19731g;

    /* JADX INFO: renamed from: i */
    public int f19733i;

    /* JADX INFO: renamed from: k */
    public int f19735k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public final byte[] f19729e = new byte[4096];

    /* JADX INFO: renamed from: f */
    public int f19730f = 0;

    /* JADX INFO: renamed from: h */
    public int f19732h = 0;

    /* JADX INFO: renamed from: j */
    public int f19734j = 0;

    public /* synthetic */ zzido(InputStream inputStream) {
        this.f19728d = inputStream;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: A */
    public final long mo8153A() {
        return m8197O();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: B */
    public final int mo8154B() {
        return zzidp.m8200h(m8193K());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: C */
    public final long mo8155C() {
        return zzidp.m8201i(m8194L());
    }

    /* JADX INFO: renamed from: D */
    public final void m8186D(int i2) throws zzifh {
        InputStream inputStream = this.f19728d;
        int i3 = this.f19730f;
        int i4 = this.f19732h;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.f19732h = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f19734j;
        int i7 = i6 + i4;
        int i8 = this.f19735k;
        if (i7 + i2 > i8) {
            m8186D((i8 - i6) - i4);
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19734j = i7;
        this.f19730f = 0;
        this.f19732h = 0;
        while (i5 < i2) {
            long j2 = i2 - i5;
            try {
                try {
                    long jSkip = inputStream.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (zzifh e) {
                    e.f19803s = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f19734j += i5;
                m8187E();
                throw th;
            }
        }
        this.f19734j += i5;
        m8187E();
        if (i5 >= i2) {
            return;
        }
        int i9 = this.f19730f;
        int i10 = i9 - this.f19732h;
        this.f19732h = i9;
        m8188F(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.f19730f;
            if (i11 <= i12) {
                this.f19732h = i11;
                return;
            } else {
                i10 += i12;
                this.f19732h = i12;
                m8188F(1);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8187E() {
        int i2 = this.f19730f + this.f19731g;
        this.f19730f = i2;
        int i3 = this.f19734j + i2;
        int i4 = this.f19735k;
        if (i3 <= i4) {
            this.f19731g = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f19731g = i5;
        this.f19730f = i2 - i5;
    }

    /* JADX INFO: renamed from: F */
    public final void m8188F(int i2) throws zzifh {
        if (m8189G(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f19734j) - this.f19732h) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8189G(int i2) throws IOException {
        InputStream inputStream = this.f19728d;
        int i3 = this.f19732h;
        int i4 = i3 + i2;
        int i5 = this.f19730f;
        if (i4 <= i5) {
            throw new IllegalStateException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 66), "refillBuffer() called when ", i2, " bytes were already available in buffer"));
        }
        int i6 = this.f19734j;
        if (i2 > (Integer.MAX_VALUE - i6) - i3 || i6 + i3 + i2 > this.f19735k) {
            return false;
        }
        byte[] bArr = this.f19729e;
        if (i3 > 0) {
            if (i5 > i3) {
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i6 = this.f19734j + i3;
            this.f19734j = i6;
            i5 = this.f19730f - i3;
            this.f19730f = i5;
            this.f19732h = 0;
        }
        try {
            int i7 = inputStream.read(bArr, i5, Math.min(4096 - i5, (Integer.MAX_VALUE - i6) - i5));
            if (i7 != 0 && i7 >= -1 && i7 <= 4096) {
                if (i7 <= 0) {
                    return false;
                }
                this.f19730f += i7;
                m8187E();
                return this.f19730f >= i2 || m8189G(i2);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + strValueOf.length() + 39 + 41);
            sb.append(strValueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(i7);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (zzifh e) {
            e.f19803s = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: H */
    public final byte[] m8190H(int i2) throws IOException {
        byte[] bArrM8191I = m8191I(i2);
        if (bArrM8191I != null) {
            return bArrM8191I;
        }
        int i3 = this.f19732h;
        int i4 = this.f19730f;
        int i5 = i4 - i3;
        this.f19734j += i4;
        this.f19732h = 0;
        this.f19730f = 0;
        ArrayList arrayListM8192J = m8192J(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f19729e, i3, bArr, 0, i5);
        int size = arrayListM8192J.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM8192J.get(i6);
            i6++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public final byte[] m8191I(int i2) throws IOException {
        if (i2 == 0) {
            return zzifc.f19794a;
        }
        int i3 = this.f19734j;
        int i4 = this.f19732h;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f19735k;
        if (i5 > i6) {
            m8186D((i6 - i3) - i4);
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.f19730f - i4;
        int i8 = i2 - i7;
        InputStream inputStream = this.f19728d;
        if (i8 >= 4096) {
            try {
                if (i8 > inputStream.available()) {
                    return null;
                }
            } catch (zzifh e) {
                e.f19803s = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f19729e, this.f19732h, bArr, 0, i7);
        this.f19734j += this.f19730f;
        this.f19732h = 0;
        this.f19730f = 0;
        while (i7 < i2) {
            try {
                int i9 = inputStream.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f19734j += i9;
                i7 += i9;
            } catch (zzifh e2) {
                e2.f19803s = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: J */
    public final ArrayList m8192J(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                try {
                    int i4 = this.f19728d.read(bArr, i3, iMin - i3);
                    if (i4 == -1) {
                        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f19734j += i4;
                    i3 += i4;
                } catch (zzifh e) {
                    e.f19803s = true;
                    throw e;
                }
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public final int m8193K() {
        int i2;
        int i3 = this.f19732h;
        int i4 = this.f19730f;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f19729e;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f19732h = i5;
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
                this.f19732h = i6;
                return i2;
            }
        }
        return (int) m8195M();
    }

    /* JADX INFO: renamed from: L */
    public final long m8194L() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f19732h;
        int i3 = this.f19730f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f19729e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f19732h = i4;
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
                this.f19732h = i5;
                return j2;
            }
        }
        return m8195M();
    }

    /* JADX INFO: renamed from: M */
    public final long m8195M() throws zzifh {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f19732h == this.f19730f) {
                m8188F(1);
            }
            int i3 = this.f19732h;
            this.f19732h = i3 + 1;
            byte b = this.f19729e[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: N */
    public final int m8196N() throws zzifh {
        int i2 = this.f19732h;
        if (this.f19730f - i2 < 4) {
            m8188F(4);
            i2 = this.f19732h;
        }
        this.f19732h = i2 + 4;
        byte[] bArr = this.f19729e;
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX INFO: renamed from: O */
    public final long m8197O() throws zzifh {
        int i2 = this.f19732h;
        if (this.f19730f - i2 < 8) {
            m8188F(8);
            i2 = this.f19732h;
        }
        this.f19732h = i2 + 8;
        byte[] bArr = this.f19729e;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: a */
    public final int mo8165a(int i2) throws zzifh {
        if (i2 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f19734j + this.f19732h + i2;
        if (i3 < 0) {
            throw new zzifh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.f19735k;
        if (i3 > i4) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f19735k = i3;
        m8187E();
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: b */
    public final void mo8166b(int i2) {
        this.f19735k = i2;
        m8187E();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: c */
    public final boolean mo8167c() {
        return this.f19732h == this.f19730f && !m8189G(1);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: d */
    public final int mo8168d() {
        return this.f19734j + this.f19732h;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: j */
    public final int mo8169j() throws zzifh {
        if (mo8167c()) {
            this.f19733i = 0;
            return 0;
        }
        int iM8193K = m8193K();
        this.f19733i = iM8193K;
        if ((iM8193K >>> 3) != 0) {
            return iM8193K;
        }
        throw new zzifh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: k */
    public final void mo8170k(int i2) throws zzifh {
        if (this.f19733i != i2) {
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
                m8186D(8);
                return true;
            }
            if (i3 == 2) {
                m8186D(m8193K());
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
            m8186D(4);
            return true;
        }
        int i5 = this.f19730f - this.f19732h;
        byte[] bArr = this.f19729e;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f19732h;
                this.f19732h = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw new zzifh("CodedInputStream encountered a malformed varint.");
        }
        while (i4 < 10) {
            if (this.f19732h == this.f19730f) {
                m8188F(1);
            }
            int i7 = this.f19732h;
            this.f19732h = i7 + 1;
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
        return Double.longBitsToDouble(m8197O());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: n */
    public final float mo8173n() {
        return Float.intBitsToFloat(m8196N());
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: o */
    public final long mo8174o() {
        return m8194L();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: p */
    public final long mo8175p() {
        return m8194L();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: q */
    public final int mo8176q() {
        return m8193K();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: r */
    public final long mo8177r() {
        return m8197O();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: s */
    public final int mo8178s() {
        return m8196N();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: t */
    public final boolean mo8179t() {
        return m8194L() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: u */
    public final String mo8180u() throws zzifh {
        int iM8193K = m8193K();
        byte[] bArr = this.f19729e;
        if (iM8193K > 0) {
            int i2 = this.f19730f;
            int i3 = this.f19732h;
            if (iM8193K <= i2 - i3) {
                String str = new String(bArr, i3, iM8193K, StandardCharsets.UTF_8);
                this.f19732h += iM8193K;
                return str;
            }
        }
        if (iM8193K == 0) {
            return "";
        }
        if (iM8193K < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iM8193K > this.f19730f) {
            return new String(m8190H(iM8193K), StandardCharsets.UTF_8);
        }
        m8188F(iM8193K);
        String str2 = new String(bArr, this.f19732h, iM8193K, StandardCharsets.UTF_8);
        this.f19732h += iM8193K;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: v */
    public final String mo8181v() throws IOException {
        int iM8193K = m8193K();
        int i2 = this.f19732h;
        int i3 = this.f19730f;
        int i4 = i3 - i2;
        byte[] bArrM8190H = this.f19729e;
        if (iM8193K <= i4 && iM8193K > 0) {
            this.f19732h = i2 + iM8193K;
        } else {
            if (iM8193K == 0) {
                return "";
            }
            if (iM8193K < 0) {
                throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (iM8193K <= i3) {
                m8188F(iM8193K);
                this.f19732h = iM8193K;
            } else {
                bArrM8190H = m8190H(iM8193K);
            }
        }
        return zzihp.m8489d(bArrM8190H, i2, iM8193K);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: w */
    public final zzidl mo8182w() throws IOException {
        int iM8193K = m8193K();
        int i2 = this.f19730f;
        int i3 = this.f19732h;
        int i4 = i2 - i3;
        byte[] bArr = this.f19729e;
        if (iM8193K <= i4 && iM8193K > 0) {
            zzidl zzidlVarM8150z = zzidl.m8150z(bArr, i3, iM8193K);
            this.f19732h += iM8193K;
            return zzidlVarM8150z;
        }
        if (iM8193K == 0) {
            return zzidl.f19719t;
        }
        if (iM8193K < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrM8191I = m8191I(iM8193K);
        if (bArrM8191I != null) {
            return zzidl.m8150z(bArrM8191I, 0, bArrM8191I.length);
        }
        int i5 = this.f19732h;
        int i6 = this.f19730f;
        int i7 = i6 - i5;
        this.f19734j += i6;
        this.f19732h = 0;
        this.f19730f = 0;
        ArrayList arrayListM8192J = m8192J(iM8193K - i7);
        byte[] bArr2 = new byte[iM8193K];
        System.arraycopy(bArr, i5, bArr2, 0, i7);
        int size = arrayListM8192J.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayListM8192J.get(i8);
            i8++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i7, length);
            i7 += length;
        }
        zzidl zzidlVar = zzidl.f19719t;
        try {
            return iM8193K == 0 ? zzidl.f19719t : new zzidj(bArr2);
        } catch (zzifh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: x */
    public final int mo8183x() {
        return m8193K();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: y */
    public final int mo8184y() {
        return m8193K();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    /* JADX INFO: renamed from: z */
    public final int mo8185z() {
        return m8196N();
    }
}
