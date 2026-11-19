package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pe */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5025pe implements InterfaceC201424 {
    public final C5027pg A00;
    public final AbstractC2570BP<Integer> A01;
    public static final String A04 = AbstractC22035C.A0h(0);
    public static final String A03 = AbstractC22035C.A0h(1);
    public static final InterfaceC201323<C5025pe> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5025pe.A00(bundle);
        }
    };

    public C5025pe(C5027pg c5027pg, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c5027pg.A01)) {
            this.A00 = c5027pg;
            this.A01 = AbstractC2570BP.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C5025pe A00(Bundle bundle) {
        return new C5025pe((C5027pg) C5027pg.A06.A6f((Bundle) AbstractC21273y.A01(bundle.getBundle(A04))), AbstractC2537As.A09((int[]) AbstractC21273y.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5025pe c5025pe = (C5025pe) obj;
        return this.A00.equals(c5025pe.A00) && this.A01.equals(c5025pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
