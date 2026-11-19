package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2713Dk extends AbstractC3735UN<C21394A> {
    public final /* synthetic */ C2712Dj A00;

    public C2713Dk(C2712Dj c2712Dj) {
        this.A00 = c2712Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C21394A c21394a) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.setText(this.A00.A02(this.A00.A00.getDuration() - this.A00.A00.getCurrentPositionInMillis()));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    public final Class<C21394A> A01() {
        return C21394A.class;
    }
}
