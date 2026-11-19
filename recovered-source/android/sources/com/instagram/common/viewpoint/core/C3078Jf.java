package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3078Jf implements InterfaceC4149b8 {
    public final WeakReference<AbstractC226067> A00;

    public C3078Jf(AbstractC226067 abstractC226067) {
        this.A00 = new WeakReference<>(abstractC226067);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
    public final void AE7(C4148b7 c4148b7) {
        AbstractC226067 abstractC226067 = this.A00.get();
        if (abstractC226067 != null) {
            abstractC226067.A06 = c4148b7.A00() != null;
            abstractC226067.A02();
        }
    }
}
