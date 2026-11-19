package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3180LJ {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C5064qI> A00;
    public final InterfaceC2953Hd[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 6);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, 127, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public C3180LJ(List<C5064qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC2953Hd[list.size()];
    }

    public final void A02(long j2, C21864v c21864v) {
        if (c21864v.A07() < 9) {
            return;
        }
        int userDataIdentifier = c21864v.A0C();
        int iA0C = c21864v.A0C();
        int iA0I = c21864v.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (iA0C == 1195456820 && iA0I == 3) {
                AbstractC2917H3.A04(j2, c21864v, this.A01);
            }
        }
    }

    public final void A03(InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        for (int i2 = 0; i2 < i; i2++) {
            c3177lg.A05();
            InterfaceC2953Hd interfaceC2953HdAKS = interfaceC2924HA.AKS(c3177lg.A03(), 3);
            C5064qI c5064qI = this.A00.get(i2);
            String str = c5064qI.A0W;
            AbstractC21273y.A09(A00(43, 19, 115).equals(str) || A00(62, 19, 37).equals(str), A00(0, 43, 63) + str);
            C20592p c20592pA11 = new C20592p().A0y(c3177lg.A04()).A11(str);
            int i3 = c5064qI.A0H;
            C20592p c20592pA10 = c20592pA11.A0n(i3).A10(c5064qI.A0V);
            int i4 = c5064qI.A03;
            interfaceC2953HdAKS.A6e(c20592pA10.A0Z(i4).A12(c5064qI.A0X).A14());
            this.A01[i2] = interfaceC2953HdAKS;
        }
    }
}
