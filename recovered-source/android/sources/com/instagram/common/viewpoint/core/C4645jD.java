package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4645jD implements InterfaceC3640Sp {
    public final /* synthetic */ AbstractC4669jd A00;
    public final /* synthetic */ InterfaceC3339Nt A01;
    public final /* synthetic */ C3340Nu A02;
    public final /* synthetic */ C4494gi A03;
    public final /* synthetic */ boolean A04;

    public C4645jD(C3340Nu c3340Nu, C4494gi c4494gi, boolean z, AbstractC4669jd abstractC4669jd, InterfaceC3339Nt interfaceC3339Nt) {
        this.A02 = c3340Nu;
        this.A03 = c4494gi;
        this.A04 = z;
        this.A00 = abstractC4669jd;
        this.A01 = interfaceC3339Nt;
    }

    private void A00(boolean z) {
        if (z) {
            if (C3763Up.A1q(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC4278dD.A01(this.A03, this.A00, 1, new C4646jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
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
