package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4063Zk implements View.OnClickListener {
    public final /* synthetic */ C3237ME A00;

    public ViewOnClickListenerC4063Zk(C3237ME c3237me) {
        this.A00 = c3237me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(EnumC3390Oi.A06);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
