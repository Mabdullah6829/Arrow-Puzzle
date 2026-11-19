package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.NativeAdViewTypeApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3595S5 implements NativeAdViewTypeApi {
    public final EnumC3814Ve A00;

    public C3595S5(int i2) {
        this.A00 = EnumC3814Ve.A00(i2);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}
