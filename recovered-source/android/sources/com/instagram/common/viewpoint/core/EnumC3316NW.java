package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC3316NW {
    A04(A01(23, 14, C1137R.styleable.ConstraintSet_polarRelativeTo)),
    A05(A01(37, 9, 3));

    public static byte[] A01;
    public static String[] A02 = {"wiqydbsLJDwKBvl8t", "43d9HmwIqa0UmHFIq", "pggHvImyjq29EoPdIbNPEyFQYY47zx5L", "Y7HVzfyHvrAyRWnGs1HIvpl", "hbOUIe", "Z6uWuqD1EDiaZecfB", "H4uwq6", "uO2zzJUzM8GpymnowP"};
    public final String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = bArrCopyOfRange[i5];
            String[] strArr = A02;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[7] = "YRQbc7SZzU6A3uauK9TIi077IJfJ6";
            bArrCopyOfRange[i5] = (byte) ((b - i4) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-84, -72, -73, -67, -82, -63, -67, -66, -86, -75, -56, -86, -71, -71, -30, -45, -39, -41, -15, -30, -31, -27, -26, 20, 32, 31, 37, 22, 41, 37, 38, 18, 29, 16, 18, 33, 33, -82, -97, -91, -93, -99, -82, -83, -79, -78};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "ja6ocK";
        strArr2[4] = "zrwWzc";
    }

    static {
        A02();
    }

    EnumC3316NW(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static EnumC3316NW A00(String str) {
        byte b;
        switch (str.hashCode()) {
            case 883765328:
                if (!str.equals(A01(37, 9, 3))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1434358835:
                boolean zEquals = str.equals(A01(23, 14, C1137R.styleable.ConstraintSet_polarRelativeTo));
                if (A02[7].length() == 12) {
                    String[] strArr = A02;
                    strArr[3] = "XJGJWrBy1UqGLv6Rhel9amw";
                    strArr[1] = "eBE1kZuIIDAbDWtcc";
                    if (!zEquals) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                } else {
                    A02[7] = "bogI3bwqsUF49nq3u6zYPkLLi";
                    if (!zEquals) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return A04;
            default:
                EnumC3316NW enumC3316NW = A05;
                if (A02[2].charAt(22) == 'a') {
                    throw new RuntimeException();
                }
                A02[7] = "wI7Mn7kKRaTG8Mvy9wZ";
                return enumC3316NW;
        }
    }
}
