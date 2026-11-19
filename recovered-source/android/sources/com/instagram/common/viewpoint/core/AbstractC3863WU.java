package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3863WU {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC3861WS> A02 = new AtomicReference<>();

    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC3878Wj.A00().AAx(3306, th);
            InterfaceC3861WS contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AIZ(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC3861WS interfaceC3861WS) {
        A01.set(z);
        A02.set(interfaceC3861WS);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
