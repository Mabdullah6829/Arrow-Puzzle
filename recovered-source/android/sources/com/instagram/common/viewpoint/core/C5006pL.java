package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5006pL implements InterfaceC213445 {
    @Override // com.instagram.common.viewpoint.core.InterfaceC213445
    public final C5004pJ A5P(Looper looper, Handler.Callback callback) {
        return new C5004pJ(new Handler(looper, callback));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC213445
    public final long A6J() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC213445
    public final long AKe() {
        return SystemClock.uptimeMillis();
    }
}
