package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4690jy implements InterfaceC4018Z1 {
    public final /* synthetic */ C237780 A00;
    public final /* synthetic */ C232176 A01;

    public C4690jy(C237780 c237780, C232176 c232176) {
        this.A00 = c237780;
        this.A01 = c232176;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4018Z1
    public final void AEA() {
        this.A01.A0F().A4Q(this.A00.A03 != null);
        if (this.A00.A03 != null) {
            this.A00.A03.A03();
        }
    }
}
