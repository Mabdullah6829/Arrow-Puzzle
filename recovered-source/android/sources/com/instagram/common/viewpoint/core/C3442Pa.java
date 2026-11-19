package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pa */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3442Pa implements InterfaceC4131aq {
    public final /* synthetic */ C3441PZ A00;

    public C3442Pa(C3441PZ c3441pz) {
        this.A00 = c3441pz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF7(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF9(String str) {
        this.A00.A05 = true;
        this.A00.A0F.setUrl(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFY(int i2) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFb(String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}
