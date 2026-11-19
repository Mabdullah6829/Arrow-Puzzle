package p024O;

import androidx.core.internal.view.SupportMenu;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.re2j.PatternSyntaxException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: renamed from: O.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0470m implements Serializable {

    /* JADX INFO: renamed from: s */
    public final String f832s;

    /* JADX INFO: renamed from: t */
    public final transient C0472o f833t;

    public C0470m(String str, C0472o c0472o) {
        if (str == null) {
            throw new NullPointerException("pattern is null");
        }
        this.f832s = str;
        this.f833t = c0472o;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:154:0x027c  */
    /* JADX WARN: Code duplicated, block: B:156:0x028a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0329  */
    /* JADX WARN: Code duplicated, block: B:190:0x0335  */
    /* JADX WARN: Code duplicated, block: B:191:0x033f  */
    /* JADX WARN: Code duplicated, block: B:193:0x034b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0356  */
    /* JADX WARN: Code duplicated, block: B:279:0x04de  */
    /* JADX WARN: Code duplicated, block: B:283:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:284:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:294:0x0518  */
    /* JADX WARN: Code duplicated, block: B:296:0x051c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0520  */
    /* JADX WARN: Code duplicated, block: B:300:0x0525  */
    /* JADX WARN: Code duplicated, block: B:301:0x0528  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C0470m m1029a(String str) {
        C0473p c0473p;
        String str2;
        short s2;
        int i2;
        short s3;
        int i3;
        int iM998h;
        int i4;
        int i5;
        byte b;
        int iM1009k;
        int i6;
        int iM1009k2;
        C0473p c0473pM1018i;
        C0458a c0458a;
        C0458a c0458a2;
        int i7;
        int i8;
        int iM1011m;
        int i9;
        int iM998h2;
        C0469l c0469l = new C0469l(str, 212);
        int i10 = c0469l.f827b;
        int i11 = i10 & 2;
        int i12 = 1;
        String str3 = c0469l.f826a;
        if (i11 != 0) {
            c0473p = new C0473p(3);
            c0473p.f848b = i10;
            int length = str3.length();
            int[] iArr = new int[str3.codePointCount(0, length)];
            int iCharCount = 0;
            int i13 = 0;
            while (iCharCount < length) {
                int iCodePointAt = str3.codePointAt(iCharCount);
                iArr[i13] = iCodePointAt;
                iCharCount += Character.charCount(iCodePointAt);
                i13++;
            }
            c0473p.f850d = iArr;
        } else {
            C0466i c0466i = new C0466i(str3);
            int i14 = -1;
            short s4 = -1;
            int i15 = -1;
            while (true) {
                boolean zM996f = c0466i.m996f();
                HashMap map = c0469l.f831f;
                C0468k c0468k = c0469l.f828c;
                if (zM996f) {
                    int iM997g = c0466i.m997g();
                    int i16 = 16;
                    if (iM997g == 36) {
                        str2 = str3;
                        s2 = s4;
                        i2 = -1;
                        if ((c0469l.f827b & 16) != 0) {
                            c0469l.m1019j(10).f848b |= 256;
                        } else {
                            c0469l.m1019j(8);
                        }
                        c0466i.m1001k(1);
                    } else if (iM997g != 46) {
                        if (iM997g == 63) {
                            str2 = str3;
                            s3 = s4;
                            i3 = c0466i.f815b;
                            iM998h = c0466i.m998h();
                            if (iM998h != 42) {
                                i16 = 14;
                            } else if (iM998h != 43) {
                                if (iM998h != 63) {
                                    i4 = 0;
                                }
                                c0469l.m1026t(i4, i14, s3, i3, c0466i, i15);
                                i15 = i3;
                            } else {
                                i16 = 15;
                            }
                            i4 = i16;
                            c0469l.m1026t(i4, i14, s3, i3, c0466i, i15);
                            i15 = i3;
                        } else if (iM997g != 94) {
                            char c = 2;
                            if (iM997g == 91) {
                                str2 = str3;
                                s2 = s4;
                                i5 = -1;
                                int i17 = c0466i.f815b;
                                c0466i.m1001k(1);
                                C0473p c0473pM1018i2 = c0469l.m1018i(4);
                                c0473pM1018i2.f848b = c0469l.f827b;
                                C0458a c0458a3 = new C0458a(0);
                                if (c0466i.m996f() && c0466i.m994d('^')) {
                                    c0466i.m1001k(1);
                                    if ((c0469l.f827b & 4) == 0) {
                                        c0458a3.m970d(10, 10);
                                    }
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                boolean z = true;
                                while (true) {
                                    if (c0466i.m996f() && c0466i.m997g() == 93 && !z) {
                                        c0466i.m1001k(1);
                                        c0458a3.m972f();
                                        if (b < 0) {
                                            int i18 = 0;
                                            int i19 = 0;
                                            int i20 = 0;
                                            while (i18 < c0458a3.f783b) {
                                                int[] iArr2 = c0458a3.f784c;
                                                int i21 = iArr2[i18];
                                                int i22 = iArr2[i18 + 1];
                                                char c2 = c;
                                                int i23 = i21 - 1;
                                                if (i20 <= i23) {
                                                    iArr2[i19] = i20;
                                                    iArr2[i19 + 1] = i23;
                                                    i19 += 2;
                                                }
                                                i20 = i22 + 1;
                                                i18 += 2;
                                                c = c2;
                                            }
                                            c0458a3.f783b = i19;
                                            if (i20 <= 1114111) {
                                                int i24 = i19 + 2;
                                                int[] iArr3 = c0458a3.f784c;
                                                if (iArr3.length < i24) {
                                                    int i25 = i19 * 2;
                                                    if (i24 < i25) {
                                                        i24 = i25;
                                                    }
                                                    int[] iArr4 = new int[i24];
                                                    System.arraycopy(iArr3, 0, iArr4, 0, i19);
                                                    c0458a3.f784c = iArr4;
                                                }
                                                int[] iArr5 = c0458a3.f784c;
                                                int i26 = c0458a3.f783b;
                                                int i27 = i26 + 1;
                                                c0458a3.f783b = i27;
                                                iArr5[i26] = i20;
                                                c0458a3.f783b = i26 + 2;
                                                iArr5[i27] = 1114111;
                                            }
                                        }
                                        c0473pM1018i2.f850d = c0458a3.m975j();
                                        c0469l.m1024r(c0473pM1018i2);
                                    } else {
                                        char c3 = c;
                                        if (c0466i.m996f() && c0466i.m994d('-') && (c0469l.f827b & 64) == 0 && !z) {
                                            String strM1000j = c0466i.m1000j();
                                            if (strM1000j.equals("-") || !strM1000j.startsWith("-]")) {
                                                c0466i.f815b = i17;
                                                throw new PatternSyntaxException("invalid character class range", c0466i.m1000j());
                                            }
                                        }
                                        int i28 = c0466i.f815b;
                                        if (c0466i.m995e("[:")) {
                                            String strM1000j2 = c0466i.m1000j();
                                            int iIndexOf = strM1000j2.indexOf(":]");
                                            if (iIndexOf < 0) {
                                                c0466i.f815b = i28;
                                                if (c0469l.m1021o(c0466i, c0458a3)) {
                                                    c0466i.f815b = i28;
                                                    iM1009k = C0469l.m1009k(c0466i, i17);
                                                    if (c0466i.m996f()) {
                                                        i6 = -1;
                                                        iM1009k2 = iM1009k;
                                                    } else {
                                                        i6 = -1;
                                                        iM1009k2 = iM1009k;
                                                    }
                                                    if ((c0469l.f827b & 1) == 0) {
                                                        c0458a3.m970d(iM1009k, iM1009k2);
                                                    } else {
                                                        c0458a3.m968b(iM1009k, iM1009k2);
                                                    }
                                                }
                                            } else {
                                                String strSubstring = strM1000j2.substring(0, iIndexOf + 2);
                                                c0466i.f815b = strSubstring.length() + c0466i.f815b;
                                                C0459b c0459b = (C0459b) C0459b.f786d.get(strSubstring);
                                                if (c0459b == null) {
                                                    throw new PatternSyntaxException("invalid character class range", strSubstring);
                                                }
                                                c0458a3.m969c(c0459b, (c0469l.f827b & 1) != 0);
                                            }
                                            i6 = -1;
                                        } else if (c0469l.m1021o(c0466i, c0458a3) || c0469l.m1020n(c0466i, c0458a3)) {
                                            i6 = -1;
                                        } else {
                                            c0466i.f815b = i28;
                                            iM1009k = C0469l.m1009k(c0466i, i17);
                                            if (c0466i.m996f() || !c0466i.m994d('-')) {
                                                i6 = -1;
                                            } else {
                                                c0466i.m1001k(1);
                                                if (c0466i.m996f() && c0466i.m994d(']')) {
                                                    i6 = -1;
                                                    c0466i.m1001k(-1);
                                                } else {
                                                    i6 = -1;
                                                    iM1009k2 = C0469l.m1009k(c0466i, i17);
                                                    if (iM1009k2 < iM1009k) {
                                                        throw new PatternSyntaxException("invalid character class range", c0466i.m993c(i28));
                                                    }
                                                }
                                                if ((c0469l.f827b & 1) == 0) {
                                                    c0458a3.m970d(iM1009k, iM1009k2);
                                                } else {
                                                    c0458a3.m968b(iM1009k, iM1009k2);
                                                }
                                            }
                                            iM1009k2 = iM1009k;
                                            if ((c0469l.f827b & 1) == 0) {
                                                c0458a3.m970d(iM1009k, iM1009k2);
                                            } else {
                                                c0458a3.m968b(iM1009k, iM1009k2);
                                            }
                                        }
                                        i5 = i6;
                                        c = c3;
                                        z = false;
                                    }
                                }
                            } else if (iM997g == 92) {
                                str2 = str3;
                                s2 = s4;
                                i5 = -1;
                                int i29 = c0466i.f815b;
                                c0466i.m1001k(1);
                                if ((c0469l.f827b & 64) == 0 || !c0466i.m996f()) {
                                    c0473pM1018i = c0469l.m1018i(4);
                                    c0473pM1018i.f848b = c0469l.f827b;
                                    if (!c0466i.m995e("\\p") || c0466i.m995e("\\P")) {
                                        c0458a = new C0458a(0);
                                        if (c0469l.m1021o(c0466i, c0458a)) {
                                            c0473pM1018i.f850d = c0458a.m975j();
                                            c0469l.m1024r(c0473pM1018i);
                                        } else {
                                            c0458a2 = new C0458a(0);
                                            if (c0469l.m1020n(c0466i, c0458a2)) {
                                                c0473pM1018i.f850d = c0458a2.m975j();
                                                c0469l.m1024r(c0473pM1018i);
                                            } else {
                                                c0466i.f815b = i29;
                                                c0469l.m1027u(c0473pM1018i);
                                                c0469l.m1016f(C0469l.m1010l(c0466i));
                                            }
                                        }
                                    } else {
                                        c0458a2 = new C0458a(0);
                                        if (c0469l.m1020n(c0466i, c0458a2)) {
                                            c0473pM1018i.f850d = c0458a2.m975j();
                                            c0469l.m1024r(c0473pM1018i);
                                        } else {
                                            c0466i.f815b = i29;
                                            c0469l.m1027u(c0473pM1018i);
                                            c0469l.m1016f(C0469l.m1010l(c0466i));
                                        }
                                    }
                                } else {
                                    int iM998h3 = c0466i.m998h();
                                    if (iM998h3 == 81) {
                                        String strM1000j3 = c0466i.m1000j();
                                        int iIndexOf2 = strM1000j3.indexOf("\\E");
                                        if (iIndexOf2 >= 0) {
                                            strM1000j3 = strM1000j3.substring(0, iIndexOf2);
                                        }
                                        c0466i.f815b = AbstractC1456a.m2438e(c0466i.f815b, 2, strM1000j3);
                                        for (int i30 = 0; i30 < strM1000j3.length(); i30++) {
                                            c0469l.m1016f(strM1000j3.charAt(i30));
                                        }
                                    } else if (iM998h3 == 98) {
                                        c0469l.m1019j(11);
                                    } else if (iM998h3 != 122) {
                                        switch (iM998h3) {
                                            case 65:
                                                c0469l.m1019j(9);
                                                break;
                                            case 66:
                                                c0469l.m1019j(12);
                                                break;
                                            case 67:
                                                throw new PatternSyntaxException("invalid escape sequence", "\\C");
                                            default:
                                                c0466i.f815b = i29;
                                                c0473pM1018i = c0469l.m1018i(4);
                                                c0473pM1018i.f848b = c0469l.f827b;
                                                if (c0466i.m995e("\\p")) {
                                                    c0458a = new C0458a(0);
                                                    if (c0469l.m1021o(c0466i, c0458a)) {
                                                        c0473pM1018i.f850d = c0458a.m975j();
                                                        c0469l.m1024r(c0473pM1018i);
                                                    } else {
                                                        c0458a2 = new C0458a(0);
                                                        if (c0469l.m1020n(c0466i, c0458a2)) {
                                                            c0473pM1018i.f850d = c0458a2.m975j();
                                                            c0469l.m1024r(c0473pM1018i);
                                                        } else {
                                                            c0466i.f815b = i29;
                                                            c0469l.m1027u(c0473pM1018i);
                                                            c0469l.m1016f(C0469l.m1010l(c0466i));
                                                        }
                                                    }
                                                } else {
                                                    c0458a = new C0458a(0);
                                                    if (c0469l.m1021o(c0466i, c0458a)) {
                                                        c0473pM1018i.f850d = c0458a.m975j();
                                                        c0469l.m1024r(c0473pM1018i);
                                                    } else {
                                                        c0458a2 = new C0458a(0);
                                                        if (c0469l.m1020n(c0466i, c0458a2)) {
                                                            c0473pM1018i.f850d = c0458a2.m975j();
                                                            c0469l.m1024r(c0473pM1018i);
                                                        } else {
                                                            c0466i.f815b = i29;
                                                            c0469l.m1027u(c0473pM1018i);
                                                            c0469l.m1016f(C0469l.m1010l(c0466i));
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        c0469l.m1019j(10);
                                    }
                                }
                            } else if (iM997g != 123) {
                                if (iM997g != 124) {
                                    switch (iM997g) {
                                        case 40:
                                            if ((c0469l.f827b & 64) == 0 || !c0466i.m995e("(?")) {
                                                C0473p c0473pM1019j = c0469l.m1019j(20);
                                                int i31 = c0469l.f830e + 1;
                                                c0469l.f830e = i31;
                                                c0473pM1019j.f853g = i31;
                                                c0466i.m1001k(i12);
                                            } else {
                                                int i32 = c0466i.f815b;
                                                String strM1000j4 = c0466i.m1000j();
                                                if (strM1000j4.startsWith("(?P<")) {
                                                    int iIndexOf3 = strM1000j4.indexOf(62);
                                                    if (iIndexOf3 < 0) {
                                                        throw new PatternSyntaxException("invalid named capture", strM1000j4);
                                                    }
                                                    String strSubstring2 = strM1000j4.substring(4, iIndexOf3);
                                                    c0466i.f815b = strSubstring2.length() + c0466i.f815b;
                                                    c0466i.m1001k(5);
                                                    if (!strSubstring2.isEmpty()) {
                                                        int i33 = 0;
                                                        while (i33 < strSubstring2.length()) {
                                                            char cCharAt = strSubstring2.charAt(i33);
                                                            int i34 = i12;
                                                            if (cCharAt == '_' || AbstractC0475r.m1168e(cCharAt)) {
                                                                i33++;
                                                                i12 = i34;
                                                            }
                                                        }
                                                        C0473p c0473pM1019j2 = c0469l.m1019j(20);
                                                        int i35 = c0469l.f830e + 1;
                                                        c0469l.f830e = i35;
                                                        c0473pM1019j2.f853g = i35;
                                                        if (map.put(strSubstring2, Integer.valueOf(i35)) != null) {
                                                            throw new PatternSyntaxException("duplicate capture group name", strSubstring2);
                                                        }
                                                        c0473pM1019j2.f854h = strSubstring2;
                                                        break;
                                                    }
                                                    throw new PatternSyntaxException("invalid named capture", strM1000j4.substring(0, iIndexOf3));
                                                }
                                                int i36 = i12;
                                                c0466i.m1001k(2);
                                                int i37 = c0469l.f827b;
                                                int i38 = i36;
                                                while (true) {
                                                    i9 = 0;
                                                    while (true) {
                                                        if (c0466i.m996f()) {
                                                            iM998h2 = c0466i.m998h();
                                                            if (iM998h2 != 41) {
                                                                if (iM998h2 != 45) {
                                                                    if (iM998h2 != 58) {
                                                                        if (iM998h2 == 85) {
                                                                            i37 |= 32;
                                                                        } else if (iM998h2 == 105) {
                                                                            i37 |= 1;
                                                                        } else if (iM998h2 == 109) {
                                                                            i37 &= -17;
                                                                        } else if (iM998h2 == 115) {
                                                                            i37 |= 8;
                                                                        }
                                                                        i9 = i36;
                                                                    }
                                                                } else if (i38 >= 0) {
                                                                    i37 = ~i37;
                                                                    i38 = -1;
                                                                }
                                                            }
                                                        }
                                                        throw new PatternSyntaxException("invalid or unsupported Perl syntax", c0466i.m993c(i32));
                                                    }
                                                }
                                                if (i38 < 0) {
                                                    if (i9 == 0) {
                                                        throw new PatternSyntaxException("invalid or unsupported Perl syntax", c0466i.m993c(i32));
                                                    }
                                                    i37 = ~i37;
                                                }
                                                if (iM998h2 == 58) {
                                                    c0469l.m1019j(20);
                                                }
                                                c0469l.f827b = i37;
                                            }
                                            break;
                                        case 41:
                                            c0469l.m1015d();
                                            if (c0469l.m1028w()) {
                                                c0469l.m1022p();
                                            }
                                            c0469l.m1013a();
                                            if (c0468k.size() < 2) {
                                                throw new PatternSyntaxException("regexp/syntax: internal error", "stack underflow");
                                            }
                                            C0473p c0473pM1022p = c0469l.m1022p();
                                            C0473p c0473pM1022p2 = c0469l.m1022p();
                                            if (c0473pM1022p2.f847a != 20) {
                                                throw new PatternSyntaxException("missing closing )", str3);
                                            }
                                            c0469l.f827b = c0473pM1022p2.f848b;
                                            if (c0473pM1022p2.f853g == 0) {
                                                c0469l.m1024r(c0473pM1022p);
                                            } else {
                                                c0473pM1022p2.f847a = 13;
                                                c0473pM1022p2.f849c = new C0473p[]{c0473pM1022p};
                                                c0469l.m1024r(c0473pM1022p2);
                                            }
                                            c0466i.m1001k(i12);
                                            break;
                                            break;
                                        case 42:
                                        case 43:
                                            str2 = str3;
                                            s3 = s4;
                                            i3 = c0466i.f815b;
                                            iM998h = c0466i.m998h();
                                            if (iM998h != 42) {
                                                i16 = 14;
                                            } else if (iM998h != 43) {
                                                if (iM998h != 63) {
                                                    i4 = 0;
                                                }
                                                c0469l.m1026t(i4, i14, s3, i3, c0466i, i15);
                                                i15 = i3;
                                            } else {
                                                i16 = 15;
                                            }
                                            i4 = i16;
                                            c0469l.m1026t(i4, i14, s3, i3, c0466i, i15);
                                            i15 = i3;
                                            break;
                                        default:
                                            c0469l.m1016f(c0466i.m998h());
                                            break;
                                    }
                                } else {
                                    int i39 = i12;
                                    c0469l.m1015d();
                                    if (!c0469l.m1028w()) {
                                        c0469l.m1019j(21);
                                    }
                                    c0466i.m1001k(i39);
                                }
                                str2 = str3;
                                s2 = s4;
                                i2 = -1;
                            } else {
                                String str4 = str3;
                                s3 = s4;
                                int i40 = i12;
                                i3 = c0466i.f815b;
                                if (c0466i.m996f() && c0466i.m994d('{')) {
                                    c0466i.m1001k(i40);
                                    int iM1011m2 = C0469l.m1011m(c0466i);
                                    if (iM1011m2 != -1 && c0466i.m996f()) {
                                        if (c0466i.m994d(',')) {
                                            c0466i.m1001k(1);
                                            if (!c0466i.m996f()) {
                                                i8 = -1;
                                                i7 = -1;
                                            } else if (c0466i.m994d('}')) {
                                                iM1011m = -1;
                                            } else {
                                                iM1011m = C0469l.m1011m(c0466i);
                                                i7 = -1;
                                                if (iM1011m != -1) {
                                                    if (!c0466i.m996f() && c0466i.m994d('}')) {
                                                        c0466i.m1001k(1);
                                                        if (iM1011m2 < 0 || iM1011m2 > 1000 || iM1011m == -2 || iM1011m > 1000 || (iM1011m >= 0 && iM1011m2 > iM1011m)) {
                                                            throw new PatternSyntaxException("invalid repeat count", c0466i.m993c(i3));
                                                        }
                                                        i8 = (iM1011m & SupportMenu.USER_MASK) | (iM1011m2 << 16);
                                                    }
                                                }
                                            }
                                        } else {
                                            iM1011m = iM1011m2;
                                        }
                                        i7 = -1;
                                        if (!c0466i.m996f()) {
                                        }
                                    } else {
                                        i8 = -1;
                                        i7 = -1;
                                    }
                                    if (i8 < 0) {
                                        c0466i.f815b = i3;
                                        c0469l.m1016f(c0466i.m998h());
                                        i15 = i3;
                                        str2 = str4;
                                    } else {
                                        i14 = i8 >> 16;
                                        s3 = (short) (i8 & SupportMenu.USER_MASK);
                                        str2 = str4;
                                        c0469l.m1026t(17, i14, s3, i3, c0466i, i15);
                                        i15 = i3;
                                    }
                                } else {
                                    i7 = -1;
                                }
                                i8 = i7;
                                if (i8 < 0) {
                                    c0466i.f815b = i3;
                                    c0469l.m1016f(c0466i.m998h());
                                    i15 = i3;
                                    str2 = str4;
                                } else {
                                    i14 = i8 >> 16;
                                    s3 = (short) (i8 & SupportMenu.USER_MASK);
                                    str2 = str4;
                                    c0469l.m1026t(17, i14, s3, i3, c0466i, i15);
                                    i15 = i3;
                                }
                            }
                            i2 = i5;
                        } else {
                            str2 = str3;
                            s2 = s4;
                            i2 = -1;
                            if ((c0469l.f827b & 16) != 0) {
                                c0469l.m1019j(9);
                            } else {
                                c0469l.m1019j(7);
                            }
                            c0466i.m1001k(1);
                        }
                        s4 = s3;
                        str3 = str2;
                        i12 = 1;
                    } else {
                        str2 = str3;
                        s2 = s4;
                        i2 = -1;
                        if ((c0469l.f827b & 8) != 0) {
                            c0469l.m1019j(6);
                        } else {
                            c0469l.m1019j(5);
                        }
                        c0466i.m1001k(1);
                    }
                    s4 = s2;
                    i15 = i2;
                    str3 = str2;
                    i12 = 1;
                } else {
                    String str5 = str3;
                    c0469l.m1015d();
                    if (c0469l.m1028w()) {
                        c0469l.m1022p();
                    }
                    c0469l.m1013a();
                    if (c0468k.size() != 1) {
                        throw new PatternSyntaxException("missing closing )", str5);
                    }
                    ((C0473p) c0468k.get(0)).f855i = map;
                    c0473p = (C0473p) c0468k.get(0);
                }
            }
        }
        int iM1035b = c0473p.m1035b();
        C0473p c0473pM1170g = AbstractC0475r.m1170g(c0473p);
        C0461d c0461d = new C0461d();
        C0471n c0471n = new C0471n();
        c0471n.f834a = new C0462e[10];
        c0471n.f835b = 0;
        c0471n.f837d = 2;
        c0461d.f793a = c0471n;
        c0461d.m980e(5);
        C0460c c0460cM978c = c0461d.m978c(c0473pM1170g);
        C0471n c0471n2 = (C0471n) c0461d.f793a;
        c0471n2.m1032b(c0460cM978c.f790b, c0461d.m980e(6).f789a);
        c0471n2.f836c = c0460cM978c.f789a;
        C0472o c0472o = new C0472o(str, c0471n2, iM1035b, false);
        StringBuilder sb = new StringBuilder();
        int i41 = c0471n2.f836c;
        C0462e c0462e = c0471n2.f834a[i41];
        while (true) {
            int i42 = c0462e.f794a;
            if (i42 != 7 && i42 != 3) {
                if (8 <= i42 && i42 <= 11 && c0462e.f797d.length == 1) {
                    while (true) {
                        int i43 = c0462e.f794a;
                        if (8 <= i43 && i43 <= 11) {
                            int[] iArr6 = c0462e.f797d;
                            if (iArr6.length == 1 && (c0462e.f796c & 1) == 0) {
                                sb.appendCodePoint(iArr6[0]);
                                int i44 = c0462e.f795b;
                                c0462e = c0471n2.f834a[i44];
                                while (true) {
                                    int i45 = c0462e.f794a;
                                    if (i45 == 7 || i45 == 3) {
                                        c0462e = c0471n2.f834a[i44];
                                        i44 = c0462e.f795b;
                                    }
                                }
                            }
                        }
                    }
                }
                String string = sb.toString();
                c0472o.f843f = string;
                try {
                    string.getBytes("UTF-8");
                    if (!c0472o.f843f.isEmpty()) {
                        c0472o.f844g = c0472o.f843f.codePointAt(0);
                    }
                    return new C0470m(str, c0472o);
                } catch (UnsupportedEncodingException unused) {
                    throw new IllegalStateException("can't happen");
                }
            }
            C0462e c0462e2 = c0471n2.f834a[i41];
            c0462e = c0462e2;
            i41 = c0462e2.f795b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1030b(String str) {
        C0472o c0472o = this.f833t;
        int[] iArr = new int[(c0472o.f841d * 2) + 2];
        C0461d c0461d = new C0461d();
        c0461d.f793a = str;
        return c0472o.m1033a(c0461d, 0, str.length(), 2, iArr, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0470m.class == obj.getClass() && this.f832s.equals(((C0470m) obj).f832s);
    }

    public final int hashCode() {
        return this.f832s.hashCode() * 31;
    }

    public final String toString() {
        return this.f832s;
    }
}
