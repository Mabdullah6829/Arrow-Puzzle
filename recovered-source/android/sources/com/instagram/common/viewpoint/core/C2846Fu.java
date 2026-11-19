package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2846Fu implements InterfaceC3574Rk {
    public final /* synthetic */ C3568Re A00;
    public final /* synthetic */ C21594U A01;

    public C2846Fu(C21594U c21594u, C3568Re c3568Re) {
        this.A01 = c21594u;
        this.A00 = c3568Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3574Rk
    public final boolean AAI() {
        if (!this.A01.A0i()) {
            if (this.A01.A0j()) {
                return true;
            }
            return this.A01.A0k();
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
