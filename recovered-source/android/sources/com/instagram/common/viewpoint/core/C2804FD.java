package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2804FD extends C4188bl {
    public final ImageView A00;
    public final C4494gi A01;

    public C2804FD(C4494gi c4494gi) {
        super(c4494gi);
        this.A01 = c4494gi;
        this.A00 = new ImageView(c4494gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC3183LM downloadImageTask = new AsyncTaskC3183LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
