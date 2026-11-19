package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2767Ec implements Comparable<C2767Ec> {
    public final boolean A00;
    public final boolean A01;

    public C2767Ec(C5064qI c5064qI, int i2) {
        this.A00 = (c5064qI.A0H & 1) != 0;
        this.A01 = C24659h.A0S(i2, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2767Ec c2767Ec) {
        return AbstractC4916ns.A01().A09(this.A01, c2767Ec.A01).A09(this.A00, c2767Ec.A00).A05();
    }
}
