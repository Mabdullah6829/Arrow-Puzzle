package com.instagram.common.viewpoint.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.55 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C219655 extends AbstractC3020Ij {
    public static byte[] A0o;
    public static String[] A0p = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public C3231M8 A04;
    public C4122ah A05;
    public C3226M3 A06;
    public C4170bT A07;
    public ViewOnClickListenerC3152Kr A08;
    public C4222cJ A09;
    public EnumC4381et A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final int A0O;
    public final Handler A0P;
    public final Handler A0Q;
    public final Handler A0R;
    public final AbstractC3278Mt A0S;
    public final C3320Na A0T;
    public final C4494gi A0U;
    public final C3792VI A0V;
    public final AbstractC3992Yb A0W;
    public final AbstractC3181LK A0X;
    public final InterfaceC4171bU A0Y;
    public final InterfaceC4313dm A0Z;
    public final C2785Eu A0a;
    public final C2775Ek A0b;
    public final C21504L A0c;
    public final AbstractC2739EA A0d;
    public final AbstractC2737E8 A0e;
    public final AbstractC2733E4 A0f;
    public final AbstractC2731E2 A0g;
    public final AbstractC2729E0 A0h;
    public final AbstractC2728Dz A0i;
    public final C2706Dd A0j;
    public final C2702DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0J(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0W() {
        A0o = new byte[]{33, 46, 43, 33, 41, 29, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 48, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, 61, 33, 54, 36, 50, 33, 55, 54, 55, 12, 37, 58, 55, 54, 60, 61, 59, 45, 58, 43, 36, 33, 43, 35, 23, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    static {
        A0W();
        A0q = (int) (AbstractC3926XX.A02 * 4.0f);
        A0r = (int) (AbstractC3926XX.A02 * 32.0f);
        A0s = AbstractC3411P3.A02(-1, 77);
        A0t = (int) (AbstractC3926XX.A02 * 26.0f);
        A0u = (int) (AbstractC3926XX.A02 * 12.0f);
    }

    public C219655(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, AbstractC3992Yb abstractC3992Yb, AbstractC4669jd abstractC4669jd, C3648Sx c3648Sx, InterfaceC4047ZU interfaceC4047ZU, int i2, InterfaceC3998Yh interfaceC3998Yh, C3792VI c3792vi, int i3, boolean z, boolean z2, InterfaceC4313dm interfaceC4313dm, int i4, int i5) {
        C3320Na c3320NaA00;
        super(c4494gi, interfaceC4047ZU, interfaceC3784VA, abstractC4669jd, i2, z, z2, interfaceC3998Yh, i5);
        this.A0H = false;
        this.A0G = false;
        this.A0F = false;
        this.A01 = 0;
        this.A0J = true;
        this.A0M = false;
        this.A0I = false;
        this.A0Q = new Handler(Looper.getMainLooper());
        this.A0l = new RunnableC4306df(this);
        this.A0E = false;
        this.A00 = 0.0f;
        this.A0B = true;
        this.A0C = false;
        this.A0K = false;
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0h = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.5D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                if (!this.A00.A0M) {
                    this.A00.A0M = true;
                    this.A00.A0U.A0F().AKh(AbstractC3914XL.A00((float) ((AbstractC3020Ij) this.A00).A06.A0k()), this.A00.getResources().getConfiguration().orientation, true, true, AbstractC3278Mt.A0A());
                    this.A00.A0X(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.setVisibility(0);
                    this.A00.A0X.A0u(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.bringToFront();
                    this.A00.A0V();
                }
            }
        };
        this.A0g = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.5B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                if (!((AbstractC3020Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0f = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.59
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            public final /* bridge */ /* synthetic */ void A03(C3733UL c3733ul) {
            }
        };
        this.A0i = new AbstractC2728Dz() { // from class: com.facebook.ads.redexgen.X.58
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21394A c21394a) {
                this.A00.A0o(c21394a);
                this.A00.A0Z.ADw((this.A00.A00 * this.A00.A0b.getDuration()) + c21394a.A00());
            }
        };
        this.A0d = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.57
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A0Z.ADc(this.A00.A0b.getDuration());
                C219655.A01(this.A00, 1.0f);
                this.A00.A0b.A0e(EnumC4381et.A02, 28);
            }
        };
        this.A0e = new C219756(this);
        this.A0Y = new C2946HW(this);
        this.A0W = abstractC3992Yb;
        this.A0O = i4;
        this.A0P = new Handler(Looper.getMainLooper());
        this.A0S = C3279Mu.A01(c4494gi, interfaceC3784VA, abstractC4669jd.A2E(), AbstractC3904XB.A00(abstractC4669jd.A29().A0J().A05()), new HashMap(), false, true, abstractC4669jd.A2A());
        this.A0U = c4494gi;
        this.A0V = c3792vi;
        this.A0j = new C2706Dd(this.A0U, this.A0V);
        this.A0k = new C2702DZ(this.A0U, i4);
        this.A0Z = interfaceC4313dm;
        if (i3 == 1) {
            c3320NaA00 = super.A06.A28().A01();
        } else {
            c3320NaA00 = super.A06.A28().A00();
        }
        this.A0T = c3320NaA00;
        AbstractC4194br.A00(this.A0U, this, abstractC4669jd.A29().A0H().A08());
        this.A0b = new C2775Ek(this.A0U);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C21504L(c4494gi, interfaceC3784VA, this.A0b, abstractC4669jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c3648Sx.A0T(videoUrl));
        this.A0N = (float) abstractC4669jd.A0k();
        A0Q();
        A0M();
        A0L();
        this.A0X = A0D();
        addView(this.A0X);
        AbstractC3966YB.A0K(this.A0X);
        A0T();
        A0R();
        A0S();
        this.A0X.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (C3763Up.A1z(this.A0U)) {
            InterfaceC3796VM interfaceC3796VMA0B = this.A0U.A0B();
            C2775Ek c2775Ek = this.A0b;
            String videoUrl2 = super.A06.A2E();
            interfaceC3796VMA0B.AKn(c2775Ek, videoUrl2, true);
        }
        if (C3763Up.A20(this.A0U)) {
            this.A0a = new C2785Eu(this.A0U, interfaceC3784VA, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0d(abstractC4669jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        A0P();
        c4494gi.A0F().ACI(this.A0m, this.A0n, true);
        this.A0j.bringToFront();
    }

    public static /* synthetic */ float A01(C219655 c219655, float f2) {
        float f3 = c219655.A00 + f2;
        c219655.A00 = f3;
        return f3;
    }

    public static /* synthetic */ int A03(C219655 c219655) {
        int i2 = c219655.A01;
        c219655.A01 = i2 + 1;
        return i2;
    }

    private AbstractC3181LK A0D() {
        String strA0J;
        if (super.A06.A10().equals(A0J(49, 14, 78))) {
            strA0J = EnumC4387ez.A04.A03();
        } else {
            strA0J = A0J(12, 37, 68);
        }
        AbstractC3181LK abstractC3181LKA03 = new C4195bs(this.A0N, strA0J, this.A0U, getColors(), super.A06, super.A0B, this.A08, AbstractC3020Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0k, this.A0V, true).A03();
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        abstractC3181LKA03.setVisibility(8);
        abstractC3181LKA03.setChainedAdInfo(super.A00);
        abstractC3181LKA03.setLayoutParams(adDetailsParams);
        return abstractC3181LKA03;
    }

    private void A0K() {
        this.A09 = new C4222cJ(this.A0U, super.A06, this.A0V, this.A0Q, super.A0B);
        this.A09.A0I(false);
        addView(this.A09.A0C(getRegularCtaForEndCard()));
    }

    private void A0L() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0u, A0u, A0u, A0u);
    }

    private void A0M() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(AbstractC3924XV.A0b, AbstractC3924XV.A0r, AbstractC3924XV.A0b, AbstractC3924XV.A0Z);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            A0q(A0J(63, 18, 85));
        }
    }

    private void A0O() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            Map<String, String> mapA05 = new C4150b9().A03(null).A02(null).A05();
            mapA05.put(A0J(0, 12, 95), A0J(63, 18, 85));
            super.A08.AB6(super.A06.A2E(), mapA05);
        }
    }

    private void A0P() {
        if (!super.A06.A29().A0K().A04()) {
            return;
        }
        this.A02 = new ImageView(this.A0U);
        addView(this.A02);
        this.A02.setVisibility(4);
        new AsyncTaskC3183LM(this.A02, this.A0U).A04().A06(new C2952Hc(this)).A07(super.A06.A29().A0H().A08());
    }

    private void A0Q() {
        postDelayed(new C2963Hn(this), C3763Up.A0P(this.A0U));
    }

    private void A0R() {
        AbstractC3966YB.A0J(this.A03);
        this.A03 = new LinearLayout(this.A0U);
        this.A03.setOrientation(1);
        AbstractC3966YB.A0K(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (super.A06.A1X() && this.A0S != null && AbstractC3914XL.A03(this.A0N)) {
            this.A07 = new C4170bT(this.A0U, super.A0B, super.A06.A0l(), this.A0S, this.A0X.getCTAButton(), this.A0X);
            addView(this.A07.getBrowserPeekView());
            this.A0R.postDelayed(new RunnableC4303dc(this), 5900L);
        }
    }

    private void A0T() {
        if (super.A06.A1e()) {
            this.A0b.setOnClickListener(new ViewOnClickListenerC4309di(this));
        }
        AbstractC3966YB.A0J(this.A0b);
        AbstractC3966YB.A0K(this.A0b);
        addView(this.A0b, new RelativeLayout.LayoutParams(-1, -2));
        this.A08 = new ViewOnClickListenerC3152Kr(this.A0U, super.A06, this.A0T, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC3936Xh) null);
        AbstractC3966YB.A0G(1001, this.A08);
        if (C3763Up.A17(this.A0U)) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC4301da(this);
            this.A0X.setCTAClickListener(onClickListener);
            if (this.A0W != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC4302db(this);
                this.A0W.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C20963S c20963s = new C20963S(this.A0U, true);
            this.A0b.A0f(c20963s);
            c20963s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C20813B(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        int duration = this.A0b.getDuration();
        int videoDuration = this.A0k.getCustomDuration();
        if (videoDuration > duration) {
            this.A0k.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(int i2) {
        if (!this.A0M) {
            return;
        }
        C2775Ek c2775Ek = this.A0b;
        RelativeLayout adjacentView = (RelativeLayout) this.A0b.getVideoView();
        this.A0b.A0Z(i2);
        A0Z(i2, c2775Ek, adjacentView);
    }

    private void A0Y(int i2) {
        if (this.A0j != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0j.getLayoutParams();
            layoutParams.setMargins(AbstractC3924XV.A09, i2, AbstractC3924XV.A09, AbstractC3924XV.A05);
            this.A0j.setLayoutParams(layoutParams);
        }
    }

    private void A0Z(int i2, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        AbstractC3966YB.A0J(this.A0X);
        if ((this.A0X instanceof C22846V) || (this.A0X instanceof C22836U)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0X.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0X);
            } else {
                View view = this.A0X;
                String[] strArr = A0p;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0p[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0X instanceof C22826T) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0X.setLayoutParams(layoutParams2);
            addView(this.A0X, layoutParams2);
        }
        this.A0X.A0l(i2);
        this.A0X.A0y(viewGroup, relativeLayout, i2);
    }

    private void A0a(ViewGroup viewGroup, View view, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i2 == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0X(i2);
    }

    private void A0b(ViewGroup viewGroup, View view, AbstractC3992Yb abstractC3992Yb, int i2) {
        AbstractC3966YB.A0d(this.A03);
        AbstractC3966YB.A0J(abstractC3992Yb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC3992Yb.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(AbstractC3924XV.A0u, AbstractC3924XV.A0r, 0, 0);
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i2 == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0X.A0z(viewGroup, false, false, this.A03.getId());
        A0X(i2);
        viewGroup.addView(abstractC3992Yb, layoutParams);
    }

    private void A0c(ViewGroup viewGroup, View view, AbstractC3992Yb abstractC3992Yb, int i2) {
        AbstractC3966YB.A0J(this.A03);
        AbstractC3966YB.A0J(abstractC3992Yb);
        AbstractC3966YB.A0J(this.A0X);
        boolean zA05 = AbstractC3914XL.A05(this.A0N);
        boolean isBrowserBelowMediaView = i2 == 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!super.A06.A2U() || i2 != 2 || !zA05) {
            A0Y(AbstractC3924XV.A0N);
            layoutParams.setMargins(AbstractC3924XV.A0T, AbstractC3924XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(AbstractC3924XV.A0T, AbstractC3924XV.A0B, 0, 0);
            A0Y(AbstractC3924XV.A0B);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams browserLayoutParam = (RelativeLayout.LayoutParams) view.getLayoutParams();
        browserLayoutParam.removeRule(14);
        browserLayoutParam.removeRule(9);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean z = isBrowserBelowMediaView || zA05;
        if (z) {
            layoutParams2.height = getHeightPixels() / 4;
            browserLayoutParam.height = getHeightPixels() / 4;
            if (A0p[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "aNPRQigyxlriqHgRS6C1obCW9NP8FFpI";
            strArr[2] = "RUJfPTyX2Zr9a7jBp48wtOZ1EckF1HKn";
            browserLayoutParam.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            this.A0b.A0Z(i2);
            layoutParams2.height = -1;
            browserLayoutParam.height = -1;
            browserLayoutParam.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        browserLayoutParam.width = -2;
        view.setLayoutParams(browserLayoutParam);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (z) {
            addView(this.A03);
            addView(abstractC3992Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC3992Yb, layoutParams);
        }
        this.A0X.A0z(viewGroup, true, zA05, this.A03.getId());
    }

    private void A0d(C3311NR c3311nr) {
        this.A0X.setInfo(c3311nr.A0I(), c3311nr.A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, this.A0Y);
        this.A0X.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(C21394A c21394a) {
        if (this.A0b.getState() == EnumC4436fm.A02 && C3763Up.A1e(this.A0U)) {
            postDelayed(new C2962Hm(this, c21394a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(String str) {
        C3226M3 c3226m3;
        AbstractC3966YB.A0J(this.A06);
        C2967Hr c2967Hr = new C2967Hr(this);
        if (this.A0U.A0E() == null) {
            this.A0U.A0F().A9v();
        }
        if (this.A07 != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (AbstractC3764Uq.A02(this.A0U) || this.A0U.A0E() == null) {
            c3226m3 = new C3226M3(this.A0U, c2967Hr);
        } else {
            c3226m3 = new C3226M3(this.A0U, this.A0U.A0E(), c2967Hr);
        }
        this.A06 = c3226m3;
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0q(String str) {
        Map<String, String> mapA05 = new C4150b9().A03(null).A02(null).A05();
        mapA05.put(A0J(0, 12, 95), str);
        this.A0V.A04(EnumC3791VH.A0J, mapA05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), mapA05);
        if (C3763Up.A2U(this.A0U)) {
            HashMap map = new HashMap();
            map.put(AbstractC4708kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC4708kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC4708kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0q(str);
            return;
        }
        if (super.A06.A1d()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0s(String str) {
        if (!this.A0K) {
            this.A0K = true;
            this.A0Z.AGQ(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(String str) {
        if (!this.A0D) {
            this.A0X.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0u(boolean z) {
        if (!z && this.A0m) {
            return;
        }
        this.A0D = z;
        if (z) {
            this.A01 = 0;
            this.A0G = false;
            this.A0F = false;
        } else {
            this.A0P.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.A03;
        float y2 = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z) {
            heightPixels /= 4.0f;
        }
        String strA0J = A0J(81, 1, 109);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0J, y2, heightPixels);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0b, strA0J, this.A0b.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0b.getHeight();
        int heightPixels2 = getHeightPixels();
        if (z) {
            heightPixels2 /= 4;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
        duration.addUpdateListener(new C4304dd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
        animatorSet.addListener(new C4305de(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        A0w(this.A0D, true);
        if (!z && this.A06 != null) {
            this.A06.destroy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    private void A0v(boolean z, int i2) {
        this.A0U.A0F().ACG(!z, i2);
        if (this.A04 != null) {
            boolean z2 = this.A0m;
            int i3 = 4;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "EaXPQIkUGhcx1dZHr3fchF7eoR8nmh6r";
            strArr2[7] = "BoqCm6Atk4DXyXzUZY25jylGRvSX4IAb";
            if (z2) {
                this.A04.setCloseButtonVisibility(4);
                return;
            }
            C3231M8 c3231m8 = this.A04;
            String[] strArr3 = A0p;
            if (strArr3[3].length() == strArr3[0].length()) {
                String[] strArr4 = A0p;
                strArr4[3] = "X7";
                strArr4[0] = "zP";
                if (z) {
                    i3 = 0;
                }
            } else if (z) {
                i3 = 0;
            }
            c3231m8.setCloseButtonVisibility(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0w(boolean z, boolean z2) {
        if (!this.A0M) {
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        if (z) {
            A0c(this.A0b, this.A0b.getVideoView(), this.A0W, i2);
            return;
        }
        if (z2) {
            C2775Ek c2775Ek = this.A0b;
            C2775Ek c2775Ek2 = this.A0b;
            String[] strArr = A0p;
            String str = strArr[6];
            String str2 = strArr[7];
            int iCharAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (iCharAt == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0b(c2775Ek, c2775Ek2.getVideoView(), this.A0W, i2);
            return;
        }
        A0a(this.A0b, this.A0b.getVideoView(), i2);
    }

    private final boolean A0x() {
        return this.A0D;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final EnumC3275Mq A1D(String str) {
        if (!A0x()) {
            if (this.A09 != null) {
                return this.A09.A0E().A0E(str);
            }
            return this.A0X.getCTAButton().A0E(str);
        }
        return EnumC3275Mq.A09;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1E() {
        A0O();
        this.A0X.A0j();
        this.A0R.removeCallbacksAndMessages(null);
        if (this.A09 != null) {
            this.A09.A0F();
        }
        this.A0Q.removeCallbacksAndMessages(null);
        if (C3763Up.A1z(this.A0U)) {
            this.A0U.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            this.A0a.A07();
        }
        C4170bT c4170bT = this.A07;
        String[] strArr = A0p;
        if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
            throw new RuntimeException();
        }
        A0p[4] = "zZx5K1WC5ur1IIrcKdsfSp5hTLdY49e9";
        if (c4170bT != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            AbstractC3966YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        AbstractC3966YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1G() {
        this.A0I = true;
        this.A0X.A0o();
        AbstractC3966YB.A0d(this.A0b, this.A0X, this.A0k, this.A04, this.A0j, this.A03, this.A0W);
        if (this.A07 != null) {
            this.A07.A0B();
        }
        AbstractC3966YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0K();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(AbstractC3924XV.A0u, AbstractC3924XV.A0r, 0, 0);
        addView(this.A0W, layoutParams);
        this.A0W.bringToFront();
        this.A0B = true;
        this.A0Z.AFw(true);
        if (this.A0W != null && getAdDataBundle().A29().A0K().A00() > 0) {
            this.A0B = false;
            if (getAdDataBundle().A2P()) {
                this.A0W.setToolbarActionMode(8);
            } else {
                this.A0W.setToolbarActionMode(2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC4307dg(this), getAdDataBundle().A29().A0K().A00());
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1H() {
        C2775Ek c2775Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c2775Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC4381et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0O;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0W.setProgressSpinnerInvisible(true);
                new C3917XO(iA02, new C2965Hp(this)).A07();
                return;
            }
        }
        this.A0W.setToolbarActionMode(8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1I(boolean z) {
        this.A0J = z;
        A0v(z, 4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1J(boolean z) {
        C4170bT c4170bT;
        if (!this.A0C) {
            this.A0X.A0m(z);
        }
        if (this.A09 != null) {
            boolean z2 = this.A0C;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "0qZcOgUU1tryulZiP6XyTUbAv74itU8r";
            strArr2[2] = "FbQDSrVtnmrn6n1tCiGdEtRCABZgMVu6";
            if (!z2) {
                this.A09.A0H(z);
            }
        }
        this.A0C = false;
        if (this.A0b.A0n()) {
            return;
        }
        if (this.A07 != null) {
            int i2 = getResources().getConfiguration().orientation;
            if (A0p[5].charAt(30) != '1') {
                A0p[5] = "NO4KYfXMvMpDq3TiuILiTAIZZLlPHE1o";
                if (i2 == 1) {
                    c4170bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c4170bT.A0C();
                }
            } else {
                String[] strArr3 = A0p;
                strArr3[1] = "uxhOTaOwbBr7x682JVxutMugyCdaSc2z";
                strArr3[2] = "WtxTL59IucrgXt9Ertpm7Y8tzE2Zsttw";
                if (i2 == 1) {
                    c4170bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c4170bT.A0C();
                }
            }
        }
        this.A0A = this.A0b.getVideoStartReason();
        this.A0L = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() == EnumC4436fm.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0L || z) {
            C2775Ek c2775Ek = this.A0b;
            EnumC4381et enumC4381et = this.A0A;
            String[] strArr = A0p;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            c2775Ek.A0e(enumC4381et, 19);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1L() {
        if (super.A06.A29().A0V() && super.A06.A29().A0K().A04()) {
            boolean z = this.A0I;
            if (A0p[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1N() {
        return this.A0B;
    }

    public final boolean A1O() {
        return !A0x();
    }

    public C3320Na getColors() {
        return this.A0T;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public C4311dk getFullScreenAdStyle() {
        return new C4311dk(true, C4311dk.A06, super.A06.A28().A01(), ViewOnClickListenerC3152Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private ViewOnClickListenerC3152Kr getRegularCtaForEndCard() {
        ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr = new ViewOnClickListenerC3152Kr(this.A0U, super.A06.A0w(), super.A06.A28().A01(), super.A08, super.A0B, (C4439fp) null, super.A0A, super.A06.A2A());
        viewOnClickListenerC3152Kr.setViewShowsOverMedia(true);
        AbstractC3966YB.A0K(viewOnClickListenerC3152Kr);
        viewOnClickListenerC3152Kr.setText(super.A06.A29().A0J().A04());
        AbstractC3966YB.A0G(1001, viewOnClickListenerC3152Kr);
        viewOnClickListenerC3152Kr.setCta(super.A06.A29().A0J(), super.A06.A2E(), new HashMap(), null);
        return viewOnClickListenerC3152Kr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0I) {
            return;
        }
        A0X(configuration.orientation);
        A0w(this.A0D, false);
        if (this.A07 != null) {
            this.A07.A0D(configuration.orientation);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            this.A0C = true;
            A1J(false);
        }
    }

    private void setUpBrowserControls(C3226M3 c3226m3) {
        if (this.A04 != null) {
            AbstractC3966YB.A0J(this.A04);
        }
        this.A04 = new C3231M8(this.A0U, c3226m3, true);
        if (this.A0m) {
            A0v(this.A0J, 1);
        }
        c3226m3.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        AbstractC3966YB.A0K(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC3924XV.A0v, AbstractC3924XV.A0v, AbstractC3924XV.A0v, AbstractC3924XV.A0v);
        this.A04.setListener(new C2966Hq(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            AbstractC3966YB.A0J(this.A05);
        }
        this.A05 = new C4122ah(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0q));
    }
}
