package com.instagram.common.viewpoint.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4871n9 implements InterfaceC2806FF {
    public final int A00;

    public C4871n9() {
        this(-1);
    }

    public C4871n9(int i2) {
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2806FF
    public final int A8Z(int i2) {
        if (this.A00 == -1) {
            if (i2 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2806FF
    public final long A8u(C2805FE c2805fe) {
        IOException iOException = c2805fe.A03;
        if ((iOException instanceof C20883K) || (iOException instanceof FileNotFoundException) || (iOException instanceof C2505AM) || (iOException instanceof C2816FP) || C22285b.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c2805fe.A00 - 1) * 1000, 5000);
    }
}
