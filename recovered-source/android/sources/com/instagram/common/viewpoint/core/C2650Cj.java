package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2650Cj implements InterfaceC4481gV {
    @Override // com.instagram.common.viewpoint.core.InterfaceC4481gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4481gV
    public final void AK4(Object obj, long j2) throws InterruptedException {
        obj.wait(j2);
    }
}
