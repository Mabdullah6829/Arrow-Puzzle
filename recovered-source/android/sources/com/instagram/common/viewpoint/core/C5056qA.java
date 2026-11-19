package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5056qA implements InterfaceC201424 {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"DHM3ogSyPiOeoDv5bW0AxEOdKkHHyzoj", "DikGrT", "5TP2r3oYS7ZAxQ2Lbh6O1Hwgb27IVuVZ", "BcOsGW4wr7kIZtXNBjWS4kH8Hq7r3t1j", "xCBSo", "o3SRWC", "etImtR6pfOeyK0p12rnN", "VXmJTa"};
    public static final C5056qA A07 = new C207030().A05();
    public static final InterfaceC201323<C5056qA> A06 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qB
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5056qA.A00(bundle);
        }
    };

    @Deprecated
    public C5056qA(long j2, long j3, long j4, float f2, float f3) {
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A01 = f2;
        this.A00 = f3;
    }

    public C5056qA(C207030 c207030) {
        this(c207030.A04, c207030.A03, c207030.A02, c207030.A01, c207030.A00);
    }

    public static /* synthetic */ C5056qA A00(Bundle bundle) {
        return new C5056qA(bundle.getLong(A01(0), -9223372036854775807L), bundle.getLong(A01(1), -9223372036854775807L), bundle.getLong(A01(2), -9223372036854775807L), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i2) {
        return Integer.toString(i2, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5056qA)) {
            return false;
        }
        C5056qA c5056qA = (C5056qA) obj;
        if (this.A04 == c5056qA.A04 && this.A03 == c5056qA.A03) {
            long j2 = this.A02;
            if (A05[3].charAt(15) == 'f') {
                throw new RuntimeException();
            }
            A05[3] = "Dnbo0S1X4SiwSLqrl4n96G4h1rg7k6Qp";
            if (j2 == c5056qA.A02) {
                float f2 = this.A01;
                float f3 = c5056qA.A01;
                String[] strArr = A05;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "apznZec0lqKPAkNyEzYuPUZE7fb8LaPc";
                strArr2[6] = "99vPzfkBdBLW0Tl0nQsz";
                if (f2 == f3 && this.A00 == c5056qA.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        return ((((i2 + result) * 31) + (this.A01 != 0.0f ? Float.floatToIntBits(this.A01) : 0)) * 31) + (this.A00 != 0.0f ? Float.floatToIntBits(this.A00) : 0);
    }
}
