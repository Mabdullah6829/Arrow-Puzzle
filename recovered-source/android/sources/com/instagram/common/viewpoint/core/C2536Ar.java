package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ar */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2536Ar implements InterfaceC5126rY {
    public final List<InterfaceC5127rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC5126rY
    public final InterfaceC5127rZ A6i(int i2) {
        this.A00.get(i2);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC5127rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5126rY
    public final int size() {
        return this.A00.size();
    }
}
