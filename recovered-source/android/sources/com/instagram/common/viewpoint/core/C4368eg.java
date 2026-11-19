package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4368eg {
    public static byte[] A09;
    public final C2775Ek A02;
    public final C4598iS A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final AbstractC2736E7 A04 = new AbstractC2736E7() { // from class: com.facebook.ads.redexgen.X.4R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21444F c21444f) {
            C4599iT c4599iT = new C4599iT(this.A00.A06, c21444f.A03(), c21444f.A01(), c21444f.A02());
            if (c21444f.A00() >= 0.05d) {
                c4599iT.A06(c21444f.A01());
            }
            C4368eg.A00(this.A00);
            this.A00.A05.A04(c4599iT);
        }
    };
    public final AbstractC2739EA A03 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.4Q
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C21494K c21494k) {
            if (this.A00.A08) {
                C4368eg c4368eg = this.A00;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c4368eg.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C4368eg(C2775Ek c2775Ek, String str, boolean z, Map<String, String> map) {
        this.A06 = str;
        this.A02 = c2775Ek;
        this.A07 = map;
        this.A08 = z;
        this.A05 = new C4598iS(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C4368eg c4368eg) {
        int i2 = c4368eg.A01;
        c4368eg.A01 = i2 + 1;
        return i2;
    }

    public final Map<String, String> A06() {
        String strA01 = C4598iS.A01(this.A05.A03());
        HashMap map = new HashMap();
        if (this.A07 != null) {
            map.putAll(this.A07);
        }
        if (strA01 == null) {
            strA01 = A02(0, 0, 25);
        }
        map.put(A02(22, 6, 33), strA01);
        map.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i2 = this.A00 + 1;
        this.A00 = i2;
        map.put(A02(0, 11, 8), String.valueOf(i2));
        return map;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
