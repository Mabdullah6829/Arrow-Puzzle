package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4696k4 implements InterfaceC3612SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C237881 A01;
    public final /* synthetic */ C237881 A02;
    public final /* synthetic */ C3710Tx A03;

    public C4696k4(C237881 c237881, int i2, C3710Tx c3710Tx, C237881 c237882) {
        this.A01 = c237881;
        this.A00 = i2;
        this.A03 = c3710Tx;
        this.A02 = c237882;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACy() {
        this.A01.A00.AEN(this.A02, C3821Vm.A00(AdErrorType.NO_FILL));
    }
}
