package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4029ZC extends LinearLayout {
    public static final int A03 = (int) (AbstractC3926XX.A02 * 10.0f);
    public static final int A04 = (int) (AbstractC3926XX.A02 * 24.0f);
    public final ImageView A00;
    public final C3388Og A01;
    public final C4494gi A02;

    public C4029ZC(C4494gi c4494gi) {
        super(c4494gi);
        this.A02 = c4494gi;
        this.A01 = AbstractC3389Oh.A00(c4494gi.A02());
        this.A00 = new ImageView(c4494gi);
        A02();
    }

    private void A02() {
        A03(this.A00, EnumC3977YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, EnumC3977YM enumC3977YM) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C3332Nm c3332Nm, String str, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh) {
        setOnClickListener(new ViewOnClickListenerC4028ZB(this, c3792vi, interfaceC3998Yh, str, c3332Nm));
    }

    public void setIconColors(int i2) {
        this.A00.setColorFilter(i2);
    }
}
