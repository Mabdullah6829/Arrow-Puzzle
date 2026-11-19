package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23607j extends AbstractC4632j0 {
    public C23607j(C4494gi c4494gi, C3353O7 c3353o7) {
        super(c4494gi, c3353o7);
    }

    private C4630iy A00(Runnable runnable) {
        return new C4630iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final AbstractC3310NQ A0I() {
        C4691jz successfullyLoadedAdapter = (C4691jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0P() {
        C4691jz interstitialAdapter = (C4691jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0R(InterfaceC3285N1 interfaceC3285N1, C3709Tw c3709Tw, C3707Tu c3707Tu, C3354O8 c3354o8) {
        C4691jz c4691jz = (C4691jz) interfaceC3285N1;
        C4631iz c4631iz = new C4631iz(this, c3354o8, c4691jz);
        A0H().postDelayed(c4631iz, c3709Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c4691jz.A0A(this.A0B, A00(c4631iz), c3354o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
