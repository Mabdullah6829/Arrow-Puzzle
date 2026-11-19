package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Y9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3964Y9 extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public C3964Y9(float f2) {
        this.A00 = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(AbstractC3924XV.A00, AbstractC3924XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
