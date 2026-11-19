package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23136y implements InterfaceC3708Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C23136y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3799VP
    public final void ACm() {
        AbstractC3862WT.A00(new C3703Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3799VP
    public final void ACq() {
        AbstractC3862WT.A00(new C3704Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3799VP
    public final void ADp(C3821Vm c3821Vm) {
        AbstractC3862WT.A00(new C3706Tt(this, c3821Vm));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3799VP
    public final void AEl() {
        AbstractC3862WT.A00(new C3702Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3708Tv
    public final void AEq() {
        AbstractC3862WT.A00(new C3705Ts(this));
    }
}
