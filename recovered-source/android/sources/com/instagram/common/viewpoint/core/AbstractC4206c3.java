package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4206c3 extends RelativeLayout {
    public static final int A08 = AbstractC3924XV.A0b;
    public static final int A09 = (int) (AbstractC3926XX.A02 * 28.0f);
    public static final int A0A = (int) (AbstractC3926XX.A02 * 32.0f);
    public C3320Na A00;
    public boolean A01;
    public C4098aJ A02;
    public final C4494gi A03;
    public final InterfaceC3784VA A04;
    public final ViewOnClickListenerC3152Kr A05;
    public final C4193bq A06;
    public final C4210c7 A07;

    public abstract boolean A1O();

    public AbstractC4206c3(C4210c7 c4210c7, boolean z) {
        C3320Na c3320NaA00;
        super(c4210c7.A06());
        this.A07 = c4210c7;
        this.A03 = c4210c7.A06();
        this.A04 = c4210c7.A07();
        if (c4210c7.A00() == 1) {
            c3320NaA00 = c4210c7.A05().A28().A01();
        } else {
            c3320NaA00 = c4210c7.A05().A28().A00();
        }
        this.A00 = c3320NaA00;
        this.A01 = z;
        this.A05 = new ViewOnClickListenerC3152Kr(c4210c7.A06(), c4210c7.A05(), this.A00, c4210c7.A07(), c4210c7.A0C(), c4210c7.A0F(), c4210c7.A0A(), c4210c7.A09());
        this.A05.setRoundedCornersEnabled(A02());
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setV2Design(A04());
        AbstractC3966YB.A0G(1001, this.A05);
        this.A06 = new C4193bq(this.A03, this.A00, this.A01, A03(), A0B());
        AbstractC3966YB.A0K(this.A06);
    }

    public final C4098aJ A00(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, C3792VI c3792vi, EnumC4101aM enumC4101aM, InterfaceC3998Yh interfaceC3998Yh) {
        this.A02 = AbstractC4103aO.A01(c4494gi, true, abstractC4669jd, c3792vi, interfaceC3998Yh, enumC4101aM, AbstractC4100aL.A00(abstractC4669jd));
        AbstractC3966YB.A0K(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (abstractC4669jd.A2U()) {
            layoutParams.setMargins(AbstractC3924XV.A0b, AbstractC3924XV.A0r, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(AbstractC3924XV.A0b, 0, 0, AbstractC3924XV.A0b);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A02.setLayoutParams(layoutParams);
        return this.A02;
    }

    public final C4102aN A01(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        C4102aN c4102aNA02 = AbstractC4103aO.A02(c4494gi, enumC4101aM, this.A07.A05());
        AbstractC3966YB.A0K(c4102aNA02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC3924XV.A0b, 0, 0, AbstractC3924XV.A0b);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        c4102aNA02.setLayoutParams(layoutParams);
        return c4102aNA02;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }

    public final boolean A04() {
        if (this.A07.A05().A29().A0H().A07() == null) {
            return this.A07.A05().A1w() || this.A07.A05().A1y();
        }
        return this.A07.A05().A1n();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        return true;
    }

    public EnumC3275Mq A1B(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1C() {
        if (this.A02 != null) {
            this.A02.A0O();
        }
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G() {
    }

    public void A1H(C3311NR c3311nr, String str, double d, Bundle bundle) {
        this.A06.A04(c3311nr.A0I().A0F(), c3311nr.A0I().A04(), null, false, !A1O() && d > 0.0d && d < 1.0d);
        this.A05.setCta(c3311nr.A0J(), str, new HashMap());
    }

    public void A1I(C21494K c21494k) {
    }

    public void A1J(C2730E1 c2730e1) {
    }

    public void A1K(C21394A c21394a, int i2) {
    }

    public void A1L(boolean z) {
        if (!z && this.A02 != null) {
            this.A02.A0P();
        }
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return true;
    }

    public boolean A1P(boolean z) {
        return false;
    }

    public C4494gi getAdContextWrapper() {
        return this.A03;
    }

    public InterfaceC3784VA getAdEventManager() {
        return this.A04;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C3320Na getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC3152Kr getCtaButton() {
        return this.A05;
    }

    public C4193bq getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C3320Na c3320NaA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c3320NaA00 = this.A07.A05().A28().A01();
        } else {
            c3320NaA00 = this.A07.A05().A28().A00();
        }
        this.A00 = c3320NaA00;
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(InterfaceC3276Mr interfaceC3276Mr) {
        getCtaButton().getCtaActionHelper().A07(interfaceC3276Mr);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
    }
}
