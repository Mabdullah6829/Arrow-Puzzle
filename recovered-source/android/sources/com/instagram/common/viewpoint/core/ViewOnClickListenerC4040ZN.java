package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4040ZN implements View.OnClickListener {
    public final /* synthetic */ C3241MI A00;

    public ViewOnClickListenerC4040ZN(C3241MI c3241mi) {
        this.A00 = c3241mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ADv();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
