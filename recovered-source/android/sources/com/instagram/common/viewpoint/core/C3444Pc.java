package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3444Pc implements InterfaceC3574Rk {
    public final /* synthetic */ C3441PZ A00;

    public C3444Pc(C3441PZ c3441pz) {
        this.A00 = c3441pz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3574Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
