package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2951Hb {
    public static String[] A04 = {"L", "s7TlvRdnTwK3t9C", "ePgRnDLQ3Wbr1YpTz29pmTY6GtuG6NQq", "sd", "s7BgXoB9vXyEEiATAltma4vCqurgDW8q", "LgZyZC", "BLEIsLc40BPM2xLP7Ykzo3HzSA", "v9CVGsZVCVWkGaEQgXjK1D2fYLLUoPIW"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C2951Hb(int i2, byte[] bArr, int i3, int i4) {
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = i3;
        this.A00 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2951Hb c2951Hb = (C2951Hb) obj;
        String[] strArr = A04;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[1] = "oBkTGyhCOE";
        if (this.A01 == c2951Hb.A01 && this.A02 == c2951Hb.A02 && this.A00 == c2951Hb.A00 && Arrays.equals(this.A03, c2951Hb.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i2 = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = (((i2 + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
