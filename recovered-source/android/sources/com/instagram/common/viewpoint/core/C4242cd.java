package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4242cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC3152Kr A02;
    public static final int A05 = (int) (AbstractC3926XX.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC3926XX.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC3926XX.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC3926XX.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC3926XX.A02 * 4.0f);

    public C4242cd(C4494gi c4494gi, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, AbstractC4669jd abstractC4669jd, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, C4439fp c4439fp, C3957Y2 c3957y2, C3320Na c3320Na, InterfaceC4171bU interfaceC4171bU) {
        super(c4494gi);
        this.A00 = c3320Na.A09(true);
        this.A01 = new RelativeLayout(c4494gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c4494gi, abstractC4669jd.A29().A0J().A04());
        if (viewOnClickListenerC3152Kr == null) {
            this.A02 = new ViewOnClickListenerC3152Kr(c4494gi, abstractC4669jd.A0w(), (C3320Na) null, interfaceC3784VA, interfaceC3998Yh, c4439fp, c3957y2, abstractC4669jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC3152Kr;
        }
        A03();
        this.A02.setCta(abstractC4669jd.A29().A0J(), abstractC4669jd.A2E(), new HashMap(), interfaceC4171bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C4494gi c4494gi, View view) {
        ImageView imageView = new ImageView(c4494gi);
        imageView.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C4494gi c4494gi, String str) {
        Button button = new Button(c4494gi);
        AbstractC3966YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC3966YB.A0Q(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c4494gi, button);
    }

    public final EnumC3275Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC4669jd abstractC4669jd, AbstractC3992Yb abstractC3992Yb) {
        this.A02.A0F(abstractC4669jd, abstractC3992Yb);
    }

    public void setCta(C3322Nc c3322Nc, String str, HashMap<String, String> extras, InterfaceC4171bU interfaceC4171bU) {
        this.A02.setCta(c3322Nc, str, extras, interfaceC4171bU);
    }
}
