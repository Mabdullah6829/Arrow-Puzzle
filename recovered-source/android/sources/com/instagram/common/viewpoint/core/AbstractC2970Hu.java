package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2970Hu {
    public final InterfaceC2953Hd A00;

    public abstract boolean A0B(C21864v c21864v) throws C20883K;

    public abstract boolean A0C(C21864v c21864v, long j2) throws C20883K;

    public AbstractC2970Hu(InterfaceC2953Hd interfaceC2953Hd) {
        this.A00 = interfaceC2953Hd;
    }

    public final boolean A00(C21864v c21864v, long j2) throws C20883K {
        return A0B(c21864v) && A0C(c21864v, j2);
    }
}
