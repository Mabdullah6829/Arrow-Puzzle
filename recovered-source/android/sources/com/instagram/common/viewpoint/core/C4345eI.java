package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.C1137R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4345eI extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC4669jd A03;
    public final C3334No A04;
    public final C4494gi A05;
    public final InterfaceC3784VA A06;
    public final InterfaceC4142b1 A07;
    public final C3192LV A08;
    public final InterfaceC4343eG A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, 127, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, 127, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, 63, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, 127, 113, 116, 121, 126, 119, 48, 98, 117, 125, 127, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A0A();
        A0E = (int) (AbstractC3926XX.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C4345eI(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, C3334No c3334No, InterfaceC3784VA interfaceC3784VA, InterfaceC4343eG interfaceC4343eG, Map<String, String> playableMetricsData) {
        super(c4494gi);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC3212Lp() { // from class: com.facebook.ads.redexgen.X.4S
            @Override // com.instagram.common.viewpoint.core.InterfaceC4142b1
            public final void ACz() {
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC3212Lp, com.instagram.common.viewpoint.core.InterfaceC4142b1
            public final void ADu(int i2, String str) {
                this.A00.A0B.set(true);
                this.A00.A09.AEh();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC4142b1
            public final void AEA() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.AEA();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC4142b1
            public final void AF8() {
                if (!this.A00.A04.A0b()) {
                    return;
                }
                this.A00.A09.AFQ();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC4142b1
            public final void AGg() {
                this.A00.A09.AGg();
            }
        };
        this.A05 = c4494gi;
        this.A03 = abstractC4669jd;
        this.A04 = c3334No;
        this.A06 = interfaceC3784VA;
        this.A09 = interfaceC4343eG;
        this.A02 = playableMetricsData;
        this.A08 = A05();
        if (C3763Up.A1z(this.A05)) {
            this.A05.A0B().AKn(this.A08, this.A03.A2E(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C4345eI c4345eI) {
        int i2 = c4345eI.A00;
        c4345eI.A00 = i2 + 1;
        return i2;
    }

    private C3192LV A05() {
        C3192LV c3192lv = new C3192LV(this.A05, (WeakReference<InterfaceC4142b1>) new WeakReference(this.A07), 10, C3763Up.A28(this.A05));
        c3192lv.setCornerRadius(A0E);
        c3192lv.setLogMultipleImpressions(false);
        c3192lv.setCheckAssetsByJavascriptBridge(false);
        c3192lv.setWebViewTimeoutInMillis(this.A04.A0F());
        c3192lv.setRequestId(this.A03.A1D());
        c3192lv.setOnTouchListener(new ViewOnTouchListenerC4344eH(this));
        WebSettings settings = c3192lv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c3192lv.addJavascriptInterface(new C4346eJ(this.A05, this, this.A06, this.A02, this.A03.A2E()), A07(0, 12, C1137R.styleable.ConstraintSet_transitionEasing));
        return c3192lv;
    }

    public final void A0B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C3691Te c3691Te = new C3691Te(A07(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A07(136, 6, 72), this.A00);
            jSONObject.put(A07(142, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A07(187, 5, 51), this.A03.A2E());
        } catch (JSONException e) {
            Log.e(A07(92, 15, 84), A07(12, 13, 74), e);
        }
        c3691Te.A07(jSONObject);
        c3691Te.A05(1);
        InterfaceC3689Tc interfaceC3689TcA08 = this.A05.A08();
        int i2 = AbstractC3690Td.A2D;
        String strA07 = A07(147, 8, 11);
        interfaceC3689TcA08.ABD(strA07, i2, c3691Te);
        this.A00 = 0;
        if (!C3763Up.A1u(this.A05)) {
            this.A09.ADX();
            return;
        }
        if (jCurrentTimeMillis <= C3763Up.A0L(this.A05)) {
            InterfaceC4343eG interfaceC4343eG = this.A09;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            interfaceC4343eG.ADX();
            return;
        }
        c3691Te.A05(0);
        this.A05.A08().ABC(strA07, AbstractC3690Td.A2E, c3691Te);
    }

    public final void A0C() {
        String strA0L;
        if (this.A04.A0Y()) {
            C3691Te c3691Te = new C3691Te(A07(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A07(170, 17, 36), this.A04.A0P());
                jSONObject.put(A07(187, 5, 51), this.A03.A2E());
            } catch (JSONException e) {
                String strA07 = A07(92, 15, 84);
                String strA08 = A07(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(strA07, strA08, e);
            }
            c3691Te.A07(jSONObject);
            c3691Te.A05(1);
            InterfaceC3689Tc interfaceC3689TcA08 = this.A05.A08();
            int i2 = AbstractC3690Td.A2G;
            String strA09 = A07(155, 15, 77);
            interfaceC3689TcA08.ABD(strA09, i2, c3691Te);
            if (C3763Up.A0r(this.A05) && AbstractC3954Xz.A00(this.A05) == EnumC3953Xy.A07) {
                this.A05.A08().ABD(strA09, AbstractC3690Td.A2F, c3691Te);
                this.A07.ADu(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            C3192LV c3192lv = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0I())) {
                strA0L = this.A04.A0I();
            } else {
                strA0L = this.A04.A0L();
            }
            c3192lv.loadUrl(strA0L);
        } catch (Exception e2) {
            this.A05.A08().ABC(A07(192, 8, 9), AbstractC3690Td.A2f, new C3691Te(e2));
        }
    }

    public final void A0D() {
        if (C3763Up.A1z(this.A05)) {
            this.A05.A0B().AKU(this.A08);
        }
        this.A08.removeJavascriptInterface(A07(0, 12, C1137R.styleable.ConstraintSet_transitionEasing));
        this.A08.destroy();
    }

    public final void A0E(int i2) {
        this.A08.setVisibility(i2);
        if (i2 == 0) {
            this.A08.resumeTimers();
        } else {
            this.A08.pauseTimers();
        }
    }

    public C3957Y2 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C4439fp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
