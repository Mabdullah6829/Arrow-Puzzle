package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3921XS {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC4669jd A02;
    public final C4494gi A03;
    public final InterfaceC3919XQ A04;

    public C3921XS(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, InterfaceC3919XQ interfaceC3919XQ) {
        this.A03 = c4494gi;
        this.A04 = interfaceC3919XQ;
        this.A02 = abstractC4669jd;
    }

    public static C3921XS A00(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, InterfaceC3919XQ interfaceC3919XQ) {
        Object creativeAsCtaLoggingHelper = c4494gi.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C3921XS(c4494gi, abstractC4669jd, interfaceC3919XQ);
            c4494gi.A0P(creativeAsCtaLoggingHelper);
        }
        return (C3921XS) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C4494gi c4494gi) {
        return C3763Up.A1g(c4494gi) && C3899X6.A0I(c4494gi);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final C3920XR A02(AbstractC4669jd abstractC4669jd) {
        boolean z;
        if (C3763Up.A1m(this.A03)) {
            z = abstractC4669jd.A1e() && A01(this.A03);
            return new C3920XR(z, z);
        }
        boolean zA1e = abstractC4669jd.A1e();
        if (zA1e) {
            boolean zA01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z = zA01;
        }
        return new C3920XR(zA1e, z);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
