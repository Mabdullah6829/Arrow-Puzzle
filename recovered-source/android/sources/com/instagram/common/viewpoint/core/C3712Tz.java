package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3712Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC3823Vp A01;

    public C3712Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC3823Vp enumC3823Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC3823Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}
