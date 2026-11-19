package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4726kZ implements InterfaceC3220Lx {
    public final InterfaceC3217Lu A00;

    public C4726kZ(InterfaceC3217Lu interfaceC3217Lu) {
        this.A00 = interfaceC3217Lu;
    }

    public final InterfaceC3217Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3220Lx
    public final C23968J ACL() {
        return new C23968J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3220Lx
    public final C4730kd ACM() {
        return new C4730kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3220Lx
    public final C4730kd ACN(String str) {
        return new C4730kd(this, str);
    }
}
