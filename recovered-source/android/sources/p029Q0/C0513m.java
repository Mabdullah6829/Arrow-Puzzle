package p029Q0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.json.internal.JsonDecodingException;
import p003C.C0118i;
import p011H.AbstractC0271e0;
import p091y0.AbstractC6574d;

/* JADX INFO: renamed from: Q0.m */
/* JADX INFO: loaded from: classes.dex */
public class C0513m {

    /* JADX INFO: renamed from: a */
    public int f1081a;

    /* JADX INFO: renamed from: b */
    public final C0118i f1082b;

    /* JADX INFO: renamed from: c */
    public String f1083c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f1084d;

    /* JADX INFO: renamed from: e */
    public final String f1085e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable, java.lang.Object[]] */
    public C0513m(String source) {
        AbstractC6452k.m12181e(source, "source");
        C0118i c0118i = new C0118i(1, (byte) 0);
        c0118i.f173b = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        c0118i.f175d = iArr;
        c0118i.f174c = -1;
        this.f1082b = c0118i;
        this.f1084d = new StringBuilder();
        this.f1085e = source;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1214k(C0513m c0513m, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = c0513m.f1081a;
        }
        c0513m.m1224j(i2, str, (i3 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1215a(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 < charSequence.length()) {
            this.f1084d.append((char) (m1226m(charSequence, i2 + 3) + (m1226m(charSequence, i2) << 12) + (m1226m(charSequence, i2 + 1) << 8) + (m1226m(charSequence, i2 + 2) << 4)));
            return i3;
        }
        this.f1081a = i2;
        if (i3 < charSequence.length()) {
            return m1215a(charSequence, this.f1081a);
        }
        m1214k(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1216b() {
        int i2 = this.f1081a;
        if (i2 == -1) {
            return false;
        }
        while (true) {
            String str = this.f1085e;
            if (i2 >= str.length()) {
                this.f1081a = i2;
                return false;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1081a = i2;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1217c(int i2, String str) {
        String str2 = this.f1085e;
        if (str2.length() - i2 < str.length()) {
            m1214k(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) != (str2.charAt(i2 + i3) | ' ')) {
                m1214k(this, "Expected valid boolean literal prefix, but had '" + m1222h() + '\'', 0, 6);
                throw null;
            }
        }
        this.f1081a = str.length() + i2;
    }

    /* JADX INFO: renamed from: d */
    public final String m1218d() {
        m1219e('\"');
        int i2 = this.f1081a;
        String str = this.f1085e;
        int iM12229y = AbstractC6574d.m12229y(str, '\"', i2, 4);
        if (iM12229y == -1) {
            m1222h();
            m1225l((byte) 1, false);
            throw null;
        }
        int i3 = i2;
        while (i3 < iM12229y) {
            if (str.charAt(i3) == '\\') {
                int iM1227n = this.f1081a;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.f1084d.append((CharSequence) str, iM1227n, i3);
                        int iM1227n2 = m1227n(i3 + 1);
                        if (iM1227n2 == -1) {
                            m1214k(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iM1215a = iM1227n2 + 1;
                        char cCharAt2 = str.charAt(iM1227n2);
                        if (cCharAt2 == 'u') {
                            iM1215a = m1215a(str, iM1215a);
                        } else {
                            char c = cCharAt2 < 'u' ? C0504d.f1057a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m1214k(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            this.f1084d.append(c);
                        }
                        iM1227n = m1227n(iM1215a);
                        if (iM1227n == -1) {
                            m1214k(this, "Unexpected EOF", iM1227n, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            this.f1084d.append((CharSequence) str, iM1227n, i3);
                            iM1227n = m1227n(i3);
                            if (iM1227n == -1) {
                                m1214k(this, "Unexpected EOF", iM1227n, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM1227n;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                String string = !z ? str.subSequence(iM1227n, i3).toString() : m1223i(iM1227n, i3);
                this.f1081a = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f1081a = iM12229y + 1;
        String strSubstring = str.substring(i2, iM12229y);
        AbstractC6452k.m12180d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public void m1219e(char c) {
        int i2 = this.f1081a;
        if (i2 == -1) {
            m1230q(c);
            throw null;
        }
        while (true) {
            String str = this.f1085e;
            if (i2 >= str.length()) {
                this.f1081a = -1;
                m1230q(c);
                throw null;
            }
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1081a = i3;
                if (cCharAt == c) {
                    return;
                }
                m1230q(c);
                throw null;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m1220f() {
        boolean z;
        long j2;
        double dPow;
        int iM1227n = m1227n(m1228o());
        String str = this.f1085e;
        int i2 = 6;
        int i3 = 0;
        if (iM1227n >= str.length() || iM1227n == -1) {
            m1214k(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1227n) == '\"') {
            iM1227n++;
            if (iM1227n == str.length()) {
                m1214k(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i4 = iM1227n;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            j4 = j4;
            if (i4 == str.length()) {
                break;
            }
            char cCharAt = str.charAt(i4);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z2) {
                if (i4 == iM1227n) {
                    m1214k(this, "Unexpected symbol " + cCharAt + " in numeric literal", i3, i2);
                    throw null;
                }
                i4++;
                j4 = j4;
                i5 = 1;
                z2 = true;
            } else if (cCharAt == '-' && z2) {
                if (i4 == iM1227n) {
                    m1214k(this, "Unexpected symbol '-' in numeric literal", i3, 6);
                    throw null;
                }
                i4++;
                i5 = i3;
                i2 = 6;
            } else if (cCharAt != '+' || !z2) {
                if (cCharAt != '-') {
                    if (AbstractC0509i.m1198b(cCharAt) != 0) {
                        break;
                    }
                    i4++;
                    int i6 = cCharAt - '0';
                    if (i6 < 0 || i6 >= 10) {
                        m1214k(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i3, 6);
                        throw null;
                    }
                    if (z2) {
                        j3 = (j3 * ((long) 10)) + ((long) i6);
                    } else {
                        j5 = (j5 * ((long) 10)) - ((long) i6);
                        if (j5 > j4) {
                            m1214k(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    i2 = 6;
                    i3 = 0;
                } else {
                    if (i4 != iM1227n) {
                        m1214k(this, "Unexpected symbol '-' in numeric literal", i3, 6);
                        throw null;
                    }
                    i4++;
                    j4 = j4;
                    i2 = 6;
                    z3 = true;
                }
            } else {
                if (i4 == iM1227n) {
                    m1214k(this, "Unexpected symbol '+' in numeric literal", i3, 6);
                    throw null;
                }
                i4++;
                j4 = j4;
                i2 = 6;
                i5 = 1;
            }
        }
        boolean z4 = i4 != iM1227n;
        if (iM1227n == i4 || (z3 && iM1227n == i4 - 1)) {
            m1214k(this, "Expected numeric literal", 0, 6);
            throw null;
        }
        if (z) {
            if (!z4) {
                m1214k(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i4) != '\"') {
                m1214k(this, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            i4++;
        }
        this.f1081a = i4;
        long j6 = j5;
        if (z2) {
            double d = j6;
            if (i5 == 0) {
                dPow = Math.pow(10.0d, -j3);
            } else {
                if (i5 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j3);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m1214k(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m1214k(this, "Can't convert " + d2 + " to Long", 0, 6);
                throw null;
            }
            j2 = (long) d2;
        } else {
            j2 = j6;
        }
        if (z3) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        m1214k(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final String m1221g() {
        String str = this.f1083c;
        if (str == null) {
            return m1218d();
        }
        AbstractC6452k.m12178b(str);
        this.f1083c = null;
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m1222h() {
        String str = this.f1083c;
        if (str != null) {
            AbstractC6452k.m12178b(str);
            this.f1083c = null;
            return str;
        }
        int iM1228o = m1228o();
        String str2 = this.f1085e;
        if (iM1228o >= str2.length() || iM1228o == -1) {
            m1214k(this, "EOF", iM1228o, 4);
            throw null;
        }
        byte bM1198b = AbstractC0509i.m1198b(str2.charAt(iM1228o));
        if (bM1198b == 1) {
            return m1221g();
        }
        if (bM1198b != 0) {
            m1214k(this, "Expected beginning of the string, but got " + str2.charAt(iM1228o), 0, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC0509i.m1198b(str2.charAt(iM1228o)) == 0) {
            iM1228o++;
            if (iM1228o >= str2.length()) {
                this.f1084d.append((CharSequence) str2, this.f1081a, iM1228o);
                int iM1227n = m1227n(iM1228o);
                if (iM1227n == -1) {
                    this.f1081a = iM1228o;
                    return m1223i(0, 0);
                }
                iM1228o = iM1227n;
                z = true;
            }
        }
        String string = !z ? str2.subSequence(this.f1081a, iM1228o).toString() : m1223i(this.f1081a, iM1228o);
        this.f1081a = iM1228o;
        return string;
    }

    /* JADX INFO: renamed from: i */
    public final String m1223i(int i2, int i3) {
        this.f1084d.append((CharSequence) this.f1085e, i2, i3);
        StringBuilder sb = this.f1084d;
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: j */
    public final void m1224j(int i2, String message, String hint) {
        AbstractC6452k.m12181e(message, "message");
        AbstractC6452k.m12181e(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbM410r = AbstractC0271e0.m410r(message, " at path: ");
        sbM410r.append(this.f1082b.m199b());
        sbM410r.append(strConcat);
        String message2 = sbM410r.toString();
        AbstractC6452k.m12181e(message2, "message");
        String input = this.f1085e;
        AbstractC6452k.m12181e(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) AbstractC0509i.m1200d(input, i2));
        AbstractC6452k.m12181e(message3, "message");
        if (i2 >= 0) {
            message3 = "Unexpected JSON token at offset " + i2 + ": " + message3;
        }
        AbstractC6452k.m12181e(message3, "message");
        throw new JsonDecodingException(message3);
    }

    /* JADX INFO: renamed from: l */
    public final void m1225l(byte b, boolean z) {
        String str;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 2) {
            str = "string escape sequence '\\'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else if (b == 10) {
            str = "end of the input";
        } else {
            str = b == 127 ? "invalid token" : "valid token";
        }
        int i2 = z ? this.f1081a - 1 : this.f1081a;
        int i3 = this.f1081a;
        String str2 = this.f1085e;
        m1214k(this, "Expected " + str + ", but had '" + ((i3 == str2.length() || i2 < 0) ? "EOF" : String.valueOf(str2.charAt(i2))) + "' instead", i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final int m1226m(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m1214k(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final int m1227n(int i2) {
        if (i2 < this.f1085e.length()) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public int m1228o() {
        char cCharAt;
        int i2 = this.f1081a;
        if (i2 == -1) {
            return i2;
        }
        while (true) {
            String str = this.f1085e;
            if (i2 >= str.length() || !((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i2++;
        }
        this.f1081a = i2;
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1229p() {
        int iM1228o = m1228o();
        String str = this.f1085e;
        if (iM1228o >= str.length() || iM1228o == -1 || str.charAt(iM1228o) != ',') {
            return false;
        }
        this.f1081a++;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m1230q(char c) {
        int i2 = this.f1081a;
        if (i2 > 0 && c == '\"') {
            try {
                this.f1081a = i2 - 1;
                String strM1222h = m1222h();
                this.f1081a = i2;
                if (AbstractC6452k.m12177a(strM1222h, "null")) {
                    m1224j(this.f1081a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1081a = i2;
                throw th;
            }
        }
        m1225l(AbstractC0509i.m1198b(c), true);
        throw null;
    }

    public final String toString() {
        return "JsonReader(source='" + ((Object) this.f1085e) + "', currentPosition=" + this.f1081a + ')';
    }
}
