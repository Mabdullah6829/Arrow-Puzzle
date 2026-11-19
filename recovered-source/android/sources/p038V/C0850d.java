package p038V;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: V.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0850d {

    /* JADX INFO: renamed from: a */
    public final String f2341a;

    /* JADX INFO: renamed from: b */
    public final int f2342b;

    /* JADX INFO: renamed from: c */
    public int f2343c;

    /* JADX INFO: renamed from: d */
    public int f2344d;

    /* JADX INFO: renamed from: e */
    public int f2345e;

    /* JADX INFO: renamed from: f */
    public int f2346f;

    /* JADX INFO: renamed from: g */
    public char[] f2347g;

    public C0850d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f2341a = name;
        this.f2342b = name.length();
    }

    /* JADX INFO: renamed from: a */
    public final int m1760a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        int i6 = this.f2342b;
        String str = this.f2341a;
        if (i5 >= i6) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f2347g;
        char c = cArr[i2];
        if (c >= '0' && c <= '9') {
            i3 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i3 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c - '7';
        }
        char c2 = cArr[i5];
        if (c2 >= '0' && c2 <= '9') {
            i4 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i4 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i4 = c2 - '7';
        }
        return (i3 << 4) + i4;
    }

    /* JADX INFO: renamed from: b */
    public final char m1761b() {
        int i2;
        int i3;
        int i4 = this.f2343c + 1;
        this.f2343c = i4;
        int i5 = this.f2342b;
        if (i4 == i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2341a);
        }
        char c = this.f2347g[i4];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iM1760a = m1760a(i4);
                            this.f2343c++;
                            if (iM1760a < 128) {
                                return (char) iM1760a;
                            }
                            if (iM1760a < 192 || iM1760a > 247) {
                                return '?';
                            }
                            if (iM1760a <= 223) {
                                i2 = iM1760a & 31;
                                i3 = 1;
                            } else if (iM1760a <= 239) {
                                i2 = iM1760a & 15;
                                i3 = 2;
                            } else {
                                i2 = iM1760a & 7;
                                i3 = 3;
                            }
                            for (int i6 = 0; i6 < i3; i6++) {
                                int i7 = this.f2343c;
                                int i8 = i7 + 1;
                                this.f2343c = i8;
                                if (i8 == i5 || this.f2347g[i8] != '\\') {
                                    return '?';
                                }
                                int i9 = i7 + 2;
                                this.f2343c = i9;
                                int iM1760a2 = m1760a(i9);
                                this.f2343c++;
                                if ((iM1760a2 & 192) != 128) {
                                    return '?';
                                }
                                i2 = (i2 << 6) + (iM1760a2 & 63);
                            }
                            return (char) i2;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    /* JADX INFO: renamed from: c */
    public final String m1762c() {
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        char c2;
        char c3;
        while (true) {
            i2 = this.f2343c;
            i3 = this.f2342b;
            if (i2 >= i3 || this.f2347g[i2] != ' ') {
                break;
            }
            this.f2343c = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.f2344d = i2;
        this.f2343c = i2 + 1;
        while (true) {
            i4 = this.f2343c;
            if (i4 >= i3 || (c3 = this.f2347g[i4]) == '=' || c3 == ' ') {
                break;
            }
            this.f2343c = i4 + 1;
        }
        String str = this.f2341a;
        if (i4 >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f2345e = i4;
        if (this.f2347g[i4] == ' ') {
            while (true) {
                i5 = this.f2343c;
                if (i5 >= i3 || (c2 = this.f2347g[i5]) == '=' || c2 != ' ') {
                    break;
                }
                this.f2343c = i5 + 1;
            }
            if (this.f2347g[i5] != '=' || i5 == i3) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f2343c++;
        while (true) {
            int i6 = this.f2343c;
            if (i6 >= i3 || this.f2347g[i6] != ' ') {
                break;
            }
            this.f2343c = i6 + 1;
        }
        int i7 = this.f2345e;
        int i8 = this.f2344d;
        if (i7 - i8 > 4) {
            char[] cArr = this.f2347g;
            if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && ((cArr[i8 + 1] == 'I' || cArr[i8 + 1] == 'i') && (cArr[i8 + 2] == 'D' || cArr[i8 + 2] == 'd')))) {
                this.f2344d = i8 + 4;
            }
        }
        char[] cArr2 = this.f2347g;
        int i9 = this.f2344d;
        return new String(cArr2, i9, i7 - i9);
    }
}
