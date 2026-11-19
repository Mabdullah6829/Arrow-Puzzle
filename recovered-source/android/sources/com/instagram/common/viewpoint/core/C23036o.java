package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23036o extends AbstractC2737E8 {
    public final /* synthetic */ C22956g A00;

    public C23036o(C22956g c22956g) {
        this.A00 = c22956g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2738E9 c2738e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4014Yx(this));
    }
}
