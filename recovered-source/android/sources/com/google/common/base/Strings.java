package com.google.common.base;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, 16, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, 42, 49, 40, 40, 74, 70, 18, 122, 48, 13, 22, 16, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, 16, 27, 28, 16, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 38, 42, 40, 40, 42, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o) {
        if (o == null) {
            return A00(94, 4, 87);
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + str, (Throwable) e);
            return A00(27, 1, 44) + str + A00(2, 7, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + e.getClass().getName() + A00(28, 1, 70);
        }
    }

    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i2;
        String strValueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 70)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i3 = 0;
        int i4 = 0;
        while (i4 < args.length && (i2 = strValueOf.indexOf(A00(9, 2, 51), i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, i2);
            int templateStart2 = i4 + 1;
            sb.append(args[i4]);
            i3 = i2 + 2;
            i4 = templateStart2;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i4 < args.length) {
            sb.append(A00(0, 2, 94));
            int i5 = i4 + 1;
            sb.append(args[i4]);
            while (i5 < args.length) {
                sb.append(A00(25, 2, 100));
                int templateStart3 = i5 + 1;
                sb.append(args[i5]);
                i5 = templateStart3;
            }
            sb.append(']');
        }
        String string = sb.toString();
        String[] strArr = A01;
        String str = strArr[6];
        String str2 = strArr[2];
        int templateStart4 = str.charAt(10);
        int i6 = str2.charAt(10);
        if (templateStart4 == i6) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
        strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
        return string;
    }
}
