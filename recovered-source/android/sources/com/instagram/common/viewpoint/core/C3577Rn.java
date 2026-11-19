package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3577Rn implements BidderTokenProviderApi {
    public final C3639So A00 = new C3639So();

    public final C3639So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C3579Rp.A09(context));
    }
}
