package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3843W9 {
    public static boolean A00;
    public static byte[] A01;
    public static final Map<String, Long> A02;
    public static final Map<String, Long> A03;
    public static final Map<String, String> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{96, 54, 127, 96, 54, 127, 96, 33, 127, 96, 33, 127, 96, 33, 82, 92, 4, 92, 0, 87, 85, 85, 11, 45, 55, 48, 57, 126, 50, 63, 45, 42, 126, 63, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A03 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A04 = new ConcurrentHashMap();
        A00 = false;
    }

    public static long A00(String str, EnumC3824Vq enumC3824Vq) {
        if (A03.containsKey(str)) {
            return A03.get(str).longValue();
        }
        switch (enumC3824Vq) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(C3844WA c3844wa) {
        AbstractC3832Vy.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A04.get(A03(c3844wa));
    }

    public static String A03(C3844WA c3844wa) {
        return String.format(Locale.US, A01(0, 14, 29), c3844wa.A09(), c3844wa.A07(), Integer.valueOf(c3844wa.A08() == null ? 0 : c3844wa.A08().A00()), Integer.valueOf(c3844wa.A08() == null ? 0 : c3844wa.A08().A01()), Integer.valueOf(c3844wa.A04()));
    }

    public static void A05(long j2, C3844WA c3844wa) {
        A03.put(A03(c3844wa), Long.valueOf(j2));
    }

    public static void A06(C3844WA c3844wa) {
        A02.put(A03(c3844wa), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C3844WA c3844wa) {
        A04.put(A03(c3844wa), str);
    }

    public static boolean A08(C3844WA c3844wa) {
        if (A00) {
            return false;
        }
        String strA03 = A03(c3844wa);
        if (A02.containsKey(strA03)) {
            return System.currentTimeMillis() - A02.get(strA03).longValue() < A00(strA03, c3844wa.A07());
        }
        return false;
    }
}
