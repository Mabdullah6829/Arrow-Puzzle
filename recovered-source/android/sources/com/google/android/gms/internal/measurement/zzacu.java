package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzacu extends zzacv {

    /* JADX INFO: renamed from: d */
    public final InputStream f21980d;

    /* JADX INFO: renamed from: e */
    public final byte[] f21981e;

    /* JADX INFO: renamed from: f */
    public int f21982f;

    /* JADX INFO: renamed from: g */
    public int f21983g;

    /* JADX INFO: renamed from: h */
    public int f21984h;

    /* JADX INFO: renamed from: i */
    public int f21985i;

    /* JADX INFO: renamed from: j */
    public int f21986j;

    /* JADX INFO: renamed from: k */
    public int f21987k = Integer.MAX_VALUE;

    public /* synthetic */ zzacu(InputStream inputStream, int i2) {
        this.f21980d = inputStream;
        this.f21981e = new byte[i2 < 8 ? 8 : i2];
        this.f21982f = 0;
        this.f21984h = 0;
        this.f21986j = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: A */
    public final int mo9384A() {
        return mo9390G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: B */
    public final int mo9385B() {
        return mo9390G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: C */
    public final int mo9386C() {
        return m9428P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: D */
    public final long mo9387D() {
        return m9429Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: E */
    public final int mo9388E() {
        return zzacv.m9431j(mo9390G());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: F */
    public final long mo9389F() {
        return zzacv.m9432k(mo9391H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: G */
    public final int mo9390G() {
        int i2;
        int i3 = this.f21984h;
        int i4 = this.f21982f;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f21981e;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f21984h = i5;
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
                this.f21984h = i6;
                return i2;
            }
        }
        return (int) m9427O();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: H */
    public final long mo9391H() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f21984h;
        int i3 = this.f21982f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f21981e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f21984h = i4;
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
                this.f21984h = i5;
                return j2;
            }
        }
        return m9427O();
    }

    /* JADX INFO: renamed from: I */
    public final void m9421I() {
        int i2 = this.f21982f + this.f21983g;
        this.f21982f = i2;
        int i3 = this.f21986j + i2;
        int i4 = this.f21987k;
        if (i3 <= i4) {
            this.f21983g = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f21983g = i5;
        this.f21982f = i2 - i5;
    }

    /* JADX INFO: renamed from: J */
    public final void m9422J(int i2) throws zzaeh {
        if (m9423K(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f21986j) - this.f21984h) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9423K(int i2) throws IOException {
        InputStream inputStream = this.f21980d;
        int i3 = this.f21984h;
        int i4 = i3 + i2;
        int i5 = this.f21982f;
        if (i4 <= i5) {
            throw new IllegalStateException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 66), "refillBuffer() called when ", i2, " bytes were already available in buffer"));
        }
        int i6 = this.f21986j;
        if (i2 > (Integer.MAX_VALUE - i6) - i3 || i6 + i3 + i2 > this.f21987k) {
            return false;
        }
        byte[] bArr = this.f21981e;
        if (i3 > 0) {
            if (i5 > i3) {
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i6 = this.f21986j + i3;
            this.f21986j = i6;
            i5 = this.f21982f - i3;
            this.f21982f = i5;
            this.f21984h = 0;
        }
        try {
            int i7 = inputStream.read(bArr, i5, Math.min(bArr.length - i5, (Integer.MAX_VALUE - i6) - i5));
            if (i7 != 0 && i7 >= -1 && i7 <= bArr.length) {
                if (i7 <= 0) {
                    return false;
                }
                this.f21982f += i7;
                m9421I();
                return this.f21982f >= i2 || m9423K(i2);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + strValueOf.length() + 39 + 41);
            sb.append(strValueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(i7);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (zzaeh e) {
            e.f22041s = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m9424L(int i2) throws IOException {
        byte[] bArrM9425M = m9425M(i2);
        if (bArrM9425M != null) {
            return bArrM9425M;
        }
        int i3 = this.f21984h;
        int i4 = this.f21982f;
        int i5 = i4 - i3;
        this.f21986j += i4;
        this.f21984h = 0;
        this.f21982f = 0;
        ArrayList arrayListM9426N = m9426N(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f21981e, i3, bArr, 0, i5);
        int size = arrayListM9426N.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM9426N.get(i6);
            i6++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public final byte[] m9425M(int i2) throws IOException {
        if (i2 == 0) {
            return zzaed.f22038a;
        }
        int i3 = this.f21986j;
        int i4 = this.f21984h;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f21987k;
        if (i5 > i6) {
            mo9405g((i6 - i3) - i4);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.f21982f - i4;
        int i8 = i2 - i7;
        InputStream inputStream = this.f21980d;
        if (i8 >= 4096) {
            try {
                if (i8 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e) {
                e.f22041s = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f21981e, this.f21984h, bArr, 0, i7);
        this.f21986j += this.f21982f;
        this.f21984h = 0;
        this.f21982f = 0;
        while (i7 < i2) {
            try {
                int i9 = inputStream.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f21986j += i9;
                i7 += i9;
            } catch (zzaeh e2) {
                e2.f22041s = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: N */
    public final ArrayList m9426N(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                try {
                    int i4 = this.f21980d.read(bArr, i3, iMin - i3);
                    if (i4 == -1) {
                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f21986j += i4;
                    i3 += i4;
                } catch (zzaeh e) {
                    e.f22041s = true;
                    throw e;
                }
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final long m9427O() throws zzaeh {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f21984h == this.f21982f) {
                m9422J(1);
            }
            int i3 = this.f21984h;
            this.f21984h = i3 + 1;
            byte b = this.f21981e[i3];
            j2 |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j2;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: P */
    public final int m9428P() throws zzaeh {
        int i2 = this.f21984h;
        if (this.f21982f - i2 < 4) {
            m9422J(4);
            i2 = this.f21984h;
        }
        this.f21984h = i2 + 4;
        byte[] bArr = this.f21981e;
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX INFO: renamed from: Q */
    public final long m9429Q() throws zzaeh {
        int i2 = this.f21984h;
        if (this.f21982f - i2 < 8) {
            m9422J(8);
            i2 = this.f21984h;
        }
        this.f21984h = i2 + 8;
        byte[] bArr = this.f21981e;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: a */
    public final int mo9399a(int i2) throws zzaeh {
        if (i2 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f21986j + this.f21984h + i2;
        if (i3 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.f21987k;
        if (i3 > i4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21987k = i3;
        m9421I();
        return i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: b */
    public final void mo9400b(int i2) {
        this.f21987k = i2;
        m9421I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: c */
    public final int mo9401c() {
        int i2 = this.f21987k;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f21986j + this.f21984h);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: d */
    public final boolean mo9402d() {
        return this.f21984h == this.f21982f && !m9423K(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: e */
    public final int mo9403e() {
        return this.f21986j + this.f21984h;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: f */
    public final int mo9404f(byte[] bArr, int i2, int i3) throws IOException {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f21982f;
        int i5 = this.f21984h;
        int i6 = i4 - i5;
        if (i6 > 0) {
            int iMin = Math.min(i3, i6);
            System.arraycopy(this.f21981e, this.f21984h, bArr, i2, iMin);
            this.f21984h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i3, (this.f21987k - this.f21986j) - i5);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i7 = this.f21980d.read(bArr, i2, iMin2);
            if (i7 != -1) {
                this.f21986j += i7;
            }
            return i7;
        } catch (zzaeh e) {
            e.f22041s = true;
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: g */
    public final void mo9405g(int i2) throws zzaeh {
        InputStream inputStream = this.f21980d;
        int i3 = this.f21982f;
        int i4 = this.f21984h;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.f21984h = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f21986j;
        int i7 = i6 + i4;
        int i8 = this.f21987k;
        if (i7 + i2 > i8) {
            mo9405g((i8 - i6) - i4);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21986j = i7;
        this.f21982f = 0;
        this.f21984h = 0;
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
                } catch (zzaeh e) {
                    e.f22041s = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f21986j += i5;
                m9421I();
                throw th;
            }
        }
        this.f21986j += i5;
        m9421I();
        if (i5 >= i2) {
            return;
        }
        int i9 = this.f21982f;
        int i10 = i9 - this.f21984h;
        this.f21984h = i9;
        m9422J(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.f21982f;
            if (i11 <= i12) {
                this.f21984h = i11;
                return;
            } else {
                i10 += i12;
                this.f21984h = i12;
                m9422J(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: l */
    public final int mo9406l() throws zzaeh {
        if (mo9402d()) {
            this.f21985i = 0;
            return 0;
        }
        int iMo9390G = mo9390G();
        this.f21985i = iMo9390G;
        if ((iMo9390G >>> 3) != 0) {
            return iMo9390G;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: m */
    public final void mo9407m(int i2) throws zzaeh {
        if (this.f21985i != i2) {
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
                mo9405g(mo9390G());
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
        int i5 = this.f21982f - this.f21984h;
        byte[] bArr = this.f21981e;
        if (i5 >= 10) {
            while (i4 < 10) {
                int i6 = this.f21984h;
                this.f21984h = i6 + 1;
                if (bArr[i6] < 0) {
                    i4++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
        }
        while (i4 < 10) {
            if (this.f21984h == this.f21982f) {
                m9422J(1);
            }
            int i7 = this.f21984h;
            this.f21984h = i7 + 1;
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
        return Double.longBitsToDouble(m9429Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: p */
    public final float mo9410p() {
        return Float.intBitsToFloat(m9428P());
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
        return mo9390G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: t */
    public final long mo9414t() {
        return m9429Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: u */
    public final int mo9415u() {
        return m9428P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: v */
    public final boolean mo9416v() {
        return mo9391H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: w */
    public final String mo9417w() throws zzaeh {
        int iMo9390G = mo9390G();
        byte[] bArr = this.f21981e;
        if (iMo9390G > 0) {
            int i2 = this.f21982f;
            int i3 = this.f21984h;
            if (iMo9390G <= i2 - i3) {
                String str = new String(bArr, i3, iMo9390G, StandardCharsets.UTF_8);
                this.f21984h += iMo9390G;
                return str;
            }
        }
        if (iMo9390G == 0) {
            return "";
        }
        if (iMo9390G < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iMo9390G > this.f21982f) {
            return new String(m9424L(iMo9390G), StandardCharsets.UTF_8);
        }
        m9422J(iMo9390G);
        String str2 = new String(bArr, this.f21984h, iMo9390G, StandardCharsets.UTF_8);
        this.f21984h += iMo9390G;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: x */
    public final String mo9418x() throws IOException {
        int iMo9390G = mo9390G();
        int i2 = this.f21984h;
        int i3 = this.f21982f;
        int i4 = i3 - i2;
        byte[] bArrM9424L = this.f21981e;
        if (iMo9390G <= i4 && iMo9390G > 0) {
            this.f21984h = i2 + iMo9390G;
        } else {
            if (iMo9390G == 0) {
                return "";
            }
            if (iMo9390G < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (iMo9390G <= i3) {
                m9422J(iMo9390G);
                this.f21984h = iMo9390G;
            } else {
                bArrM9424L = m9424L(iMo9390G);
            }
        }
        return zzagl.m9719d(bArrM9424L, i2, iMo9390G);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: y */
    public final zzacr mo9419y() throws IOException {
        int iMo9390G = mo9390G();
        int i2 = this.f21982f;
        int i3 = this.f21984h;
        int i4 = i2 - i3;
        byte[] bArr = this.f21981e;
        if (iMo9390G <= i4 && iMo9390G > 0) {
            zzacr zzacrVarM9380n = zzacr.m9380n(bArr, i3, iMo9390G);
            this.f21984h += iMo9390G;
            return zzacrVarM9380n;
        }
        if (iMo9390G == 0) {
            return zzacr.f21972t;
        }
        if (iMo9390G < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrM9425M = m9425M(iMo9390G);
        if (bArrM9425M != null) {
            return zzacr.m9380n(bArrM9425M, 0, bArrM9425M.length);
        }
        int i5 = this.f21984h;
        int i6 = this.f21982f;
        int i7 = i6 - i5;
        this.f21986j += i6;
        this.f21984h = 0;
        this.f21982f = 0;
        ArrayList arrayListM9426N = m9426N(iMo9390G - i7);
        byte[] bArr2 = new byte[iMo9390G];
        System.arraycopy(bArr, i5, bArr2, 0, i7);
        int size = arrayListM9426N.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayListM9426N.get(i8);
            i8++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i7, length);
            i7 += length;
        }
        try {
            zzacr zzacrVar = zzacr.f21972t;
            return iMo9390G == 0 ? zzacr.f21972t : new zzacq(bArr2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    /* JADX INFO: renamed from: z */
    public final byte[] mo9420z() throws zzaeh {
        int iMo9390G = mo9390G();
        int i2 = this.f21982f;
        int i3 = this.f21984h;
        if (iMo9390G > i2 - i3 || iMo9390G <= 0) {
            if (iMo9390G >= 0) {
                return m9424L(iMo9390G);
            }
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f21981e, i3, i3 + iMo9390G);
        this.f21984h += iMo9390G;
        return bArrCopyOfRange;
    }
}
