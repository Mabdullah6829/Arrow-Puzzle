package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3371OP {

    @Nullable
    public static HandlerC3370OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC3370OO A00(C4490ge c4490ge) {
        if (A00 == null) {
            A00 = new HandlerC3370OO(c4490ge);
        }
        return A00;
    }

    public static void A01(C4490ge c4490ge) {
        if (AbstractC3766Us.A0F(c4490ge)) {
            A03(c4490ge);
        }
    }

    public static void A02(C4490ge c4490ge) {
        if (AbstractC3766Us.A0E(c4490ge)) {
            A03(c4490ge);
        }
    }

    public static void A03(C4490ge c4490ge) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC3959Y4.A01.execute(new C4593iN(c4490ge));
        }
    }
}
