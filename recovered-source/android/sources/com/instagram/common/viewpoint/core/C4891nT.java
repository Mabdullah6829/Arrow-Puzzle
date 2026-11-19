package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4891nT implements InterfaceC3082Jj {
    public final long A00;
    public final AbstractC2570BP<C5014pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C4891nT(long j2, AbstractC2570BP<C5014pT> abstractC2570BP) {
        this.A00 = j2;
        this.A01 = abstractC2570BP;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        return j2 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        AbstractC21273y.A07(i2 == 0);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        return this.A00 > j2 ? 0 : -1;
    }
}
