package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3837W3 implements InterfaceC3807VX {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C3833Vz A01;

    public C3837W3(C3833Vz c3833Vz, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c3833Vz;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3807VX
    public final void AJU() {
        this.A01.A00 = 0.0f;
        this.A00.setVolume(0.0f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3807VX
    public final void AJZ(NativeAd nativeAd) {
        this.A01.A02 = nativeAd.getNativeOptions();
        this.A01.A0G();
        this.A01.A0H();
        this.A01.A0Q(C3732UK.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3807VX
    public final void AKY() {
        this.A01.A0J();
    }
}
