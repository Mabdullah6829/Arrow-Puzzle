package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC2772Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2772Eh<T extends AbstractC2772Eh<T>> {
    public final int A00;
    public final int A01;
    public final C5064qI A02;
    public final C5027pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC2772Eh(int i2, C5027pg c5027pg, int i3) {
        this.A00 = i2;
        this.A03 = c5027pg;
        this.A01 = i3;
        this.A02 = c5027pg.A08(i3);
    }
}
