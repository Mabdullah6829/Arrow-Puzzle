package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3625SZ {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C3623SX> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
            i5++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C3623SX A00() {
        C3623SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C3623SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.common.viewpoint.core.C3623SX A01(com.instagram.common.viewpoint.core.C3659T8 r5, com.instagram.common.viewpoint.core.C3623SX r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.SX r0 = com.instagram.common.viewpoint.core.AbstractC3630Sf.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Tc r5 = r5.A08()
            int r4 = com.instagram.common.viewpoint.core.AbstractC3690Td.A1Q
            com.facebook.ads.redexgen.X.Te r3 = new com.facebook.ads.redexgen.X.Te
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.ABC(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC3625SZ.A01(com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.SX):com.facebook.ads.redexgen.X.SX");
    }

    public static C3623SX A02(C3659T8 c3659t8, C3623SX c3623sx, C3624SY c3624sy) {
        C3626Sa c3626SaA00 = null;
        try {
            if (AbstractC3762Uo.A06(c3659t8) && (c3623sx == null || TextUtils.isEmpty(c3623sx.A03()))) {
                c3626SaA00 = AbstractC3627Sb.A00(c3659t8.getContentResolver());
            }
        } catch (Throwable th) {
            c3659t8.A08().ABC(A04(12, 7, 84), AbstractC3690Td.A1S, new C3691Te(th));
        }
        if (c3626SaA00 != null && c3626SaA00.A01 != null) {
            A03.set(c3626SaA00.A01);
            c3624sy.A05(c3626SaA00.A01);
        }
        if (c3623sx == null && c3626SaA00 != null && !TextUtils.isEmpty(c3626SaA00.A00)) {
            return new C3623SX(c3626SaA00.A00, c3626SaA00.A02, EnumC3622SW.A04);
        }
        return c3623sx;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C3624SY c3624sy) {
        A02.set(c3624sy.A02());
        A03.set(c3624sy.A03());
    }

    public static void A07(C3659T8 c3659t8) {
        long jA01;
        C3623SX advertisingIdInfo;
        try {
            C3624SY c3624sy = new C3624SY(c3659t8);
            A06(c3624sy);
            if (A08()) {
                return;
            }
            C3623SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < AbstractC3762Uo.A00(c3659t8)) {
                return;
            }
            if (AbstractC3762Uo.A07(c3659t8)) {
                advertisingIdInfo = A01(c3659t8, A02(c3659t8, null, c3624sy));
            } else {
                advertisingIdInfo = A02(c3659t8, A01(c3659t8, null), c3624sy);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c3624sy.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            c3659t8.A08().ABC(A04(12, 7, 84), AbstractC3690Td.A1R, new C3691Te(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = C3906XD.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = C3906XD.A05(strA04);
            if (updated2) {
                A03.set(C3906XD.A01(strA04));
                z = true;
            }
        }
        boolean zA04 = C3906XD.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z;
        }
        String strA05 = A04(19, 13, 108);
        boolean updated3 = C3906XD.A05(strA05);
        if (updated3) {
            String strA01 = C3906XD.A01(strA05);
            AtomicReference<C3623SX> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new C3623SX(strA01, false, EnumC3622SW.A03));
            return true;
        }
        return z;
    }
}
