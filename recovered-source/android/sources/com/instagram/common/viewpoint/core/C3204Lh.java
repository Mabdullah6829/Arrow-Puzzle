package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3204Lh extends AbstractRunnableC3871Wc {
    public final WeakReference<C4439fp> A00;

    public C3204Lh(C4439fp c4439fp) {
        this.A00 = new WeakReference<>(c4439fp);
    }

    public C3204Lh(WeakReference<C4439fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        C4439fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
