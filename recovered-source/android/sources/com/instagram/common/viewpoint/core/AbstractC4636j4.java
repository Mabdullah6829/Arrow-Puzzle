package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4636j4 implements InterfaceC3640Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC4636j4(boolean z) {
        this.A00 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADT() {
        A01(true);
    }
}
