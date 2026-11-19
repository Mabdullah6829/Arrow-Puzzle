package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3308NO extends RelativeLayout implements InterfaceC3999Yi {
    public static byte[] A0h;
    public static String[] A0i = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final RelativeLayout.LayoutParams A0p;
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public Toast A05;
    public C3568Re A06;
    public C3917XO A07;
    public C4098aJ A08;
    public C4102aN A09;
    public ViewOnClickListenerC3152Kr A0A;
    public C4345eI A0B;
    public C4362ea A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Handler A0N;
    public final AbstractC4669jd A0O;
    public final C3334No A0P;
    public final InterfaceC3574Rk A0Q;
    public final C4494gi A0R;
    public final InterfaceC3784VA A0S;
    public final C3792VI A0T;
    public final C3917XO A0U;
    public final ViewOnSystemUiVisibilityChangeListenerC3952Xx A0V;
    public final InterfaceC3998Yh A0W;
    public final InterfaceC4047ZU A0X;
    public final InterfaceC4184bh A0Y;
    public final C4185bi A0Z;
    public final C4349eM A0a;
    public final AtomicBoolean A0b;
    public final AtomicBoolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final AbstractC3992Yb A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C3308NO(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, String str, InterfaceC4047ZU interfaceC4047ZU, boolean z) {
        super(c4494gi);
        String strA0D = A0D(0, 0, 113);
        this.A0E = strA0D;
        this.A0D = strA0D;
        this.A0Q = new C3377OV(this);
        this.A0c = new AtomicBoolean(false);
        this.A0b = new AtomicBoolean(false);
        this.A0K = false;
        this.A0M = true;
        this.A0H = false;
        this.A0G = false;
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0F = false;
        this.A0f = z;
        this.A0R = c4494gi;
        this.A0W = interfaceC3998Yh;
        this.A0S = interfaceC3784VA;
        this.A0O = abstractC4669jd;
        this.A0P = abstractC4669jd.A29().A0H().A07();
        this.A0T = new C3792VI(this.A0O.A2E(), this.A0S);
        this.A0X = interfaceC4047ZU;
        this.A0C = new C4362ea(c4494gi, this.A0X, str, this.A0W);
        if (abstractC4669jd.A29().A0H().A07() != null) {
            this.A0I = abstractC4669jd.A29().A0H().A07().A0X();
            this.A0E = abstractC4669jd.A29().A0H().A07().A0O();
            this.A0D = abstractC4669jd.A29().A0H().A07().A0N();
        }
        this.A0J = this.A0O.A29().A0S() && this.A0O.A29().A0H().A03() > 0;
        this.A0e = this.A0O.A29().A0H().A0B();
        if (this.A0P == null) {
            this.A0W.A4j(this.A0X.A81());
            this.A0W.A4j(this.A0X.A7w());
        }
        int iA03 = this.A0P != null ? !this.A0P.A0c() ? (this.A0J && this.A0e) ? this.A0O.A29().A0H().A03() : this.A0P.A0C() : this.A0P.A0E() : 0;
        this.A0c.set(!this.A0P.A0W());
        C3377OV c3377ov = null;
        this.A0U = new C3917XO(iA03, new C3341Nv(this, c3377ov));
        this.A0d = C3763Up.A0o(this.A0R);
        this.A0g = A07();
        if (this.A0P.A0c()) {
            this.A0g.A09();
        }
        this.A0a = new C4349eM(this.A0R, this.A0S, this.A0O);
        AbstractC4194br.A00(c4494gi, this, abstractC4669jd.A29().A0H().A08());
        this.A0V = new ViewOnSystemUiVisibilityChangeListenerC3952Xx(this);
        this.A0V.A05(EnumC3951Xw.A02);
        if (C3763Up.A2K(this.A0R)) {
            this.A0g.setProgressSpinnerInvisible(true);
        }
        C3309NP c3309np = new C3309NP(this, c3377ov);
        HashMap map = new HashMap();
        map.put(A0D(56, 9, 90), this.A0X.A8l());
        this.A0B = new C4345eI(this.A0R, this.A0O, this.A0P, this.A0S, c3309np, map);
        A0K();
        this.A0W.A45(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0Y = new C3345Nz(this);
        this.A0Z = new C4185bi(this.A0R, this.A0g, this.A0O, (C2775Ek) null, this.A0W, this.A0Y, this.A0A, this.A02, this.A0B);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEU();
        }
    }

    public static String A0D(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0h = new byte[]{124, 85, 123, 83, 69, 67, 83, 125, 49, 62, 59, 49, 57, 13, 61, 32, 59, 53, 59, 60, 15, 0, 5, 15, 7, 51, 31, 3, 25, 30, 15, 9, 62, 57, 35, 50, 37, 36, 35, 62, 35, 62, 54, 59, 87, 88, 77, 80, 79, 92, 102, 90, 85, 80, 90, 82, 65, 93, 80, 82, 84, 92, 84, 95, 69, 104, 127, 109, 123, 104, 126, 127, 126, 69, 108, 115, 126, 127, 117, 30, 12, 11, 31, 0, 12, 30, 54, 10, 5, 0, 10, 2};
    }

    static {
        A0P();
        A0p = new RelativeLayout.LayoutParams(-1, -1);
        A0k = AbstractC3924XV.A0N;
        A0l = AbstractC3924XV.A09;
        A0o = AbstractC3924XV.A07;
        A0m = AbstractC3924XV.A05;
        A0n = AbstractC3411P3.A02(-1, 77);
        A0j = AbstractC3924XV.A0U;
    }

    public C3308NO(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, String str, InterfaceC4047ZU interfaceC4047ZU) {
        this(c4494gi, interfaceC3784VA, interfaceC3998Yh, abstractC4669jd, str, interfaceC4047ZU, false);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0R, this.A0W, this.A0T, 0, this.A0O.A22(), this.A0I);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A0D(this.A0O.A28().A01(), ViewOnClickListenerC3152Kr.A05(this.A0O));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0O.A2C(), this.A0O.A2E(), this.A0P.A0C(), this.A0O.A2D());
        fullScreenAdToolbar.setToolbarListener(new C3342Nw(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC3152Kr A09() {
        if (this.A0B == null || this.A0B.getViewabilityChecker() == null || this.A0B.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr = new ViewOnClickListenerC3152Kr(this.A0R, this.A0X.A7M(), this.A0O.A28().A01(), this.A0S, this.A0W, this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0O.A2A());
        AbstractC3966YB.A0K(viewOnClickListenerC3152Kr);
        viewOnClickListenerC3152Kr.setText(this.A0O.A29().A0J().A04());
        viewOnClickListenerC3152Kr.setTextSize(14.0f);
        viewOnClickListenerC3152Kr.setPadding(AbstractC3924XV.A02, AbstractC3924XV.A02, AbstractC3924XV.A02, AbstractC3924XV.A02);
        viewOnClickListenerC3152Kr.setOnClickListener(new ViewOnClickListenerC4023Z6(this));
        return viewOnClickListenerC3152Kr;
    }

    private C4193bq A0B() {
        C4494gi c4494gi = this.A0R;
        C3320Na c3320NaA01 = this.A0O.A28().A01();
        int i2 = !this.A0J ? 16 : 17;
        boolean z = this.A0J;
        String[] strArr = A0i;
        if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "YLS";
        strArr2[4] = "sNsC3VBoYaF6TxGjee";
        C4193bq c4193bq = new C4193bq(c4494gi, c3320NaA01, true, i2, !z ? 14 : 13, 0);
        c4193bq.A04(this.A0O.A29().A0I().A0G(), this.A0O.A29().A0I().A0F(), null, false, true);
        TextView descriptionTv = c4193bq.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c4193bq.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c4193bq;
    }

    private void A0G() {
        String strA01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0k, A0k);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C4187bk c4187bk = new C4187bk(this.A0R);
        AbstractC3966YB.A0N(c4187bk, 0);
        AbstractC3966YB.A0K(c4187bk);
        new AsyncTaskC3183LM(c4187bk, this.A0R).A05(A0k, A0k).A07(this.A0O.A2C().A01());
        TextView textView = new TextView(this.A0R);
        AbstractC3966YB.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0O.A28().A01().A07(true));
        textView.setText(this.A0O.A29().A0I().A0G());
        textView.setTextSize(!this.A0I ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C4189bm c4189bm = new C4189bm(this.A0R, !this.A0I ? A0o : A0m, 5, A0n, -1);
        c4189bm.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0R);
        textView2.setTextColor(this.A0O.A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0I) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = AbstractC3924XV.A0U;
        LinearLayout linearLayout = new LinearLayout(this.A0R);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0l);
        layoutParams4.topMargin = AbstractC3924XV.A0U / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c4189bm, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = AbstractC3924XV.A0U;
        ratingInfoContainerParams.addRule(1, c4187bk.getId());
        ratingInfoContainerParams.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A04 != null) {
            this.A04.removeAllViews();
            this.A04.addView(relativeLayout, ratingInfoContainerParams);
            this.A04.addView(c4187bk, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0O.A29().A0I().A0C())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c4189bm.setRating(Float.parseFloat(this.A0O.A29().A0I().A0C()));
        if (this.A0O.A29().A0I().A09() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A0D(0, 1, 63));
        if (!this.A0I) {
            strA01 = NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0O.A29().A0I().A09()));
        } else {
            strA01 = AbstractC3935Xg.A01(Integer.parseInt(this.A0O.A29().A0I().A09()));
        }
        sb.append(strA01);
        sb.append(A0D(1, 1, 23));
        textView2.setText(sb.toString());
    }

    private void A0H() {
        if (this.A0P.A0W()) {
            A0J();
        } else {
            A0O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0L = true;
        if (this.A0O.A29().A0S()) {
            this.A0C.A06();
            this.A0W.A4k(this.A0X.A6l(), new C21494K(0, 0));
        }
    }

    private void A0J() {
        C4317dq c4317dqA0F = new C4315do(this.A0R, this.A0O.A29().A0I(), this.A0O.A2C()).A0A(this.A0O.A28().A01()).A0D(this.A0P.A0Q()).A0C(this.A0P.A0K()).A09(AdError.SERVER_ERROR_CODE).A0E(this.A0I).A0B(this.A0E).A0F();
        AbstractC3794VK.A04(c4317dqA0F, this.A0T, EnumC3791VH.A0U);
        addView(c4317dqA0F, A0p);
        c4317dqA0F.A04(new C3344Ny(this));
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams;
        this.A0A = A09();
        this.A02 = new RelativeLayout(getContext());
        AbstractC3966YB.A0K(this.A02);
        this.A04 = new RelativeLayout(getContext());
        AbstractC3966YB.A0K(this.A04);
        if (this.A0d) {
            A0G();
        } else {
            RelativeLayout relativeLayout = this.A04;
            C4193bq c4193bqA0B = A0B();
            RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c4193bqA0B, iconAndMetaDataContainerParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, AbstractC3924XV.A09, 0);
        this.A02.addView(this.A04, layoutParams2);
        if (this.A0A != null) {
            ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr = this.A0A;
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0i[3] = "f";
            layoutParams2.addRule(0, viewOnClickListenerC3152Kr.getId());
            if (!this.A0I) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A04.getId());
                layoutParams.addRule(8, this.A04.getId());
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                AbstractC3966YB.A0V(this.A0A, AbstractC3966YB.A06(-16738826, A0j));
                this.A0A.setStateListAnimator(null);
                this.A0A.setPadding(AbstractC3924XV.A0B, AbstractC3924XV.A06, AbstractC3924XV.A0B, AbstractC3924XV.A06);
                AbstractC3966YB.A0Z(this.A0A);
            }
            layoutParams.addRule(11);
            this.A02.addView(this.A0A, layoutParams);
        }
        AbstractC3966YB.A0K(this.A0g);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        this.A01 = new LinearLayout(getContext());
        AbstractC3966YB.A0K(this.A01);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
        adWebViewParams.setMargins(AbstractC3924XV.A09, AbstractC3924XV.A05, AbstractC3924XV.A09, AbstractC3924XV.A05);
        adWebViewParams.addRule(12);
        this.A01.setOrientation(1);
        RelativeLayout.LayoutParams toolbarParams = new RelativeLayout.LayoutParams(-1, -1);
        toolbarParams.setMargins(AbstractC3924XV.A09, 0, AbstractC3924XV.A09, 0);
        toolbarParams.addRule(3, this.A0g.getId());
        toolbarParams.addRule(2, this.A01.getId());
        this.A01.addView(this.A02, new RelativeLayout.LayoutParams(-2, -2));
        this.A03 = new RelativeLayout(getContext());
        AbstractC3966YB.A0K(this.A03);
        this.A01.addView(this.A03);
        if (this.A0O.A2M()) {
            this.A0g.A08();
            A0M();
        }
        if (this.A0O.A2W()) {
            A0L();
        }
        this.A0g.setVisibility(4);
        this.A0B.setVisibility(4);
        this.A02.setVisibility(4);
        addView(this.A0g, layoutParams3);
        addView(this.A0B, toolbarParams);
        addView(this.A01, adWebViewParams);
        if (this.A0P.A0Y()) {
            this.A0B.A0C();
        }
    }

    private void A0L() {
        this.A09 = AbstractC4103aO.A02(this.A0R, EnumC4101aM.A03, this.A0O);
        AbstractC3966YB.A0K(this.A09);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.topMargin = AbstractC3924XV.A09;
        this.A03.addView(this.A09, layoutParams);
    }

    private void A0M() {
        this.A08 = AbstractC4103aO.A01(this.A0R, true, this.A0O, this.A0T, this.A0W, EnumC4101aM.A03, AbstractC4100aL.A00(this.A0O));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.topMargin = AbstractC3924XV.A09;
        this.A03.addView(this.A08, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0O.A2M() && this.A08 != null) {
            this.A08.A0P();
            if (this.A0O.A2U()) {
                AbstractC4100aL.A04(this.A0R, EnumC4101aM.A02);
            } else {
                AbstractC4100aL.A05(this.A0R, EnumC4101aM.A02);
            }
        }
        if (this.A0O.A2W() && this.A09 != null) {
            AbstractC4100aL.A06(this.A0R, EnumC4101aM.A02);
        }
        new C3792VI(this.A0O.A2E(), this.A0S).A04(EnumC3791VH.A0z, null);
        this.A0b.set(true);
        AbstractC3966YB.A0W(this);
        AbstractC3966YB.A0H(this.A0B);
        AbstractC3966YB.A0d(this.A0Z, this.A00, this.A0B);
        if (this.A0I) {
            boolean z = this.A0d;
            String[] strArr = A0i;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[6] = "qNCG6dDJsAPFbWTySRxInyS8ppXyMF33";
            strArr2[1] = "jWdNFAVobp8QAHjjZXwWCxlFqJ2u0nxR";
            if (z) {
                AbstractC3966YB.A0H(this.A0g);
            }
        } else {
            AbstractC3966YB.A0L(this.A0g);
        }
        AbstractC3966YB.A0L(this.A0A);
        Pair<EnumC4348eL, View> pairA03 = this.A0a.A03(this.A0A);
        this.A00 = (View) pairA03.second;
        switch (C4024Z7.A00[((EnumC4348eL) pairA03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                screenshotParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                if (!this.A0I) {
                    AbstractC3966YB.A0L(this.A02);
                    screenshotParams.addRule(2, this.A01.getId());
                    addView(this.A00, screenshotParams);
                } else {
                    View c4310dj = new C4310dj(this.A0R, this.A0O.A2C(), this.A0O.A29().A0I(), A09(), this.A0D, new ViewOnClickListenerC4022Z5(this));
                    RelativeLayout.LayoutParams screenshotParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    if (this.A0O.A2M()) {
                        screenshotParams2.addRule(2, this.A01.getId());
                        if (this.A02 != null) {
                            AbstractC3966YB.A0O(this.A02, 8);
                        }
                    }
                    addView(c4310dj, screenshotParams2);
                    View view = this.A0g;
                    String[] strArr3 = A0i;
                    if (strArr3[7].length() == strArr3[4].length()) {
                        A0i[5] = "GuR3tgtU";
                        removeView(view);
                    } else {
                        String[] strArr4 = A0i;
                        strArr4[0] = "xaRPgQ1Vn5AR5k4AW07eBuZz1tirIodN";
                        strArr4[2] = "10QTFu18AzpwL0fCi5Lt2x9tRdyuYXAR";
                        removeView(view);
                    }
                }
                break;
            case 2:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (this.A0O.A2M()) {
                    layoutParams.addRule(2, this.A01.getId());
                    if (this.A02 != null) {
                        AbstractC3966YB.A0O(this.A02, 8);
                    }
                } else {
                    AbstractC3966YB.A0d(this.A01);
                }
                addView(this.A00, layoutParams);
                break;
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        AbstractC3966YB.A0W(this);
        if (!this.A0P.A0Y()) {
            this.A0B.A0C();
        }
        this.A0g.setVisibility(0);
        this.A0B.setVisibility(0);
        if (this.A02 != null) {
            RelativeLayout relativeLayout = this.A02;
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0i[3] = "XO2ZpTY6Mgvz2u";
            relativeLayout.setVisibility(0);
        }
        if (this.A0A != null && this.A0O.A25() > 0 && this.A07 == null) {
            this.A07 = new C3917XO(this.A0O.A25(), new C3343Nx(this));
            this.A07.A07();
        }
        this.A0U.A07();
        if (this.A08 != null && this.A0O.A2Q()) {
            C4098aJ c4098aJ = this.A08;
            String[] strArr2 = A0i;
            if (strArr2[0].charAt(6) != strArr2[2].charAt(6)) {
                c4098aJ.A0Q();
            } else {
                A0i[5] = "teHq37vz";
                c4098aJ.A0Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i2) {
        String strValueOf = String.valueOf(i2);
        Toast toast = this.A05;
        String strA0J = this.A0P.A0J();
        String progress = A0D(2, 6, 75);
        AbstractC3966YB.A0b(toast, strA0J.replace(progress, strValueOf), 49, 0, AbstractC3924XV.A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W(boolean z, String str) {
        this.A0H = true;
        HashMap map = new HashMap();
        map.put(A0D(8, 12, 57), z ? A0D(79, 13, 2) : A0D(44, 12, 82));
        map.put(A0D(20, 12, 7), str);
        new C4172bV(this.A0R, this.A0X.A7M(), this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0S, this.A0O.A2A(), this.A0W).A05(this.A0O.A2E(), this.A0O.A29().A0J().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0X() {
        return this.A0O.A10().equals(A0D(65, 14, 113)) || (this.A0O.A10().equals(A0D(32, 12, 60)) && this.A0O.A29().A0V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        return this.A0e && !this.A0K && !this.A0M && this.A0P.A0C() < this.A0O.A29().A0H().A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        this.A06 = c3568Re;
        this.A06.A0A(this.A0Q);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
        this.A0U.A06();
        this.A0G = true;
        if (!this.A0F && !z && this.A08 != null) {
            this.A08.A0P();
        }
        this.A0F = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
        if ((!this.A0e || !this.A0M) && !this.A0K) {
            boolean z2 = this.A0c.get();
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z2) {
                C3917XO c3917xo = this.A0U;
                String[] strArr3 = A0i;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    String[] strArr4 = A0i;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (c3917xo.A05()) {
                        return;
                    }
                } else {
                    String[] strArr5 = A0i;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (c3917xo.A05()) {
                        return;
                    }
                }
                this.A0U.A07();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return this.A0O.A2E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        this.A0V.A03();
        if (this.A08 != null) {
            this.A08.A0O();
        }
        if (this.A06 != null) {
            this.A06.A0B(this.A0Q);
        }
        if (this.A0B != null) {
            if (!TextUtils.isEmpty(this.A0O.A2E())) {
                this.A0S.AB7(this.A0O.A2E(), new C4150b9().A03(this.A0B.getViewabilityChecker()).A02(this.A0B.getTouchDataRecorder()).A05());
            }
            C4345eI c4345eI = this.A0B;
            String[] strArr = A0i;
            if (strArr[0].charAt(6) != strArr[2].charAt(6)) {
                throw new RuntimeException();
            }
            A0i[3] = "Lk0Kz0u4YEu";
            c4345eI.A0D();
        }
        this.A0U.A06();
        this.A0g.setToolbarListener(null);
        this.A0N.removeCallbacksAndMessages(null);
        this.A05 = null;
        this.A06 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AFi(false);
        } else {
            this.A0F = true;
            AFA(false);
        }
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }

    public void setServerSideRewardHandler(C4362ea c4362ea) {
        this.A0C = c4362ea;
    }
}
