package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3139Ke implements InterfaceC4149b8 {
    public final WeakReference<C22756M> A00;

    public C3139Ke(C22756M c22756m) {
        this.A00 = new WeakReference<>(c22756m);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
    public final void AE7(C4148b7 c4148b7) {
        C22756M c22756m = this.A00.get();
        if (c22756m != null) {
            c22756m.A04 = c4148b7.A00() != null;
            c22756m.A02();
        }
    }
}
