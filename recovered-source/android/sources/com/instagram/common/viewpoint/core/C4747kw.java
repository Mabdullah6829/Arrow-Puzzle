package com.instagram.common.viewpoint.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4747kw implements InterfaceC3191LU<File> {
    @Override // com.instagram.common.viewpoint.core.InterfaceC3191LU
    public final C3190LT<File> A3x(File file, InterfaceC3209Lm interfaceC3209Lm) {
        if (file.exists()) {
            return new C3190LT<>(true, file);
        }
        return new C3190LT<>(false, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3191LU
    public final void A5D(File file, InterfaceC3209Lm interfaceC3209Lm) {
    }
}
