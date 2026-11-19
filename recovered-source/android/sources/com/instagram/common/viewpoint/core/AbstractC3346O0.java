package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3346O0 {
    public static String[] A00 = {"8XYGd5ZHSKJUGKcOBZRj1wh994qBk", "BxRxgsb39CeS8gUybSCvfMthfoa7WN", "MbLF7RBGQJ5IZlZwsL", "5COIZmJumnkEkrhpQeQyhRhZGCLVsyVV", "KxSUW8Yx0pGLd", "vVb3IVkHxruGPbcu6dN9QNWQiYSW5FCa", "S8VYx", "aJn40"};

    public static void A00(AbstractC3310NQ abstractC3310NQ, C3648Sx c3648Sx, String str) {
        if (abstractC3310NQ.A0t() != null && abstractC3310NQ.A0t().A05() != null) {
            int iA04 = abstractC3310NQ.A0t().A04();
            if (A00[2].length() == 15) {
                throw new RuntimeException();
            }
            A00[4] = "IYXFBoSH0TRoN";
            if (iA04 > 0 && abstractC3310NQ.A0t().A03() > 0) {
                c3648Sx.A0c(new C3646Sv(abstractC3310NQ.A0t().A05(), (int) (abstractC3310NQ.A0t().A03() * AbstractC3926XX.A02), (int) (abstractC3310NQ.A0t().A04() * AbstractC3926XX.A02), abstractC3310NQ.A1D(), str));
            }
        }
    }
}
