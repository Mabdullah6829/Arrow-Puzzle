package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4049ZW implements InterfaceC4485gZ {
    public final /* synthetic */ C4490ge A00;
    public final /* synthetic */ C3844WA A01;

    public C4049ZW(C3844WA c3844wa, C4490ge c4490ge) {
        this.A01 = c3844wa;
        this.A00 = c4490ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4485gZ
    public final Map<String, String> A7z() {
        return this.A01.A0A(C3728UG.A00().A01(this.A00, true).A06());
    }
}
