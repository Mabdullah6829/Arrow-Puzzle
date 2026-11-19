package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4071Zs extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (AbstractC3926XX.A02 * 8.0f);
    public static final int A06 = (int) (((double) AbstractC3926XX.A02) * 14.5d);
    public static final int A04 = (int) (AbstractC3926XX.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C4071Zs(C4494gi c4494gi) {
        super(c4494gi);
        this.A00 = new ImageView(c4494gi);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c4494gi);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout linearLayout = this.A01;
        LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new TextView(c4494gi);
        AbstractC3966YB.A0a(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        LinearLayout linearLayout2 = this.A01;
        TextView textView = this.A02;
        LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(EnumC3977YM enumC3977YM, String str, String str2) {
        this.A00.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            AbstractC3966YB.A0a(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            setPadding(0, A05, 0, A05);
            return;
        }
        setPadding(0, A06, 0, A06);
    }
}
