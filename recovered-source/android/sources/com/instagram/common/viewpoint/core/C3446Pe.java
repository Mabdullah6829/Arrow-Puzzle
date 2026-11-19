package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3446Pe extends AbstractC3992Yb {
    public static byte[] A08;
    public static String[] A09 = {"fERBvMHNNnzy3nk4ZNYWfuNmaphricqR", "36dIUinCjWD1st1oFa", "LXwDs8sQ22ml4TxQk7X9Yy2PND6TLebQ", "XXrP48rjLtmBZR3EppDVWeHK64Oiflqr", "lJVaLdSDUZo8CZ4Z9dOQvPM3HMB2ksyr", "0Ja0eNtF0Cq6bAhyEs6lkKXZN09pMEMJ", "OH638NDLRGGNEgbxKp", "sf1pLwcEB21wXoeUmJKgsuWxlp0ZYlJT"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final Integer A0D;
    public static final Integer A0E;
    public int A00;
    public InterfaceC3996Yf A01;
    public float A02;
    public InterfaceC3991Ya A03;
    public boolean A04;
    public final C4494gi A05;
    public final C3995Ye A06;
    public final EnumC3997Yg A07;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{110, 65, 66, 94, 72, 13, 108, 73};
        String[] strArr = A09;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[6] = "7Gx7HJtPRSPh20N7Kw";
        strArr2[1] = "xYim5uVBO0YQkaepUH";
    }

    static {
        A07();
        A0A = AbstractC3924XV.A0C;
        A0C = AbstractC3924XV.A0H;
        A0B = (int) (((double) A0C) / 2.0d);
        A0D = 855638016;
        A0E = null;
    }

    public C3446Pe(C4494gi c4494gi, EnumC3997Yg enumC3997Yg, AbstractC4669jd abstractC4669jd, int i2, InterfaceC3996Yf interfaceC3996Yf) {
        super(c4494gi);
        this.A00 = 0;
        this.A04 = true;
        this.A05 = c4494gi;
        this.A07 = enumC3997Yg;
        this.A01 = interfaceC3996Yf;
        A04();
        this.A06 = new C3995Ye(this.A05, abstractC4669jd, this.A07, i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        this.A06.setContentDescription(A03(0, 8, 81));
        this.A06.setOnClickListener(new ViewOnClickListenerC3994Yd(this));
        addView(this.A06, layoutParams);
        A06();
    }

    private void A04() {
        View view = new View(this.A05);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    private void A05() {
        Rect requestedMargins = getRequestedMargins();
        if (this.A01 != null && requestedMargins != null) {
            this.A01.AEZ(getToolbarHeight());
        }
    }

    private void A06() {
        if (Build.VERSION.SDK_INT >= 28) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.Yc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.A00.A0F(view, windowInsets);
                }
            });
        }
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

    public final /* synthetic */ WindowInsets A0F(View view, WindowInsets windowInsets) {
        int cutoutInsetTop;
        DisplayCutout cutout = windowInsets.getDisplayCutout();
        if (cutout != null && (cutoutInsetTop = cutout.getSafeInsetTop()) != this.A00) {
            this.A00 = cutoutInsetTop;
            A05();
        }
        return windowInsets;
    }

    public final void A0G() {
        if (this.A03 != null && this.A04) {
            InterfaceC3991Ya interfaceC3991Ya = this.A03;
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "Nz9FTwNSu9sKseNM42ZlibQZooapJX2m";
            strArr[0] = "gMFqMi1vQ9rk8jIPSWsyy3tPRxgAiTUd";
            interfaceC3991Ya.ACl(this);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public Rect getRequestedMargins() {
        if (getResources().getConfiguration().orientation == 1) {
            int i2 = AbstractC3924XV.A0u;
            int i3 = AbstractC3924XV.A0c;
            int orientation = this.A00;
            return new Rect(i2, i3 + orientation, 0, 0);
        }
        return new Rect(AbstractC3924XV.A0u, AbstractC3924XV.A0v, 0, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarActionMode() {
        return this.A06.A09();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarHeight() {
        if (this.A07 == EnumC3997Yg.A08) {
            if (getResources().getConfiguration().orientation == 1) {
                int i2 = this.A00;
                int orientation = A0C;
                int i3 = i2 + orientation;
                int orientation2 = AbstractC3924XV.A0c;
                return i3 + (orientation2 * 2);
            }
            int i4 = A0C;
            int orientation3 = AbstractC3924XV.A0v;
            return i4 + (orientation3 * 2);
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public InterfaceC3991Ya getToolbarListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A05();
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

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    private void setClickable(float f2) {
        boolean z;
        if (f2 > 0.0f) {
            boolean zA19 = C3763Up.A19(this.A05);
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            A09[5] = "CynGSFEo4busEIaNEzQQTo6NoR2HzSp3";
            if (zA19) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        this.A04 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setFullscreen(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetails(C3332Nm c3332Nm, String str, int i2, C3338Ns c3338Ns) {
        this.A02 = i2 * 1000;
        setClickable(this.A02);
        this.A06.A0A(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgress(float f2) {
        float f3 = (f2 / 100.0f) * this.A02;
        float remainingMs = 0.0f;
        if (this.A02 - f3 > 0.0f) {
            float remainingMs2 = this.A02;
            remainingMs = remainingMs2 - f3;
        }
        this.A06.A0B(remainingMs);
        setClickable(remainingMs);
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
        this.A06.A0C(i2);
        if (i2 == 0) {
            setProgress(100.0f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarListener(InterfaceC3991Ya interfaceC3991Ya) {
        this.A03 = interfaceC3991Ya;
    }
}
