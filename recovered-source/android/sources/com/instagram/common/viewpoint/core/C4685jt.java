package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4685jt implements InterfaceC3640Sp {
    public final /* synthetic */ C23737w A00;

    public C4685jt(C23737w c23737w) {
        this.A00 = c23737w;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADT() {
        A00(true);
    }
}
