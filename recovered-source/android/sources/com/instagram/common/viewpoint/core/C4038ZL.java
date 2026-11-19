package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4038ZL implements InterfaceC3725UD {
    public final /* synthetic */ String[] A00;

    public C4038ZL(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3725UD
    public final boolean A3A(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
