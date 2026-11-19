package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4072Zt implements View.OnClickListener {
    public final /* synthetic */ C4074Zv A00;

    public ViewOnClickListenerC4072Zt(C4074Zv c4074Zv) {
        this.A00 = c4074Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
