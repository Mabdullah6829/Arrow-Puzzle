package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0n */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C19350n extends C19380q {
    @Override // com.instagram.common.viewpoint.core.C3448Pg
    public final C3465Py A07(View view, C3465Py c3465Py) {
        WindowInsets result = (WindowInsets) C3465Py.A01(c3465Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3465Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C3448Pg
    public final C3465Py A08(View view, C3465Py c3465Py) {
        WindowInsets result = (WindowInsets) C3465Py.A01(c3465Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3465Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C3448Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.instagram.common.viewpoint.core.C3448Pg
    public final void A0E(View view, InterfaceC3434PR interfaceC3434PR) {
        if (interfaceC3434PR == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC3447Pf(this, interfaceC3434PR));
        }
    }
}
