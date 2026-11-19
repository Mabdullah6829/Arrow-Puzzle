package com.instagram.common.viewpoint.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.es */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4380es extends ContentObserver {
    public final C2744EF A00;

    public C4380es(Handler handler, C2744EF c2744ef) {
        super(handler);
        this.A00 = c2744ef;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0f();
    }
}
