package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4557hk implements InterfaceC3524Qw {
    public final /* synthetic */ C23377M A00;

    public C4557hk(C23377M c23377m) {
        this.A00 = c23377m;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3524Qw
    public final void ACv(AbstractC3548RK abstractC3548RK) {
        abstractC3548RK.A0d(true);
        if (abstractC3548RK.A06 != null && abstractC3548RK.A07 == null) {
            abstractC3548RK.A06 = null;
        }
        abstractC3548RK.A07 = null;
        if (!abstractC3548RK.A0G() && !this.A00.A1x(abstractC3548RK.A0H) && abstractC3548RK.A0i()) {
            this.A00.removeDetachedView(abstractC3548RK.A0H, false);
        }
    }
}
