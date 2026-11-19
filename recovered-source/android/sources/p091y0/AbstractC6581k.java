package p091y0;

import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;

/* JADX INFO: renamed from: y0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6581k extends AbstractC6580j {
    /* JADX INFO: renamed from: p */
    public static Integer m12231p(String str) {
        boolean z;
        int i2;
        int i3;
        AbstractC6452k.m12181e(str, "<this>");
        AbstractC0242F.m346a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (AbstractC6452k.m12182f(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / 10))) || (i3 = i4 * 10) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }
}
