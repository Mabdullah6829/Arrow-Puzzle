package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4053Za {
    public int A00;
    public EnumC3977YM A01;
    public InterfaceC4058Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C4494gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C4053Za(C4494gi c4494gi, InterfaceC4058Zf interfaceC4058Zf) {
        this.A0B = c4494gi;
        this.A02 = interfaceC4058Zf;
    }

    public final C4053Za A0C(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C4053Za A0D(EnumC3977YM enumC3977YM) {
        this.A01 = enumC3977YM;
        return this;
    }

    public final C4053Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C4053Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C4053Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C4053Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C4053Za A0I(boolean z) {
        this.A08 = z;
        return this;
    }

    public final C4053Za A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C4053Za A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C4054Zb A0L() {
        return new C4054Zb(this, null);
    }
}
