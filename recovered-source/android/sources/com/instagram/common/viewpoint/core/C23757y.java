package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23757y extends AbstractC4636j4 {
    public final /* synthetic */ C23737w A00;
    public final /* synthetic */ AbstractC4673jh A01;
    public final /* synthetic */ C23627l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23757y(C23737w c23737w, boolean z, boolean z2, C23627l c23627l, AbstractC4673jh abstractC4673jh) {
        super(z);
        this.A00 = c23737w;
        this.A03 = z2;
        this.A02 = c23627l;
        this.A01 = abstractC4673jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4636j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4636j4
    public final void A01(boolean z) {
        if (!C3763Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == EnumC3854WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC4278dD.A01(this.A00.A04, this.A02, 0, new C4682jq(this));
    }
}
