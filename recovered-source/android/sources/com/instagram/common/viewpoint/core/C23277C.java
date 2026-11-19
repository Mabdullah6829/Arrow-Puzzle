package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23277C extends C4523hB {
    public InterfaceC4366ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C4494gi c4494gi, NativeAd nativeAd, C3813Vd c3813Vd) {
        C4187bk c4187bk = new C4187bk(c4494gi);
        MediaView mediaView = new MediaView(c4494gi);
        AdOptionsView adOptionsView = new AdOptionsView(c4494gi, nativeAd, nativeAdLayout);
        c3813Vd.A09(adOptionsView, 28);
        this.A00 = new C2793F2(c4494gi, nativeAd, c3813Vd, C3732UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c4187bk, mediaView, adOptionsView);
        AbstractC3966YB.A0N(nativeAdLayout, c3813Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c4187bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C3576Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
