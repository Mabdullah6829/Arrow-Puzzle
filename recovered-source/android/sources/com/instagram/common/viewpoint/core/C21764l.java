package com.instagram.common.viewpoint.core;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4l */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C21764l extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C21804p A00;

    public C21764l(C21804p c21804p) {
        this.A00 = c21804p;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}
