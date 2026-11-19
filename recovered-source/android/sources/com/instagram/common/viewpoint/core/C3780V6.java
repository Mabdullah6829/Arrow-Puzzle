package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3780V6 {
    public double A00;
    public EnumC3786VC A01;
    public EnumC3787VD A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C3780V6 A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C3780V6 A01(EnumC3786VC enumC3786VC) {
        this.A01 = enumC3786VC;
        return this;
    }

    public final C3780V6 A02(EnumC3787VD enumC3787VD) {
        this.A02 = enumC3787VD;
        return this;
    }

    public final C3780V6 A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C3780V6 A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C3780V6 A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C3780V6 A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C3781V7 A07(C3659T8 c3659t8) {
        return new C3781V7(c3659t8, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
