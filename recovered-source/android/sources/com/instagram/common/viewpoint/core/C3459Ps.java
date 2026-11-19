package com.instagram.common.viewpoint.core;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ps */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3459Ps extends DataSetObserver {
    public final /* synthetic */ C3462Pv A00;

    public C3459Ps(C3462Pv c3462Pv) {
        this.A00 = c3462Pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0e();
    }
}
