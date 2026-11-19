package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4083a4 extends LinearLayout {
    public final Handler A00;
    public final ImageView A01;
    public final ImageView A02;
    public final C3332Nm A03;
    public final C3388Og A04;
    public final C4494gi A05;
    public final C3792VI A06;
    public final InterfaceC3998Yh A07;
    public final Runnable A08;
    public final String A09;

    public C4083a4(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh) {
        super(c4494gi);
        this.A00 = new Handler(Looper.getMainLooper());
        this.A08 = new RunnableC4081a2(this);
        this.A05 = c4494gi;
        this.A09 = abstractC4669jd.A2E();
        this.A03 = abstractC4669jd.A2C();
        this.A07 = interfaceC3998Yh;
        this.A06 = c3792vi;
        this.A04 = AbstractC3389Oh.A00(c4494gi.A02());
        this.A01 = A01(EnumC3977YM.AD_CHOICE_V2_COLLAPSE, 1104);
        addView(this.A01);
        this.A02 = A01(EnumC3977YM.AD_CHOICE_V2_EXPAND, 1105);
        addView(this.A02);
        A07(8);
        setOnClickListener(new ViewOnClickListenerC4082a3(this));
    }

    private final ImageView A01(EnumC3977YM enumC3977YM, int i2) {
        ImageView imageView = new ImageView(this.A05);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        AbstractC3966YB.A0G(i2, imageView);
        return imageView;
    }

    public final void A04() {
        this.A00.removeCallbacksAndMessages(null);
    }

    public final void A05() {
        this.A00.removeCallbacks(this.A08);
        A07(8);
    }

    public final void A06() {
        if (this.A06 != null) {
            this.A06.A04(EnumC3791VH.A0A, null);
        }
        if (this.A04.A0O(this.A05.A02(), true)) {
            this.A07.AAo(this.A09, this.A03);
        } else {
            if (TextUtils.isEmpty(this.A03.A00())) {
                return;
            }
            C3899X6.A0O(new C3899X6(), this.A05, AbstractC3904XB.A00(this.A03.A00()), this.A09);
        }
    }

    public final void A07(int i2) {
        if (i2 == 0) {
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
        } else {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
        }
    }
}
