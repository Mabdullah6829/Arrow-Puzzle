package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4376eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C4378eq A01;

    public C4376eo(C4378eq c4378eq, float f2) {
        this.A01 = c4378eq;
        this.A00 = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
