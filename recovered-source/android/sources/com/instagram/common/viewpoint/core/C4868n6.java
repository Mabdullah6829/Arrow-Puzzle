package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4868n6 implements InterfaceExecutorC2828Fb {
    public final /* synthetic */ InterfaceC213849 A00;
    public final /* synthetic */ Executor A01;

    public C4868n6(Executor executor, InterfaceC213849 interfaceC213849) {
        this.A01 = executor;
        this.A00 = interfaceC213849;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceExecutorC2828Fb
    public final void AHb() {
        this.A00.A39(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
