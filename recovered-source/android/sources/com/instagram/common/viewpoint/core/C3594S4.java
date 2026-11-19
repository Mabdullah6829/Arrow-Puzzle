package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3594S4 implements NativeAdViewApi {
    public static View A00(C4494gi c4494gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C3813Vd c3813Vd = (C3813Vd) nativeAdViewAttributes.getInternalAttributes();
        C3732UK internalNativeAd = C3732UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC3814Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c3813Vd);
        C23277C c23277c = new C23277C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c4494gi, c23277c);
        c23277c.A08(mediumRectTemplateLayout, c4494gi, nativeAd, c3813Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC3926XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C4494gi c4494gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C3732UK c3732ukA0L = C3732UK.A0L(nativeAd.getInternalNativeAd());
        C3813Vd c3813Vd = (C3813Vd) nativeAdViewAttributes.getInternalAttributes();
        c3732ukA0L.A1h(EnumC3814Ve.A0B);
        c3732ukA0L.A1g(c3813Vd);
        C23277C c23277c = new C23277C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c4494gi, c23277c);
        c23277c.A08(nativeAdLayout, c4494gi, nativeAd, c3813Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C3579Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return AbstractC4021Z4.A00(C3579Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C4494gi contextWrapper;
        try {
            if (context instanceof C4494gi) {
                contextWrapper = (C4494gi) context;
            } else {
                contextWrapper = C3579Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return AbstractC4021Z4.A00(C3579Rp.A03(context), th);
        }
    }
}
