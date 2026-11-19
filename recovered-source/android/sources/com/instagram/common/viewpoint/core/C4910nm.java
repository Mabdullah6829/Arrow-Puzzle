package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4910nm implements InterfaceC2696DT, InterfaceC2697DU {
    public final int A00;
    public final /* synthetic */ C24739p A01;

    public C4910nm(C24739p c24739p, int i2) {
        this.A01 = c24739p;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2697DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2696DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2696DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2696DT
    public final int AHP(C23146z c23146z, C4985p0 c4985p0, int i2) {
        return this.A01.A0Y(this.A00, c23146z, c4985p0, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2696DT
    public final int AK2(long j2) {
        return this.A01.A0X(this.A00, j2);
    }
}
