package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5T */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C22205T extends AbstractC2737E8 {
    public final /* synthetic */ C22195S A00;

    public C22205T(C22195S c22195s) {
        this.A00 = c22195s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2738E9 c2738e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4291dQ(this));
    }
}
