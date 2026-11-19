package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5058qC implements InterfaceC201424 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C5058qC A06 = new C20652v().A0A();
    public static final InterfaceC201323<C2515AW> A05 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return new C20652v().A06(bundle.getLong(C5058qC.A01(0), 0L)).A05(bundle.getLong(C5058qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C5058qC.A01(2), false)).A07(bundle.getBoolean(C5058qC.A01(3), false)).A09(bundle.getBoolean(C5058qC.A01(4), false)).A0B();
        }
    };

    public C5058qC(C20652v c20652v) {
        this.A01 = c20652v.A01;
        this.A00 = c20652v.A00;
        this.A03 = c20652v.A03;
        this.A02 = c20652v.A02;
        this.A04 = c20652v.A04;
    }

    public static String A01(int i2) {
        return Integer.toString(i2, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5058qC)) {
            return false;
        }
        C5058qC c5058qC = (C5058qC) obj;
        return this.A01 == c5058qC.A01 && this.A00 == c5058qC.A00 && this.A03 == c5058qC.A03 && this.A02 == c5058qC.A02 && this.A04 == c5058qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
