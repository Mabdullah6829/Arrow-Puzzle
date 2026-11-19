package com.instagram.common.viewpoint.core;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3504Qb implements Comparator<C3505Qc> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C3505Qc c3505Qc, C3505Qc c3505Qc2) {
        if ((c3505Qc.A03 == null) != (c3505Qc2.A03 == null)) {
            C23377M c23377m = c3505Qc.A03;
            if (A00[1].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c23377m == null ? 1 : -1;
        }
        if (c3505Qc.A04 != c3505Qc2.A04) {
            return c3505Qc.A04 ? -1 : 1;
        }
        int i2 = c3505Qc2.A02 - c3505Qc.A02;
        if (i2 != 0) {
            return i2;
        }
        int i3 = c3505Qc.A00;
        int deltaViewVelocity = c3505Qc2.A00;
        int i4 = i3 - deltaViewVelocity;
        if (i4 != 0) {
            return i4;
        }
        return 0;
    }
}
