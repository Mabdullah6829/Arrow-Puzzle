package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.L9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3170L9 {
    public static byte[] A02;
    public final List<C5064qI> A00;
    public final InterfaceC2953Hd[] A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public C3170L9(List<C5064qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC2953Hd[list.size()];
    }

    public final void A02(long j2, C21864v c21864v) {
        AbstractC2917H3.A03(j2, c21864v, this.A01);
    }

    public final void A03(InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        for (int i2 = 0; i2 < i; i2++) {
            c3177lg.A05();
            InterfaceC2953Hd interfaceC2953HdAKS = interfaceC2924HA.AKS(c3177lg.A03(), 3);
            C5064qI c5064qI = this.A00.get(i2);
            String str = c5064qI.A0W;
            AbstractC21273y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C20592p c20592pA11 = new C20592p().A0y(c5064qI.A0T != null ? c5064qI.A0T : c3177lg.A04()).A11(str);
            int i3 = c5064qI.A0H;
            C20592p c20592pA10 = c20592pA11.A0n(i3).A10(c5064qI.A0V);
            int i4 = c5064qI.A03;
            interfaceC2953HdAKS.A6e(c20592pA10.A0Z(i4).A12(c5064qI.A0X).A14());
            this.A01[i2] = interfaceC2953HdAKS;
        }
    }
}
