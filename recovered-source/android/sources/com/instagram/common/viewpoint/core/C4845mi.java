package com.instagram.common.viewpoint.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4845mi extends AbstractC2916H2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4845mi(final C2933HJ c2933hj, int i2, long j2, long j3) {
        super(new InterfaceC2911Gx() { // from class: com.facebook.ads.redexgen.X.mk
            @Override // com.instagram.common.viewpoint.core.InterfaceC2911Gx
            public final long AKQ(long j4) {
                return c2933hj.A07(j4);
            }
        }, new C4846mj(c2933hj, i2), c2933hj.A06(), 0L, c2933hj.A09, j2, j3, c2933hj.A05(), Math.max(6, c2933hj.A06));
        Objects.requireNonNull(c2933hj);
    }
}
