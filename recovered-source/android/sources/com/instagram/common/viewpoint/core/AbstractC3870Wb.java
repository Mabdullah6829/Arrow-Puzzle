package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3870Wb extends RelativeLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC3861WS> A01 = new AtomicReference<>();

    public static void A00(boolean z, InterfaceC3861WS interfaceC3861WS) {
        A00.set(z);
        A01.set(interfaceC3861WS);
    }
}
