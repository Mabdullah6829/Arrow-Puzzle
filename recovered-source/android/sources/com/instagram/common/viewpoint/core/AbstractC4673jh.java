package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4673jh implements InterfaceC3285N1 {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0H();

    public abstract AbstractC3310NQ A0I();

    public abstract boolean A0J();

    public final void A00(int i2) {
        this.A00 = i2;
    }

    public final void A01(long j2) {
        this.A01 = j2;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3285N1
    public final AdPlacementType A8k() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
