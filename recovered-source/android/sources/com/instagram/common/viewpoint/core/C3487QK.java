package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3487QK implements InterfaceC3946Xr {
    public final Collection<String> A00;

    public C3487QK() {
        this.A00 = new ArrayList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void AH8(String str) {
        this.A00.add(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
