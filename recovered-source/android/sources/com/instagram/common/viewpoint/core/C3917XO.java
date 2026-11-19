package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3917XO {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC3916XN A06;

    public C3917XO(int i2, float f2, long j2, Handler handler, InterfaceC3916XN interfaceC3916XN) {
        this(i2, interfaceC3916XN, handler);
        this.A02 = j2;
        this.A01 = f2;
    }

    public C3917XO(int i2, InterfaceC3916XN interfaceC3916XN) {
        this(i2, interfaceC3916XN, new Handler());
    }

    public C3917XO(int i2, InterfaceC3916XN interfaceC3916XN, Handler handler) {
        this.A04 = false;
        this.A00 = i2;
        this.A06 = interfaceC3916XN;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.AFV(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ADS();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (!A05()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ADS();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.AFV(this.A00);
        this.A05.postDelayed(new C3507Qe(this), this.A02);
        return true;
    }
}
