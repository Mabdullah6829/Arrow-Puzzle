package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4940oH implements InterfaceC2489A6 {
    @Override // com.instagram.common.viewpoint.core.InterfaceC2489A6
    public final /* synthetic */ InterfaceC2488A5 AH3(C2484A1 c2484a1, C5064qI c5064qI) {
        return AbstractC2486A3.A00(this, c2484a1, c5064qI);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2489A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2489A6
    public final InterfaceC24769s A3C(C2484A1 c2484a1, C5064qI c5064qI) {
        if (c5064qI.A0O == null) {
            return null;
        }
        return new C4938oF(new C24749q(new C2520Ab(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2489A6
    public final int A7W(C5064qI c5064qI) {
        return c5064qI.A0O != null ? 1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2489A6
    public final void AJe(Looper looper, C24018O c24018o) {
    }
}
