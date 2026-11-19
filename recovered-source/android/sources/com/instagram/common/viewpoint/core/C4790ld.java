package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ld */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4790ld implements InterfaceC3082Jj {
    public final long[] A00;
    public final C5014pT[] A01;

    public C4790ld(C5014pT[] c5014pTArr, long[] jArr) {
        this.A01 = c5014pTArr;
        this.A00 = jArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        int iA0L = AbstractC22035C.A0L(this.A00, j2, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C5014pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        boolean z = true;
        AbstractC21273y.A07(i2 >= 0);
        if (i2 >= this.A00.length) {
            z = false;
        }
        AbstractC21273y.A07(z);
        return this.A00[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        int iA0K = AbstractC22035C.A0K(this.A00, j2, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
