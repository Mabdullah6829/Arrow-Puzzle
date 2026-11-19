package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.ServiceStarter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4039ZM extends LinearLayout {
    public static String[] A0A = {"iBjFS74UqofOwX9raECs8wFiPopmP8ZT", "DvkIZsK2SfYDf1PYliynkurznpBmB2mx", "JthO9De0vDUnz", "alrxHoKVfabvqyWYzjdfx1EKUXaFGyZT", "MSxuugz3RBTPC5P7p9BXefIxh5y8oQF5", "xAXGeIm", "UaB9zlLwJ5ijSfJwpwiqdPYYRduUW", "7D"};
    public static final int A0B = (int) (AbstractC3926XX.A02 * 40.0f);
    public int A00;
    public final GradientDrawable A01;
    public final GradientDrawable A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final RelativeLayout A05;
    public final TextView A06;
    public final AbstractC4669jd A07;
    public final C4494gi A08;
    public final int A09;

    public C4039ZM(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, int i2) {
        super(c4494gi);
        this.A01 = new GradientDrawable();
        this.A02 = new GradientDrawable();
        this.A08 = c4494gi;
        this.A07 = abstractC4669jd;
        this.A09 = this.A07.A2D().A00();
        this.A03 = new ImageView(c4494gi);
        this.A04 = new LinearLayout(c4494gi);
        this.A05 = new RelativeLayout(c4494gi);
        this.A06 = new TextView(c4494gi);
        this.A00 = i2;
        A00();
    }

    private void A00() {
        this.A01.setShape(1);
        this.A01.setColor(Integer.MIN_VALUE);
        this.A02.setShape(0);
        this.A02.setColor(Integer.MIN_VALUE);
        this.A02.setCornerRadii(new float[]{50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f});
        if (!TextUtils.isEmpty(this.A07.A2D().A05())) {
            A02();
            this.A05.addView(this.A06);
        }
        A01();
        this.A05.addView(this.A03);
        setToolbarActionMode(this.A00);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC3924XV.A0b, 0, AbstractC3924XV.A0b, 0);
        this.A04.addView(this.A05, layoutParams);
        addView(this.A04, new LinearLayout.LayoutParams(-2, -2));
    }

    private void A01() {
        this.A03.setColorFilter(-1);
        this.A03.setPadding(AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0B, A0B);
        layoutParams.addRule(1, this.A06.getId());
        this.A03.setLayoutParams(layoutParams);
    }

    private void A02() {
        this.A06.setTextColor(-1);
        this.A06.setTextSize(13.0f);
        this.A06.setText(this.A07.A2D().A05());
        if (Build.VERSION.SDK_INT >= 28) {
            this.A06.setTypeface(Typeface.create(Typeface.SANS_SERIF, ServiceStarter.ERROR_UNKNOWN, false));
        }
        this.A06.setPadding(AbstractC3924XV.A0Z, 0, 0, 0);
        AbstractC3966YB.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        this.A06.setLayoutParams(layoutParams);
    }

    public final boolean A03() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    private EnumC3977YM getNtdIcon() {
        switch (this.A09) {
            case 1:
                EnumC3977YM actionEncodedImage = EnumC3977YM.ICON_SKIP;
                return actionEncodedImage;
            case 2:
                EnumC3977YM actionEncodedImage2 = EnumC3977YM.AD_NTD_CHEVRON_DOWN;
                return actionEncodedImage2;
            case 3:
                EnumC3977YM actionEncodedImage3 = EnumC3977YM.AD_NTD_FAST_FORWARD;
                return actionEncodedImage3;
            case 4:
                EnumC3977YM actionEncodedImage4 = EnumC3977YM.AD_NTD_DIAGONAL_ARROW;
                return actionEncodedImage4;
            case 5:
                EnumC3977YM actionEncodedImage5 = EnumC3977YM.AD_NTD_PANEL_OPEN;
                return actionEncodedImage5;
            default:
                EnumC3977YM actionEncodedImage6 = EnumC3977YM.OTHER_SKIP;
                return actionEncodedImage6;
        }
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i2) {
        if (i2 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setToolbarActionMode(int i2) {
        EnumC3977YM ntdIcon;
        this.A08.A0F().AGB(i2);
        this.A00 = i2;
        setVisibility(4);
        this.A06.setVisibility(8);
        this.A05.setBackground(this.A01);
        this.A03.setPadding(AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y);
        switch (i2) {
            case 0:
                ntdIcon = EnumC3977YM.NAV_CROSS;
                setVisibility(0);
                break;
            case 1:
                ntdIcon = EnumC3977YM.ICON_SKIP;
                setVisibility(0);
                break;
            case 8:
                ntdIcon = getNtdIcon();
                if (!TextUtils.isEmpty(this.A07.A2D().A05())) {
                    this.A06.setVisibility(0);
                    this.A03.setPadding(0, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y, AbstractC3924XV.A0Y);
                    RelativeLayout relativeLayout = this.A05;
                    GradientDrawable gradientDrawable = this.A02;
                    String[] strArr = A0A;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0A;
                    strArr2[4] = "oZDmetKHu9grnCPFFZaM4ttbALN8X9Pg";
                    strArr2[1] = "vBKViN6oqvNYKRPMnY7Cbo5hW74eYH8B";
                    relativeLayout.setBackground(gradientDrawable);
                }
                setVisibility(0);
                break;
            default:
                ntdIcon = EnumC3977YM.NAV_CROSS;
                break;
        }
        this.A03.setImageBitmap(AbstractC3978YN.A01(ntdIcon));
        if (i2 == 1) {
            AbstractC3966YB.A0G(1005, this.A03);
        } else {
            AbstractC3966YB.A0G(1002, this.A03);
        }
    }
}
