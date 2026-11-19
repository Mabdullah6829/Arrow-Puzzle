package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4195bs {
    public final float A00;
    public final int A01;
    public final AbstractC4669jd A02;
    public final C3320Na A03;
    public final C4494gi A04;
    public final InterfaceC3784VA A05;
    public final C3792VI A06;
    public final C3957Y2 A07;
    public final InterfaceC3998Yh A08;
    public final ViewOnClickListenerC3152Kr A09;
    public final C2702DZ A0A;
    public final C4439fp A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C4195bs(float f2, String str, C4494gi c4494gi, C3320Na c3320Na, AbstractC4669jd abstractC4669jd, InterfaceC3998Yh interfaceC3998Yh, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, int i2, boolean z, InterfaceC3784VA interfaceC3784VA, C4439fp c4439fp, C3957Y2 c3957y2, C2702DZ c2702dz, C3792VI c3792vi, boolean z2) {
        this.A00 = f2;
        this.A0C = str;
        this.A09 = viewOnClickListenerC3152Kr;
        this.A03 = c3320Na;
        this.A0E = z2;
        this.A0D = z;
        this.A01 = i2;
        this.A04 = c4494gi;
        this.A05 = interfaceC3784VA;
        this.A08 = interfaceC3998Yh;
        this.A0B = c4439fp;
        this.A07 = c3957y2;
        this.A02 = abstractC4669jd;
        this.A0A = c2702dz;
        this.A06 = c3792vi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6V] */
    private C22846V A00() {
        return new AbstractC3181LK(this.A04, this.A09, this.A01, this.A0D, this.A03, this.A0C, this.A05, this.A08, this.A0B, this.A07, this.A02, this.A0A, this.A06, this.A0E) { // from class: com.facebook.ads.redexgen.X.6V
            public static String[] A00 = {"G", "KzTy2hy9hhtw1RMGA4AWQtLCSBRvIgNx", "TFXx3faCMHKsw8ZQwSQJp4p3qrvSFGQZ", "FDPqMwfpfrBnIs9VqOwKhGqv0efVrSDC", "w99CmZO3gVFe1JaqJ0AV2MifxVBEUT0K", "IReileYPgfNfW", "Qab6Yr7DAj1gKX83C9lxa", "vvhOodmvLfB1cs4WARwmrAXLlmUlw4y7"};
            public static final int A01 = (int) (AbstractC3926XX.A02 * 152.0f);

            {
                int i2 = getResources().getConfiguration().orientation;
                A00();
                A07(i2);
                A09(i2);
                AbstractC3966YB.A0K(this.A0P);
                A06(i2);
                A02(i2);
                A05(i2);
                A0A(((AbstractC3181LK) this).A06, i2);
                A0A(((AbstractC3181LK) this).A05, i2);
                A04(i2);
                A03(i2);
                A08(i2);
                A0B(((AbstractC3181LK) this).A04, i2);
                addView(this.A0O);
            }

            private void A00() {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(13);
                int i2 = (int) (getResources().getDisplayMetrics().widthPixels * 0.1f);
                layoutParams.setMargins(i2, 0, i2, 0);
                this.A0N.setLayoutParams(layoutParams);
            }

            private void A01(int i2) {
                if (((AbstractC4156bF) this).A08.getParent() != null) {
                    ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr = ((AbstractC4156bF) this).A08;
                    if (A00[6].length() != 21) {
                        throw new RuntimeException();
                    }
                    A00[6] = "77Sm8WMgdJozvQKOpKshJ";
                    AbstractC3966YB.A0J(viewOnClickListenerC3152Kr);
                }
                if (i2 == 1) {
                    A10(this.A0O);
                    this.A0O.addView(this.A0J);
                    this.A0O.addView(this.A0W);
                    this.A0O.addView(((AbstractC4156bF) this).A08);
                    this.A0O.addView(this.A0K);
                    this.A0O.addView(this.A0V);
                    A0x(this.A0O, ((AbstractC3181LK) this).A06);
                    A0x(this.A0O, ((AbstractC3181LK) this).A05);
                    return;
                }
                this.A0N.addView(((AbstractC4156bF) this).A09);
                this.A0N.addView(this.A0Q);
                this.A0N.addView(this.A0P);
                this.A0N.addView(((AbstractC4156bF) this).A08);
                this.A0N.addView(this.A0W);
                A10(this.A0N);
                this.A0N.addView(this.A0J);
                this.A0O.addView(this.A0V);
                this.A0O.addView(this.A0N);
                this.A0O.addView(this.A0K);
                A0x(this.A0O, ((AbstractC3181LK) this).A06);
                A0x(this.A0O, ((AbstractC3181LK) this).A05);
            }

            private void A02(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
                layoutParams.setMargins(0, 0, AbstractC3924XV.A0k, 0);
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                this.A0K.setLayoutParams(layoutParams);
                this.A0K.setPadding(AbstractC3924XV.A0v, AbstractC3924XV.A0v, 0, 0);
            }

            private void A03(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC3181LK.A0g);
                if (i2 == 1) {
                    layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0b);
                    layoutParams.addRule(2, this.A0W.getId());
                } else {
                    if (this.A0R.A1W()) {
                        int i3 = AbstractC3181LK.A0e;
                        if (A00[6].length() != 21) {
                            throw new RuntimeException();
                        }
                        A00[6] = "Dd2RBNBmNkHhqsYmFaiUI";
                        layoutParams.height = i3;
                    }
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.addRule(3, this.A0J.getId());
                }
                layoutParams.addRule(14);
                ((AbstractC4156bF) this).A08.setLayoutParams(layoutParams);
                A0p();
            }

            private void A04(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0J.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.removeRule(3);
                    ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr = ((AbstractC4156bF) this).A08;
                    if (A00[0].length() != 1) {
                        throw new RuntimeException();
                    }
                    A00[0] = "l";
                    layoutParams.addRule(2, viewOnClickListenerC3152Kr.getId());
                } else {
                    layoutParams.removeRule(2);
                    layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0v);
                    layoutParams.addRule(3, this.A0P.getId());
                }
                this.A0J.setLayoutParams(layoutParams);
            }

            private void A05(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = AbstractC3924XV.A0b;
                if (i2 == 1) {
                    layoutParams.removeRule(11);
                    layoutParams.addRule(7, ((AbstractC4156bF) this).A08.getId());
                    layoutParams.rightMargin = 0;
                } else {
                    layoutParams.removeRule(7);
                    layoutParams.addRule(11);
                    layoutParams.rightMargin = AbstractC3924XV.A0b;
                }
                layoutParams.addRule(12);
                this.A0V.setLayoutParams(layoutParams);
            }

            private void A06(int i2) {
                int horizontalMargin;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
                if (i2 == 1) {
                    horizontalMargin = AbstractC3924XV.A0p;
                    this.A0P.setMaxLines(4);
                    this.A0P.setTextSize(18.0f);
                } else {
                    horizontalMargin = AbstractC3924XV.A0v;
                    if (this.A0R.A1W()) {
                        this.A0P.setMaxLines(1);
                        this.A0P.setTextSize(15.0f);
                    } else {
                        this.A0P.setMaxLines(2);
                        this.A0P.setTextSize(18.0f);
                    }
                }
                layoutParams.setMargins(horizontalMargin, AbstractC3924XV.A0v, horizontalMargin, AbstractC3924XV.A0b);
                layoutParams.addRule(14);
                layoutParams.addRule(3, this.A0Q.getId());
                layoutParams.addRule(14);
                this.A0P.setTypeface(Typeface.DEFAULT);
                this.A0P.setLayoutParams(layoutParams);
            }

            private void A07(int i2) {
                int i3;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC4156bF) this).A09.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.width = A01;
                    layoutParams.height = A01;
                    layoutParams.setMargins(0, (-A01) / 4, 0, 0);
                    i3 = 30;
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(14);
                    if (A00[4].charAt(11) != 'e') {
                        throw new RuntimeException();
                    }
                    A00[0] = "p";
                    int i4 = this.A0R.A1W() ? AbstractC3181LK.A0f : AbstractC3181LK.A0m;
                    layoutParams.width = i4;
                    layoutParams.height = i4;
                    layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                    i3 = 15;
                }
                if (!this.A0a) {
                    ((AbstractC4156bF) this).A09.setRadius(i3);
                }
                layoutParams.addRule(14);
                ((AbstractC4156bF) this).A09.setLayoutParams(layoutParams);
            }

            private void A08(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0W.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.removeRule(3);
                    if (this.A0V.getVisibility() == 0) {
                        layoutParams.addRule(2, this.A0V.getId());
                    } else {
                        layoutParams.addRule(2, this.A0K.getId());
                    }
                    if ((((AbstractC3181LK) this).A06 != null || ((AbstractC3181LK) this).A05 != null) && A11()) {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0l);
                    } else if (((AbstractC3181LK) this).A06 != null) {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0Z);
                    } else {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0g);
                    }
                } else {
                    layoutParams.removeRule(2);
                    layoutParams.addRule(3, ((AbstractC4156bF) this).A08.getId());
                    layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                }
                this.A0W.setLayoutParams(layoutParams);
            }

            private void A09(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
                this.A0Q.setTypeface(Typeface.DEFAULT_BOLD);
                if (this.A0R.A1W() && i2 == 2) {
                    this.A0Q.setMaxLines(1);
                    this.A0Q.setTextSize(24.0f);
                } else {
                    this.A0Q.setMaxLines(2);
                    this.A0Q.setTextSize(30.0f);
                }
                int i3 = 0;
                if (i2 == 1) {
                    i3 = AbstractC3924XV.A0k;
                }
                int horizontalMargin = AbstractC3924XV.A0b;
                layoutParams.setMargins(i3, horizontalMargin, i3, 0);
                layoutParams.addRule(14);
                int horizontalMargin2 = ((AbstractC4156bF) this).A09.getId();
                layoutParams.addRule(3, horizontalMargin2);
                this.A0Q.setLayoutParams(layoutParams);
            }

            private void A0A(View view, int i2) {
                if (view != null) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (i2 == 1) {
                        if (((AbstractC3181LK) this).A04 != null && A11()) {
                            layoutParams.setMargins(0, AbstractC3924XV.A0Z, 0, AbstractC3924XV.A0b);
                        } else {
                            layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0b);
                        }
                        layoutParams.addRule(5, ((AbstractC4156bF) this).A08.getId());
                    } else {
                        layoutParams.addRule(9);
                        layoutParams.setMargins(AbstractC3924XV.A0Z, 0, 0, AbstractC3924XV.A0b);
                    }
                    layoutParams.addRule(12);
                    view.setLayoutParams(layoutParams);
                }
            }

            private void A0B(TextView textView, int i2) {
                if (textView == null || textView.getVisibility() != 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                if (A00[5].length() == 30) {
                    throw new RuntimeException();
                }
                A00[2] = "MzAm3HoD6orDxlJQlGTEx6IPe7UcdOUI";
                if (i2 == 1) {
                    layoutParams.removeRule(3);
                    if (((AbstractC3181LK) this).A06 != null) {
                        layoutParams.addRule(2, ((AbstractC3181LK) this).A06.getId());
                    } else if (((AbstractC3181LK) this).A05 != null) {
                        C4098aJ c4098aJ = ((AbstractC3181LK) this).A05;
                        if (A00[6].length() != 21) {
                            A00[6] = "7zj9JJJnjsPUDa1S35qln";
                            layoutParams.addRule(2, c4098aJ.getId());
                        } else {
                            A00[6] = "ItVyc3UmcGyu1CZchDJaM";
                            layoutParams.addRule(2, c4098aJ.getId());
                        }
                    } else if (this.A0V.getVisibility() == 0) {
                        layoutParams.addRule(2, this.A0V.getId());
                    } else {
                        layoutParams.addRule(2, this.A0K.getId());
                    }
                    layoutParams.addRule(5, this.A0W.getId());
                } else {
                    layoutParams.removeRule(2);
                    layoutParams.removeRule(5);
                    if (A00[4].charAt(11) != 'e') {
                        layoutParams.addRule(3, this.A0W.getId());
                    } else {
                        A00[4] = "R3yRGwLLrpZeNDGI2NMpzxnpAOR0imjx";
                        layoutParams.addRule(3, this.A0W.getId());
                    }
                }
                layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, 0);
                textView.setLayoutParams(layoutParams);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK, com.instagram.common.viewpoint.core.AbstractC4156bF
            public final void A0l(int i2) {
                super.A0l(i2);
                AbstractC3966YB.A0d(this.A0N, ((AbstractC4156bF) this).A09, this.A0Q, this.A0W, ((AbstractC3181LK) this).A04, this.A0P, this.A0K, this.A0V, ((AbstractC3181LK) this).A06, ((AbstractC3181LK) this).A05, this.A0J);
                A00();
                A07(i2);
                A0B(((AbstractC3181LK) this).A04, i2);
                A08(i2);
                A04(i2);
                A03(i2);
                A09(i2);
                A06(i2);
                A02(i2);
                A05(i2);
                A0A(((AbstractC3181LK) this).A06, i2);
                A0A(((AbstractC3181LK) this).A05, i2);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0u(int i2) {
                if (this.A0b) {
                    A0v(6000L);
                    this.A0Z.set(true);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0y(ViewGroup viewGroup, RelativeLayout relativeLayout, int i2) {
                if (i2 == 1) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC4156bF) this).A09.getLayoutParams();
                    layoutParams.addRule(3, relativeLayout.getId());
                    ((AbstractC4156bF) this).A09.setLayoutParams(layoutParams);
                    viewGroup.addView(((AbstractC4156bF) this).A09);
                    viewGroup.addView(this.A0Q);
                    viewGroup.addView(this.A0P);
                }
                A01(i2);
                if (this.A0Z.get()) {
                    A0v(600L);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6U] */
    private C22836U A01() {
        return new AbstractC3181LK(this.A04, this.A09, this.A01, this.A0D, this.A03, this.A0C, this.A05, this.A08, this.A0B, this.A07, this.A02, this.A0A, this.A06, this.A0E) { // from class: com.facebook.ads.redexgen.X.6U
            public static String[] A01 = {"jx4KYlgMCzDl9ClzKv", "6Ix4GmMTfvyGvtJf24kawibkIRWRaxha", "zW69YqA5HPweJk44OR41r89kehyD8PUK", "YWeaBtgKCGSZjZhmH64nz1hbm3NBx6WA", "r8zWPPccQcaX84RMJyONYLJrFGke7QKT", "leMtqeNEOkXnn1xJcE4uVuewwh76dLco", "HficAYafh9u7bjEKghLSIT4OmCXpUy86", "1EAnVhI1sEBIq9Q3DhiB3BUE0Cu5Wqiv"};
            public final Runnable A00 = new RunnableC4163bM(this);

            {
                int i2 = getResources().getConfiguration().orientation;
                A08(i2);
                A0E(i2);
                A04();
                A09(i2);
                A0D(i2);
                A0F(i2);
                A0C(i2);
                A03();
                A02();
                A05();
                A0H(((AbstractC3181LK) this).A04);
                A0A(i2);
                A0B(i2);
                A0G(((AbstractC3181LK) this).A06, i2);
                A0G(((AbstractC3181LK) this).A05, i2);
                A06(i2);
                this.A0O.addView(this.A0M);
                addView(this.A0O);
            }

            private void A00() {
                AbstractC3966YB.A0d(((AbstractC4156bF) this).A09, this.A0Q, ((AbstractC4156bF) this).A08, this.A0W, ((AbstractC3181LK) this).A04, this.A0P, this.A0K, this.A0V, ((AbstractC3181LK) this).A06, ((AbstractC3181LK) this).A05, this.A0J, this.A0N);
            }

            private void A01() {
                A0w(this.A0M, -1291845632, new float[]{72.0f, 72.0f, 72.0f, 72.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }

            private void A02() {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC3181LK.A0g);
                layoutParams.addRule(3, this.A0J.getId());
                if (this.A0J.getVisibility() == 0) {
                    layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, 0);
                } else {
                    if (this.A0R.A1W()) {
                        layoutParams.height = AbstractC3181LK.A0e;
                    }
                    int i2 = AbstractC3924XV.A0b;
                    String[] strArr = A01;
                    if (strArr[7].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[0] = "bbzU6";
                    layoutParams.setMargins(0, i2, 0, 0);
                }
                layoutParams.addRule(14);
                ((AbstractC4156bF) this).A08.setLayoutParams(layoutParams);
                A0p();
            }

            private void A03() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0J.getLayoutParams();
                layoutParams.addRule(3, this.A0P.getId());
                if (this.A0J.getVisibility() == 0) {
                    layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                this.A0J.setLayoutParams(layoutParams);
            }

            private void A04() {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.37f);
                layoutParams.addRule(13);
                this.A0N.setLayoutParams(layoutParams);
            }

            private void A05() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0W.getLayoutParams();
                layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                layoutParams.addRule(3, ((AbstractC4156bF) this).A08.getId());
                this.A0W.setLayoutParams(layoutParams);
            }

            private void A06(int i2) {
                A00();
                if (i2 == 1) {
                    this.A0M.addView(((AbstractC4156bF) this).A09);
                    this.A0M.addView(this.A0Q);
                    this.A0M.addView(this.A0P);
                    this.A0M.addView(this.A0J);
                    this.A0M.addView(((AbstractC4156bF) this).A08);
                    this.A0M.addView(this.A0W);
                    A10(this.A0M);
                    this.A0M.addView(this.A0K);
                    this.A0M.addView(this.A0V);
                    A0x(this.A0M, ((AbstractC3181LK) this).A06);
                    A0x(this.A0M, ((AbstractC3181LK) this).A05);
                    return;
                }
                this.A0N.addView(((AbstractC4156bF) this).A09);
                this.A0N.addView(this.A0Q);
                this.A0N.addView(this.A0P);
                this.A0N.addView(((AbstractC4156bF) this).A08);
                this.A0N.addView(this.A0W);
                A10(this.A0N);
                this.A0N.addView(this.A0J);
                this.A0O.addView(this.A0V);
                this.A0O.addView(this.A0N);
                this.A0O.addView(this.A0K);
                A0x(this.A0O, ((AbstractC3181LK) this).A06);
                A0x(this.A0O, ((AbstractC3181LK) this).A05);
            }

            private void A07(int i2) {
                if (i2 == 2) {
                    this.A0G.removeCallbacks(this.A00);
                    this.A0M.setLayoutTransition(null);
                }
            }

            private void A08(int i2) {
                if (i2 == 1) {
                    ((AbstractC3181LK) this).A07 = new C2677DA(this.A0M, 400, 100, 0);
                    this.A0Y.set(false);
                }
            }

            private void A09(int i2) {
                RelativeLayout.LayoutParams layoutParams;
                if (i2 == 1) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    this.A0M.setGravity(80);
                    layoutParams.setMargins(AbstractC3924XV.A0b, 0, AbstractC3924XV.A0b, 0);
                    this.A0M.setPadding(AbstractC3924XV.A0e, 0, AbstractC3924XV.A0e, 0);
                    A01();
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    this.A0M.setGravity(1);
                    A0w(this.A0M, 0, null);
                }
                this.A0M.setLayoutParams(layoutParams);
            }

            private void A0A(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.removeRule(12);
                    layoutParams.removeRule(11);
                    layoutParams.setMargins(0, AbstractC3924XV.A0c, 0, 0);
                    layoutParams.addRule(11);
                    layoutParams.addRule(3, this.A0W.getId());
                } else {
                    layoutParams.setMargins(0, 0, AbstractC3924XV.A0k, 0);
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.A0K.setLayoutParams(layoutParams);
                this.A0K.setPadding(AbstractC3924XV.A0v, AbstractC3924XV.A0v, 0, 0);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0087  */
            private void A0B(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (i2 == 1) {
                    layoutParams.removeRule(12);
                    layoutParams.addRule(11);
                    if ((((AbstractC3181LK) this).A06 != null || ((AbstractC3181LK) this).A05 != null) && ((AbstractC3181LK) this).A04 != null) {
                        boolean zA11 = A11();
                        if (A01[6].charAt(17) == 'p') {
                            throw new RuntimeException();
                        }
                        A01[5] = "9VTq8PIH50Su9E5lRE3QuJlucOvI2NLH";
                        if (zA11) {
                            layoutParams.addRule(3, ((AbstractC3181LK) this).A04.getId());
                        } else {
                            layoutParams.addRule(3, this.A0W.getId());
                        }
                    } else {
                        layoutParams.addRule(3, this.A0W.getId());
                    }
                    C4102aN c4102aN = ((AbstractC3181LK) this).A06;
                    if (A01[6].charAt(17) == 'p') {
                        throw new RuntimeException();
                    }
                    A01[6] = "d6TWNWWQx1AhMjb62w90jJqiVsiNGx5J";
                    if (c4102aN != null) {
                        if (((AbstractC3181LK) this).A04 != null && A11()) {
                            layoutParams.setMargins(0, AbstractC3924XV.A0Z, 0, AbstractC3924XV.A0b);
                        } else {
                            layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, AbstractC3924XV.A0b);
                        }
                    } else {
                        layoutParams.setMargins(0, AbstractC3924XV.A0f, 0, AbstractC3924XV.A0b);
                    }
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.setMargins(0, 0, AbstractC3924XV.A0b, AbstractC3924XV.A0b);
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.A0V.setLayoutParams(layoutParams);
            }

            private void A0C(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
                layoutParams.addRule(14);
                layoutParams.addRule(3, this.A0Q.getId());
                layoutParams.setMargins(AbstractC3924XV.A0v, AbstractC3924XV.A0v, AbstractC3924XV.A0v, 0);
                this.A0P.setLayoutParams(layoutParams);
                if (i2 == 1) {
                    this.A0P.setTextSize(18.0f);
                    if (A01[6].charAt(17) == 'p') {
                        throw new RuntimeException();
                    }
                    A01[2] = "LwMNVJXewPVvHtT8EyPDkqGjMUrnRCOE";
                    if (this.A0Y.get()) {
                        this.A0P.setVisibility(8);
                        this.A0P.setMaxLines(2);
                        return;
                    }
                    return;
                }
                if (!this.A0R.A1W()) {
                    this.A0P.setMaxLines(2);
                    this.A0P.setTextSize(18.0f);
                } else {
                    this.A0P.setMaxLines(1);
                    this.A0P.setTextSize(15.0f);
                }
                this.A0P.setVisibility(0);
            }

            private void A0D(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC4156bF) this).A09.getLayoutParams();
                if (i2 == 1) {
                    if (this.A0Y.get()) {
                        ((AbstractC4156bF) this).A09.setVisibility(8);
                    }
                    layoutParams.width = AbstractC3181LK.A0l;
                    layoutParams.height = AbstractC3181LK.A0l;
                    layoutParams.setMargins(0, (-AbstractC3181LK.A0l) / 2, 0, 0);
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(14);
                    int i3 = this.A0R.A1W() ? AbstractC3181LK.A0f : AbstractC3181LK.A0m;
                    layoutParams.width = i3;
                    layoutParams.height = i3;
                    layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                    ((AbstractC4156bF) this).A09.setVisibility(0);
                }
                layoutParams.addRule(14);
                ((AbstractC4156bF) this).A09.setLayoutParams(layoutParams);
            }

            private void A0E(int i2) {
                if (i2 == 1) {
                    this.A0O.setClipChildren(false);
                    this.A0O.setClipToPadding(false);
                    String[] strArr = A01;
                    if (strArr[1].charAt(21) == strArr[3].charAt(21)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "cGbvdTJNONPNbXLhpEbXT6xJPDu44esN";
                    this.A0O.setGravity(80);
                    return;
                }
                this.A0O.setGravity(8388659);
            }

            private void A0F(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
                layoutParams.addRule(14);
                layoutParams.addRule(3, ((AbstractC4156bF) this).A09.getId());
                layoutParams.setMargins(0, AbstractC3924XV.A0c, 0, 0);
                this.A0Q.setTypeface(Typeface.DEFAULT_BOLD);
                if (this.A0R.A1W() && i2 == 2) {
                    this.A0Q.setMaxLines(1);
                    this.A0Q.setTextSize(24.0f);
                } else {
                    this.A0Q.setMaxLines(2);
                    this.A0Q.setTextSize(30.0f);
                }
                this.A0Q.setLayoutParams(layoutParams);
                if (i2 == 1) {
                    if (this.A0Y.get()) {
                        this.A0Q.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.A0Q.setVisibility(0);
            }

            private void A0G(View view, int i2) {
                if (view != null) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (i2 == 1) {
                        if (((AbstractC3181LK) this).A04 != null && A11()) {
                            layoutParams.addRule(3, ((AbstractC3181LK) this).A04.getId());
                            layoutParams.setMargins(0, AbstractC3924XV.A0Z, 0, AbstractC3924XV.A0b);
                        } else {
                            layoutParams.addRule(3, this.A0W.getId());
                            layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, AbstractC3924XV.A0b);
                        }
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.setMargins(AbstractC3924XV.A0b, 0, 0, AbstractC3924XV.A0b);
                    }
                    layoutParams.addRule(9);
                    view.setLayoutParams(layoutParams);
                }
            }

            private void A0H(TextView textView) {
                if (textView != null) {
                    int visibility = textView.getVisibility();
                    if (A01[6].charAt(17) == 'p') {
                        throw new RuntimeException();
                    }
                    A01[6] = "mNXbhcpsRbbwGhDffCZ213OdU3Broeit";
                    if (visibility != 0) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.addRule(3, this.A0W.getId());
                    layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, 0);
                    textView.setLayoutParams(layoutParams);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK, com.instagram.common.viewpoint.core.AbstractC4156bF
            public final void A0l(int i2) {
                super.A0l(i2);
                A07(i2);
                A00();
                A0E(i2);
                A09(i2);
                A04();
                A0D(i2);
                A0H(((AbstractC3181LK) this).A04);
                A05();
                A03();
                A02();
                A0F(i2);
                A0C(i2);
                A0A(i2);
                A0B(i2);
                A0G(((AbstractC3181LK) this).A06, i2);
                A0G(((AbstractC3181LK) this).A05, i2);
                A06(i2);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0u(int i2) {
                if (this.A0b && !this.A0Z.get()) {
                    A0v(6000L);
                    this.A0Z.set(true);
                }
                if (((AbstractC3181LK) this).A07 == null || i2 == 2) {
                    return;
                }
                ((AbstractC3181LK) this).A07.A4A(true, false);
                this.A0Y.set(true);
                this.A0G.postDelayed(this.A00, 5000L);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0y(ViewGroup viewGroup, RelativeLayout relativeLayout, int i2) {
                if (this.A0Z.get()) {
                    A0v(600L);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
            public void setInfo(C3318NY c3318ny, C3322Nc c3322Nc, String str, String str2, InterfaceC3936Xh interfaceC3936Xh, InterfaceC4171bU interfaceC4171bU) {
                super.setInfo(c3318ny, c3322Nc, str, str2, interfaceC3936Xh, interfaceC4171bU);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6T] */
    private C22826T A02() {
        return new AbstractC3181LK(this.A04, this.A09, this.A01, this.A0D, this.A03, this.A0C, this.A05, this.A08, this.A0B, this.A07, this.A02, this.A0A, this.A06, this.A0E) { // from class: com.facebook.ads.redexgen.X.6T
            public static String[] A00 = {"xFpGP6HPJdxG02oIdF9HxIihRC1N68eF", "SON7b0vH7pU6goQPwxtgPgRIrt0b", "K8DFrhhg1SsjCm4z8vXCiiOaNBIf4pDg", "gTEb8e", "wHRSkCegs17WrS1ZFDoTECKCsF5cwC3Q", "MW7m9Sx4Y", "aUUm4uG1aRzEZg1qhLXNvnDll0TBP1yk", "rrQmUhcDQBY8PjMlrfgiyZrhPVfY"};
            public static final int A02 = (int) (AbstractC3926XX.A02 * 152.0f);
            public static final int A01 = (int) (AbstractC3926XX.A02 * 60.0f);

            {
                int i2 = getResources().getConfiguration().orientation;
                A03(i2);
                A04(i2);
                A0A(i2);
                A01();
                A07(i2);
                A06(i2);
                A0D(i2);
                A08(i2);
                A0E(((AbstractC3181LK) this).A06, i2);
                A0E(((AbstractC3181LK) this).A05, i2);
                A0C(i2);
                AbstractC3966YB.A0K(this.A0P);
                if (i2 == 1) {
                    A09(i2);
                }
                A0B(i2);
                A02(i2);
                A05(i2);
                this.A0O.addView(this.A0M);
                addView(this.A0O);
            }

            private void A00() {
                AbstractC3966YB.A0d(((AbstractC4156bF) this).A09, this.A0Q, ((AbstractC4156bF) this).A08, this.A0W, ((AbstractC3181LK) this).A04, this.A0P, this.A0J, this.A0K, this.A0V, ((AbstractC3181LK) this).A06, ((AbstractC3181LK) this).A05, this.A0L, this.A0N);
            }

            private void A01() {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                this.A0L.setLayoutParams(layoutParams);
                this.A0L.setGravity(1);
                this.A0L.setOrientation(1);
            }

            private void A02(int i2) {
                A00();
                if (i2 == 1) {
                    if (((AbstractC3181LK) this).A04 != null && ((AbstractC3181LK) this).A04.getVisibility() == 0) {
                        this.A0O.addView(((AbstractC3181LK) this).A04);
                    }
                    this.A0O.addView(this.A0W);
                    this.A0O.addView(this.A0V);
                    this.A0O.addView(((AbstractC4156bF) this).A08);
                    this.A0O.addView(this.A0J);
                    A0x(this.A0O, ((AbstractC3181LK) this).A06);
                    A0x(this.A0O, ((AbstractC3181LK) this).A05);
                } else {
                    this.A0L.addView(this.A0J);
                    this.A0L.addView(((AbstractC4156bF) this).A08);
                    this.A0N.addView(this.A0L);
                    this.A0N.addView(((AbstractC4156bF) this).A09);
                    this.A0N.addView(this.A0Q);
                    this.A0M.addView(this.A0V);
                    this.A0M.addView(this.A0N);
                    this.A0M.addView(this.A0W);
                    if (((AbstractC3181LK) this).A04 != null && ((AbstractC3181LK) this).A04.getVisibility() == 0) {
                        this.A0M.addView(((AbstractC3181LK) this).A04);
                    }
                    A0x(this.A0M, ((AbstractC3181LK) this).A05);
                    A0x(this.A0M, ((AbstractC3181LK) this).A06);
                }
                this.A0O.addView(this.A0K);
            }

            private void A03(int i2) {
                if (i2 == 2) {
                    ((AbstractC3181LK) this).A07 = new C2677DA(this.A0M, 400, 100, 0);
                    this.A0Y.set(false);
                }
            }

            private void A04(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0M.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0b);
                if (i2 == 1) {
                    this.A0M.setVisibility(8);
                } else {
                    int i3 = getResources().getDisplayMetrics().widthPixels;
                    if (A00[5].length() != 9) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A00;
                    strArr[6] = "fxD9Evjxj1QSbkd6sjXNqMWP1zvaSe0y";
                    strArr[2] = "LbyTcx7MzeGvJAIRAeX8dxGClI61VeIC";
                    layoutParams.width = (int) (i3 * 0.4f);
                    layoutParams.height = -2;
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    this.A0M.setPadding(AbstractC3924XV.A0b, AbstractC3924XV.A0b, AbstractC3924XV.A0b, AbstractC3924XV.A0b);
                    A0w(this.A0M, -1728053248, new float[]{32.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 32.0f, 32.0f});
                    this.A0M.setVisibility(0);
                }
                this.A0M.setLayoutParams(layoutParams);
            }

            private void A05(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.removeRule(20);
                    layoutParams.addRule(21);
                    layoutParams.setMargins(0, 0, AbstractC3924XV.A0k, 0);
                    this.A0K.setPadding(AbstractC3924XV.A0v, AbstractC3924XV.A0v, 0, 0);
                } else {
                    layoutParams.removeRule(21);
                    layoutParams.addRule(20);
                    if (A00[3].length() == 25) {
                        throw new RuntimeException();
                    }
                    A00[3] = "loHD1sEgjyAFCmeIlD5ALXOeqArjH8d";
                    layoutParams.setMargins(AbstractC3924XV.A0k, 0, 0, 0);
                }
                layoutParams.addRule(12);
                this.A0K.setPadding(0, AbstractC3924XV.A0v, AbstractC3924XV.A0v, 0);
                this.A0K.setLayoutParams(layoutParams);
            }

            private void A06(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC3181LK.A0g);
                if (i2 == 1) {
                    layoutParams.removeRule(15);
                    ((AbstractC3181LK) this).A02 = 30;
                    layoutParams.addRule(14);
                    layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0b);
                    layoutParams.addRule(2, this.A0W.getId());
                    ((AbstractC4156bF) this).A08.setMinWidth(-1);
                } else {
                    layoutParams.removeRule(2);
                    ((AbstractC3181LK) this).A02 = 16;
                    layoutParams.width = -2;
                    layoutParams.height = AbstractC3181LK.A0n;
                    if (this.A0J.getVisibility() != 0) {
                        layoutParams.addRule(15);
                    }
                    layoutParams.setMargins(0, 0, 0, 0);
                    ((AbstractC4156bF) this).A08.setMinWidth((int) (getResources().getDisplayMetrics().widthPixels * 0.12f));
                }
                layoutParams.addRule(14);
                ((AbstractC4156bF) this).A08.setLayoutParams(layoutParams);
                ((AbstractC4156bF) this).A08.setPadding(AbstractC3924XV.A0o, 0, AbstractC3924XV.A0o, 0);
                A0p();
            }

            private void A07(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3181LK.A0h, AbstractC3181LK.A0h);
                if (i2 == 1) {
                    layoutParams.addRule(2, ((AbstractC4156bF) this).A08.getId());
                    layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0v);
                    layoutParams.addRule(14);
                } else {
                    layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0o);
                    layoutParams.removeRule(14);
                    layoutParams.removeRule(2);
                }
                this.A0J.setLayoutParams(layoutParams);
            }

            private void A08(int i2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.removeRule(12);
                layoutParams.removeRule(3);
                if (i2 != 1) {
                    layoutParams.addRule(3, this.A0W.getId());
                    if (A00[0].charAt(3) == '4') {
                        throw new RuntimeException();
                    }
                    A00[5] = "oGoH0QuGh";
                    layoutParams.addRule(11);
                    if ((((AbstractC3181LK) this).A06 != null || ((AbstractC3181LK) this).A05 != null) && A11()) {
                        layoutParams.setMargins(0, AbstractC3924XV.A0k, 0, 0);
                    } else {
                        layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                    }
                } else {
                    layoutParams.addRule(12);
                    if (this.A0W.getVisibility() == 0) {
                        layoutParams.addRule(7, this.A0W.getId());
                    } else {
                        layoutParams.addRule(7, ((AbstractC4156bF) this).A08.getId());
                    }
                    layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0b);
                }
                this.A0V.setLayoutParams(layoutParams);
            }

            private void A09(int i2) {
                if (i2 == 1) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
                    layoutParams.addRule(14);
                    layoutParams.addRule(3, this.A0Q.getId());
                    layoutParams.setMargins(AbstractC3924XV.A0p, 0, AbstractC3924XV.A0p, AbstractC3924XV.A0v);
                    this.A0P.setTypeface(Typeface.DEFAULT);
                    this.A0P.setTextSize(18.0f);
                    this.A0P.setLayoutParams(layoutParams);
                    this.A0P.setMaxLines(2);
                }
            }

            private void A0A(int i2) {
                int topMargin;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC4156bF) this).A09.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.width = A02;
                    layoutParams.height = A02;
                    layoutParams.setMargins(0, (-A02) / 4, 0, 0);
                    layoutParams.addRule(14);
                    topMargin = 30;
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(14);
                    layoutParams.width = A01;
                    layoutParams.height = A01;
                    layoutParams.setMargins(0, 0, AbstractC3924XV.A0v, 0);
                    topMargin = 12;
                }
                if (!this.A0a) {
                    ((AbstractC4156bF) this).A09.setRadius(topMargin);
                }
                ((AbstractC4156bF) this).A09.setLayoutParams(layoutParams);
            }

            private void A0B(int i2) {
                if (((AbstractC3181LK) this).A04 == null || ((AbstractC3181LK) this).A04.getVisibility() != 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC3181LK) this).A04.getLayoutParams();
                layoutParams.removeRule(5);
                layoutParams.removeRule(3);
                layoutParams.removeRule(2);
                if (i2 != 1) {
                    layoutParams.addRule(3, this.A0W.getId());
                    layoutParams.setMargins(0, AbstractC3924XV.A0o, 0, 0);
                } else {
                    if (((AbstractC3181LK) this).A06 != null) {
                        layoutParams.addRule(2, ((AbstractC3181LK) this).A06.getId());
                        layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, AbstractC3924XV.A0Z);
                    } else if (((AbstractC3181LK) this).A05 != null) {
                        C4098aJ c4098aJ = ((AbstractC3181LK) this).A05;
                        if (A00[5].length() != 9) {
                            throw new RuntimeException();
                        }
                        A00[3] = "4tbuGoue1V8fWdz46zhhiARc";
                        layoutParams.addRule(2, c4098aJ.getId());
                        layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, AbstractC3924XV.A0b);
                    } else {
                        if (this.A0V.getVisibility() == 0) {
                            layoutParams.addRule(2, this.A0V.getId());
                        } else {
                            layoutParams.addRule(2, this.A0K.getId());
                        }
                        layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, 0);
                    }
                    layoutParams.addRule(5, this.A0W.getId());
                }
                ((AbstractC3181LK) this).A04.setLayoutParams(layoutParams);
            }

            private void A0C(int i2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0W.getLayoutParams();
                layoutParams.removeRule(2);
                layoutParams.removeRule(3);
                if (i2 == 1) {
                    if (this.A0V.getVisibility() == 0) {
                        layoutParams.addRule(2, this.A0V.getId());
                    } else {
                        layoutParams.addRule(2, this.A0K.getId());
                    }
                    if ((((AbstractC3181LK) this).A06 != null || ((AbstractC3181LK) this).A05 != null) && A11()) {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0k);
                    } else if (((AbstractC3181LK) this).A06 != null) {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0Z);
                    } else {
                        layoutParams.setMargins(AbstractC3924XV.A0k, 0, AbstractC3924XV.A0k, AbstractC3924XV.A0f);
                    }
                } else {
                    layoutParams.setMargins(0, AbstractC3924XV.A0v, 0, 0);
                    layoutParams.addRule(3, this.A0N.getId());
                }
                this.A0W.setLayoutParams(layoutParams);
            }

            private void A0D(int i2) {
                int i3;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
                if (i2 == 1) {
                    layoutParams.removeRule(1);
                    layoutParams.removeRule(15);
                    layoutParams.removeRule(0);
                    i3 = 4;
                    layoutParams.addRule(14);
                    layoutParams.addRule(3, ((AbstractC4156bF) this).A09.getId());
                    int i4 = AbstractC3924XV.A0k;
                    int i5 = AbstractC3924XV.A0b;
                    int textAlignment = AbstractC3924XV.A0k;
                    layoutParams.setMargins(i4, i5, textAlignment, AbstractC3924XV.A0v);
                    this.A0Q.setTypeface(Typeface.DEFAULT_BOLD);
                    this.A0Q.setTextSize(30.0f);
                    this.A0Q.setMaxLines(2);
                } else {
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(14);
                    i3 = 5;
                    layoutParams.addRule(15);
                    layoutParams.addRule(1, ((AbstractC4156bF) this).A09.getId());
                    layoutParams.addRule(0, this.A0L.getId());
                    layoutParams.setMargins(0, 0, AbstractC3924XV.A0v, 0);
                    this.A0Q.setTypeface(Typeface.DEFAULT);
                    this.A0Q.setTextSize(20.0f);
                    this.A0Q.setMaxLines(1);
                }
                this.A0Q.setTextAlignment(i3);
                this.A0Q.setLayoutParams(layoutParams);
                this.A0Q.setEllipsize(TextUtils.TruncateAt.END);
            }

            private void A0E(View view, int i2) {
                if (view != null) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (i2 == 1) {
                        if (this.A0W.getVisibility() == 0) {
                            layoutParams.addRule(5, this.A0W.getId());
                        } else {
                            layoutParams.addRule(5, ((AbstractC4156bF) this).A08.getId());
                        }
                        layoutParams.addRule(12);
                        layoutParams.setMargins(0, 0, 0, AbstractC3924XV.A0b);
                    } else {
                        layoutParams.addRule(3, this.A0W.getId());
                        layoutParams.addRule(9);
                        boolean zA11 = A11();
                        if (A00[4].charAt(12) != 'r') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A00;
                        strArr[6] = "3HhgBwxbQho2sMg1wvX4XpAgboCjPBz9";
                        strArr[2] = "J5Bqq1rF94wnFI0B1PXvrlfndQ3xbAEE";
                        if (zA11) {
                            layoutParams.setMargins(0, AbstractC3924XV.A0k, 0, 0);
                        } else {
                            layoutParams.setMargins(0, AbstractC3924XV.A0b, 0, 0);
                        }
                    }
                    view.setLayoutParams(layoutParams);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK, com.instagram.common.viewpoint.core.AbstractC4156bF
            public final void A0l(int i2) {
                super.A0l(i2);
                A00();
                A04(i2);
                A05(i2);
                A08(i2);
                A0B(i2);
                A0C(i2);
                A01();
                A07(i2);
                A06(i2);
                A0A(i2);
                A0D(i2);
                A09(i2);
                A0E(((AbstractC3181LK) this).A06, i2);
                A0E(((AbstractC3181LK) this).A05, i2);
                A02(i2);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0u(int i2) {
                if (this.A0b) {
                    A0v(6000L);
                    this.A0Z.set(true);
                }
                if (((AbstractC3181LK) this).A07 != null && i2 == 2) {
                    ((AbstractC3181LK) this).A07.A4A(true, false);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3181LK
            public final void A0y(ViewGroup viewGroup, RelativeLayout relativeLayout, int i2) {
                if (i2 == 1) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC4156bF) this).A09.getLayoutParams();
                    layoutParams.addRule(3, relativeLayout.getId());
                    ((AbstractC4156bF) this).A09.setLayoutParams(layoutParams);
                    viewGroup.addView(((AbstractC4156bF) this).A09);
                    viewGroup.addView(this.A0Q);
                    viewGroup.addView(this.A0P);
                }
                if (this.A0Z.get()) {
                    A0v(600L);
                }
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
            public void setInfo(C3318NY c3318ny, C3322Nc c3322Nc, String str, String str2, InterfaceC3936Xh interfaceC3936Xh, InterfaceC4171bU interfaceC4171bU) {
                super.setInfo(c3318ny, c3322Nc, str, str2, interfaceC3936Xh, interfaceC4171bU);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
            public void setTitleMaxLines(int i2) {
                this.A0Q.setMaxLines(i2);
                this.A0Q.setEllipsize(TextUtils.TruncateAt.END);
            }
        };
    }

    public final AbstractC3181LK A03() {
        if (AbstractC3914XL.A03(this.A00)) {
            return A01();
        }
        if (AbstractC3914XL.A05(this.A00)) {
            return A02();
        }
        return A00();
    }
}
