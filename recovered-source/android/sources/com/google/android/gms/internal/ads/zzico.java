package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzico implements Closeable {

    /* JADX INFO: renamed from: A */
    public int f19671A;

    /* JADX INFO: renamed from: B */
    public int[] f19672B;

    /* JADX INFO: renamed from: D */
    public String[] f19674D;

    /* JADX INFO: renamed from: E */
    public int[] f19675E;

    /* JADX INFO: renamed from: s */
    public final StringReader f19676s;

    /* JADX INFO: renamed from: z */
    public long f19683z;

    /* JADX INFO: renamed from: t */
    public final char[] f19677t = new char[1024];

    /* JADX INFO: renamed from: u */
    public int f19678u = 0;

    /* JADX INFO: renamed from: v */
    public int f19679v = 0;

    /* JADX INFO: renamed from: w */
    public int f19680w = 0;

    /* JADX INFO: renamed from: x */
    public int f19681x = 0;

    /* JADX INFO: renamed from: y */
    public int f19682y = 0;

    /* JADX INFO: renamed from: C */
    public int f19673C = 1;

    static {
        new zzicn();
    }

    public zzico(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f19672B = iArr;
        iArr[0] = 6;
        this.f19674D = new String[32];
        this.f19675E = new int[32];
        this.f19676s = stringReader;
    }

    /* JADX INFO: renamed from: A */
    public final IllegalStateException m8073A(String str) throws IOException {
        int iM8077i = m8077i();
        String strM8086a = zzicp.m8086a(m8077i());
        String strM8076h = m8076h();
        int iM2438e = AbstractC1456a.m2438e(str.length() + 18, strM8076h.length(), strM8086a);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iM8077i == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(strConcat.length() + iM2438e + 5);
        AbstractC0271e0.m413u(sb, "Expected ", str, " but was ", strM8086a);
        return new IllegalStateException(AbstractC1456a.m2450q(sb, strM8076h, "\nSee ", strConcat));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9 A[DONT_INVERT, PHI: r9
  0x01e9: PHI (r9v20 char) = (r9v10 char), (r9v21 char) binds: [B:141:0x01bc, B:147:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x0208  */
    /* JADX WARN: Code duplicated, block: B:174:0x020c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x0220  */
    /* JADX WARN: Code duplicated, block: B:185:0x022a  */
    /* JADX WARN: Code duplicated, block: B:187:0x022e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0234 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:237:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144 A[PHI: r1 r3
  0x0144: PHI (r1v33 int) = (r1v32 int), (r1v47 int) binds: [B:91:0x012b, B:98:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0144: PHI (r3v10 int) = (r3v9 int), (r3v11 int) binds: [B:91:0x012b, B:98:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        if (r6 == false) goto L152;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m8074c() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzico.m8074c():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19682y = 0;
        this.f19672B[0] = 8;
        this.f19673C = 1;
        this.f19676s.close();
    }

    /* JADX INFO: renamed from: e */
    public final String m8075e() throws IOException {
        String str;
        int iM8074c = this.f19682y;
        if (iM8074c == 0) {
            iM8074c = m8074c();
        }
        if (iM8074c == 10) {
            str = m8080n();
        } else if (iM8074c == 8) {
            str = m8079l('\'');
        } else if (iM8074c == 9) {
            str = m8079l('\"');
        } else if (iM8074c == 11) {
            str = null;
        } else if (iM8074c == 15) {
            str = Long.toString(this.f19683z);
        } else {
            if (iM8074c != 16) {
                throw m8073A("a string");
            }
            str = new String(this.f19677t, this.f19678u, this.f19671A);
            this.f19678u += this.f19671A;
        }
        this.f19682y = 0;
        int[] iArr = this.f19675E;
        int i2 = this.f19673C - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m8076h() {
        int i2 = this.f19680w + 1;
        int i3 = this.f19678u - this.f19681x;
        StringBuilder sb = new StringBuilder("$");
        for (int i4 = 0; i4 < this.f19673C; i4++) {
            int i5 = this.f19672B[i4];
            switch (i5) {
                case 1:
                case 2:
                    int i6 = this.f19675E[i4];
                    sb.append('[');
                    sb.append(i6);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f19674D[i4];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i5).length() + 21), "Unknown scope value: ", i5));
            }
        }
        int i7 = i3 + 1;
        String string = sb.toString();
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i7).length();
        StringBuilder sb2 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        AbstractC1456a.m2455v(sb2, " at line ", i2, " column ", i7);
        return AbstractC0271e0.m403k(sb2, " path ", string);
    }

    /* JADX INFO: renamed from: i */
    public final int m8077i() throws IOException {
        int iM8074c = this.f19682y;
        if (iM8074c == 0) {
            iM8074c = m8074c();
        }
        switch (iM8074c) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8078j(char c) throws zzicr {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m8084u();
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final String m8079l(char c) throws zzicr {
        char[] cArr;
        int i2;
        StringBuilder sb = null;
        do {
            int i3 = this.f19678u;
            int i4 = this.f19679v;
            int i5 = i3;
            while (true) {
                cArr = this.f19677t;
                if (i3 < i4) {
                    int i6 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        int i7 = (i6 - i5) - 1;
                        this.f19678u = i6;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    char c3 = '\n';
                    if (c2 == '\\') {
                        int i8 = i6 - i5;
                        int i9 = i8 - 1;
                        this.f19678u = i6;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i8 + i8, 16));
                        }
                        sb.append(cArr, i5, i9);
                        if (this.f19678u == this.f19679v && !m8082p(1)) {
                            m8085w("Unterminated escape sequence");
                            throw null;
                        }
                        int i10 = this.f19678u;
                        int i11 = i10 + 1;
                        this.f19678u = i11;
                        char c4 = cArr[i10];
                        if (c4 != '\n') {
                            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                if (c4 == 'b') {
                                    c3 = '\b';
                                } else if (c4 == 'f') {
                                    c3 = '\f';
                                } else if (c4 != 'n') {
                                    if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            m8085w("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i10 + 5 > this.f19679v && !m8082p(4)) {
                                            m8085w("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i12 = this.f19678u;
                                        int i13 = i12 + 4;
                                        int i14 = 0;
                                        while (i12 < i13) {
                                            int i15 = i14 << 4;
                                            char c5 = cArr[i12];
                                            if (c5 >= '0' && c5 <= '9') {
                                                i2 = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i2 = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    m8085w("Malformed Unicode escape \\u".concat(new String(cArr, this.f19678u, 4)));
                                                    throw null;
                                                }
                                                i2 = c5 - '7';
                                            }
                                            i14 = i2 + i15;
                                            i12++;
                                        }
                                        this.f19678u += 4;
                                        c3 = (char) i14;
                                    }
                                }
                            }
                            sb.append(c3);
                            i5 = this.f19678u;
                            i4 = this.f19679v;
                            i3 = i5;
                        } else {
                            this.f19680w++;
                            this.f19681x = i11;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i5 = this.f19678u;
                        i4 = this.f19679v;
                        i3 = i5;
                    } else {
                        if (c2 == '\n') {
                            this.f19680w++;
                            this.f19681x = i6;
                        }
                        i3 = i6;
                    }
                }
            }
            int i16 = i3 - i5;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i16 + i16, 16));
            }
            sb.append(cArr, i5, i16);
            this.f19678u = i3;
        } while (m8082p(1));
        m8085w("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final String m8080n() throws zzicr {
        char[] cArr;
        String string;
        int i2 = 0;
        int i3 = 0;
        StringBuilder sb = null;
        while (true) {
            int i4 = this.f19678u + i3;
            int i5 = this.f19679v;
            cArr = this.f19677t;
            if (i4 < i5) {
                char c = cArr[i4];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    if (c != '#') {
                        if (c != ',') {
                            if (c != '/' && c != '=') {
                                if (c != '{' && c != '}' && c != ':') {
                                    if (c != ';') {
                                        switch (c) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                break;
                                            default:
                                                i3++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    m8084u();
                    throw null;
                }
                i2 = i3;
            } else if (i3 >= 1024) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max(i3, 16));
                }
                sb.append(cArr, this.f19678u, i3);
                this.f19678u += i3;
                if (m8082p(1)) {
                    i3 = 0;
                }
            } else if (!m8082p(i3 + 1)) {
                i2 = i3;
            }
        }
        if (sb == null) {
            string = new String(cArr, this.f19678u, i2);
        } else {
            sb.append(cArr, this.f19678u, i2);
            string = sb.toString();
        }
        this.f19678u += i2;
        return string;
    }

    /* JADX INFO: renamed from: o */
    public final void m8081o(int i2) throws zzicr {
        int i3 = this.f19673C;
        if (i3 - 1 >= 1280) {
            String strM8076h = m8076h();
            throw new zzicr(AbstractC0271e0.m403k(new StringBuilder(strM8076h.length() + 26), "Nesting limit 1280 reached", strM8076h));
        }
        int[] iArr = this.f19672B;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            this.f19672B = Arrays.copyOf(iArr, i4);
            this.f19675E = Arrays.copyOf(this.f19675E, i4);
            this.f19674D = (String[]) Arrays.copyOf(this.f19674D, i4);
        }
        int[] iArr2 = this.f19672B;
        int i5 = this.f19673C;
        this.f19673C = i5 + 1;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8082p(int i2) throws IOException {
        int i3;
        int i4 = this.f19681x;
        int i5 = this.f19678u;
        this.f19681x = i4 - i5;
        int i6 = this.f19679v;
        char[] cArr = this.f19677t;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f19679v = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f19679v = 0;
        }
        this.f19678u = 0;
        do {
            int i8 = this.f19679v;
            int i9 = this.f19676s.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.f19679v + i9;
            this.f19679v = i3;
            if (this.f19680w == 0 && this.f19681x == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f19678u++;
                this.f19681x = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final int m8083r(boolean z) throws IOException {
        int i2 = this.f19678u;
        int i3 = this.f19679v;
        while (true) {
            if (i2 == i3) {
                this.f19678u = i2;
                if (!m8082p(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m8076h()));
                    }
                    return -1;
                }
                i2 = this.f19678u;
                i3 = this.f19679v;
            }
            int i4 = i2 + 1;
            char c = this.f19677t[i2];
            if (c == '\n') {
                this.f19680w++;
                this.f19681x = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.f19678u = i4;
                        return c;
                    }
                    this.f19678u = i4;
                    m8084u();
                    throw null;
                }
                this.f19678u = i4;
                if (i4 == i3) {
                    this.f19678u = i2;
                    boolean zM8082p = m8082p(2);
                    this.f19678u++;
                    if (!zM8082p) {
                        return 47;
                    }
                }
                m8084u();
                throw null;
            }
            i2 = i4;
        }
    }

    public final String toString() {
        return "zzico".concat(m8076h());
    }

    /* JADX INFO: renamed from: u */
    public final void m8084u() throws zzicr {
        m8085w("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final void m8085w(String str) throws zzicr {
        String strM8076h = m8076h();
        throw new zzicr(AbstractC1456a.m2450q(new StringBuilder(str.length() + strM8076h.length() + 79), str, strM8076h, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }
}
