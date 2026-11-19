package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2865GD implements InterfaceC4325dy {
    public final /* synthetic */ C2863GB A00;

    public C2865GD(C2863GB c2863gb) {
        this.A00 = c2863gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4325dy
    public final void AIY() {
        this.A00.A0B();
        if (!this.A00.A0E || this.A00.A01 == null) {
            if (this.A00.A07 == null) {
                this.A00.A0C.A4j(this.A00.A0D.A81());
                this.A00.A0C.A4j(this.A00.A0D.A7w());
                return;
            }
            this.A00.A04 = this.A00.A05(this.A00.A0D, this.A00.A07, Boolean.valueOf(this.A00.A05.A1n()));
            if (this.A00.A02 != null && this.A00.A00 != null) {
                this.A00.A04.AAu(this.A00.A02, this.A00.A03, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof C3255MW) {
            this.A00.A04 = this.A00.A01;
            ((C3255MW) this.A00.A04).A0b();
        }
    }
}
