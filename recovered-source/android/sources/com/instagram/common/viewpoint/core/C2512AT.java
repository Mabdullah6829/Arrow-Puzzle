package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2512AT extends AbstractC5039pt {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC22035C.A0h(1);
    public static final String A03 = AbstractC22035C.A0h(2);
    public static final InterfaceC201323<C2512AT> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pr
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C2512AT.A00(bundle);
        }
    };

    public C2512AT() {
        this.A01 = false;
        this.A00 = false;
    }

    public C2512AT(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C2512AT A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC5039pt.A02, -1) == 3;
        AbstractC21273y.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C2512AT(bundle.getBoolean(A03, false));
        }
        return new C2512AT();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2512AT)) {
            return false;
        }
        C2512AT c2512at = (C2512AT) obj;
        return this.A00 == c2512at.A00 && this.A01 == c2512at.A01;
    }

    public final int hashCode() {
        return AbstractC2617CB.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
