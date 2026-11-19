package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21794o extends BroadcastReceiver {
    public final /* synthetic */ C21804p A00;

    public C21794o(C21804p c21804p) {
        this.A00 = c21804p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C21804p.A00(context);
        if (AbstractC22035C.A02 >= 31 && iA00 == 5) {
            C21774m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
