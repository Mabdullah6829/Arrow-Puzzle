package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2627CL implements InterfaceC4488gc {
    public final C2642Cb A00;
    public final EnumC4493gh A01;

    public AbstractC2627CL(C2642Cb c2642Cb, EnumC4493gh enumC4493gh) {
        this.A00 = c2642Cb;
        this.A01 = enumC4493gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4488gc
    public void A4D(Map<InterfaceC4470gK, EnumC4493gh> map, Map<SyncModifiableBundle, EnumC4480gU> map2) {
        map.put(this.A00, this.A01);
    }
}
