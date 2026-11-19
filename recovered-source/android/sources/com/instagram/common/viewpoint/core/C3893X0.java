package com.instagram.common.viewpoint.core;

import android.app.Activity;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3893X0 {
    public static final C3893X0 A04 = new C3893X0(new C3527Qz(), new C3523Qv());
    public final InterfaceC3892Wz A02;
    public final InterfaceC3955Y0 A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C3893X0(InterfaceC3955Y0 interfaceC3955Y0, InterfaceC3892Wz interfaceC3892Wz) {
        this.A03 = interfaceC3955Y0;
        this.A02 = interfaceC3892Wz;
    }

    public static C3893X0 A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5n();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8M();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C3893X0.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5n() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
