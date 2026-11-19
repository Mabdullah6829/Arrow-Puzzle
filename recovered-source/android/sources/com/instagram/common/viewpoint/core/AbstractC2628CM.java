package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2628CM implements InterfaceC4488gc {
    public final EnumC4480gU A00;
    public final AbstractC20492d A01;

    public AbstractC2628CM(AbstractC20492d abstractC20492d, EnumC4480gU enumC4480gU) {
        this.A01 = abstractC20492d;
        this.A00 = enumC4480gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4488gc
    public void A4D(Map<InterfaceC4470gK, EnumC4493gh> map, Map<SyncModifiableBundle, EnumC4480gU> map2) {
        map2.put(null, this.A00);
    }
}
