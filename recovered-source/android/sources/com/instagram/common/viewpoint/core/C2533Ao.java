package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2533Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC5126rY A00;
    public InterfaceC5110rI A01;
    public C5097r5 A02;
    public final InterfaceC5111rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC5110rI A03 = new C2534Ap(this);

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C2533Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC5126rY interfaceC5126rY, InterfaceC5111rJ interfaceC5111rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC5126rY;
        this.A04 = interfaceC5111rJ;
    }

    public static C2533Ao A01() {
        return new C2533Ao(new ViewpointQeConfig(), new C2536Ar(), null);
    }

    private void A05(AbstractC5113rL abstractC5113rL, InterfaceC5118rQ interfaceC5118rQ, InterfaceC2530Al interfaceC2530Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C5097r5.A01(this.A05, abstractC5113rL, interfaceC5118rQ, interfaceC2530Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C5122rU c5122rU) {
        C5097r5 c5097r5 = this.A02;
        if (c5097r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c5122rU != null) {
                c5097r5.A07(dspViewableNode, c5122rU);
            } else {
                c5097r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C5122rU c5122rU, C5115rN c5115rN) {
        C5097r5 c5097r5 = this.A02;
        if (c5097r5 != null && dspViewableNode != null && c5115rN != null) {
            if (this.A05.A00 && c5122rU != null) {
                c5115rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c5115rN.A08 + c5122rU;
                c5097r5.A08(dspViewableNode, c5122rU, c5115rN);
            } else {
                c5097r5.A09(dspViewableNode, c5115rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C5115rN<?, ?> c5115rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c5115rN);
    }

    public final void A0A(AbstractC5113rL abstractC5113rL, View view) {
        if (abstractC5113rL != null && view != null) {
            A05(abstractC5113rL, new C2535Aq(view, this.A00), new C20041u(null), null);
        }
    }
}
