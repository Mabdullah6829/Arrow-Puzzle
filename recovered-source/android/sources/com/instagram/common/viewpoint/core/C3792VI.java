package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3792VI {
    public static byte[] A02;
    public final InterfaceC3784VA A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public C3792VI(String str, InterfaceC3784VA interfaceC3784VA) {
        this.A01 = str;
        this.A00 = interfaceC3784VA;
    }

    public static void A02(EnumC3791VH enumC3791VH, Map<String, String> map, String str, InterfaceC3784VA interfaceC3784VA) {
        A03(enumC3791VH.A03(), map, str, interfaceC3784VA);
    }

    public static void A03(String str, Map<String, String> map, String str2, InterfaceC3784VA interfaceC3784VA) {
        if (!AbstractC3794VK.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        interfaceC3784VA.ABF(str2, map);
    }

    public final void A04(EnumC3791VH enumC3791VH, Map<String, String> data) {
        A05(enumC3791VH.A03(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
