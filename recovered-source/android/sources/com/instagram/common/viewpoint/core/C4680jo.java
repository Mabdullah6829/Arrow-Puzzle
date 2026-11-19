package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4680jo implements InterfaceC3349O3 {
    public final /* synthetic */ C23737w A00;

    public C4680jo(C23737w c23737w) {
        this.A00 = c23737w;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3349O3
    public final void AFF(AdError adError) {
        this.A00.A01.AFp(this.A00, adError);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3349O3
    public final void AFG() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }
}
