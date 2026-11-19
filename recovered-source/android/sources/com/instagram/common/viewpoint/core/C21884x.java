package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4x */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21884x extends AbstractC2897Gj {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC4206c3 A00;
    public C2702DZ A01;
    public final ImageView A02;
    public final InterfaceC3574Rk A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C21884x(C4494gi c4494gi, InterfaceC4047ZU interfaceC4047ZU, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd, C3648Sx c3648Sx, InterfaceC3998Yh interfaceC3998Yh) {
        super(c4494gi, interfaceC4047ZU, interfaceC3784VA, abstractC4669jd, c3648Sx, interfaceC3998Yh);
        this.A03 = new C2890Gc(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC4669jd.A29().A0H().A04() > 0) {
            this.A01 = new C2702DZ(c4494gi, abstractC4669jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new AsyncTaskC3183LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new C2889Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private AbstractC4206c3 A01(int i2) {
        if (this.A02.getParent() != null) {
            AbstractC3966YB.A0J(this.A02);
        }
        C4209c6 c4209c6A0M = new C4209c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i2).A0M(this.A07);
        if (this.A01 != null) {
            c4209c6A0M.A0R(this.A01);
        }
        c4209c6A0M.A0L(C3279Mu.A00(super.A05, super.A06, A03(0, 0, 52), AbstractC3904XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C4210c7 params = c4209c6A0M.A0U();
        return AbstractC4207c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    private void A08(int i2) {
        boolean z;
        AbstractC3966YB.A0J(this.A00);
        this.A00 = A01(i2);
        this.A00.setAccidentalClickCappingListener(new InterfaceC3276Mr() { // from class: com.facebook.ads.redexgen.X.Gd
            @Override // com.instagram.common.viewpoint.core.InterfaceC3276Mr
            public final void ACk() {
                this.A00.A0n();
            }
        });
        C3320Na colors = this.A00.getColors();
        Integer backgroundColorForToolbar = getBackgroundColorForToolbar();
        boolean z2 = true;
        if (backgroundColorForToolbar == null) {
            if (this.A00 != null) {
                if (!this.A00.A1O()) {
                    AbstractC4206c3 abstractC4206c3 = this.A00;
                    if (A08[4].length() == 3) {
                        String[] strArr = A08;
                        strArr[2] = "fKHhGKaWmtnLqlWg01lC";
                        strArr[5] = "lG6mBbCbmu9ZuvMubYOS";
                        if (!(abstractC4206c3 instanceof AbstractC3135Ka)) {
                            z = false;
                        }
                        AbstractC3966YB.A0N(this, colors.A08(z));
                    }
                }
                z = true;
                AbstractC3966YB.A0N(this, colors.A08(z));
            } else {
                z = false;
                AbstractC3966YB.A0N(this, colors.A08(z));
            }
            throw new RuntimeException();
        }
        int iIntValue = backgroundColorForToolbar.intValue();
        String[] strArr2 = A08;
        if (strArr2[2].length() != strArr2[5].length()) {
            AbstractC3966YB.A0N(this, iIntValue);
        } else {
            A08[0] = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm";
            AbstractC3966YB.A0N(this, iIntValue);
        }
        AbstractC3992Yb abstractC3992Yb = this.A09;
        String[] strArr3 = A08;
        if (strArr3[2].length() == strArr3[5].length()) {
            String[] strArr4 = A08;
            strArr4[2] = "a7i0pPPxGgijq0ih0stJ";
            strArr4[5] = "yYRdNfPwhLNXT50Mgldr";
            abstractC3992Yb.setFullscreen(this.A00.A1O());
            this.A09.A0D(colors, ViewOnClickListenerC3152Kr.A05(super.A03));
            A0j(this.A00);
            if (super.A01 != null) {
                addView(super.A01, 0, AbstractC2897Gj.A0H);
            }
            if (this.A00 == null || !this.A00.A1O()) {
                z2 = false;
            }
            setUpFullscreenMode(z2);
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final AbstractC3992Yb A0c() {
        AbstractC3992Yb abstractC3992YbA0c = super.A0c();
        if (super.A03.A2T()) {
            abstractC3992YbA0c.setOnClickListener(new ViewOnClickListenerC4314dn(this));
        }
        return abstractC3992YbA0c;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(EnumC3791VH.A0Y, null);
            EnumC3275Mq enumC3275MqA1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            EnumC3275Mq actionOutcome = EnumC3275Mq.A09;
            if (enumC3275MqA1B != actionOutcome) {
                EnumC3275Mq actionOutcome2 = EnumC3275Mq.A06;
                if (enumC3275MqA1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final void A0h() {
        AbstractC3966YB.A0L(this.A00);
        AbstractC3966YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int iA04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (iA04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(iA04, new C2888Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= iA04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new C2887GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        AbstractC3992Yb abstractC3992Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC3992Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final void A0k(C3568Re c3568Re) {
        FrameLayout.LayoutParams layoutParams;
        c3568Re.A0A(this.A03);
        int orientation = c3568Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            AbstractC3966YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, AbstractC3924XV.A0r, 0, 0);
            } else {
                int i2 = requestedMargins.left;
                int i3 = requestedMargins.top;
                int i4 = requestedMargins.right;
                int i5 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i2, i3, i4, i5);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        AbstractC3966YB.A0H(this.A00);
        AbstractC3966YB.A0H(this.A09);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC4206c3 abstractC4206c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC4206c3.A1P(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
        if (this.A00 != null) {
            this.A00.A1L(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2897Gj, com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        if (C3763Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            AbstractC4206c3 abstractC4206c3 = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC4206c3.A1C();
        }
        super.onDestroy();
    }
}
