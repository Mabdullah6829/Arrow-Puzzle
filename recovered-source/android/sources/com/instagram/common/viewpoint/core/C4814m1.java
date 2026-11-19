package com.instagram.common.viewpoint.core;

import androidx.work.WorkRequest;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4814m1 implements InterfaceC2948HY {
    public final /* synthetic */ C4813m0 A00;

    public C4814m1(C4813m0 c4813m0) {
        this.A00 = c4813m0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        long jA06 = this.A00.A0B.A06(j2);
        long j3 = this.A00.A09;
        long j4 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j5 = (j4 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = AbstractC22035C.A0T((j3 + (j5 / targetGranule2)) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, this.A00.A09, this.A00.A08 - 1);
        return new C2947HX(new C2949HZ(j2, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
