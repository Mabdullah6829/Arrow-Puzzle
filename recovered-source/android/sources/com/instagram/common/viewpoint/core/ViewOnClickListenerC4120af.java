package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4120af implements View.OnClickListener {
    public final /* synthetic */ C3229M6 A00;

    public ViewOnClickListenerC4120af(C3229M6 c3229m6) {
        this.A00 = c3229m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08.canGoForward()) {
                this.A00.A08.goForward();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
