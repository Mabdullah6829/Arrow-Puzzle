package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.if */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4611if extends AbstractC3286N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C4609id A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C4611if(C4609id c4609id) {
        this.A00 = c4609id;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && C3763Up.A2D(this.A00.A06)) {
            this.A00.A03.A0S(new C4612ig(this));
            this.A00.A03.A0N();
            this.A00.A03.A0K();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0C() {
        this.A00.A06.A0F().A3K();
        this.A00.A07.onAdClicked(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0F(InterfaceC3285N1 interfaceC3285N1) {
        if (this.A00.A03 != null) {
            this.A00.A05 = true;
            this.A00.A02 = this.A00.A03.A0I();
            if (!(this.A00.A02 instanceof AbstractC4669jd)) {
                InterstitialAdExtendedListener interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    interstitialAdExtendedListener.onAdLoaded(this.A00.A08.A6k());
                    return;
                }
            } else {
                AbstractC4669jd abstractC4669jd = (AbstractC4669jd) this.A00.A02;
                if (abstractC4669jd.A26() > 0) {
                    C3905XC c3905xc = new C3905XC();
                    if (c3905xc.A09(this.A00.A06, this.A00.A08.A08(), abstractC4669jd.A26())) {
                        c3905xc.A08(this.A00.A06, true);
                        this.A00.A01 = c3905xc.A06(this.A00.A06, this.A00.A08.A0A(), this.A00.A08.A08());
                    } else {
                        C4609id c4609id = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            c3905xc.A08(c4609id.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            c3905xc.A08(c4609id.A06, false);
                        }
                    }
                }
                C4609id c4609id2 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    if (c4609id2.A01 != null) {
                        abstractC4669jd.A2J(true);
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new C3363OH(this, abstractC4669jd)).withCacheFlags(this.A00.A08.A0B()).withRewardData(this.A00.A08.A03()).build();
                        this.A00.A01.loadAd(loadAdConfig);
                        return;
                    }
                    C4609id c4609id3 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        c4609id3.A07.onAdLoaded(this.A00.A08.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        c4609id3.A07.onAdLoaded(this.A00.A08.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC3690Td.A0N, new C3691Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0G(C3821Vm c3821Vm) {
        this.A00.A06.A0F().A3N(C3956Y1.A01(this.A00.A00), c3821Vm.A03().getErrorCode(), c3821Vm.A04());
        this.A00.A07.onError(this.A00.A08.A6k(), AbstractC3907XE.A00(c3821Vm));
    }
}
