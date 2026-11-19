package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ae */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4119ae implements View.OnClickListener {
    public final /* synthetic */ C3229M6 A00;

    public ViewOnClickListenerC4119ae(C3229M6 c3229m6) {
        this.A00 = c3229m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08.canGoBack()) {
                this.A00.A08.goBack();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
