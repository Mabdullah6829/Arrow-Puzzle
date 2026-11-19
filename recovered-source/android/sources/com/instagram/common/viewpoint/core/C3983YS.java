package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3983YS {
    public static C3983YS A02;
    public final C3456Pp A00;
    public final C3985YU A01;

    public C3983YS(C4494gi c4494gi, Executor executor, C3709Tw c3709Tw) {
        this.A01 = new C3985YU(c4494gi);
        this.A00 = new C3456Pp(executor, c3709Tw, c4494gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C4494gi c4494gi, Executor executor, C3709Tw c3709Tw) {
        if (!C3763Up.A1c(c4494gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new C3983YS(c4494gi, executor, c3709Tw);
            A02.A00();
        } else {
            A02.A02(c3709Tw);
        }
    }

    private void A02(C3709Tw c3709Tw) {
        this.A00.A07(c3709Tw);
    }
}
