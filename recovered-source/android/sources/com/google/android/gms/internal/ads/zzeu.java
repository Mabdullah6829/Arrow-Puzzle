package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeu {

    /* JADX INFO: renamed from: d */
    public static final char[] f14883d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f14884e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final zzgxd f14885f = zzgxd.m7244v(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f14886g = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public byte[] f14887a;

    /* JADX INFO: renamed from: b */
    public int f14888b;

    /* JADX INFO: renamed from: c */
    public int f14889c;

    public zzeu(byte[] bArr, int i2) {
        this.f14887a = bArr;
        this.f14889c = i2;
    }

    /* JADX INFO: renamed from: u */
    public static int m6356u(Charset charset) {
        zzgtr.m7132e("Unsupported charset: %s", f14885f.contains(charset), charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m6357w(byte b) {
        return (b & 192) == 128;
    }

    /* JADX INFO: renamed from: x */
    public static int m6358x(int i2, int i3, int i4, int i5) {
        return zzhaq.m7306c((byte) 0, zzhau.m7311a(((i2 & 7) << 2) | ((i3 & 48) >> 4)), zzhau.m7311a(((i4 & 60) >> 2) | ((i3 & 15) << 4)), zzhau.m7311a((i5 & 63) | ((i4 & 3) << 6)));
    }

    /* JADX INFO: renamed from: A */
    public final void m6359A(int i2) {
        byte[] bArr = this.f14887a;
        if (i2 > bArr.length) {
            this.f14887a = Arrays.copyOf(bArr, i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m6360B() {
        return Math.max(this.f14889c - this.f14888b, 0);
    }

    /* JADX INFO: renamed from: C */
    public final void m6361C(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.f14887a.length) {
            z = true;
        }
        zzgtr.m7128a(z);
        this.f14889c = i2;
    }

    /* JADX INFO: renamed from: D */
    public final int m6362D() {
        return this.f14888b;
    }

    /* JADX INFO: renamed from: E */
    public final void m6363E(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.f14889c) {
            z = true;
        }
        zzgtr.m7128a(z);
        this.f14888b = i2;
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m6364F() {
        return this.f14887a;
    }

    /* JADX INFO: renamed from: G */
    public final void m6365G(int i2) {
        m6363E(this.f14888b + i2);
    }

    /* JADX INFO: renamed from: H */
    public final void m6366H(byte[] bArr, int i2, int i3) {
        m6395v(i3);
        System.arraycopy(this.f14887a, this.f14888b, bArr, i2, i3);
        this.f14888b += i3;
    }

    /* JADX INFO: renamed from: I */
    public final int m6367I() {
        m6395v(1);
        return this.f14887a[this.f14888b] & 255;
    }

    /* JADX INFO: renamed from: J */
    public final int m6368J() {
        if (m6360B() >= 4) {
            int iM6376b = m6376b();
            this.f14888b -= 4;
            return iM6376b;
        }
        int i2 = this.f14888b;
        int i3 = this.f14889c;
        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length()), "position=", i2, ", limit=", i3));
    }

    /* JADX INFO: renamed from: K */
    public final int m6369K() {
        m6395v(1);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        this.f14888b = i2 + 1;
        return bArr[i2] & 255;
    }

    /* JADX INFO: renamed from: L */
    public final int m6370L() {
        m6395v(2);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        this.f14888b = i2 + 2;
        return (bArr[i3] & 255) | (i4 << 8);
    }

    /* JADX INFO: renamed from: M */
    public final int m6371M() {
        m6395v(2);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        this.f14888b = i2 + 2;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    /* JADX INFO: renamed from: N */
    public final short m6372N() {
        m6395v(2);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        this.f14888b = i2 + 2;
        return (short) ((bArr[i3] & 255) | (i4 << 8));
    }

    /* JADX INFO: renamed from: O */
    public final int m6373O() {
        m6395v(3);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.f14888b = i5;
        int i6 = bArr[i3] & 255;
        this.f14888b = i2 + 3;
        return (bArr[i5] & 255) | (i4 << 16) | (i6 << 8);
    }

    /* JADX INFO: renamed from: P */
    public final long m6374P() {
        m6395v(4);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.f14888b = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.f14888b = i5;
        long j4 = bArr[i4];
        this.f14888b = i2 + 4;
        return (((long) bArr[i5]) & 255) | ((j2 & 255) << 24) | ((j3 & 255) << 16) | ((j4 & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public final long m6375a() {
        m6395v(4);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.f14888b = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.f14888b = i5;
        long j4 = bArr[i4];
        this.f14888b = i2 + 4;
        return ((((long) bArr[i5]) & 255) << 24) | (255 & j2) | ((j3 & 255) << 8) | ((j4 & 255) << 16);
    }

    /* JADX INFO: renamed from: b */
    public final int m6376b() {
        m6395v(4);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.f14888b = i5;
        int i6 = bArr[i3] & 255;
        int i7 = i2 + 3;
        this.f14888b = i7;
        int i8 = bArr[i5] & 255;
        this.f14888b = i2 + 4;
        return (bArr[i7] & 255) | (i4 << 24) | (i6 << 16) | (i8 << 8);
    }

    /* JADX INFO: renamed from: c */
    public final int m6377c() {
        m6395v(4);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.f14888b = i5;
        int i6 = bArr[i3] & 255;
        int i7 = i2 + 3;
        this.f14888b = i7;
        int i8 = bArr[i5] & 255;
        this.f14888b = i2 + 4;
        return ((bArr[i7] & 255) << 24) | (i6 << 8) | i4 | (i8 << 16);
    }

    /* JADX INFO: renamed from: d */
    public final long m6378d() {
        m6395v(8);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.f14888b = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.f14888b = i5;
        long j4 = bArr[i4];
        int i6 = i2 + 4;
        this.f14888b = i6;
        long j5 = bArr[i5];
        int i7 = i2 + 5;
        this.f14888b = i7;
        long j6 = bArr[i6];
        int i8 = i2 + 6;
        this.f14888b = i8;
        long j7 = bArr[i7];
        int i9 = i2 + 7;
        this.f14888b = i9;
        long j8 = bArr[i8];
        this.f14888b = i2 + 8;
        return ((j8 & 255) << 8) | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | (((long) bArr[i9]) & 255);
    }

    /* JADX INFO: renamed from: e */
    public final long m6379e() {
        m6395v(8);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.f14888b = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.f14888b = i5;
        long j4 = bArr[i4];
        int i6 = i2 + 4;
        this.f14888b = i6;
        long j5 = bArr[i5];
        int i7 = i2 + 5;
        this.f14888b = i7;
        long j6 = bArr[i6];
        int i8 = i2 + 6;
        this.f14888b = i8;
        long j7 = bArr[i7];
        int i9 = i2 + 7;
        this.f14888b = i9;
        long j8 = bArr[i8];
        this.f14888b = i2 + 8;
        return ((j8 & 255) << 48) | (j2 & 255) | ((j3 & 255) << 8) | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((j6 & 255) << 32) | ((j7 & 255) << 40) | ((((long) bArr[i9]) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public final int m6380f() {
        m6395v(4);
        byte[] bArr = this.f14887a;
        int i2 = this.f14888b;
        int i3 = i2 + 1;
        this.f14888b = i3;
        int i4 = bArr[i2] & 255;
        this.f14888b = i2 + 2;
        int i5 = bArr[i3] & 255;
        this.f14888b = i2 + 4;
        return (i4 << 8) | i5;
    }

    /* JADX INFO: renamed from: g */
    public final int m6381g() {
        return (m6369K() << 21) | (m6369K() << 14) | (m6369K() << 7) | m6369K();
    }

    /* JADX INFO: renamed from: h */
    public final int m6382h() {
        int iM6376b = m6376b();
        if (iM6376b >= 0) {
            return iM6376b;
        }
        throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6376b).length() + 18), "Top bit not zero: ", iM6376b));
    }

    /* JADX INFO: renamed from: i */
    public final int m6383i() {
        int iM6377c = m6377c();
        if (iM6377c >= 0) {
            return iM6377c;
        }
        throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6377c).length() + 18), "Top bit not zero: ", iM6377c));
    }

    /* JADX INFO: renamed from: j */
    public final long m6384j() {
        long jM6378d = m6378d();
        if (jM6378d >= 0) {
            return jM6378d;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(jM6378d).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(jM6378d);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public final String m6385k(int i2, Charset charset) {
        m6395v(i2);
        byte[] bArr = this.f14887a;
        int i3 = this.f14888b;
        String str = new String(bArr, i3, i2, charset);
        this.f14888b = i3 + i2;
        return str;
    }

    /* JADX INFO: renamed from: l */
    public final String m6386l(int i2) {
        m6395v(i2);
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f14888b;
        int i4 = (i3 + i2) - 1;
        int i5 = (i4 >= this.f14889c || this.f14887a[i4] != 0) ? i2 : i2 - 1;
        byte[] bArr = this.f14887a;
        String str = zzfm.f16091a;
        String str2 = new String(bArr, i3, i5, StandardCharsets.UTF_8);
        this.f14888b += i2;
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public final String m6387m() {
        if (m6360B() == 0) {
            return null;
        }
        int i2 = this.f14888b;
        while (i2 < this.f14889c && this.f14887a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f14887a;
        int i3 = this.f14888b;
        String str = zzfm.f16091a;
        String str2 = new String(bArr, i3, i2 - i3, StandardCharsets.UTF_8);
        this.f14888b = i2;
        if (i2 < this.f14889c) {
            this.f14888b = i2 + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00be A[ADDED_TO_REGION, EDGE_INSN: B:63:0x00be->B:54:0x00be BREAK  A[LOOP:0: B:24:0x005a->B:52:0x00bb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[ADDED_TO_REGION, EDGE_INSN: B:65:0x00be->B:54:0x00be BREAK  A[LOOP:0: B:24:0x005a->B:52:0x00bb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final String m6388n(Charset charset) {
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b2;
        zzgtr.m7132e("Unsupported charset: %s", f14885f.contains(charset), charset);
        if (m6360B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m6391q();
        }
        int i2 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i2 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i3 = this.f14888b;
        while (true) {
            int i4 = this.f14889c;
            if (i3 >= i4 - (i2 - 1)) {
                i3 = i4;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b3 = this.f14887a[i3];
                String str = zzfm.f16091a;
                if (b3 == 10 || b3 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f14887a;
                    if (bArr[i3] == 0) {
                        b = bArr[i3 + 1];
                        String str2 = zzfm.f16091a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f14887a;
                            if (bArr2[i3 + 1] == 0) {
                                b2 = bArr2[i3];
                                String str3 = zzfm.f16091a;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3 += i2;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f14887a;
                            if (bArr2[i3 + 1] == 0) {
                                b2 = bArr2[i3];
                                String str4 = zzfm.f16091a;
                                if (b2 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i3 += i2;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f14887a;
                        if (bArr2[i3 + 1] == 0) {
                            b2 = bArr2[i3];
                            String str5 = zzfm.f16091a;
                            if (b2 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i3 += i2;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f14887a;
                if (bArr[i3] == 0) {
                    b = bArr[i3 + 1];
                    String str6 = zzfm.f16091a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f14887a;
                    if (bArr2[i3 + 1] == 0) {
                        b2 = bArr2[i3];
                        String str7 = zzfm.f16091a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i3 += i2;
            } else {
                bArr = this.f14887a;
                if (bArr[i3] == 0) {
                    b = bArr[i3 + 1];
                    String str8 = zzfm.f16091a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f14887a;
                    if (bArr2[i3 + 1] == 0) {
                        b2 = bArr2[i3];
                        String str9 = zzfm.f16091a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i3 += i2;
            }
        }
        String strM6385k = m6385k(i3 - this.f14888b, charset);
        if (this.f14888b != this.f14889c && m6393s(charset, f14883d) == '\r') {
            m6393s(charset, f14884e);
        }
        return strM6385k;
    }

    /* JADX INFO: renamed from: o */
    public final long m6389o() {
        int i2;
        m6395v(1);
        long j2 = this.f14887a[this.f14888b];
        int i3 = 7;
        while (true) {
            i2 = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j2) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i2 = 1;
                    break;
                }
                j2 &= (long) (i4 - 1);
                i2 = 7 - i3;
                break;
            }
            i3--;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        m6395v(i2);
        for (int i5 = 1; i5 < i2; i5++) {
            byte b = this.f14887a[this.f14888b + i5];
            if ((b & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | ((long) (b & 63));
        }
        this.f14888b += i2;
        return j2;
    }

    /* JADX INFO: renamed from: p */
    public final long m6390p() {
        long j2 = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.f14888b == this.f14889c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM6369K = m6369K();
            j2 |= (127 & jM6369K) << (i2 * 7);
            if ((jM6369K & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: q */
    public final Charset m6391q() {
        if (m6360B() >= 3) {
            byte[] bArr = this.f14887a;
            int i2 = this.f14888b;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f14888b = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m6360B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f14887a;
        int i3 = this.f14888b;
        byte b = bArr2[i3];
        if (b == -2) {
            if (bArr2[i3 + 1] != -1) {
                return null;
            }
            this.f14888b = i3 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.f14888b = i3 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: r */
    public final char m6392r(int i2, ByteOrder byteOrder) {
        byte b;
        byte b2;
        m6395v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f14887a;
            int i3 = this.f14888b + i2;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            byte[] bArr2 = this.f14887a;
            int i4 = this.f14888b + i2;
            b = bArr2[i4 + 1];
            b2 = bArr2[i4];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: s */
    public final char m6393s(Charset charset, char[] cArr) {
        int iM6394t;
        if (m6360B() >= m6356u(charset) && (iM6394t = m6394t(charset)) != 0) {
            int i2 = iM6394t >>> 8;
            if (!Character.isSupplementaryCodePoint(i2)) {
                long j2 = i2;
                char c = (char) j2;
                zzgtr.m7131d(j2, ((long) c) == j2, "Out of range: %s");
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f14888b = zzhaq.m7304a(iM6394t & 255) + this.f14888b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX INFO: renamed from: t */
    public final int m6394t(Charset charset) {
        int codePoint;
        int i2;
        int iM6358x;
        zzgtr.m7132e("Unsupported charset: %s", f14885f.contains(charset), charset);
        if (m6360B() < m6356u(charset)) {
            int i3 = this.f14888b;
            int i4 = this.f14889c;
            throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i3).length() + 17 + String.valueOf(i4).length()), "position=", i3, ", limit=", i4));
        }
        int i5 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f14887a[this.f14888b];
            if ((b & 128) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i5;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.f14887a[this.f14888b];
            if ((b2 & 128) == 0) {
                i2 = 1;
            } else if ((b2 & 224) == 192 && m6360B() >= 2 && m6357w(this.f14887a[this.f14888b + 1])) {
                i2 = 2;
            } else if ((this.f14887a[this.f14888b] & 240) == 224 && m6360B() >= 3) {
                byte[] bArr = this.f14887a;
                int i6 = this.f14888b;
                if (m6357w(bArr[i6 + 1]) && m6357w(bArr[i6 + 2])) {
                    i2 = 3;
                } else if ((this.f14887a[this.f14888b] & 248) == 240) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            } else if ((this.f14887a[this.f14888b] & 248) == 240 || m6360B() < 4) {
                i2 = 0;
            } else {
                byte[] bArr2 = this.f14887a;
                int i7 = this.f14888b;
                if (m6357w(bArr2[i7 + 1]) && m6357w(bArr2[i7 + 2]) && m6357w(bArr2[i7 + 3])) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
            }
            if (i2 == 1) {
                iM6358x = this.f14887a[this.f14888b] & 255;
            } else if (i2 == 2) {
                byte[] bArr3 = this.f14887a;
                int i8 = this.f14888b;
                iM6358x = m6358x(0, 0, bArr3[i8], bArr3[i8 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr4 = this.f14887a;
                        int i9 = this.f14888b;
                        iM6358x = m6358x(bArr4[i9], bArr4[i9 + 1], bArr4[i9 + 2], bArr4[i9 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f14887a;
                int i10 = this.f14888b;
                iM6358x = m6358x(0, bArr5[i10] & 15, bArr5[i10 + 1], bArr5[i10 + 2]);
            }
            i5 = i2;
            codePoint = iM6358x;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM6392r = m6392r(0, byteOrder);
            if (!Character.isHighSurrogate(cM6392r) || m6360B() < 4) {
                codePoint = cM6392r;
                i5 = 2;
            } else {
                codePoint = Character.toCodePoint(cM6392r, m6392r(2, byteOrder));
                i5 = 4;
            }
        }
        return (codePoint << 8) | i5;
    }

    /* JADX INFO: renamed from: v */
    public final void m6395v(int i2) {
        if (!f14886g.get() || m6360B() >= i2) {
            return;
        }
        int iM6360B = m6360B();
        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 25 + String.valueOf(iM6360B).length()), "bytesNeeded= ", i2, ", bytesLeft=", iM6360B));
    }

    /* JADX INFO: renamed from: y */
    public final void m6396y(int i2) {
        byte[] bArr = this.f14887a;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        m6397z(i2, bArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m6397z(int i2, byte[] bArr) {
        this.f14887a = bArr;
        this.f14889c = i2;
        this.f14888b = 0;
    }

    public zzeu() {
        this.f14887a = zzfm.f16092b;
    }

    public zzeu(int i2) {
        this.f14887a = new byte[i2];
        this.f14889c = i2;
    }

    public zzeu(byte[] bArr) {
        this.f14887a = bArr;
        this.f14889c = bArr.length;
    }
}
