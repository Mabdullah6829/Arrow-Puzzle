package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4331e4 extends LinearLayout {
    public static final int A04 = (int) (AbstractC3926XX.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC3926XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C4187bk A02;
    public final C4494gi A03;

    public C4331e4(C4494gi c4494gi) {
        super(c4494gi);
        this.A03 = c4494gi;
        A00(c4494gi);
    }

    private final void A00(C4494gi c4494gi) {
        setGravity(16);
        this.A02 = new C4187bk(c4494gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c4494gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c4494gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC3966YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c4494gi);
        AbstractC3966YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i2, int i3) {
        this.A00.setTextColor(i2);
        this.A01.setTextColor(i3);
    }

    public void setPageDetails(C3332Nm c3332Nm) {
        AsyncTaskC3183LM asyncTaskC3183LM = new AsyncTaskC3183LM(this.A02, this.A03);
        asyncTaskC3183LM.A05(A04, A04);
        asyncTaskC3183LM.A07(c3332Nm.A01());
        this.A00.setText(c3332Nm.A02());
        this.A01.setText(c3332Nm.A03());
    }
}
