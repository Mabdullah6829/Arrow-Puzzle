package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5097r5 {
    public static C5097r5 A03;
    public static InterfaceC5125rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C5107rF A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = bArrCopyOfRange[i5];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i5] = (byte) ((b - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C5097r5(ViewpointQeConfig viewpointQeConfig, AbstractC5113rL abstractC5113rL, C5107rF c5107rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c5107rF;
        abstractC5113rL.A03(new C2528Aj(c5107rF));
    }

    public static ScanDelayController A00(int i2) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C5097r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC5113rL abstractC5113rL, InterfaceC5118rQ interfaceC5118rQ, InterfaceC2530Al interfaceC2530Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C5097r5 c5097r5 = A03;
        if (c5097r5 != null) {
            return c5097r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        C2626CK c2626ck = C2626CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C5097r5(viewpointQeConfig, abstractC5113rL, new C5107rF(viewpointQeConfig, interfaceC5118rQ, c2626ck, interfaceC2530Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC5112rK interfaceC5112rK) {
        this.A02.A0H(interfaceC5112rK);
    }

    public final void A05(InterfaceC5110rI interfaceC5110rI) {
        this.A02.A0I(interfaceC5110rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C5122rU c5122rU) {
        if (this.A00.A00 && c5122rU != null) {
            this.A01.A06(dspViewableNode, c5122rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C5122rU c5122rU, C5115rN c5115rN) {
        if (this.A00.A00 && c5122rU != null) {
            this.A01.A07(dspViewableNode, c5122rU, c5115rN);
        } else {
            this.A01.A08(dspViewableNode, c5115rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C5115rN c5115rN) {
        A08(dspViewableNode, null, c5115rN);
    }
}
