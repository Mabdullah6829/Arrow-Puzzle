package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4046ZT extends View {

    @Nullable
    public InterfaceC4045ZS A00;

    public C4046ZT(C4494gi c4494gi, InterfaceC4045ZS interfaceC4045ZS) {
        super(c4494gi);
        this.A00 = interfaceC4045ZS;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        InterfaceC4045ZS interfaceC4045ZS = this.A00;
    }
}
