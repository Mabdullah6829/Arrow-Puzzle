package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4138ax implements InterfaceC3663TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C4129ao A01;

    public C4138ax(C4129ao c4129ao, AdvertisingId advertisingId) {
        this.A01 = c4129ao;
        this.A00 = advertisingId;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3663TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3663TC
    public final String getId() {
        return this.A00.getId();
    }
}
