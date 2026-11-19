package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4191bo implements InterfaceC3662TB {
    public final C3659T8 A00;

    public AbstractC4191bo(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
    public final Map<String, String> A5a() {
        return C3720U8.A01(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
    public final Map<String, String> A6w() {
        return C3700Tn.A02();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
    public final String A8L() {
        return C3700Tn.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
    public final String A8N() {
        return AbstractC3625SZ.A00().A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
    public final boolean AAU() {
        return C3893X0.A00().A03();
    }
}
