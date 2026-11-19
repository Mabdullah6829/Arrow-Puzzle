package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23497Y extends AbstractC4616ik {
    public static final InterfaceC3365OJ A02 = new C4601iV();
    public C4609id A00;
    public final C4604iY A01;

    public C23497Y(C4604iY c4604iY, String str) {
        super(c4604iY.A05(), str, A02.A5T(c4604iY));
        this.A01 = c4604iY;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4616ik
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(EnumC3359OD.A03);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4616ik
    public final void A09() {
        this.A00 = new C4609id(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4616ik
    public final void A0D(boolean z) {
        this.A05.AJn(z);
    }

    public final void A0E(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC3766Us.A09(this.A02) && AbstractC3766Us.A0A(this.A02)) {
            if (AbstractC3766Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0F(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(PointerIconCompat.TYPE_ALL_SCROLL, AbstractC3380OY.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C3956Y1.A00() > this.A01.A00();
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6p() == EnumC3359OD.A05;
    }

    public final boolean A0I(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new C4609id(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}
