package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3994Yd implements View.OnClickListener {
    public final /* synthetic */ C3446Pe A00;

    public ViewOnClickListenerC3994Yd(C3446Pe c3446Pe) {
        this.A00 = c3446Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
