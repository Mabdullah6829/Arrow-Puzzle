package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6g */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22956g extends AbstractC3398Oq {
    public static String[] A0E = {"vPMRmT88mgqFEke8ATcV4DjUXhfKSOnR", "vcxzG3inNeckkmEQerBRT2lbis8VS7m7", "eUyvpit7R4E8S", "81xoNnBskiL3NHuExK0jouL0xNUbAz24", "9rRUUXnOqMhF40SMgnak6Kzhg0roR6HI", "NGPySEd1uSK0pWi3", "38FqFi34P3eGFZ4PzNWUjtJ56H9UGtdy", "zzAANKTeXLAH5LLCmw3IQOJWh4jGOg5d"};
    public C21504L A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final C3648Sx A04;
    public final InterfaceC3784VA A05;
    public final C2775Ek A06;
    public final AbstractC2739EA A07;
    public final AbstractC2737E8 A08;
    public final C2712Dj A09;
    public final ViewOnClickListenerC2709Dg A0A;
    public final C2708Df A0B;
    public final AbstractC4438fo A0C;
    public final C4439fp A0D;

    public C22956g(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, C3648Sx c3648Sx, C3792VI c3792vi, View.OnClickListener onClickListener, AbstractC4669jd abstractC4669jd) {
        super(c4494gi, onClickListener, c3792vi, abstractC4669jd);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.6p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                if (C3763Up.A1T(((AbstractC3398Oq) this.A00).A08)) {
                    this.A00.A06.A0e(EnumC4381et.A02, 30);
                }
            }
        };
        this.A08 = new C23036o(this);
        this.A05 = interfaceC3784VA;
        this.A04 = c3648Sx;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c4494gi);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(c3792vi);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(c3792vi);
        AbstractC3966YB.A0K(this.A0B);
        A0F();
    }

    private C3397Op A00() {
        return new C3397Op(this);
    }

    private C2775Ek A01(C3792VI c3792vi) {
        C2775Ek c2775Ek = new C2775Ek(super.A08);
        AbstractC3966YB.A0K(c2775Ek);
        c2775Ek.setFunnelLoggingHandler(c3792vi);
        c2775Ek.getEventBus().A03(this.A07, this.A08);
        if (C3763Up.A1V(super.A08)) {
            c2775Ek.setVolume(0.0f);
        }
        if (!C3763Up.A1Q(super.A08)) {
            c2775Ek.setOnClickListener(new ViewOnClickListenerC4015Yy(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c2775Ek, videoLayoutParams);
        return c2775Ek;
    }

    private C2712Dj A03() {
        C2712Dj c2712Dj = new C2712Dj(super.A08);
        c2712Dj.setTextColor(-1);
        AbstractC3966YB.A0a(c2712Dj, false, 12);
        c2712Dj.setGravity(17);
        this.A06.A0f(c2712Dj);
        return c2712Dj;
    }

    private ViewOnClickListenerC2709Dg A04() {
        ViewOnClickListenerC2709Dg viewOnClickListenerC2709Dg = new ViewOnClickListenerC2709Dg(super.A08);
        this.A06.A0f(viewOnClickListenerC2709Dg);
        return viewOnClickListenerC2709Dg;
    }

    private C2708Df A06(C3792VI c3792vi) {
        C2708Df c2708Df = new C2708Df(super.A08, c3792vi, true);
        c2708Df.setBackgroundPaintColor(855638016);
        this.A06.A0f(c2708Df);
        return c2708Df;
    }

    private C4439fp A07() {
        return new C4439fp(this, 50, true, new WeakReference(this.A0C), super.A08);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
            return;
        }
        if (super.A05 != null) {
            super.A05.A0P();
        }
        this.A0D.A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public final void A0D() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0W();
        if (super.A05 != null) {
            super.A05.A0O();
        }
        AbstractC3966YB.A0J(this.A06);
        if (this.A00 != null) {
            C21504L c21504l = this.A00;
            if (A0E[1].charAt(6) != 'i') {
                throw new RuntimeException();
            }
            A0E[6] = "QSSPJpdXUUt8XbGqouva3DO5ILergMU2";
            c21504l.A0p();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public final void A0E() {
        super.A0E();
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public final void A0F() {
        super.A0F();
        if (C3763Up.A1W(super.A08)) {
            AbstractC3966YB.A0J(this.A0A);
            this.A0A.setLayoutParams(A0C(true, false));
            addView(this.A0A);
        }
        if (C3763Up.A1S(super.A08)) {
            AbstractC3966YB.A0J(this.A09);
            this.A09.setLayoutParams(A0C(true, true));
            addView(this.A09);
        }
        if (C3763Up.A1U(super.A08)) {
            AbstractC3966YB.A0J(this.A0B);
            this.A0B.setLayoutParams(A0C(false, false));
            addView(this.A0B);
        }
        C4084a5 c4084a5 = super.A04;
        if (A0E[6].charAt(23) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[5] = "QWCSfSUWuFerXIpv";
        strArr[2] = "7tLHnRgEmKXMN";
        if (c4084a5 != null) {
            AbstractC3966YB.A0J(super.A04);
            if (C3763Up.A1U(super.A08)) {
                super.A04.setLayoutParams(AbstractC3398Oq.A0A(this.A0B));
            } else {
                super.A04.setLayoutParams(AbstractC3398Oq.A0A(null));
            }
            addView(super.A04);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public final boolean A0G() {
        return this.A06.A0l();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public final boolean A0H() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) (((double) (getMeasuredWidth() - this.A06.getMeasuredWidth())) / 2.0d);
        int i2 = AbstractC3398Oq.A0D;
        int widthGap = AbstractC3398Oq.A0C;
        return measuredWidth > i2 + (widthGap * 2);
    }

    public final C22956g A0I(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0T(str2));
        this.A00 = new C21504L(super.A08, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new AsyncTaskC3183LM(this.A03, super.A08).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C3396Oo(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3398Oq
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
