package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4694k2 implements InterfaceC4266d1 {
    public final /* synthetic */ C237881 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AAn() {
        String strA00 = this.A00.A03.A2C().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        C3899X6.A0O(new C3899X6(), this.A00.A04, AbstractC3904XB.A00(strA00), this.A00.A7O());
    }

    public C4694k2(C237881 c237881) {
        this.A00 = c237881;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void ADm(C225562 c225562) {
        new Handler(Looper.getMainLooper()).postDelayed(new C4695k3(this, c225562), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AE2() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4266d1
    public final void AGC(View view, MotionEvent motionEvent) {
    }
}
