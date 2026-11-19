package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5020pZ implements InterfaceC201424 {
    public final int A00;
    public final C5027pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = AbstractC22035C.A0h(0);
    public static final String A09 = AbstractC22035C.A0h(1);
    public static final String A08 = AbstractC22035C.A0h(3);
    public static final String A06 = AbstractC22035C.A0h(4);
    public static final InterfaceC201323<C5020pZ> A05 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5020pZ.A00(bundle);
        }
    };

    public C5020pZ(C5027pg c5027pg, boolean z, int[] iArr, boolean[] zArr) {
        this.A00 = c5027pg.A01;
        boolean z2 = false;
        AbstractC21273y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c5027pg;
        if (z && this.A00 > 1) {
            z2 = true;
        }
        this.A02 = z2;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C5020pZ A00(Bundle bundle) {
        C5027pg c5027pg = (C5027pg) C5027pg.A06.A6f((Bundle) AbstractC21273y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC4727ka.A00(bundle.getIntArray(A09), new int[c5027pg.A01]);
        boolean[] selected = (boolean[]) AbstractC4727ka.A00(bundle.getBooleanArray(A08), new boolean[c5027pg.A01]);
        return new C5020pZ(c5027pg, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5020pZ c5020pZ = (C5020pZ) obj;
        if (this.A02 == c5020pZ.A02 && this.A01.equals(c5020pZ.A01) && Arrays.equals(this.A03, c5020pZ.A03) && Arrays.equals(this.A04, c5020pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
