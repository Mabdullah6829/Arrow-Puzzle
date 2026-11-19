package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3185LO {
    public final int A00;
    public final long A01;

    public C3185LO(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public static C3185LO A00(InterfaceC4855ms interfaceC4855ms, C21864v c21864v) throws IOException {
        interfaceC4855ms.AGt(c21864v.A0l(), 0, 8);
        c21864v.A0f(0);
        int iA0C = c21864v.A0C();
        long size = c21864v.A0O();
        return new C3185LO(iA0C, size);
    }
}
