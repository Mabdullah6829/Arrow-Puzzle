package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3834W0 implements InterfaceC3805VV {
    public WeakReference<C3732UK> A00;

    public C3834W0(C3732UK c3732uk) {
        this.A00 = new WeakReference<>(c3732uk);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3805VV
    public final void AFB(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1o(z, false);
        }
    }
}
