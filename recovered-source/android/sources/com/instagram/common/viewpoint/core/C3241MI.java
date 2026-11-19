package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3241MI implements InterfaceC3999Yi {
    public static byte[] A0D;
    public int A00;
    public C2785Eu A01;
    public C21504L A02;
    public String A03;
    public final C4494gi A04;
    public final InterfaceC3784VA A05;
    public final InterfaceC3998Yh A06;
    public final InterfaceC4042ZP A07;
    public final C2775Ek A08;
    public final AbstractC2731E2 A0C = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.6d
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, 64, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C2732E3 c2732e3) {
            this.A00.A06.A4k(A00(0, 21, 63), c2732e3);
        }
    };
    public final AbstractC2733E4 A0B = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.6a
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_stateLabels);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, 63, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C21404B c21404b) {
            this.A00.A06.A4k(A00(0, 21, 40), c21404b);
        }
    };
    public final AbstractC2739EA A09 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.6Z
        public static byte[] A01;
        public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static String A00(int i2, int i3, int i4) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                int i6 = bArrCopyOfRange[i5] ^ i4;
                if (A02[2].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                bArrCopyOfRange[i5] = (byte) (i6 ^ 70);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C21494K c21494k) {
            this.A00.A06.A4k(A00(0, 21, 51), c21494k);
        }
    };
    public final AbstractC2737E8 A0A = new AbstractC2737E8() { // from class: com.facebook.ads.redexgen.X.6Y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C2738E9 c2738e9) {
            this.A00.A07.ADv();
        }
    };

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, 28, 27, 5};
    }

    public C3241MI(C4494gi c4494gi, InterfaceC4042ZP interfaceC4042ZP, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh) {
        this.A04 = c4494gi;
        this.A05 = interfaceC3784VA;
        this.A07 = interfaceC4042ZP;
        this.A08 = new C2775Ek(c4494gi);
        this.A08.A0f(new C21193q(c4494gi));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC3998Yh;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC3998Yh.A45(this.A08, layoutParams);
        C4006Yp closeButton = new C4006Yp(c4494gi);
        closeButton.setOnClickListener(new ViewOnClickListenerC4040ZN(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC3998Yh.A45(closeButton, params);
    }

    public final void A04(int i2) {
        this.A08.setVideoProgressReportIntervalMs(i2);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C4330e3 c4330e3 = new C4330e3(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i2 = (int) (16.0f * AbstractC3926XX.A02);
            layoutParams.setMargins(i2, i2, i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c4330e3.setOnClickListener(new ViewOnClickListenerC4041ZO(this));
            this.A06.A45(c4330e3, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, C1137R.styleable.ConstraintSet_quantizeMotionSteps), 0);
        this.A02 = new C21504L(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C3763Up.A20(this.A04)) {
            this.A01 = new C2785Eu(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0a(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0e(EnumC4381et.A04, 17);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new C2735E6());
        this.A08.A0X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new C2734E5());
        if (!this.A08.A0o()) {
            this.A08.A0e(EnumC4381et.A04, 18);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        this.A06.A4k(A02(37, 21, 39), new C2727Dy(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0b(1);
        this.A08.A0W();
    }
}
