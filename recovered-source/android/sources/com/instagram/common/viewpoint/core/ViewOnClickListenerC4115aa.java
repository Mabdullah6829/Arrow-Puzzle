package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aa */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4115aa implements View.OnClickListener {
    public final /* synthetic */ C3231M8 A00;

    public ViewOnClickListenerC4115aa(C3231M8 c3231m8) {
        this.A00 = c3231m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07.canGoForward()) {
                this.A00.A07.goForward();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
