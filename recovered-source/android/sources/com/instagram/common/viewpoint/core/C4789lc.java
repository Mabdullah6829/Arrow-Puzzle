package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4789lc implements InterfaceC3082Jj {
    public final C3121KM A00;
    public final Map<String, C3128KT> A01;
    public final Map<String, String> A02;
    public final Map<String, C3122KN> A03;
    public final long[] A04;

    public C4789lc(C3121KM c3121km, Map<String, C3128KT> map, Map<String, C3122KN> map2, Map<String, String> imageMap) {
        this.A00 = c3121km;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c3121km.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        return this.A00.A0E(j2, this.A01, this.A03, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        return this.A04[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return this.A04.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        int iA0K = AbstractC22035C.A0K(this.A04, j2, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
