package com.instagram.common.viewpoint.core;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3519Qr extends Observable<AbstractC3520Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC3520Qs) this.mObservers.get(size)).A00();
        }
    }
}
