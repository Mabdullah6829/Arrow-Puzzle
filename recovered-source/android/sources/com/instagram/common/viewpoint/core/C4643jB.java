package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4643jB implements InterfaceC3612SM {
    public final /* synthetic */ C3340Nu A00;

    public C4643jB(C3340Nu c3340Nu) {
        this.A00 = c3340Nu;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACx() {
        this.A00.A04.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3612SM
    public final void ACy() {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }
}
