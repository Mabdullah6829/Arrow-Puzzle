package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4644jC implements InterfaceC3349O3 {
    public final /* synthetic */ C3340Nu A00;

    public C4644jC(C3340Nu c3340Nu) {
        this.A00 = c3340Nu;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3349O3
    public final void AFF(AdError adError) {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3349O3
    public final void AFG() {
        this.A00.A04.ACp();
    }
}
