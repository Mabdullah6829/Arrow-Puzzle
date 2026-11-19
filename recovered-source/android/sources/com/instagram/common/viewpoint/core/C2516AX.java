package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2516AX extends AbstractC5039pt {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC22035C.A0h(1);
    public static final String A03 = AbstractC22035C.A0h(2);
    public static final InterfaceC201323<C2516AX> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qH
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C2516AX.A00(bundle);
        }
    };

    public C2516AX() {
        this.A01 = false;
        this.A00 = false;
    }

    public C2516AX(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C2516AX A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC5039pt.A02, -1) == 0;
        AbstractC21273y.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C2516AX(bundle.getBoolean(A03, false));
        }
        return new C2516AX();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2516AX)) {
            return false;
        }
        C2516AX c2516ax = (C2516AX) obj;
        return this.A00 == c2516ax.A00 && this.A01 == c2516ax.A01;
    }

    public final int hashCode() {
        return AbstractC2617CB.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
