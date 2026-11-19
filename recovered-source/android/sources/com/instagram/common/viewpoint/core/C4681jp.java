package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4681jp implements InterfaceC3612SM {
    public final /* synthetic */ C23737w A00;

    public C4681jp(C23737w c23737w) {
        this.A00 = c23737w;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACx() {
        this.A00.A0C.set(true);
        this.A00.A01.AFm(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
