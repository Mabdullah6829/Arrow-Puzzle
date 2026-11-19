package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.br */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4194br {
    public static final int A00 = AbstractC3966YB.A00();

    public static void A00(C4494gi c4494gi, ViewGroup viewGroup, String str) {
        new AsyncTaskC3183LM(viewGroup, c4494gi).A07(str);
        View view = new View(c4494gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC3966YB.A0U(view, c4494gi);
        viewGroup.addView(view, 0);
    }
}
