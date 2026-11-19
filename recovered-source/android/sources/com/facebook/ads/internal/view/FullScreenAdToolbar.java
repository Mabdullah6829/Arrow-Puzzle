package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.instagram.common.viewpoint.core.AbstractC3926XX;
import com.instagram.common.viewpoint.core.AbstractC3966YB;
import com.instagram.common.viewpoint.core.AbstractC3992Yb;
import com.instagram.common.viewpoint.core.AbstractC4197bu;
import com.instagram.common.viewpoint.core.C3320Na;
import com.instagram.common.viewpoint.core.C3332Nm;
import com.instagram.common.viewpoint.core.C3338Ns;
import com.instagram.common.viewpoint.core.C3792VI;
import com.instagram.common.viewpoint.core.C3990YZ;
import com.instagram.common.viewpoint.core.C4029ZC;
import com.instagram.common.viewpoint.core.C4037ZK;
import com.instagram.common.viewpoint.core.C4331e4;
import com.instagram.common.viewpoint.core.C4494gi;
import com.instagram.common.viewpoint.core.EnumC3977YM;
import com.instagram.common.viewpoint.core.InterfaceC3991Ya;
import com.instagram.common.viewpoint.core.InterfaceC3998Yh;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC3152Kr;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC4007Yq;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends AbstractC3992Yb {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C3990YZ A00;
    public InterfaceC3991Ya A01;
    public InterfaceC3991Ya A02;
    public C4029ZC A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C3792VI A07;
    public final InterfaceC3998Yh A08;
    public final C4037ZK A09;
    public final C4331e4 A0A;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC3926XX.A02 * 10.0f);
        A0H = (int) (AbstractC3926XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC3926XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C4494gi c4494gi, InterfaceC3998Yh interfaceC3998Yh, C3792VI c3792vi, int i2, int i3, boolean z) {
        super(c4494gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z;
        this.A08 = interfaceC3998Yh;
        this.A07 = c3792vi;
        setGravity(16);
        this.A09 = new C4037ZK(c4494gi, i2, z);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC4007Yq(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c4494gi);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C4331e4(c4494gi);
            AbstractC3966YB.A0G(PointerIconCompat.TYPE_CELL, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i3 != -1) {
                A0G(c4494gi, i3);
                return;
            }
            return;
        }
        if (i3 != -1) {
            A0G(c4494gi, i3);
        }
        this.A06 = new RelativeLayout(c4494gi);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C4331e4(c4494gi);
        AbstractC3966YB.A0G(PointerIconCompat.TYPE_CELL, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0C(float f2, int i2) {
        this.A09.A03(f2, i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final void A0D(C3320Na c3320Na, boolean z) {
        boolean z2 = this.A04;
        int iA05 = c3320Na.A05(z2);
        this.A0A.A02(c3320Na.A0B(z2), iA05);
        boolean z3 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z3) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c3320Na, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC3966YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        AbstractC3966YB.A0N(this, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(C3332Nm c3332Nm, String str, int i2) {
        this.A09.setInitialUnskippableSeconds(i2);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c3332Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c3332Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(C4494gi c4494gi, int i2) {
        if (this.A00 != null) {
            AbstractC3966YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C3990YZ(c4494gi, i2);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new C4029ZC(c4494gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public int getToolbarHeight() {
        return AbstractC3992Yb.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public InterfaceC3991Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setAdReportingVisible(boolean z) {
        A04(!this.A05 ? this.A00 : this.A03, z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setCTAClickListener(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        this.A0A.setOnClickListener(AbstractC4197bu.A03(viewOnClickListenerC3152Kr, A02(17, 7, 47)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setFullscreen(boolean z) {
        this.A04 = z;
    }

    public void setOnlyPageDetails(C3332Nm c3332Nm) {
        if (c3332Nm != null) {
            this.A0A.setPageDetails(c3332Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetails(C3332Nm c3332Nm, String str, int i2, C3338Ns c3338Ns) {
        this.A09.setInitialUnskippableSeconds(i2);
        this.A0A.setPageDetails(c3332Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c3332Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c3332Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setPageDetailsVisible(boolean z) {
        this.A06.removeAllViews();
        if (z) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgress(float f2) {
        this.A09.setProgress(f2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressImage(EnumC3977YM enumC3977YM) {
        this.A09.setProgressImage(enumC3977YM);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressImmediate(float f2) {
        this.A09.setProgressImmediate(f2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setProgressSpinnerInvisible(boolean z) {
        this.A09.setProgressSpinnerInvisible(z);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            AbstractC3966YB.A0S(view, 0, ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarActionMode(int i2) {
        this.A09.setToolbarActionMode(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3992Yb
    public void setToolbarListener(InterfaceC3991Ya interfaceC3991Ya) {
        this.A02 = interfaceC3991Ya;
    }
}
