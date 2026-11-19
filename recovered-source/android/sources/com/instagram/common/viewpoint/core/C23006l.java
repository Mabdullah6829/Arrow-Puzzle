package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6l */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23006l implements Comparable<C23006l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C23547d A03;

    public C23006l(C23547d c23547d) {
        this.A03 = c23547d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C23006l c23006l) {
        if ((this.A02 == null) != (c23006l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i2 = this.A00 - c23006l.A00;
        if (i2 != 0) {
            return i2;
        }
        int comparePeriodIndex = AbstractC22035C.A08(this.A01, c23006l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i2, long j2, Object obj) {
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = obj;
    }
}
