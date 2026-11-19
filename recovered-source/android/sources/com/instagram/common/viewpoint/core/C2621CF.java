package com.instagram.common.viewpoint.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2621CF implements InterfaceC4550hc {
    public static final C2621CF A00 = new C2621CF();

    public static C2621CF A00() {
        return A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4550hc
    public final long ACf() {
        return SystemClock.elapsedRealtime();
    }
}
