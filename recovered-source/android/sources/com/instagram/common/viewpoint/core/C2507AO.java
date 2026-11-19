package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2507AO implements InterfaceC22255Y {
    public InterfaceC22465t A02;
    public InterfaceC4735kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C22415o A07 = new C22415o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final C2507AO A00(InterfaceC22465t interfaceC22465t) {
        this.A02 = interfaceC22465t;
        return this;
    }

    public final C2507AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22255Y
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C19941k A5I() {
        C19941k c19941k = new C19941k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c19941k.A43(this.A02);
        }
        return c19941k;
    }
}
