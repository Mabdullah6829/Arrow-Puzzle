package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3236MD extends AbstractC4056Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C3388Og A04;
    public final C4494gi A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (AbstractC3926XX.A02 * 4.0f);
        A08 = (int) (AbstractC3926XX.A02 * 10.0f);
        A07 = (int) (AbstractC3926XX.A02 * 44.0f);
    }

    public C3236MD(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str) {
        super(c4494gi, interfaceC3784VA, str);
        this.A05 = c4494gi;
        this.A04 = AbstractC3389Oh.A00(c4494gi.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        AbstractC3966YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0O() {
        this.A01.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC4065Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C4060Zh c4060Zh = new C4060Zh(this.A05);
        c4060Zh.setData(this.A04.A0H(), EnumC3977YM.HIDE_AD);
        c4060Zh.setOnClickListener(new ViewOnClickListenerC4066Zn(this, c4060Zh));
        C4060Zh c4060Zh2 = new C4060Zh(this.A05);
        c4060Zh2.setData(this.A04.A0L(), EnumC3977YM.REPORT_AD);
        c4060Zh2.setOnClickListener(new ViewOnClickListenerC4067Zo(this, c4060Zh2));
        C4060Zh c4060Zh3 = new C4060Zh(this.A05);
        c4060Zh3.setData(this.A04.A0M(), EnumC3977YM.AD_CHOICES_ICON);
        c4060Zh3.setOnClickListener(new ViewOnClickListenerC4068Zp(this, c4060Zh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        AbstractC3966YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c4060Zh, layoutParams);
        this.A02.addView(c4060Zh2, layoutParams);
        this.A02.addView(c4060Zh3, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0P() {
        AbstractC3966YB.A0I(this);
        AbstractC3966YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0Q(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC3966YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC3966YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c3392Ok, enumC3390Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0R(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi) {
        AbstractC3966YB.A0W(this.A03);
        this.A01.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC4069Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C3392Ok c3392Ok2 : c3392Ok.A05()) {
            C4060Zh c4060Zh = new C4060Zh(this.A05);
            c4060Zh.setData(c3392Ok2.A04(), null);
            c4060Zh.setOnClickListener(new ViewOnClickListenerC4070Zr(this, c4060Zh, c3392Ok2));
            this.A02.addView(c4060Zh, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final boolean A0S() {
        return true;
    }
}
