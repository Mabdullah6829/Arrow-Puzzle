package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2782Er extends AbstractRunnableC3871Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2775Ek A02;
    public final /* synthetic */ EnumC4436fm A03;

    public C2782Er(C2775Ek c2775Ek, EnumC4436fm enumC4436fm, int i2, int i3) {
        this.A02 = c2775Ek;
        this.A03 = enumC4436fm;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (this.A03 == EnumC4436fm.A07) {
            this.A02.A0M(EnumC3791VH.A0y);
            this.A02.A0B.A0F().A3j();
            this.A02.A0C.A02(C2775Ek.A0J);
            return;
        }
        if (this.A03 == EnumC4436fm.A03) {
            this.A02.A0M(EnumC3791VH.A0t);
            this.A02.A04 = true;
            this.A02.A0C.A02(C2775Ek.A0H);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC4436fm.A06) {
            this.A02.A0M(EnumC3791VH.A0s);
            this.A02.A0B.A0F().A3b();
            this.A02.A04 = true;
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0C.A02(new C21494K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC4436fm.A0A) {
            if (C3763Up.A1z(this.A02.A0B)) {
                this.A02.A0B.A0B().AGc();
            }
            this.A02.A0M(EnumC3791VH.A0w);
            this.A02.A0B.A0F().A3q();
            this.A02.A0C.A02(C2775Ek.A0I);
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC4436fm.A05) {
            this.A02.A0M(EnumC3791VH.A0v);
            this.A02.A0B.A0F().A3f();
            C3734UM c3734um = this.A02.A0C;
            final int i2 = this.A00;
            c3734um.A02(new AbstractC2740EB(i2) { // from class: com.facebook.ads.redexgen.X.4B
            });
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC4436fm.A04) {
            this.A02.A0M(EnumC3791VH.A0u);
            this.A02.A0B.A0F().A3c();
            this.A02.A0C.A02(C2775Ek.A0L);
            this.A02.A08.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC4436fm.A09) {
            this.A02.A0M(EnumC3791VH.A0s);
            this.A02.A0B.A0F().A3l();
            this.A02.A04 = true;
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0C.A02(new C21494K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
