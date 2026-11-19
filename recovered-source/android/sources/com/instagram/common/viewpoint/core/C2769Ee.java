package com.instagram.common.viewpoint.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2769Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C2770Ef A00;
    public final /* synthetic */ C24659h A01;

    public C2769Ee(C2770Ef c2770Ef, C24659h c24659h) {
        this.A00 = c2770Ef;
        this.A01 = c24659h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
