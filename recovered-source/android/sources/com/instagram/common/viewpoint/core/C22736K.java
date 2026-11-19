package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6K */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22736K extends AbstractC3135Ka {
    public static byte[] A09;
    public float A00;
    public C4355eS A01;
    public boolean A02;
    public final Handler A03;
    public final View A04;
    public final RelativeLayout A05;
    public final RelativeLayout A06;
    public final AbstractC3992Yb A07;
    public final InterfaceC3998Yh A08;

    static {
        A06();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    public C22736K(C4210c7 c4210c7) {
        super(c4210c7, true);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c4210c7.A0C();
        this.A07 = c4210c7.A0B();
        this.A06 = new RelativeLayout(c4210c7.A06());
        this.A05 = new RelativeLayout(c4210c7.A06());
        AbstractC3966YB.A0K(this.A05);
        AbstractC3966YB.A0K(this.A06);
        this.A04 = c4210c7.A02();
        A04();
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC4194br.A00(c4210c7.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((AbstractC4206c3) this).A07.A06().A0F().AKh(AbstractC3914XL.A00(this.A00), getResources().getConfiguration().orientation, false, false, AbstractC3278Mt.A0C(((AbstractC4206c3) this).A07.A04()));
    }

    private void A02() {
        AbstractC3966YB.A0d(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new C4355eS(((AbstractC4206c3) this).A07.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((AbstractC4206c3) this).A07.A08());
        addView(this.A01.A0W(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        AbstractC3966YB.A0J(getAdDetailsView());
        addView(getAdDetailsView(), new RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof AbstractC3181LK) {
            ((AbstractC3181LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        AbstractC3966YB.A0K(this.A04);
        C3920XR c3920xrA02 = super.A08.A02(getAdDataBundle());
        ((AbstractC4206c3) this).A07.A06().A0H().A00(c3920xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (c3920xrA02.A00) {
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1X(view);
                }
            });
        } else {
            if (!C3763Up.A1J(getAdContextWrapper())) {
                return;
            }
            AbstractC4153bC.A00(this.A04, C3763Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC4205c2(this));
        }
    }

    private void A05() {
        this.A09.set(true);
        AbstractC3966YB.A0W(this);
        int i2 = 2;
        AbstractC3966YB.A0d(this.A05, getAdDetailsView());
        AbstractC3966YB.A0L(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                AbstractC3992Yb abstractC3992Yb = this.A07;
                if (getAdDataBundle().A2P()) {
                    i2 = 8;
                }
                abstractC3992Yb.setToolbarActionMode(i2);
                this.A07.setProgressImmediate(0.0f);
            }
            new C3917XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C3133KY(this)).A07();
        }
    }

    private void A07(int i2) {
        A08(i2);
        A1V(i2, this.A06, this.A05);
    }

    private void A08(int i2) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i2 == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (AbstractC3914XL.A05(this.A00)) {
                layoutParams.addRule(13);
                RelativeLayout.LayoutParams containerLayoutParam = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                containerLayoutParam.addRule(14);
                this.A05.setLayoutParams(containerLayoutParam);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka, com.instagram.common.viewpoint.core.AbstractC4206c3
    public final void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        getAdDetailsView().A0j();
        if (this.A01 != null) {
            this.A01.A0Y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka, com.instagram.common.viewpoint.core.AbstractC4206c3
    public final void A1H(C3311NR c3311nr, String str, double d, Bundle bundle) {
        super.A1H(c3311nr, str, d, bundle);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A01 != null) {
            this.A01.A0e(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1M() {
        return getAdInfo().A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1P(boolean z) {
        if (getAdInfo().A0V() && !this.A09.get()) {
            A05();
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka
    public final AbstractC4156bF A1R(C4210c7 c4210c7, C3311NR c3311nr, String str) {
        this.A00 = new C3648Sx(c4210c7.A06()).A0M(c3311nr.A0H().A08());
        return new C4195bs(this.A00, str, c4210c7.A06(), getColors(), c4210c7.A05(), c4210c7.A0C(), getCtaButton(), AbstractC3135Ka.A0G, false, c4210c7.A07(), c4210c7.A0F(), c4210c7.A0A(), c4210c7.A0E(), c4210c7.A08(), false).A03();
    }

    public final /* synthetic */ void A1X(View view) {
        getCtaButton().A0E(A01(0, 5, 115));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public int getCloseButtonStyle() {
        if (this.A02) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !this.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka, com.instagram.common.viewpoint.core.AbstractC4206c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A09.get()) {
            this.A01.A0a(configuration.orientation);
        } else {
            A07(configuration.orientation);
        }
    }
}
