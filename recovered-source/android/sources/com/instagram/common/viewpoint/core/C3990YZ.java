package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3990YZ extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C3388Og A02;
    public final C4494gi A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_polarRelativeTo);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (AbstractC3926XX.A02 * 50.0f);
        A05 = (int) (AbstractC3926XX.A02 * 10.0f);
        A06 = (int) (AbstractC3926XX.A02 * 20.0f);
        A09 = (int) (AbstractC3926XX.A02 * 4.0f);
        A07 = (int) (AbstractC3926XX.A02 * 12.0f);
    }

    public C3990YZ(C4494gi c4494gi, int i2) {
        super(c4494gi);
        this.A03 = c4494gi;
        this.A02 = AbstractC3389Oh.A00(c4494gi.A02());
        setOrientation(0);
        this.A00 = new ImageView(c4494gi);
        this.A01 = new ImageView(c4494gi);
        A04(i2);
    }

    private void A04(int i2) {
        EnumC3977YM enumC3977YM;
        A05(this.A00, EnumC3977YM.AD_CHOICES_ICON);
        if (i2 == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            AbstractC3966YB.A0a(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i2 == 1) {
            enumC3977YM = EnumC3977YM.AN_INFO_ICON;
        } else {
            enumC3977YM = EnumC3977YM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC3977YM);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, EnumC3977YM enumC3977YM) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C3332Nm c3332Nm, String str, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh) {
        setOnClickListener(new ViewOnClickListenerC3989YY(this, c3792vi, interfaceC3998Yh, str, c3332Nm));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i2);
        AbstractC3966YB.A0V(this, gradientDrawable);
    }

    public void setIconColors(int i2) {
        this.A00.setColorFilter(i2);
        this.A01.setColorFilter(i2);
    }
}
