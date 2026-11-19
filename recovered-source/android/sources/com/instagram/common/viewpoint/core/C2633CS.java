package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2633CS extends BroadcastReceiver {
    public final /* synthetic */ C2638CX A00;

    public C2633CS(C2638CX c2638cx) {
        this.A00 = c2638cx;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
