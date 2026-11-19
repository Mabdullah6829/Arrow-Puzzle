package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3404Ow extends AbstractC4156bF {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC3926XX.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC3926XX.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC3926XX.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC3926XX.A02 * 4.0f);

    public C3404Ow(C4494gi c4494gi, int i2, C3320Na c3320Na, boolean z, String str, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, C4439fp c4439fp, C3957Y2 c3957y2, C3326Ng c3326Ng) {
        super(c4494gi, null, i2, c3320Na, z, str, interfaceC3784VA, interfaceC3998Yh, c4439fp, c3957y2, c3326Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i2), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i2) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC4156bF.A0B);
        linearLayout.addView(this.A00, AbstractC4156bF.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i2, i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i2, int i3, boolean z) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i2);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        AbstractC3966YB.A0a(textView, z, i3);
        return textView;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
    public final void A0l(int i2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4156bF
    public void setInfo(C3318NY c3318ny, C3322Nc c3322Nc, String str, String str2, InterfaceC3936Xh interfaceC3936Xh, InterfaceC4171bU interfaceC4171bU) {
        super.setInfo(c3318ny, c3322Nc, str, str2, interfaceC3936Xh, interfaceC4171bU);
        this.A01.setText(c3318ny.A0G());
        this.A00.setText(c3318ny.A0F());
        if (TextUtils.isEmpty(c3322Nc.A04())) {
            AbstractC3966YB.A0H(this.A08);
        }
    }
}
