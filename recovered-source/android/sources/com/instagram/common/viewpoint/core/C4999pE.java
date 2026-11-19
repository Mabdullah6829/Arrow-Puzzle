package com.instagram.common.viewpoint.core;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Deprecated
public final class C4999pE implements InterfaceC22255Y {
    public final Context A00;
    public final InterfaceC22255Y A01;
    public final InterfaceC22465t A02;

    public C4999pE(Context context, InterfaceC22465t interfaceC22465t, InterfaceC22255Y interfaceC22255Y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC22465t;
        this.A01 = interfaceC22255Y;
    }

    public C4999pE(Context context, String str, InterfaceC22465t interfaceC22465t) {
        this(context, interfaceC22465t, new C2507AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC22255Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2508AP A5I() {
        C2508AP c2508ap = new C2508AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            c2508ap.A43(this.A02);
        }
        return c2508ap;
    }
}
