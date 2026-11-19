package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3862WT {
    public static void A00(AbstractRunnableC3858WP abstractRunnableC3858WP) {
        new Handler(Looper.getMainLooper()).post(abstractRunnableC3858WP);
    }
}
