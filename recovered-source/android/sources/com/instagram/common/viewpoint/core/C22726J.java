package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6J */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22726J extends AbstractC3135Ka {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 71);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C22726J(C4210c7 c4210c7, boolean z) {
        super(c4210c7, true);
        this.A01 = z;
        this.A00 = c4210c7.A02();
        if (this.A00 == null) {
            return;
        }
        A1S();
        if (this.A01) {
            addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c4210c7.A06());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC4206c3.A08, 0, AbstractC4206c3.A08, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        C3920XR c3920xrA02 = this.A08.A02(getAdDataBundle());
        c4210c7.A06().A0H().A00(c3920xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A08);
        if (this.A00 != null) {
            if (c3920xrA02.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1X(view);
                    }
                });
            } else if (C3763Up.A1J(getAdContextWrapper())) {
                AbstractC4153bC.A00(this.A00, C3763Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC4212c9(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A0A() {
        return this.A01 && super.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A0B() {
        return this.A01 && super.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka, com.instagram.common.viewpoint.core.AbstractC4206c3
    public final void A1H(C3311NR c3311nr, String str, double d, Bundle bundle) {
        super.A1H(c3311nr, str, d, bundle);
        if (!this.A01 && d > 0.0d && this.A00 != null) {
            int mediaHeight = (int) (((double) (A04 - (AbstractC4206c3.A08 * 2))) / d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i2 = AbstractC4206c3.A08;
            int mediaHeight2 = AbstractC4206c3.A08;
            layoutParams.setMargins(i2, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
    public final boolean A1O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3135Ka
    public final AbstractC4156bF A1R(C4210c7 c4210c7, C3311NR c3311nr, String str) {
        return new C3138Kd(c4210c7.A06(), getCtaButton(), AbstractC3135Ka.A0F, c3311nr.A0I().A00() == EnumC3316NW.A05, getColors(), c3311nr.A0J().A06(), str, c4210c7.A07(), c4210c7.A0C(), c4210c7.A0F(), c4210c7.A0A(), c4210c7.A05());
    }

    public final /* synthetic */ void A1X(View view) {
        getCtaButton().A0E(A00(0, 5, 11));
    }
}
