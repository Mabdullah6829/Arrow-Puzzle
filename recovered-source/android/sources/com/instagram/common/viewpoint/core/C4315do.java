package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4315do {
    public String A02;
    public String A03;
    public String A04;
    public final C3318NY A06;
    public final C3332Nm A07;
    public final C4494gi A08;
    public C3320Na A01 = C3320Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C4315do(C4494gi c4494gi, C3318NY c3318ny, C3332Nm c3332Nm) {
        this.A08 = c4494gi;
        this.A06 = c3318ny;
        this.A07 = c3332Nm;
    }

    public final C4315do A09(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C4315do A0A(C3320Na c3320Na) {
        this.A01 = c3320Na;
        return this;
    }

    public final C4315do A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C4315do A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C4315do A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C4315do A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C4317dq A0F() {
        return new C4317dq(this, null);
    }
}
