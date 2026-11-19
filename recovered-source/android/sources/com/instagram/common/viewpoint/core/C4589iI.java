package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4589iI implements InterfaceC3656T5 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public InterfaceC1889Ad A09;
    public WeakReference<InterfaceC1889Ad> A0A;
    public final C4494gi A0B;
    public final InterfaceC3715U3 A0C;
    public final String A0D;

    public C4589iI(C4494gi c4494gi, String str, InterfaceC1889Ad interfaceC1889Ad, InterfaceC3715U3 interfaceC3715U3) {
        this.A0B = c4494gi;
        this.A0D = str;
        this.A09 = interfaceC1889Ad;
        this.A0A = new WeakReference<>(interfaceC1889Ad);
        this.A0C = interfaceC3715U3;
        c4494gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3656T5
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final C4494gi A01() {
        return this.A0B;
    }

    public final void A02(InterfaceC1889Ad interfaceC1889Ad) {
        if (interfaceC1889Ad == null && !C3763Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = interfaceC1889Ad;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3656T5
    public final InterfaceC1889Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
