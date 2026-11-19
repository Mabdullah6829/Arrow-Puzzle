package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4054Zb extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C3388Og A02;
    public final C4494gi A03;
    public final InterfaceC4058Zf A04;
    public final boolean A05;
    public static final int A09 = (int) (AbstractC3926XX.A02 * 16.0f);
    public static final int A0A = (int) (AbstractC3926XX.A02 * 8.0f);
    public static final int A0D = (int) (AbstractC3926XX.A02 * 44.0f);
    public static final int A08 = (int) (AbstractC3926XX.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (AbstractC3926XX.A02 * 75.0f);
    public static final int A0B = (int) (AbstractC3926XX.A02 * 25.0f);
    public static final int A0F = (int) (AbstractC3926XX.A02 * 45.0f);
    public static final int A0C = (int) (AbstractC3926XX.A02 * 15.0f);
    public static final int A06 = (int) (AbstractC3926XX.A02 * 16.0f);

    public C4054Zb(C4053Za c4053Za) {
        super(c4053Za.A0B);
        this.A03 = c4053Za.A0B;
        this.A02 = AbstractC3389Oh.A00(this.A03.A02());
        this.A04 = c4053Za.A02;
        this.A01 = c4053Za.A0A ? A0E : A0F;
        this.A00 = c4053Za.A0A ? A0B : A0C;
        this.A05 = c4053Za.A07;
        setFocusable(true);
        View viewA01 = A01(c4053Za);
        View viewA00 = A00(c4053Za);
        View footerView = getFooterView();
        AbstractC3966YB.A0K(viewA01);
        AbstractC3966YB.A0K(viewA00);
        AbstractC3966YB.A0K(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, viewA01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(viewA01, contentParams);
        addView(viewA00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(0);
    }

    public /* synthetic */ C4054Zb(C4053Za c4053Za, ViewOnClickListenerC4051ZY viewOnClickListenerC4051ZY) {
        this(c4053Za);
    }

    private View A00(C4053Za c4053Za) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(AbstractC3978YN.A01(c4053Za.A01));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c4053Za.A00);
        AbstractC3966YB.A0V(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        AbstractC3966YB.A0a(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(c4053Za.A06);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        AbstractC3966YB.A0a(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(c4053Za.A05);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (c4053Za.A08) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c4053Za.A04)) {
                C4187bk c4187bk = new C4187bk(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c4187bk.setFullCircleCorners(true);
                new AsyncTaskC3183LM(c4187bk, this.A03).A05(A0F, A0F).A07(c4053Za.A04);
                linearLayout2.addView(c4187bk, iconParams);
            }
            C4060Zh c4060Zh = new C4060Zh(this.A03);
            c4060Zh.setData(c4053Za.A03, EnumC3977YM.CHECKMARK);
            c4060Zh.setSelected(true);
            linearLayout2.addView(c4060Zh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C4053Za c4053Za) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c4053Za.A09) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC4051ZY(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC3978YN.A01(EnumC3977YM.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        AbstractC3966YB.A0a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC4052ZZ(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
