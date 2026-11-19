package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3260Mb implements InterfaceC3916XN {
    public final /* synthetic */ C3255MW A00;

    public C3260Mb(C3255MW c3255mw) {
        this.A00 = c3255mw;
    }

    public /* synthetic */ C3260Mb(C3255MW c3255mw, C3271Mm c3271Mm) {
        this(c3255mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A00.A0D();
        if (!this.A00.A0R.get()) {
            if (this.A00.A0T || !this.A00.A0D) {
                if (this.A00.A0H.A0V()) {
                    this.A00.A0U.setToolbarActionMode(1);
                    return;
                } else {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            this.A00.A0U.setToolbarActionMode(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        if (this.A00.A0H.A0A() > 0 && f2 == this.A00.A0H.A0A()) {
            this.A00.A0U.setToolbarActionMode(8);
        }
    }
}
