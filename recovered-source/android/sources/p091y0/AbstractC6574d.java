package p091y0;

import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p087v0.C6545d;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6574d extends AbstractC6582l {
    /* JADX INFO: renamed from: A */
    public static boolean m12222A(String str) {
        AbstractC6452k.m12181e(str, "<this>");
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static int m12223B(String str, String str2) {
        int iM12227w = m12227w(str);
        AbstractC6452k.m12181e(str, "<this>");
        return str.lastIndexOf(str2, iM12227w);
    }

    /* JADX INFO: renamed from: C */
    public static String m12224C(String str, String delimiter) {
        AbstractC6452k.m12181e(delimiter, "delimiter");
        int iM12230z = m12230z(str, delimiter, 0, 6);
        if (iM12230z == -1) {
            return str;
        }
        String strSubstring = str.substring(delimiter.length() + iM12230z, str.length());
        AbstractC6452k.m12180d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: D */
    public static String m12225D(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(46, m12227w(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC6452k.m12180d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m12226v(String str, String other) {
        AbstractC6452k.m12181e(str, "<this>");
        AbstractC6452k.m12181e(other, "other");
        return m12230z(str, other, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m12227w(CharSequence charSequence) {
        AbstractC6452k.m12181e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: x */
    public static final int m12228x(CharSequence other, String string, int i2, boolean z) {
        AbstractC6452k.m12181e(other, "<this>");
        AbstractC6452k.m12181e(string, "string");
        if (!z && (other instanceof String)) {
            return ((String) other).indexOf(string, i2);
        }
        int length = other.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = other.length();
        if (length > length2) {
            length = length2;
        }
        C6545d c6545d = new C6545d(i2, length, 1);
        boolean z2 = other instanceof String;
        int i3 = c6545d.f24769u;
        int i4 = c6545d.f24768t;
        int i5 = c6545d.f24767s;
        if (z2 && (string instanceof String)) {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str = string;
                boolean z3 = z;
                if (AbstractC6582l.m12234s(str, 0, z3, (String) other, i6, string.length())) {
                    return i6;
                }
                if (i6 == i4) {
                    return -1;
                }
                i6 += i3;
                string = str;
                z = z3;
            }
        } else {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            while (true) {
                int length3 = string.length();
                AbstractC6452k.m12181e(other, "other");
                if (i5 >= 0 && string.length() - length3 >= 0 && i5 <= other.length() - length3) {
                    for (int i7 = 0; i7 < length3; i7++) {
                        if (AbstractC0242F.m352i(string.charAt(i7), other.charAt(i5 + i7), z)) {
                        }
                    }
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m12229y(CharSequence charSequence, char c, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        AbstractC6452k.m12181e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i2);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iM12227w = m12227w(charSequence);
        if (i2 > iM12227w) {
            return -1;
        }
        while (!AbstractC0242F.m352i(cArr[0], charSequence.charAt(i2), false)) {
            if (i2 == iM12227w) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m12230z(CharSequence charSequence, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m12228x(charSequence, str, i2, false);
    }
}
