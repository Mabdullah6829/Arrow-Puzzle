package com.instagram.common.viewpoint.core;

import android.graphics.Paint;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4405fH extends Paint {
    public final /* synthetic */ C4406fI A00;
    public final /* synthetic */ boolean A01;

    public C4405fH(C4406fI c4406fI, boolean z) {
        this.A00 = c4406fI;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
