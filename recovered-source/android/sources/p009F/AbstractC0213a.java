package p009F;

import p001B.AbstractC0076b;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0213a {
    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m294a(double d) {
        if (Math.getExponent(d) <= 1023) {
            if (d != 0.0d) {
                AbstractC0076b.m131f(Math.getExponent(d) <= 1023, "not a normal value");
                int exponent = Math.getExponent(d);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d)) {
                }
            }
            return true;
        }
        return false;
    }
}
