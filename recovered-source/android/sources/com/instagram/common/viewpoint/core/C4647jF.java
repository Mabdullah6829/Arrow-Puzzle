package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4647jF implements InterfaceC3612SM {
    public final /* synthetic */ AbstractC4669jd A00;
    public final /* synthetic */ InterfaceC3339Nt A01;
    public final /* synthetic */ C3340Nu A02;
    public final /* synthetic */ C4494gi A03;
    public final /* synthetic */ boolean A04;

    public C4647jF(C3340Nu c3340Nu, C4494gi c4494gi, boolean z, AbstractC4669jd abstractC4669jd, InterfaceC3339Nt interfaceC3339Nt) {
        this.A02 = c3340Nu;
        this.A03 = c4494gi;
        this.A04 = z;
        this.A00 = abstractC4669jd;
        this.A01 = interfaceC3339Nt;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACx() {
        if (C3763Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC4278dD.A01(this.A03, this.A00, 1, new C4648jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
