package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4197bu {
    public static float A00(C3311NR c3311nr) {
        int height = c3311nr.A0H().A01();
        int width = c3311nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) (((double) (AbstractC3925XW.A00().widthPixels - (AbstractC4206c3.A08 * 2))) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC3966YB.A01(16);
        int ctaTextHeight = AbstractC4178bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC4206c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC3925XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC4196bt A03(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, String str) {
        return new ViewOnClickListenerC4196bt(viewOnClickListenerC3152Kr, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i2) {
        return A02(i2) < A01(d);
    }

    public static boolean A06(int i2, int i3, double d) {
        return i2 == 2 || A05(d, i3);
    }
}
