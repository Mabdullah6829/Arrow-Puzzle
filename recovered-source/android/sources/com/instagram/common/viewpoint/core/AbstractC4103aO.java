package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4103aO {
    public static C4098aJ A00(C4494gi c4494gi, boolean z, AbstractC4669jd abstractC4669jd, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh, EnumC4101aM enumC4101aM, InterfaceC4099aK interfaceC4099aK, EnumC4104aP enumC4104aP) {
        return new C4098aJ(c4494gi, z, abstractC4669jd, c3792vi, interfaceC3998Yh, enumC4101aM, interfaceC4099aK, enumC4104aP);
    }

    public static C4098aJ A01(C4494gi c4494gi, boolean z, AbstractC4669jd abstractC4669jd, C3792VI c3792vi, InterfaceC3998Yh interfaceC3998Yh, EnumC4101aM enumC4101aM, EnumC4104aP enumC4104aP) {
        return new C4098aJ(c4494gi, z, abstractC4669jd, c3792vi, interfaceC3998Yh, enumC4101aM, enumC4104aP);
    }

    public static C4102aN A02(C4494gi c4494gi, EnumC4101aM enumC4101aM, AbstractC4669jd abstractC4669jd) {
        return new C4102aN(c4494gi, enumC4101aM, abstractC4669jd);
    }

    public static C4111aW A03(C4494gi c4494gi, EnumC4101aM enumC4101aM, AbstractC4669jd abstractC4669jd, View view, EnumC3977YM enumC3977YM, NativeAdLayout nativeAdLayout, InterfaceC4099aK interfaceC4099aK) {
        return new C4111aW(c4494gi, enumC4101aM, abstractC4669jd, view, enumC3977YM, nativeAdLayout, interfaceC4099aK);
    }
}
