package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4156bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C4494gi A07;
    public final ViewOnClickListenerC3152Kr A08;
    public final C4187bk A09;

    public static String A0h(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i2);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC4156bF(C4494gi c4494gi, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, int i2, C3320Na c3320Na, boolean z, String str, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, C4439fp c4439fp, C3957Y2 c3957y2, C3326Ng c3326Ng, boolean z2, String str2) {
        super(c4494gi);
        this.A02 = A0h(0, 0, 37);
        AbstractC3966YB.A0K(this);
        this.A07 = c4494gi;
        this.A04 = i2;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C4187bk(c4494gi);
        AbstractC3966YB.A0N(this.A09, 0);
        AbstractC3966YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c4494gi);
            this.A01 = new TextView(c4494gi);
            AbstractC3966YB.A0K(this.A01);
        }
        if (viewOnClickListenerC3152Kr == null) {
            this.A08 = new ViewOnClickListenerC3152Kr(c4494gi, str, c3320Na, z, interfaceC3784VA, interfaceC3998Yh, c4439fp, c3957y2, c3326Ng);
        } else {
            this.A08 = viewOnClickListenerC3152Kr;
        }
        AbstractC3966YB.A0G(1001, this.A08);
        this.A05 = AbstractC4197bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c4494gi);
        this.A06.setLayoutParams(A0B);
        AbstractC3966YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC3152Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C3318NY c3318ny, C3322Nc c3322Nc, String str, String str2, InterfaceC3936Xh interfaceC3936Xh, InterfaceC4171bU interfaceC4171bU) {
        this.A08.setCta(c3322Nc, str, new HashMap(), interfaceC3936Xh, interfaceC4171bU);
        new AsyncTaskC3183LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i2) {
    }
}
