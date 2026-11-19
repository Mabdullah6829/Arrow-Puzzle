package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.la */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4787la implements InterfaceC3082Jj {
    public final List<C5014pT> A00;

    public C4787la(List<C5014pT> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        AbstractC21273y.A07(i2 == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}
