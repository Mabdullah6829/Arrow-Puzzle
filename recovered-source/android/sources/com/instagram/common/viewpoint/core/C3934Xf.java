package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3934Xf implements ViewpointAction<C3770Uw, C3775V1> {
    public C3915XM A00;

    public C3934Xf(C3915XM c3915xm) {
        this.A00 = c3915xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6R(C5115rN<C3770Uw, C3775V1> c5115rN, InterfaceC5105rD interfaceC5105rD) {
        switch (interfaceC5105rD.A9U(c5115rN)) {
            case A02:
            case A04:
                this.A00.A02(c5115rN, interfaceC5105rD);
                break;
        }
    }
}
