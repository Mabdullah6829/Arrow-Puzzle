package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3878Wj {
    public static final AtomicReference<InterfaceC3877Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC3877Wi A00() {
        InterfaceC3877Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new C3529R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC3877Wi interfaceC3877Wi) {
        A00.set(interfaceC3877Wi);
    }
}
