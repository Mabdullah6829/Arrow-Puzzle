package p024O;

import java.util.Arrays;
import java.util.Map;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: O.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0473p {

    /* JADX INFO: renamed from: j */
    public static final C0473p[] f846j = new C0473p[0];

    /* JADX INFO: renamed from: a */
    public int f847a;

    /* JADX INFO: renamed from: b */
    public int f848b;

    /* JADX INFO: renamed from: c */
    public C0473p[] f849c;

    /* JADX INFO: renamed from: d */
    public int[] f850d;

    /* JADX INFO: renamed from: e */
    public int f851e;

    /* JADX INFO: renamed from: f */
    public int f852f;

    /* JADX INFO: renamed from: g */
    public int f853g;

    /* JADX INFO: renamed from: h */
    public String f854h;

    /* JADX INFO: renamed from: i */
    public Map f855i;

    public C0473p(int i2) {
        this.f847a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1034a(StringBuilder sb) {
        String str;
        int i2 = 0;
        switch (AbstractC6468c.m12193b(this.f847a)) {
            case 0:
                sb.append("[^\\x00-\\x{10FFFF}]");
                break;
            case 1:
                sb.append("(?:)");
                break;
            case 2:
                if ((this.f848b & 1) != 0) {
                    sb.append("(?i:");
                }
                int[] iArr = this.f850d;
                int length = iArr.length;
                while (i2 < length) {
                    AbstractC0475r.m1165b(iArr[i2], sb);
                    i2++;
                }
                if ((this.f848b & 1) != 0) {
                    sb.append(')');
                }
                break;
            case 3:
                if (this.f850d.length % 2 == 0) {
                    sb.append('[');
                    int[] iArr2 = this.f850d;
                    if (iArr2.length == 0) {
                        sb.append("^\\x00-\\x{10FFFF}");
                    } else if (iArr2[0] == 0 && iArr2[iArr2.length - 1] == 1114111) {
                        sb.append('^');
                        int i3 = 1;
                        while (true) {
                            int[] iArr3 = this.f850d;
                            if (i3 < iArr3.length - 1) {
                                int i4 = iArr3[i3] + 1;
                                int i5 = iArr3[i3 + 1] - 1;
                                if (i4 == 45) {
                                    sb.append('\\');
                                }
                                AbstractC0475r.m1165b(i4, sb);
                                if (i4 != i5) {
                                    sb.append('-');
                                    if (i5 == 45) {
                                        sb.append('\\');
                                    }
                                    AbstractC0475r.m1165b(i5, sb);
                                }
                                i3 += 2;
                            }
                        }
                    } else {
                        while (true) {
                            int[] iArr4 = this.f850d;
                            if (i2 < iArr4.length) {
                                int i6 = iArr4[i2];
                                int i7 = iArr4[i2 + 1];
                                if (i6 == 45) {
                                    sb.append('\\');
                                }
                                AbstractC0475r.m1165b(i6, sb);
                                if (i6 != i7) {
                                    sb.append('-');
                                    if (i7 == 45) {
                                        sb.append('\\');
                                    }
                                    AbstractC0475r.m1165b(i7, sb);
                                }
                                i2 += 2;
                            }
                        }
                    }
                    sb.append(']');
                } else {
                    sb.append("[invalid char class]");
                }
                break;
            case 4:
                sb.append("(?-s:.)");
                break;
            case 5:
                sb.append("(?s:.)");
                break;
            case 6:
                sb.append('^');
                break;
            case 7:
                sb.append('$');
                break;
            case 8:
                sb.append("\\A");
                break;
            case 9:
                if ((this.f848b & 256) == 0) {
                    sb.append("\\z");
                } else {
                    sb.append("(?-m:$)");
                }
                break;
            case 10:
                sb.append("\\b");
                break;
            case 11:
                sb.append("\\B");
                break;
            case 12:
                String str2 = this.f854h;
                if (str2 == null || str2.isEmpty()) {
                    sb.append('(');
                } else {
                    sb.append("(?P<");
                    sb.append(this.f854h);
                    sb.append(">");
                }
                C0473p c0473p = this.f849c[0];
                if (c0473p.f847a != 2) {
                    c0473p.m1034a(sb);
                }
                sb.append(')');
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                C0473p c0473p2 = this.f849c[0];
                if (AbstractC6468c.m12193b(c0473p2.f847a) > 12 || (c0473p2.f847a == 3 && c0473p2.f850d.length > 1)) {
                    sb.append("(?:");
                    c0473p2.m1034a(sb);
                    sb.append(')');
                } else {
                    c0473p2.m1034a(sb);
                }
                switch (AbstractC6468c.m12193b(this.f847a)) {
                    case 13:
                        sb.append('*');
                        break;
                    case 14:
                        sb.append('+');
                        break;
                    case 15:
                        sb.append('?');
                        break;
                    case 16:
                        sb.append('{');
                        sb.append(this.f851e);
                        if (this.f851e != this.f852f) {
                            sb.append(',');
                            int i8 = this.f852f;
                            if (i8 >= 0) {
                                sb.append(i8);
                            }
                        }
                        sb.append('}');
                        break;
                }
                if ((this.f848b & 32) != 0) {
                    sb.append('?');
                }
                break;
            case 17:
                C0473p[] c0473pArr = this.f849c;
                int length2 = c0473pArr.length;
                while (i2 < length2) {
                    C0473p c0473p3 = c0473pArr[i2];
                    if (c0473p3.f847a == 19) {
                        sb.append("(?:");
                        c0473p3.m1034a(sb);
                        sb.append(')');
                    } else {
                        c0473p3.m1034a(sb);
                    }
                    i2++;
                }
                break;
            case 18:
                C0473p[] c0473pArr2 = this.f849c;
                int length3 = c0473pArr2.length;
                String str3 = "";
                while (i2 < length3) {
                    C0473p c0473p4 = c0473pArr2[i2];
                    sb.append(str3);
                    c0473p4.m1034a(sb);
                    i2++;
                    str3 = "|";
                }
                break;
            default:
                switch (this.f847a) {
                    case 1:
                        str = "NO_MATCH";
                        break;
                    case 2:
                        str = "EMPTY_MATCH";
                        break;
                    case 3:
                        str = "LITERAL";
                        break;
                    case 4:
                        str = "CHAR_CLASS";
                        break;
                    case 5:
                        str = "ANY_CHAR_NOT_NL";
                        break;
                    case 6:
                        str = "ANY_CHAR";
                        break;
                    case 7:
                        str = "BEGIN_LINE";
                        break;
                    case 8:
                        str = "END_LINE";
                        break;
                    case 9:
                        str = "BEGIN_TEXT";
                        break;
                    case 10:
                        str = "END_TEXT";
                        break;
                    case 11:
                        str = "WORD_BOUNDARY";
                        break;
                    case 12:
                        str = "NO_WORD_BOUNDARY";
                        break;
                    case 13:
                        str = "CAPTURE";
                        break;
                    case 14:
                        str = "STAR";
                        break;
                    case 15:
                        str = "PLUS";
                        break;
                    case 16:
                        str = "QUEST";
                        break;
                    case 17:
                        str = "REPEAT";
                        break;
                    case 18:
                        str = "CONCAT";
                        break;
                    case 19:
                        str = "ALTERNATE";
                        break;
                    case 20:
                        str = "LEFT_PAREN";
                        break;
                    case 21:
                        str = "VERTICAL_BAR";
                        break;
                    default:
                        str = "null";
                        break;
                }
                sb.append(str);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1035b() {
        int i2 = this.f847a == 13 ? this.f853g : 0;
        C0473p[] c0473pArr = this.f849c;
        if (c0473pArr != null) {
            for (C0473p c0473p : c0473pArr) {
                int iM1035b = c0473p.m1035b();
                if (i2 < iM1035b) {
                    i2 = iM1035b;
                }
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj instanceof C0473p) {
            C0473p c0473p = (C0473p) obj;
            int i2 = this.f847a;
            if (i2 == c0473p.f847a) {
                int iM12193b = AbstractC6468c.m12193b(i2);
                if (iM12193b == 2 || iM12193b == 3) {
                    if (Arrays.equals(this.f850d, c0473p.f850d)) {
                        return true;
                    }
                } else if (iM12193b != 9) {
                    switch (iM12193b) {
                        case 12:
                            if (this.f853g == c0473p.f853g && ((str = this.f854h) != null ? str.equals(c0473p.f854h) : c0473p.f854h == null) && this.f849c[0].equals(c0473p.f849c[0])) {
                                return true;
                            }
                            break;
                        case 13:
                        case 14:
                        case 15:
                            if ((this.f848b & 32) == (c0473p.f848b & 32) && this.f849c[0].equals(c0473p.f849c[0])) {
                                return true;
                            }
                            break;
                        case 16:
                            if ((this.f848b & 32) == (c0473p.f848b & 32) && this.f851e == c0473p.f851e && this.f852f == c0473p.f852f && this.f849c[0].equals(c0473p.f849c[0])) {
                                return true;
                            }
                            break;
                        case 17:
                        case 18:
                            if (this.f849c.length == c0473p.f849c.length) {
                                int i3 = 0;
                                while (true) {
                                    C0473p[] c0473pArr = this.f849c;
                                    if (i3 >= c0473pArr.length) {
                                        return true;
                                    }
                                    if (c0473pArr[i3].equals(c0473p.f849c[i3])) {
                                        i3++;
                                    }
                                }
                            }
                            break;
                        default:
                            return true;
                    }
                } else if ((this.f848b & 256) == (c0473p.f848b & 256)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2;
        int iHashCode2;
        int iHashCode3;
        int iM12193b = AbstractC6468c.m12193b(this.f847a);
        int iM12193b2 = AbstractC6468c.m12193b(this.f847a);
        if (iM12193b2 == 2 || iM12193b2 == 3) {
            iHashCode = Arrays.hashCode(this.f850d);
        } else if (iM12193b2 != 9) {
            switch (iM12193b2) {
                case 12:
                    int i3 = this.f853g * 31;
                    String str = this.f854h;
                    iHashCode2 = ((str != null ? str.hashCode() : 0) * 31) + i3;
                    iHashCode3 = this.f849c[0].hashCode();
                    i2 = (iHashCode3 * 31) + iHashCode2;
                    return i2 + iM12193b;
                case 13:
                case 14:
                case 15:
                    return (this.f849c[0].hashCode() * 31) + ((this.f848b & 32) * 31) + iM12193b;
                case 16:
                    iHashCode2 = (this.f852f * 31) + (this.f851e * 31);
                    iHashCode3 = this.f849c[0].hashCode();
                    i2 = (iHashCode3 * 31) + iHashCode2;
                    return i2 + iM12193b;
                case 17:
                case 18:
                    iHashCode = Arrays.deepHashCode(this.f849c);
                    break;
                default:
                    return iM12193b;
            }
        } else {
            iHashCode = this.f848b & 256;
        }
        i2 = iHashCode * 31;
        return i2 + iM12193b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m1034a(sb);
        return sb.toString();
    }
}
