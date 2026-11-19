package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4851mo implements InterfaceC2948HY {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C4851mo(long[] jArr, long[] jArr2, long j2) {
        AbstractC21273y.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01 && jArr2[0] > 0) {
            int length2 = length + 1;
            this.A02 = new long[length2];
            int length3 = length + 1;
            this.A03 = new long[length3];
            System.arraycopy(jArr, 0, this.A02, 1, length);
            System.arraycopy(jArr2, 0, this.A03, 1, length);
        } else {
            this.A02 = jArr;
            this.A03 = jArr2;
        }
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        if (!this.A01) {
            return new C2947HX(C2949HZ.A04);
        }
        int iA0L = AbstractC22035C.A0L(this.A03, j2, true, true);
        C2949HZ c2949hz = new C2949HZ(this.A03[iA0L], this.A02[iA0L]);
        if (c2949hz.A01 != j2) {
            int targetIndex = this.A03.length;
            if (iA0L != targetIndex - 1) {
                int targetIndex2 = iA0L + 1;
                long j3 = this.A03[targetIndex2];
                int targetIndex3 = iA0L + 1;
                C2949HZ rightSeekPoint = new C2949HZ(j3, this.A02[targetIndex3]);
                return new C2947HX(c2949hz, rightSeekPoint);
            }
        }
        return new C2947HX(c2949hz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return this.A01;
    }
}
