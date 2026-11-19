package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2917H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, -31, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    public static int A00(C21864v c21864v) {
        int i2 = 0;
        while (value != 0) {
            int b = c21864v.A0I();
            i2 += b;
            if (b != 255) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j2, C21864v c21864v, InterfaceC2953Hd[] interfaceC2953HdArr) {
        while (true) {
            if (c21864v.A07() > 1) {
                int iA00 = A00(c21864v);
                int iA01 = A00(c21864v);
                int iA09 = c21864v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c21864v.A07();
                    if (iA01 > payloadType) {
                        AbstractC21714g.A07(A01(0, 7, 3), A01(7, 45, 16));
                        iA09 = c21864v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c21864v.A0I();
                        int providerCode = c21864v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c21864v.A0C();
                        }
                        int iA0I = c21864v.A0I();
                        if (providerCode == 47) {
                            c21864v.A0g(1);
                        }
                        int i2 = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i2 &= userDataTypeCode;
                        }
                        if (i2 != 0) {
                            A04(j2, c21864v, interfaceC2953HdArr);
                        }
                    }
                } else {
                    AbstractC21714g.A07(A01(0, 7, 3), A01(7, 45, 16));
                    iA09 = c21864v.A0A();
                }
                c21864v.A0f(iA09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j2, C21864v c21864v, InterfaceC2953Hd[] interfaceC2953HdArr) {
        int firstByte = c21864v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c21864v.A0g(1);
        int i2 = (firstByte & 31) * 3;
        int iA09 = c21864v.A09();
        for (InterfaceC2953Hd interfaceC2953Hd : interfaceC2953HdArr) {
            c21864v.A0f(iA09);
            interfaceC2953Hd.AIr(c21864v, i2);
            if (j2 != -9223372036854775807L) {
                interfaceC2953Hd.AIu(j2, 1, i2, 0, null);
            }
        }
    }
}
