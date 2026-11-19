package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ib */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4607ib extends AbstractC3286N2 {
    public static byte[] A01;
    public final /* synthetic */ C4605iZ A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C4607ib(C4605iZ c4605iZ) {
        this.A00 = c4605iZ;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A06() {
        this.A00.A07.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A07() {
        this.A00.A07.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A08() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A09() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0A() {
        if (this.A00.A02 != null) {
            C3609SJ c3609sj = (C3609SJ) this.A00.A02.buildShowAdConfig();
            c3609sj.A02(System.currentTimeMillis() - this.A00.A01);
            this.A00.A02.show(c3609sj.build());
            return;
        }
        this.A00.A07.onRewardedVideoClosed();
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
    public final void A0F(InterfaceC3285N1 interfaceC3285N1) {
        if (this.A00.A04 == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC3690Td.A0N, new C3691Te(A00(3, 18, 108)));
            return;
        }
        AbstractC4673jh abstractC4673jh = (AbstractC4673jh) interfaceC3285N1;
        if (this.A00.A08.A03 != null) {
            abstractC4673jh.A02(this.A00.A08.A03);
        }
        this.A00.A08.A00 = abstractC4673jh.A0H();
        this.A00.A05 = true;
        this.A00.A03 = this.A00.A04.A0I();
        if (this.A00.A03 != null) {
            int iA26 = 0;
            if (!this.A00.A03.A1b()) {
                iA26 = ((AbstractC4669jd) this.A00.A03).A26();
            }
            if (iA26 > 0) {
                C3905XC c3905xc = new C3905XC();
                if (c3905xc.A09(this.A00.A06, this.A00.A08.A06, iA26)) {
                    c3905xc.A08(this.A00.A06, true);
                    this.A00.A02 = c3905xc.A07(this.A00.A06, this.A00.A08.A0D, this.A00.A08.A06);
                } else {
                    c3905xc.A08(this.A00.A06, false);
                }
            }
        }
        if (this.A00.A02 != null) {
            ((AbstractC4669jd) this.A00.A03).A2J(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A02.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A03.A0s()).withAdExperience(this.A00.A08.A02).withAdListener(new C3364OI(this)).build();
            this.A00.A02.loadAd(loadAdConfig);
            return;
        }
        this.A00.A07.onAdLoaded(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0G(C3821Vm c3821Vm) {
        this.A00.A0D(true);
        this.A00.A08.A0B.A0F().A3N(C3956Y1.A01(this.A00.A00), c3821Vm.A03().getErrorCode(), c3821Vm.A04());
        this.A00.A07.onError(this.A00.A08.A6k(), AbstractC3907XE.A00(c3821Vm));
    }
}
