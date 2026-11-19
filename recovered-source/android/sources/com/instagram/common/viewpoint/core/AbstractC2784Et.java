package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2784Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5019pY A01(C2779Eo c2779Eo, List<? extends InterfaceC2781Eq>[] listArr) {
        C20302K c20302k = new C20302K();
        int i2 = 0;
        while (true) {
            boolean z = false;
            if (i2 >= c2779Eo.A02()) {
                C4894nW c4894nWA06 = c2779Eo.A06();
                for (int i3 = 0; i3 < c4894nWA06.A01; i3++) {
                    C5027pg c5027pgA05 = c4894nWA06.A05(i3);
                    int[] iArr = new int[c5027pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c20302k.A04(new C5020pZ(c5027pgA05, false, iArr, new boolean[c5027pgA05.A01]));
                }
                return new C5019pY(c20302k.A05());
            }
            C4894nW c4894nWA07 = c2779Eo.A07(i2);
            List<? extends InterfaceC2781Eq> list = listArr[i2];
            int i4 = 0;
            while (i4 < c4894nWA07.A01) {
                C5027pg c5027pgA06 = c4894nWA07.A05(i4);
                int iA05 = c2779Eo.A05(i2, i4, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) == strArr[0].charAt(11)) {
                    String[] strArr2 = A00;
                    strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                    strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                    boolean z2 = iA05 != 0;
                    int[] iArr2 = new int[c5027pgA06.A01];
                    boolean[] zArr = new boolean[c5027pgA06.A01];
                    for (int i5 = 0; i5 < c5027pgA06.A01; i5++) {
                        iArr2[i5] = c2779Eo.A04(i2, i4, i5);
                        boolean z3 = false;
                        if (A00[5].length() == 9) {
                            String[] strArr3 = A00;
                            strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                            strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                            for (int i6 = 0; i6 < list.size(); i6++) {
                                InterfaceC2781Eq interfaceC2781Eq = list.get(i6);
                                if (interfaceC2781Eq.A9L().equals(c5027pgA06) && interfaceC2781Eq.AA6(i5) != -1) {
                                    z3 = true;
                                    break;
                                }
                            }
                            zArr[i5] = z3;
                        }
                    }
                    c20302k.A04(new C5020pZ(c5027pgA06, z2, iArr2, zArr));
                    i4++;
                    z = false;
                }
                throw new RuntimeException();
            }
            i2++;
        }
    }

    public static C5019pY A00(C2779Eo c2779Eo, InterfaceC2781Eq[] interfaceC2781EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC2781EqArr.length];
        for (int i2 = 0; i2 < interfaceC2781EqArr.length; i2++) {
            InterfaceC2781Eq interfaceC2781Eq = interfaceC2781EqArr[i2];
            if (interfaceC2781Eq != null) {
                listA01 = AbstractC2570BP.A04(interfaceC2781Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i2] = listA01;
        }
        return A01(c2779Eo, listArr);
    }
}
