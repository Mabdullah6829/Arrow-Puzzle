package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5069qP implements InterfaceC21053b {
    public final C5029pj A00 = new C5029pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i2, long j2);

    public final int A00() {
        long jA77 = A77();
        long jA7s = A7s();
        if (jA77 == -9223372036854775807L || jA7s == -9223372036854775807L) {
            return 0;
        }
        if (jA7s == 0) {
            return 100;
        }
        return AbstractC22035C.A07((int) ((100 * jA77) / jA7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i2) {
        A0H(i2, -9223372036854775807L);
    }

    public final void A04(long j2) {
        A0H(A7h(), j2);
    }
}
