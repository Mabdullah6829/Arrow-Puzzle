package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3728UG {
    public static C3728UG A00 = new C3728UG();

    public static C3728UG A00() {
        return A00;
    }

    public final C4036ZJ A01(C3659T8 c3659t8, boolean z) {
        return new C4036ZJ(c3659t8, z, new C3638Sn());
    }

    public final Map<String, String> A02(C3659T8 c3659t8) {
        try {
            return A01(c3659t8, false).A06();
        } catch (Throwable th) {
            c3659t8.A08().A4I(th);
            return C3720U8.A01(c3659t8);
        }
    }
}
