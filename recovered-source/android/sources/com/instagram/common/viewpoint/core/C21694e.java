package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4e */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C21694e extends AbstractC2737E8 {
    public final /* synthetic */ C21604V A00;

    public C21694e(C21604V c21604v) {
        this.A00 = c21604v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2738E9 c2738e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4321du(this));
    }
}
