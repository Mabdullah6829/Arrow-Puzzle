package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4091aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C4098aJ A01;

    public C4091aC(C4098aJ c4098aJ, float f2) {
        this.A01 = c4098aJ;
        this.A00 = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(AbstractC3924XV.A00, AbstractC3924XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
