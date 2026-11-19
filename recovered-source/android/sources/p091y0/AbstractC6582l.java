package p091y0;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: y0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6582l extends AbstractC6581k {
    /* JADX INFO: renamed from: q */
    public static String m12232q(byte[] bArr) {
        AbstractC6452k.m12181e(bArr, "<this>");
        return new String(bArr, AbstractC6571a.f24799a);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m12233r(String str, String suffix, boolean z) {
        AbstractC6452k.m12181e(str, "<this>");
        AbstractC6452k.m12181e(suffix, "suffix");
        return !z ? str.endsWith(suffix) : m12234s(str, str.length() - suffix.length(), true, suffix, 0, suffix.length());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m12234s(String str, int i2, boolean z, String other, int i3, int i4) {
        AbstractC6452k.m12181e(str, "<this>");
        AbstractC6452k.m12181e(other, "other");
        return !z ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z, i2, other, i3, i4);
    }

    /* JADX INFO: renamed from: t */
    public static String m12235t(String str, String str2, String str3) {
        int iM12228x = AbstractC6574d.m12228x(str, str2, 0, false);
        if (iM12228x < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iM12228x);
            sb.append(str3);
            i3 = iM12228x + length;
            if (iM12228x >= str.length()) {
                break;
            }
            iM12228x = AbstractC6574d.m12228x(str, str2, iM12228x + i2, false);
        } while (iM12228x > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m12236u(String str, String prefix) {
        AbstractC6452k.m12181e(str, "<this>");
        AbstractC6452k.m12181e(prefix, "prefix");
        return str.startsWith(prefix);
    }
}
