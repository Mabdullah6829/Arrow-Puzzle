package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1137R;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ka */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3135Ka extends AbstractC4206c3 implements InterfaceC3919XQ {
    public static byte[] A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public C2715Dm A00;
    public C2694DR A01;
    public C2677DA A02;
    public final Handler A03;
    public final AbstractC4669jd A04;
    public final C3311NR A05;
    public final InterfaceC3998Yh A06;
    public final AbstractC4156bF A07;
    public final C3921XS A08;
    public final AtomicBoolean A09;

    public static String A0L(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0A = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, 63, 58, 60, 62, 59, 72, 72, 68, 7, 58, 61, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, 61, 64, 76, 74, 11, 67, 62, 64, 66, 63, 76, 76, 72, 11, 62, 65, 80, 11, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, 11, 67, 70, 75, 70, 80, 69, 60, 62, 64, 81, 70, 83, 70, 81, 86, 23, 10, 28, 6, 23, 9, 10, 9, 4, 27, 14, 9, 10, 20};
    }

    public abstract AbstractC4156bF A1R(C4210c7 c4210c7, C3311NR c3311nr, String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1U() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A1E());
        textView.setTextColor(-1);
        AbstractC3966YB.A0a(textView, true, 24);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC3924XV.A0q, 0, AbstractC3924XV.A0q, AbstractC3924XV.A0b);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C4187bk c4187bk = new C4187bk(super.A07.A06());
        c4187bk.setRadius(15);
        AbstractC3966YB.A0N(c4187bk, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0E, A0E);
        layoutParams3.gravity = 17;
        c4187bk.setLayoutParams(layoutParams3);
        new AsyncTaskC3183LM(c4187bk, super.A07.A06()).A05(A0E, A0E).A07(super.A07.A05().A2C().A01());
        TextView textView2 = new TextView(super.A07.A06());
        textView2.setText(String.format(Locale.US, super.A07.A05().A1F(), super.A07.A05().A29().A0I().A0G()));
        textView2.setTextColor(-1);
        AbstractC3966YB.A0a(textView2, false, 17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC3924XV.A0f, AbstractC3924XV.A0b, AbstractC3924XV.A0f, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c4187bk);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0J());
        if (this.A04.A2M() && this.A04.A2R()) {
            addView(A00(super.A07.A06(), super.A07.A05(), super.A07.A08(), EnumC4101aM.A07, super.A07.A0C()));
        }
        if (this.A04.A2W()) {
            addView(A01(super.A07.A06(), EnumC4101aM.A07));
        }
    }

    static {
        A0M();
        A0H = (int) (AbstractC3926XX.A02 * 48.0f);
        A0G = (int) (AbstractC3926XX.A02 * 80.0f);
        A0E = (int) (AbstractC3926XX.A02 * 120.0f);
        A0F = (int) (AbstractC3926XX.A02 * 128.0f);
        A0L = (int) (AbstractC3926XX.A02 * 16.0f);
        A0B = (int) (AbstractC3926XX.A02 * 4.0f);
        A0K = (int) (AbstractC3926XX.A02 * 44.0f);
        A0I = AbstractC3924XV.A0v;
        A0J = (int) (AbstractC3926XX.A02 * 12.0f);
        A0N = (int) (AbstractC3926XX.A02 * 12.0f);
        A0M = (int) (AbstractC3926XX.A02 * 26.0f);
        A0C = AbstractC3411P3.A02(-1, 77);
        A0D = AbstractC3411P3.A02(A0C, 90);
    }

    public AbstractC3135Ka(C4210c7 c4210c7, boolean z) {
        super(c4210c7, z);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A09 = new AtomicBoolean(false);
        this.A04 = c4210c7.A05();
        this.A08 = C3921XS.A00(c4210c7.A06(), this.A04, this);
        this.A05 = this.A04.A29();
        this.A07 = A0K(c4210c7);
        if (this.A04.A1w()) {
            this.A07.setVisibility(8);
        }
        AbstractC3992Yb abstractC3992YbA0B = c4210c7.A0B();
        this.A06 = c4210c7.A0C();
        if (abstractC3992YbA0B != null) {
            abstractC3992YbA0B.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC3992YbA0B.getToolbarHeight()));
            abstractC3992YbA0B.setPageDetailsVisible(false);
        }
    }

    private ImageView A0J() {
        ImageView imageView = new ImageView(super.A07.A06());
        imageView.setImageBitmap(Bitmap.createScaledBitmap(AbstractC3978YN.A01(EnumC3977YM.NAV_CROSS), AbstractC3924XV.A0e, AbstractC3924XV.A0e, true));
        imageView.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.by
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A1W(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC3924XV.A0r, AbstractC3924XV.A0b, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private AbstractC4156bF A0K(C4210c7 c4210c7) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A04.A1w()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c4210c7.A05().A10().equals(A0L(91, 14, 67))) {
            clickEvent = EnumC4387ez.A04.A03();
        } else {
            clickEvent = A0L(9, 37, C1137R.styleable.ConstraintSet_quantizeMotionSteps);
        }
        AbstractC4156bF abstractC4156bFA1R = A1R(c4210c7, this.A05, clickEvent);
        abstractC4156bFA1R.getCTAButton().getCtaActionHelper().A08(this.A04);
        abstractC4156bFA1R.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        this.A02 = new C2677DA(abstractC4156bFA1R, 400, 100, 0);
        AbstractC3966YB.A0K(abstractC4156bFA1R);
        abstractC4156bFA1R.A0l(c4210c7.A00());
        if (C3763Up.A17(c4210c7.A06())) {
            abstractC4156bFA1R.A0k();
            if (c4210c7.A0B() != null) {
                c4210c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        addView(abstractC4156bFA1R, layoutParams);
        abstractC4156bFA1R.getCTAButton().A0F(this.A04, c4210c7.A0B());
        return abstractC4156bFA1R;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        if (this.A04 != null && this.A04.A29().A0L() != null) {
            AbstractC3911XI.A06(super.A07.A06().A02(), this.A04.A29().A0L());
        }
        this.A08.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public void A1H(C3311NR c3311nr, String str, double d, Bundle bundle) {
        super.A1H(c3311nr, str, d, bundle);
        this.A07.setInfo(c3311nr.A0I(), c3311nr.A0J(), str, this.A04.A2C().A01(), super.A07.A09(), null);
    }

    public final int A1Q(AbstractC3992Yb abstractC3992Yb) {
        return abstractC3992Yb == null ? AbstractC3992Yb.A00 : abstractC3992Yb.getToolbarHeight();
    }

    public void A1S() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C2715Dm(true, false);
            if (this.A01 != null) {
                this.A00.A0L(this.A01);
            }
            C3320Na c3320NaA01 = this.A04.A28().A01();
            this.A00.A0L(new C2678DB(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, c3320NaA01.A0A(true)));
            Drawable startDrawable = AbstractC3966YB.A08(A0C, A0D, A0B);
            this.A00.A0L(new C2695DS(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, startDrawable, AbstractC3966YB.A05(c3320NaA01.A09(true), A0B)));
            this.A00.A0L(new C2693DQ(expandableLayout, 150, false));
            this.A00.A0K(2300);
        }
    }

    public final void A1T() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A15());
        textView.setTextColor(-1);
        AbstractC3966YB.A0a(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0L, A0L, A0L, A0L);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C4181be c4181be = new C4181be(super.A07.A06(), 0, -13524404, EnumC3977YM.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0H, A0H);
        layoutParams3.gravity = 17;
        c4181be.setLayoutParams(layoutParams3);
        linearLayout.addView(c4181be);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1V(int i2, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof AbstractC3181LK) {
            if ((getAdDetailsView() instanceof C22846V) || (getAdDetailsView() instanceof C22836U)) {
                AbstractC3966YB.A0J(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0l(i2);
            ((AbstractC3181LK) getAdDetailsView()).A0y(viewGroup, relativeLayout, i2);
        }
    }

    public final /* synthetic */ void A1W(View view) {
        this.A06.A4j(A0L(46, 45, 123));
    }

    public AbstractC4669jd getAdDataBundle() {
        return this.A04;
    }

    public C2677DA getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC4156bF getAdDetailsView() {
        return this.A07;
    }

    public C3311NR getAdInfo() {
        return this.A05;
    }

    public C2715Dm getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A09.get() && (this.A04.A29().A0K().A02().isEmpty() || this.A04.A29().A0K().A03() || this.A04.A1j())) {
            return;
        }
        getAdDetailsView().A0l(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View expandableLayout;
        super.onLayout(z, i2, i3, i4, i5);
        if (!this.A04.A29().A0K().A03() && !this.A04.A1j() && !this.A04.A1w() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z && this.A01 == null) {
            this.A01 = new C2694DR(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A00.A0L(this.A01);
            this.A00.A0J();
        }
    }
}
