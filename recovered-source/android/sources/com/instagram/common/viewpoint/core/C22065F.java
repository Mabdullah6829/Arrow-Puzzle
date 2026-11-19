package com.instagram.common.viewpoint.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5F */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22065F extends AbstractC3020Ij {
    public static byte[] A0o;
    public static String[] A0p = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C3320Na A0D;
    public C3229M6 A0E;
    public C4122ah A0F;
    public C3226M3 A0G;
    public C4242cd A0H;
    public EnumC4381et A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final AbstractC3278Mt A0V;
    public final C4494gi A0W;
    public final C3792VI A0X;
    public final AbstractC3992Yb A0Y;
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
    public final C2708Df A0j;
    public final C2702DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0L(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0p;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0o = bArr;
    }

    static {
        A0X();
        A0q = (int) (AbstractC3926XX.A02 * 4.0f);
        A0r = (int) (AbstractC3926XX.A02 * 8.0f);
        A0s = AbstractC3411P3.A02(-1, 77);
        A0w = (int) (AbstractC3926XX.A02 * 26.0f);
        A0x = (int) (AbstractC3926XX.A02 * 12.0f);
        A0u = (int) (AbstractC3926XX.A02 * 12.0f);
        A0v = (int) (AbstractC3926XX.A02 * 44.0f);
        A0t = AbstractC3924XV.A0v;
    }

    public C22065F(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, AbstractC3992Yb abstractC3992Yb, AbstractC4669jd abstractC4669jd, C3648Sx c3648Sx, InterfaceC4047ZU interfaceC4047ZU, int i2, InterfaceC3998Yh interfaceC3998Yh, C3792VI c3792vi, int i3, boolean z, boolean z2, InterfaceC4313dm interfaceC4313dm, int i4, int i5) {
        C3320Na c3320NaA00;
        super(c4494gi, interfaceC4047ZU, interfaceC3784VA, abstractC4669jd, i2, z, z2, interfaceC3998Yh, i5);
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0l = new RunnableC4298dX(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0h = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.5R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.A0T = true;
            }
        };
        this.A0g = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.5P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                if (!((AbstractC3020Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0f = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.5M
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            public final /* bridge */ /* synthetic */ void A03(C3733UL c3733ul) {
            }
        };
        this.A0i = new AbstractC2728Dz() { // from class: com.facebook.ads.redexgen.X.5K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21394A c21394a) {
                this.A00.A0f(c21394a);
                this.A00.A0Z.ADw((this.A00.A01 * this.A00.A0b.getDuration()) + c21394a.A00());
            }
        };
        this.A0d = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.5J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A0Z.ADc(this.A00.A0b.getDuration());
                C22065F.A03(this.A00, 1.0f);
                this.A00.A0b.A0e(EnumC4381et.A02, 28);
            }
        };
        this.A0e = new C22075G(this);
        this.A0Y = abstractC3992Yb;
        this.A0U = i4;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c4494gi.getSystemService(A0L(12, 12, 28));
        this.A0V = C3279Mu.A01(c4494gi, interfaceC3784VA, abstractC4669jd.A2E(), AbstractC3904XB.A00(abstractC4669jd.A29().A0J().A05()), new HashMap(), false, true, abstractC4669jd.A2A());
        this.A0W = c4494gi;
        this.A0X = c3792vi;
        this.A0j = new C2708Df(this.A0W, this.A0X);
        this.A0k = new C2702DZ(this.A0W, -1);
        this.A0Z = interfaceC4313dm;
        if (i3 == 1) {
            c3320NaA00 = super.A06.A28().A01();
        } else {
            c3320NaA00 = super.A06.A28().A00();
        }
        this.A0D = c3320NaA00;
        this.A0b = new C2775Ek(this.A0W);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C21504L(c4494gi, interfaceC3784VA, this.A0b, abstractC4669jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c3648Sx.A0T(videoUrl));
        A0R();
        A0O();
        A0N();
        C4494gi c4494gi2 = this.A0W;
        String videoUrl2 = abstractC4669jd.A29().A0H().A08();
        AbstractC4194br.A00(c4494gi2, this, videoUrl2);
        setupLayoutConfiguration(false);
        A0T();
        A0S();
        postDelayed(new C2968Hs(this), 1000L);
        if (C3763Up.A1z(this.A0W)) {
            InterfaceC3796VM interfaceC3796VMA0B = this.A0W.A0B();
            C2775Ek c2775Ek = this.A0b;
            String videoUrl3 = super.A06.A2E();
            interfaceC3796VMA0B.AKn(c2775Ek, videoUrl3, true);
        }
        if (C3763Up.A20(this.A0W)) {
            this.A0a = new C2785Eu(this.A0W, interfaceC3784VA, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0Y(abstractC4669jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        c4494gi.A0F().ACI(this.A0m, this.A0n, true);
    }

    public static /* synthetic */ float A03(C22065F c22065f, float f2) {
        float f3 = c22065f.A01 + f2;
        c22065f.A01 = f3;
        return f3;
    }

    public static /* synthetic */ int A05(C22065F c22065f) {
        int i2 = c22065f.A02;
        c22065f.A02 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A07(C22065F c22065f) {
        int i2 = c22065f.A07;
        c22065f.A07 = i2 + 1;
        return i2;
    }

    private void A0M() {
        AbstractC3966YB.A0J(this.A0B);
        this.A0B = new LinearLayout(this.A0W);
        AbstractC3966YB.A0U(this.A0B, this.A0W);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0N() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0x, A0x, A0x, A0x);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
        layoutParams.addRule(12);
        addView(this.A0k, layoutParams);
    }

    private void A0O() {
        this.A0j.setPadding(A0u, A0u, A0u, A0u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0v, A0v);
        layoutParams.setMargins(0, AbstractC3992Yb.A00, A0t, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            A0h(A0L(24, 18, 58));
        }
    }

    private void A0Q() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            Map<String, String> mapA05 = new C4150b9().A03(null).A02(null).A05();
            mapA05.put(A0L(0, 12, 87), A0L(24, 18, 58));
            super.A08.AB6(super.A06.A2E(), mapA05);
        }
    }

    private void A0R() {
        postDelayed(new C2971Hv(this), C3763Up.A0P(this.A0W));
    }

    private void A0S() {
        AbstractC3966YB.A0J(this.A0A);
        this.A0A = new LinearLayout(this.A0W);
        this.A0A.setOrientation(1);
        AbstractC3966YB.A0K(this.A0A);
        A0V();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0T() {
        View view = this.A0b;
        if (super.A06.A1e()) {
            view.setOnClickListener(new ViewOnClickListenerC4300dZ(this));
        }
        AbstractC3966YB.A0J(view);
        AbstractC3966YB.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0W);
        View mMediaView = this.A0C;
        AbstractC3966YB.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0r, A0r / 2, A0r, A0w);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        AbstractC3966YB.A0K(mMediaView3);
        this.A0H = new C4242cd(this.A0W, null, super.A06, super.A08, super.A0B, super.A0D, super.A0A, getColors(), new C2980I4(this));
        View mMediaView4 = this.A0H;
        AbstractC3966YB.A0G(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0W();
        A0M();
        if (C3763Up.A17(this.A0W)) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC4292dR(this));
            View mMediaView6 = this.A0Y;
            if (mMediaView6 != null) {
                this.A0Y.setCTAClickListener(new ViewOnClickListenerC4293dS(this));
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C20963S c20963s = new C20963S(this.A0W);
            this.A0b.A0f(c20963s);
            c20963s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C20813B(this.A0W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0p[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Y(C3311NR c3311nr) {
        double dA00 = AbstractC4197bu.A00(c3311nr);
        String strA0F = c3311nr.A0I().A0F();
        if (strA0F == null || strA0F.trim().length() == 0) {
            AbstractC3966YB.A0O(this.A0B, 8);
            if (C3763Up.A17(this.A0W)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(strA0F);
            if (C3763Up.A17(this.A0W)) {
                this.A0B.setClickable(true);
            }
        }
        if (dA00 > 0.0d) {
            this.A03 = (int) (((double) this.A06) / dA00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(C21394A c21394a) {
        if (this.A0b.getState() == EnumC4436fm.A02 && C3763Up.A1e(this.A0W)) {
            postDelayed(new C2969Ht(this, c21394a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(String str) {
        C3226M3 c3226m3;
        AbstractC3966YB.A0J(this.A0G);
        C2977I1 c2977i1 = new C2977I1(this);
        if (this.A0W.A0E() == null) {
            this.A0W.A0F().A9v();
        }
        boolean zA02 = AbstractC3764Uq.A02(this.A0W);
        if (A0p[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0p;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (zA02 || this.A0W.A0E() == null) {
            c3226m3 = new C3226M3(this.A0W, c2977i1);
        } else {
            c3226m3 = new C3226M3(this.A0W, this.A0W.A0E(), c2977i1);
        }
        this.A0G = c3226m3;
        this.A0G.setOnTouchListener(new ViewOnTouchListenerC4294dT(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0h(String str) {
        Map<String, String> mapA05 = new C4150b9().A03(null).A02(null).A05();
        mapA05.put(A0L(0, 12, 87), str);
        this.A0X.A04(EnumC3791VH.A0J, mapA05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), mapA05);
        if (C3763Up.A2U(this.A0W)) {
            HashMap map = new HashMap();
            map.put(AbstractC4708kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC4708kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC4708kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O()) {
                boolean z = this.A0M;
                if (A0p[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0p;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z) {
                    return;
                }
            }
            this.A0M = true;
            A0h(str);
            return;
        }
        boolean zA1d = super.A06.A1d();
        if (A0p[1].charAt(27) == 'i') {
            String[] strArr2 = A0p;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!zA1d) {
                return;
            }
        } else if (!zA1d) {
            return;
        }
        A0P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(boolean z) {
        if (!z && this.A0m && !this.A0R) {
            return;
        }
        this.A0K = z;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!z) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String strA0L = A0L(48, 1, 127);
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.A0H, strA0L, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y2 = this.A0A.getY();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0L, y2, i2);
        objectAnimatorOfFloat2.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0b, strA0L, this.A0b.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0b.getHeight();
        int i3 = this.A05;
        if (z) {
            i3 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i3).setDuration(500L);
        duration.addUpdateListener(new C4296dV(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new C4297dW(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        animatorSet.start();
    }

    private void A0k(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        AbstractC3966YB.A0J(this.A0b);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0S();
        }
        this.A0b.setTranslationY(0.0f);
        addView(this.A0b, 1, layoutParams);
        A0M();
        A0W();
    }

    private void A0l(boolean z, int i2) {
        this.A0W.A0F().ACG(!z, i2);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z ? 0 : 4);
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final EnumC3275Mq A1D(String str) {
        if (!A0m()) {
            EnumC3275Mq enumC3275MqA02 = this.A0H.A02(str);
            String[] strArr = A0p;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0p[1] = "gDqV8VnRL5n4dziTmRcIoSoDocYisV3G";
            return enumC3275MqA02;
        }
        return EnumC3275Mq.A09;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1E() {
        A0Q();
        if (C3763Up.A1z(this.A0W)) {
            this.A0W.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            C2785Eu c2785Eu = this.A0a;
            if (A0p[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0p[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            c2785Eu.A07();
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
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1H() {
        C2775Ek c2775Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c2775Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC4381et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0U;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0Y.setProgressSpinnerInvisible(true);
                new C3917XO(iA02, new C2973Hx(this)).A07();
                return;
            }
        }
        this.A0Y.setToolbarActionMode(8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1I(boolean z) {
        this.A0R = z;
        A0l(z, 4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1J(boolean z) {
        if (this.A0b.A0n()) {
            return;
        }
        this.A0I = this.A0b.getVideoStartReason();
        this.A0S = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() != EnumC4436fm.A06) {
            EnumC4381et enumC4381et = this.A0I;
            String[] strArr = A0p;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC4381et != null) {
                if (!this.A0S || z) {
                    this.A0b.A0e(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1L() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public final boolean A1N() {
        return true;
    }

    public final boolean A1O() {
        return !A0m();
    }

    public C3320Na getColors() {
        return this.A0D;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public C4311dk getFullScreenAdStyle() {
        return new C4311dk(true, C4311dk.A06, super.A06.A28().A01(), ViewOnClickListenerC3152Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij
    public C3957Y2 getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3020Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0k(A0m());
        setupLayoutConfiguration(A0m());
        A0V();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            A1J(false);
        }
    }

    private void setUpBrowserControls(C3226M3 c3226m3) {
        AbstractC3966YB.A0J(this.A0E);
        this.A0E = new C3229M6(this.A0W, c3226m3, true, this.A0n);
        if (this.A0m) {
            A0l(this.A0R, 1);
        }
        c3226m3.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        AbstractC3966YB.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C2974Hy(this));
        this.A0E.setOnTouchListener(new ViewOnTouchListenerC4295dU(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC3966YB.A0J(this.A0F);
        this.A0F = new C4122ah(this.A0W, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0q));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0W.getSystemService(A0L(42, 6, 42));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
