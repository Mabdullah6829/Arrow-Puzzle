package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3623SX {
    public final long A00;
    public final EnumC3622SW A01;
    public final String A02;
    public final boolean A03;

    public C3623SX(String str, boolean z, EnumC3622SW enumC3622SW) {
        this(str, z, enumC3622SW, System.currentTimeMillis());
    }

    public C3623SX(String str, boolean z, EnumC3622SW enumC3622SW, long j2) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC3622SW;
        this.A00 = j2;
    }

    public static C3623SX A00() {
        return new C3623SX("", true, EnumC3622SW.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC3622SW A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
