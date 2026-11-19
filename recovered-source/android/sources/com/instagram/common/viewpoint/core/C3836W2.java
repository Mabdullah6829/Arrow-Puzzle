package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3836W2 implements InterfaceC4149b8 {
    public final /* synthetic */ C3833Vz A00;

    public C3836W2(C3833Vz c3833Vz) {
        this.A00 = c3833Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
    public final void AE7(C4148b7 c4148b7) {
        this.A00.A0G.set(c4148b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c4148b7.A00() != null);
        }
    }
}
