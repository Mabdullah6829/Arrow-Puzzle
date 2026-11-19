package com.instagram.common.viewpoint.core;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2795F4 {
    public final CopyOnWriteArrayList<C2794F3> A00 = new CopyOnWriteArrayList<>();

    public final void A00(int i2, long j2, long j3) {
        Iterator<C2794F3> it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            C2794F3.A02(null);
            throw null;
        }
    }
}
