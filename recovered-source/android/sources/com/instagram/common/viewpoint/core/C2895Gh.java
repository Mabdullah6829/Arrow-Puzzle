package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2895Gh implements InterfaceC4313dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2892Ge A01;

    public C2895Gh(C2892Ge c2892Ge, int i2) {
        this.A01 = c2892Ge;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void ADc(int i2) {
        C2892Ge.A03(this.A01, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void ADw(float f2) {
        if (!this.A01.A08) {
            this.A01.A0L(f2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void AGQ(String str) {
        this.A01.A0D.A0F().A3a(str);
        if (this.A01.A0A.A2H() && this.A01.A00 < this.A01.A0A.A23()) {
            this.A01.A0D.A0F().AC2();
            this.A01.A0X(false, this.A00);
        } else {
            this.A01.A0I.A4j(this.A01.A0J.A81());
            this.A01.A0M(3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void AKc() {
        this.A01.setUnskippableSecondsComplete(false);
        this.A01.A0H.setProgressImmediate(0.0f);
        this.A01.A0H.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4313dm
    public final void AKd(float f2) {
        this.A01.A0H.setProgress(100.0f * f2);
    }
}
