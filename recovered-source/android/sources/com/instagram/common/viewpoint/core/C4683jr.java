package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4683jr implements InterfaceC3612SM {
    public final /* synthetic */ C23737w A00;
    public final /* synthetic */ boolean A01;

    public C4683jr(C23737w c23737w, boolean z) {
        this.A00 = c23737w;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACx() {
        if (!C3763Up.A1t(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        } else {
            this.A00.A06 = AbstractC4278dD.A01(this.A00.A04, (C23627l) this.A00.A03, 0, new C4684js(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACy() {
        this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
