package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4560hn implements InterfaceC3555RR {
    public final /* synthetic */ C23377M A00;

    public C4560hn(C23377M c23377m) {
        this.A00 = c23377m;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3555RR
    public final void AH9(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        this.A00.A1l(abstractC3548RK, c3525Qx, c3525Qx2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3555RR
    public final void AHB(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        this.A00.A0r.A0Y(abstractC3548RK);
        this.A00.A1m(abstractC3548RK, c3525Qx, c3525Qx2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3555RR
    public final void AHD(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        abstractC3548RK.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC3548RK, abstractC3548RK, c3525Qx, c3525Qx2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC3548RK, c3525Qx, c3525Qx2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3555RR
    public final void AKZ(AbstractC3548RK abstractC3548RK) {
        this.A00.A06.A1F(abstractC3548RK.A0H, this.A00.A0r);
    }
}
