package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4173bW {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1I] */
    public static C19661I A00(final C4210c7 c4210c7, final C3732UK c3732uk, final String str, final C22866X c22866x) {
        final boolean z = true;
        return new C22756M(c4210c7, c3732uk, z, str, c22866x) { // from class: com.facebook.ads.redexgen.X.1I
            public ViewOnClickListenerC3152Kr A00;
            public C4332e5 A01;
            public final InterfaceC3784VA A02 = this.A0I.A06().A02().A0A();
            public final C3732UK A03;
            public final C22866X A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC3926XX.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC3926XX.A02 * 6.0f);

            {
                this.A03 = c3732uk;
                this.A05 = str;
                this.A04 = c22866x;
                this.A03.A1Q(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3079Jg
            public void setupNativeCtaExtension(C4332e5 c4332e5) {
                C3326Ng c3326NgA2A;
                this.A01 = c4332e5;
                int iA0Q = C3763Up.A0Q(this.A0I.A06());
                C3320Na c3320NaA01 = this.A03.A13().A28().A01();
                C4494gi c4494giA06 = this.A0I.A06();
                String strA0w = this.A03.A13().A0w();
                InterfaceC3784VA interfaceC3784VA = this.A02;
                InterfaceC3998Yh dummyListener = C4137aw.getDummyListener();
                C4439fp c4439fpA0b = this.A04.A0b();
                C3957Y2 c3957y2A1E = this.A03.A1E();
                if (this.A03.A13() == null) {
                    c3326NgA2A = null;
                } else {
                    c3326NgA2A = this.A03.A13().A2A();
                }
                this.A00 = new ViewOnClickListenerC3152Kr(c4494giA06, strA0w, c3320NaA01, interfaceC3784VA, dummyListener, c4439fpA0b, c3957y2A1E, c3326NgA2A);
                this.A00.setCta(c4332e5.A03().A0J(), this.A05, new HashMap());
                this.A03.A1Q(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    AbstractC3966YB.A0R(this.A00, A07, 5, c3320NaA01.A0A(false));
                    ((C22756M) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C22756M) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C22756M) this).A06.bringToFront();
                }
            }
        };
    }
}
