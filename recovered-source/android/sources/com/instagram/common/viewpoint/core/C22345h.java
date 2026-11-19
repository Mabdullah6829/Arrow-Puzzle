package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5h */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22345h extends AbstractC3020Ij {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public C3917XO A00;
    public AbstractC4206c3 A01;
    public C2702DZ A02;
    public final int A03;
    public final ImageView A04;
    public final C3792VI A05;
    public final AbstractC3992Yb A06;
    public final InterfaceC4313dm A07;
    public final AtomicBoolean A08;

    public C22345h(C4494gi c4494gi, InterfaceC4047ZU interfaceC4047ZU, int i2, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd, InterfaceC3998Yh interfaceC3998Yh, AbstractC3992Yb abstractC3992Yb, C3792VI c3792vi, boolean z, boolean z2, InterfaceC4313dm interfaceC4313dm, int i3, int i4) {
        super(c4494gi, interfaceC4047ZU, interfaceC3784VA, abstractC4669jd, i2, z, z2, interfaceC3998Yh, i4);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i3;
        this.A07 = interfaceC4313dm;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC3992Yb;
        this.A05 = c3792vi;
        if (abstractC4669jd.A1c()) {
            this.A02 = new C2702DZ(c4494gi, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new AsyncTaskC3183LM(this.A04, c4494gi).A05(abstractC4669jd.A29().A0H().A00(), abstractC4669jd.A29().A0H().A01()).A06(new C3018Ih(this)).A07(abstractC4669jd.A29().A0H().A08());
        A08(c4494gi.getResources().getConfiguration().orientation);
    }

    private AbstractC4206c3 A02(int i2) {
        if (this.A04.getParent() != null) {
            AbstractC3966YB.A0J(this.A04);
        }
        boolean z = i2 != 2;
        C4209c6 c4209c6 = new C4209c6(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C4209c6 interstitialLayoutParamsBuilder = c4209c6.A0J(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0P(this.A06).A0I(i2).A0T(z).A0S(super.A00).A0M(this.A05);
        if (this.A02 != null) {
            c4209c6.A0R(this.A02);
        }
        c4209c6.A0L(C3279Mu.A00(super.A07, super.A08, "", AbstractC3904XB.A00(super.A06.A29().A0J().A05()), new HashMap(), super.A06.A2A()));
        c4209c6.A0Q(this.A07);
        return AbstractC4207c4.A00(c4209c6.A0U(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1F();
        }
    }

    private void A08(int i2) {
        AbstractC3966YB.A0J(this.A01);
        this.A01 = A02(i2);
        if (this.A01 instanceof C3113KE) {
            ((C3113KE) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C3081Ji) {
            AbstractC4206c3 abstractC4206c3 = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C3081Ji) abstractC4206c3).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final EnumC3275Mq A1D(String str) {
        return this.A01.A1B(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1E() {
        if (C3763Up.A1z(super.A07)) {
            super.A07.A0B().AKU(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1C();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1G() {
        if (this.A01 instanceof C3137Kc) {
            AbstractC4206c3 abstractC4206c3 = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C3137Kc) abstractC4206c3).A1Q();
            return;
        }
        if (this.A01 instanceof C3081Ji) {
            ((C3081Ji) this.A01).A1Q(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1H() {
        int iA02 = super.A06.A29().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new C3917XO(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C3016If(this));
            this.A00.A07();
            if (iA02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (iA02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (iA02 < secondsForNextCta2) {
                    if (iA02 <= 0) {
                        return;
                    }
                    new C3917XO(iA02, new C3014Id(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFw(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1I(boolean z) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1J(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
        if (this.A01 != null) {
            this.A01.A1L(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1K(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1L() {
        if (this.A01.A1M()) {
            if (!(this.A01 instanceof C3137Kc) || ((C3137Kc) this.A01).A1R()) {
                return (this.A01 instanceof C3081Ji) && !((C3081Ji) this.A01).A1S();
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1M() {
        if (this.A01 instanceof C3137Kc) {
            return ((C3137Kc) this.A01).A1R();
        }
        boolean z = this.A01 instanceof C3081Ji;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z) {
            return ((C3081Ji) this.A01).A1S();
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1N() {
        if (this.A01 instanceof C3137Kc) {
            return ((C3137Kc) this.A01).A1S();
        }
        if (this.A01 instanceof C3081Ji) {
            return ((C3081Ji) this.A01).A1T();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public C4311dk getFullScreenAdStyle() {
        C3320Na colors = this.A01.getColors();
        return new C4311dk(this.A01.A1O(), C4311dk.A07, colors, ViewOnClickListenerC3152Kr.A05(super.A06), colors.A08(this.A01.A1O() || (this.A01 instanceof AbstractC3135Ka)), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C3137Kc) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A29().A0T()) {
            A08(configuration.orientation);
        }
    }
}
