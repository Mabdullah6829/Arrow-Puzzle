package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.C3733UL;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3735UN<T extends C3733UL> {
    public abstract Class<T> A01();

    public abstract void A03(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UN != com.facebook.ads.internal.events.EventSubscriber<T extends com.facebook.ads.redexgen.X.UL> */
    public final boolean A00(T event) {
        return true;
    }
}
