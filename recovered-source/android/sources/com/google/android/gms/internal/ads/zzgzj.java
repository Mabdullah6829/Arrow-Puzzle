package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.RoundingMode;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzgzj {

    /* JADX INFO: renamed from: a */
    public final String f18388a;

    /* JADX INFO: renamed from: b */
    public final char[] f18389b;

    /* JADX INFO: renamed from: c */
    public final int f18390c;

    /* JADX INFO: renamed from: d */
    public final int f18391d;

    /* JADX INFO: renamed from: e */
    public final int f18392e;

    /* JADX INFO: renamed from: f */
    public final int f18393f;

    /* JADX INFO: renamed from: g */
    public final byte[] f18394g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f18395h;

    /* JADX INFO: renamed from: i */
    public final boolean f18396i;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgzj(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c = cArr[i2];
            if (!(c < 128)) {
                throw new IllegalArgumentException(zzgui.m7149b("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(zzgui.m7149b("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: a */
    public final int m7273a(char c) throws zzgzm {
        if (c > 127) {
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.f18394g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzgzm(AbstractC0271e0.m401i(new StringBuilder(String.valueOf(c).length() + 24), "Unrecognized character: ", c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgzj)) {
            return false;
        }
        zzgzj zzgzjVar = (zzgzj) obj;
        return this.f18396i == zzgzjVar.f18396i && Arrays.equals(this.f18389b, zzgzjVar.f18389b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18389b) + (true != this.f18396i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f18388a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    public zzgzj(String str, char[] cArr, byte[] bArr, boolean z) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        this.f18388a = str;
        cArr.getClass();
        this.f18389b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (zzhaf.f18423a[roundingMode.ordinal()]) {
                    case 1:
                        zzhaj.m7300b(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f18391d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i2 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f18392e = i2;
                        this.f18393f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f18390c = length - 1;
                        this.f18394g = bArr;
                        zArr = new boolean[i2];
                        for (int i3 = 0; i3 < this.f18393f; i3++) {
                            int i4 = this.f18391d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[zzhag.m7295a(i3 * 8, i4)] = true;
                        }
                        this.f18395h = zArr;
                        this.f18396i = z;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f18391d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i5 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f18392e = i5;
                        this.f18393f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f18390c = length - 1;
                        this.f18394g = bArr;
                        zArr = new boolean[i5];
                        while (i3 < this.f18393f) {
                            int i6 = this.f18391d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[zzhag.m7295a(i3 * 8, i6)] = true;
                        }
                        this.f18395h = zArr;
                        this.f18396i = z;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f18391d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i7 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f18392e = i7;
                        this.f18393f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f18390c = length - 1;
                        this.f18394g = bArr;
                        zArr = new boolean[i7];
                        while (i3 < this.f18393f) {
                            int i8 = this.f18391d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[zzhag.m7295a(i3 * 8, i8)] = true;
                        }
                        this.f18395h = zArr;
                        this.f18396i = z;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length2).length() + 24), "Illegal alphabet length ", length2), e);
        }
    }
}
