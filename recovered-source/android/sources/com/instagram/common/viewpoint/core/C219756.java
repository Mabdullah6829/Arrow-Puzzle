package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.56 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C219756 extends AbstractC2737E8 {
    public final /* synthetic */ C219655 A00;

    public C219756(C219655 c219655) {
        this.A00 = c219655;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2738E9 c2738e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4308dh(this));
    }
}
