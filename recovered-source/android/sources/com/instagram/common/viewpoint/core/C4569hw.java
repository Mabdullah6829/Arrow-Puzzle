package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4569hw implements InterfaceC3480QD {
    public final /* synthetic */ C23417Q A00;
    public final /* synthetic */ C3475Q8 A01;

    public C4569hw(C23417Q c23417q, C3475Q8 c3475q8) {
        this.A00 = c23417q;
        this.A01 = c3475q8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3480QD
    public final Object A5G(int i2) {
        C3473Q6 compatInfo = this.A01.A00(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3480QD
    public final List<Object> A6Y(String str, int i2) {
        List<C3473Q6> listA03 = this.A01.A03(str, i2);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i3 = 0; i3 < infoCount; i3++) {
            arrayList.add(listA03.get(i3).A0M());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3480QD
    public final Object A6Z(int i2) {
        C3473Q6 compatInfo = this.A01.A01(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3480QD
    public final boolean AGv(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
