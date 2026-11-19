package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5041pv implements InterfaceC201424 {
    public final C20572n A00;
    public static String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final C5041pv A03 = new C20933P().A04();
    public static final String A04 = AbstractC22035C.A0h(0);
    public static final InterfaceC201323<C5041pv> A02 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pw
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5041pv.A01(bundle);
        }
    };

    public C5041pv(C20572n c20572n) {
        this.A00 = c20572n;
    }

    public static C5041pv A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        C20933P c20933p = new C20933P();
        int i2 = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i2 < size) {
                c20933p.A00(integerArrayList.get(i2).intValue());
                i2++;
            } else {
                return c20933p.A04();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5041pv)) {
                return false;
            }
            return this.A00.equals(((C5041pv) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
