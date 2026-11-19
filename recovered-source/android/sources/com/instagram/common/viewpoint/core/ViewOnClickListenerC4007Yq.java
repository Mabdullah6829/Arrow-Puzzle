package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4007Yq implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC4007Yq(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 != null && this.A00.A09.A06()) {
                this.A00.A02.ACl(this.A00);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
