package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4183bg implements View.OnClickListener {
    public final /* synthetic */ C4185bi A00;

    public ViewOnClickListenerC4183bg(C4185bi c4185bi) {
        this.A00 = c4185bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
