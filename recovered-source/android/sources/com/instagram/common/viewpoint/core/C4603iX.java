package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4603iX implements InterfaceC3373OR {
    public final /* synthetic */ C4604iY A00;
    public final /* synthetic */ C4601iV A01;

    public C4603iX(C4601iV c4601iV, C4604iY c4604iY) {
        this.A01 = c4601iV;
        this.A00 = c4604iY;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3373OR
    public final InterfaceC3372OQ A5S(InterfaceC3360OE interfaceC3360OE, AbstractC4616ik abstractC4616ik, HandlerC3367OL handlerC3367OL) {
        return new C4600iU(this.A00.A05(), this.A00, interfaceC3360OE, handlerC3367OL);
    }
}
