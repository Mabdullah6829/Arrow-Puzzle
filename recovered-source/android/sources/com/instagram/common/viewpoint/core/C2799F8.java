package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2799F8 implements InterfaceC4464gE {
    public final /* synthetic */ C4362ea A00;

    public C2799F8(C4362ea c4362ea) {
        this.A00 = c4362ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4464gE
    public final void AHA() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4j(this.A00.A03.A94());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4464gE
    public final void AHC(C4466gG c4466gG) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c4466gG == null || !c4466gG.A00()) {
            this.A00.A01.A0F().ABv();
            this.A00.A02.A4j(this.A00.A03.A94());
        } else {
            this.A00.A01.A0F().ABw();
            this.A00.A02.A4j(this.A00.A03.A95());
        }
    }
}
