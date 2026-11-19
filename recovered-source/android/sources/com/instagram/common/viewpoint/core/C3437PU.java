package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3437PU extends AbstractC3992Yb {
    public static byte[] A03;
    public C4494gi A00;
    public InterfaceC3991Ya A01;
    public final C4039ZM A02;

    static {
        A05();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public C3437PU(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, int i2) {
        super(c4494gi);
        this.A00 = c4494gi;
        setGravity(16);
        A04();
        this.A02 = new C4039ZM(this.A00, abstractC4669jd, i2);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC4008Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0C(float f2, int i2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0D(C3320Na c3320Na, boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarHeight() {
        return AbstractC3992Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public InterfaceC3991Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setCTAClickListener(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i2) {
        this.A02.setInitialUnskippableSeconds(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetails(C3332Nm c3332Nm, String str, int i2, C3338Ns c3338Ns) {
        this.A02.setInitialUnskippableSeconds(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgress(float f2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressImage(EnumC3977YM enumC3977YM) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressImmediate(float f2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarActionMode(int i2) {
        this.A02.setToolbarActionMode(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarListener(InterfaceC3991Ya interfaceC3991Ya) {
        this.A01 = interfaceC3991Ya;
    }
}
