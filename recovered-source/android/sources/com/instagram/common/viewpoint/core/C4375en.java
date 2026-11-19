package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.en */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4375en extends ViewOutlineProvider {
    public final /* synthetic */ C4378eq A00;

    public C4375en(C4378eq c4378eq) {
        this.A00 = c4378eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
