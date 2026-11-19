package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3230M7 implements InterfaceC4132ar {
    public final /* synthetic */ C3229M6 A00;

    public C3230M7(C3229M6 c3229m6) {
        this.A00 = c3229m6;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4132ar
    public final void ADB(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0B && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4132ar
    public final void ADx(boolean z) {
        this.A00.A0D(z);
        if (this.A00.A0B && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
