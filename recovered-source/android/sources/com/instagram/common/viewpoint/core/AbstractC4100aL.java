package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4100aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC4104aP A00(AbstractC4669jd abstractC4669jd) {
        if (abstractC4669jd.A2U()) {
            EnumC4104aP enumC4104aP = EnumC4104aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC4104aP;
        }
        return EnumC4104aP.A03;
    }

    public static void A01(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        c4494gi.A0F().AAz(enumC4101aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        c4494gi.A0F().AB9(enumC4101aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        c4494gi.A0F().AC7(enumC4101aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        A01(c4494gi, enumC4101aM);
    }

    public static void A05(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        A02(c4494gi, enumC4101aM);
    }

    public static void A06(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        A03(c4494gi, enumC4101aM);
    }

    public static void A07(C3792VI c3792vi, C4494gi c4494gi, InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, EnumC4101aM enumC4101aM) {
        if (c3792vi != null) {
            c3792vi.A04(EnumC3791VH.A0A, null);
        }
        if (abstractC4669jd.A2Q()) {
            c4494gi.A0F().AB8(enumC4101aM.name().toLowerCase(Locale.US));
        }
        if (abstractC4669jd.A2U()) {
            c4494gi.A0F().AAy(enumC4101aM.name().toLowerCase(Locale.US));
        }
        C3388Og c3388OgA00 = AbstractC3389Oh.A00(c4494gi.A02());
        C4490ge c4490geA02 = c4494gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c3388OgA00.A0O(c4490geA02, true)) {
            if (interfaceC3998Yh != null) {
                interfaceC3998Yh.AAo(abstractC4669jd.A2E(), abstractC4669jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC4669jd.A2C().A00())) {
                return;
            }
            C3899X6.A0O(new C3899X6(), c4494gi, AbstractC3904XB.A00(abstractC4669jd.A2C().A00()), abstractC4669jd.A2E());
        }
    }
}
